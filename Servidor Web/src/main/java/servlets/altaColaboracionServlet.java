/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
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
import clienteWS.Colaborador;
import clienteWS.PropuestaDTO;
import clienteWS.EstadoPropuesta;

/**
 *
 * @author Juanpi
 */
@WebServlet(name = "altaColaboracionServlet", urlPatterns = {"/altaColaboracionServlet"})
public class altaColaboracionServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        // Crear cliente del Web Service
        System.setProperty("file.encoding", "UTF-8");
        IctrlServicioService service = new IctrlServicioService();
        IctrlServicio port = service.getIctrlServicioPort();

        try {
            // Obtener todas las propuestas
            List<PropuestaDTO> propuestas = port.listarPropuestasDTO();

            request.setAttribute("propuestas", propuestas);
            request.getRequestDispatcher("altaColaboracion.jsp").forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("mensaje", "Error al cargar las propuestas: " + e.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        HttpSession sesion = request.getSession();
        String nicknameColaborador = (String) sesion.getAttribute("usuarioSesion");

        if (nicknameColaborador == null || nicknameColaborador.isEmpty()) {
            response.sendRedirect("inicioSesion.jsp");
            return;
        }

        // Crear cliente WS
        IctrlServicioService service = new IctrlServicioService();
        IctrlServicio port = service.getIctrlServicioPort();

        try {
            // Datos del formulario
            String titulo = request.getParameter("titulo");
            Float montoAportado = Float.parseFloat(request.getParameter("monto"));
            String tipoRetorno = request.getParameter("tipoRetorno");

            // Fecha actual
            Date fechaActual = Date.valueOf(LocalDate.now());

            // Obtener propuesta desde WS
            PropuestaDTO prop = port.buscoPropuestaDTO(titulo);

            // === Lógica del estado (ahora vía WS) ===
            if (prop.getEstadoActual().toString().equalsIgnoreCase("INGRESADA") || prop.getEstadoActual().toString().equalsIgnoreCase("PUBLICADA")) {
                port.cambiarEstadoPropuesta(titulo, EstadoPropuesta.EN_FINANCIACION.name());
            }

            // Si alcanza el monto total → FINANCIADA
            if (prop.getMontoRecaudado() + montoAportado >= prop.getMontoNecesario()) {
                port.cambiarEstadoPropuesta(titulo, EstadoPropuesta.FINANCIADA.name());
            }

            // Crear la colaboración remotamente
            port.altaColaboracion(
                    nicknameColaborador,
                    titulo,
                    montoAportado,
                    tipoRetorno,
                    fechaActual.toString()
            );

            response.sendRedirect("home.jsp");

        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("mensaje", "❌ Error al crear la colaboración: " + e.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
