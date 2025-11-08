/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

// Cliente del Web Service
import clienteWS.IctrlServicio;
import clienteWS.IctrlServicioService;
import clienteWS.PropuestaDTO;
import clienteWS.CategoriaDTO;

/**
 *
 * @author Juanpi
 */
@WebServlet(name = "consultaPropuestaServlet", urlPatterns = {"/consultaPropuestaServlet"})
public class consultaPropuestaServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        // Obtener el parametro de busqueda (puede venir vacio)
        String filtros = request.getParameter("filtros");
        String estado = request.getParameter("estado");
        String orden = request.getParameter("orden");
        String tipo = request.getParameter("tipo");

        // Crear cliente WS
        System.setProperty("file.encoding", "UTF-8");
        IctrlServicioService service = new IctrlServicioService();
        IctrlServicio port = service.getIctrlServicioPort();

        try {
            // Obtener todas las propuestas (ya no usamos ControladoraNueva)
            List<PropuestaDTO> propuestas = port.listarPropuestasNoIngresadas();

            // FILTRO DE TEXTO
            if (filtros != null && !filtros.trim().isEmpty()) {
                List<PropuestaDTO> filtradas = new ArrayList<>();
                String[] palabras = filtros.split(",");
                for (PropuestaDTO p : propuestas) {
                    for (String palabra : palabras) {
                        String f = palabra.trim().toLowerCase();
                        if (p.getTitulo().toLowerCase().contains(f)
                                || p.getDescripcion().toLowerCase().contains(f)
                                || p.getLugar().toLowerCase().contains(f)) {
                            filtradas.add(p);
                            break;
                        }
                    }
                }
                propuestas = filtradas;
            }

            // FILTRAR POR ESTADO
            if (estado != null && !estado.isEmpty()) {
                propuestas.removeIf(p -> !p.getEstadoActual().toString().equalsIgnoreCase(estado));
            }

            // FILTRAR POR TIPO
            if (tipo != null && !tipo.isEmpty()) {
                propuestas.removeIf(p -> !p.getTipoEspectaculo().equalsIgnoreCase(tipo.trim()));
            }

            // ORDENAR
            if ("ALFABETICO".equalsIgnoreCase(orden)) {
                propuestas.sort((a, b) -> a.getTitulo().compareToIgnoreCase(b.getTitulo()));
            } else if ("ANIO_DESC".equalsIgnoreCase(orden)) {
                propuestas.sort((a, b) -> {
                    if (a.getFechaPublicada() == null || b.getFechaPublicada() == null) {
                        return 0;
                    }
                    try {
                        java.util.Date fechaA = a.getFechaPublicada().toGregorianCalendar().getTime();
                        java.util.Date fechaB = b.getFechaPublicada().toGregorianCalendar().getTime();
                        return fechaB.compareTo(fechaA); // más reciente primero
                    } catch (Exception ex) {
                        ex.printStackTrace();
                        return 0;
                    }
                });
            }

            // Obtener categorías desde el WS
            List<CategoriaDTO> categorias = port.listarCategoriaDTO();

            // Guardar en la request
            request.setAttribute("categorias", categorias);
            request.setAttribute("propuestas", propuestas);
            request.setAttribute("filtros", filtros);
            request.setAttribute("estado", estado);
            request.setAttribute("orden", orden);

            // Enviar a la JSP
            request.getRequestDispatcher("consultaPropuesta.jsp").forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("errorMensaje", "Error al consultar las propuestas: " + e.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
