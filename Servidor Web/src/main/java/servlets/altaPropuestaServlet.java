/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.time.LocalTime;
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
import clienteWS.Categoria;
import clienteWS.CategoriaDTO;
import clienteWS.EstadoPropuesta;
import clienteWS.Proponente;
import clienteWS.UsuarioDTO;

/**
 *
 * @author Juanpi
 */
@WebServlet(name = "altaPropuestaServlet", urlPatterns = {"/altaPropuestaServlet"})
public class altaPropuestaServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Crear cliente del Web Service
        System.setProperty("file.encoding", "UTF-8");
        IctrlServicioService service = new IctrlServicioService();
        IctrlServicio port = service.getIctrlServicioPort();

        try {
            // Obtener las categorías disponibles desde el WS
            List<CategoriaDTO> tiposCategorias = port.listarCategoriaDTO();

            // Mandar al JSP
            request.setAttribute("tiposCategorias", tiposCategorias);
            request.getRequestDispatcher("altaPropuesta.jsp").forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("error", "Error al cargar las categorías: " + e.getMessage());
            response.setContentType("text/plain;charset=UTF-8");
            response.getWriter().println("Error al listar las categorias creo: " + e.getMessage());
            return;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        // Datos desde el formulario
        String titulo = request.getParameter("titulo");
        String descripcion = request.getParameter("descripcion");
        String tipoEspectaculo = request.getParameter("tipoEspectaculo");
        String lugar = request.getParameter("lugar");
        String fechaStr = request.getParameter("fechaRealizacion");
        String horaStr = request.getParameter("horaRealizacion");
        String tipoRetorno = request.getParameter("tipoRetorno");

        HttpSession sesion = request.getSession();
        UsuarioDTO usuarioDTO = (UsuarioDTO) sesion.getAttribute("usuarioObjeto");
        
                // Crear cliente WS
        IctrlServicioService service = new IctrlServicioService();
        IctrlServicio port = service.getIctrlServicioPort();
        
        Proponente p = port.buscoProponente(usuarioDTO.getNickname());

        Date fechaRealizacion = null;
        LocalTime hora = null;
        float precioEntrada = 0;
        float montoNecesario = 0;

        try {
            fechaRealizacion = Date.valueOf(fechaStr);
            hora = LocalTime.parse(horaStr);
            precioEntrada = Float.parseFloat(request.getParameter("precioEntrada"));
            montoNecesario = Float.parseFloat(request.getParameter("montoNecesario"));
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("error", "Error en el formato de los datos numéricos o de la fecha.");
            request.getRequestDispatcher("/altaPropuesta.jsp").forward(request, response);
            return;
        }

        try {
            // Llamar al método remoto para registrar la propuesta
            port.altaPropuesta(
                    p,
                    titulo,
                    descripcion,
                    tipoEspectaculo,
                    lugar,
                    fechaRealizacion.toString(), // SOAP usa String para fechas
                    hora.toString(),
                    precioEntrada,
                    montoNecesario,
                    tipoRetorno,
                    null,
                    EstadoPropuesta.INGRESADA.name() // pasar como String
            );

            response.sendRedirect("home.jsp");

        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("error", "Error al crear la propuesta: " + e.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
