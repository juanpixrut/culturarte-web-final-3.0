/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
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

/**
 *
 * @author Juanpi
 */
@WebServlet(name = "cancelarPropuestaServlet", urlPatterns = {"/cancelarPropuestaServlet"})
public class cancelarPropuestaServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
         HttpSession session = request.getSession();
        String nicknamePedido = (String) session.getAttribute("usuarioSesion");

        if (nicknamePedido == null || nicknamePedido.isEmpty()) {
            response.sendRedirect("inicioSesion.jsp");
            return;
        }

        // Crear cliente del Web Service
        System.setProperty("file.encoding", "UTF-8");
        IctrlServicioService service = new IctrlServicioService();
        IctrlServicio port = service.getIctrlServicioPort();

        try {
            // Obtener propuestas financiadas del proponente
            List<PropuestaDTO> propuestas = port.listarPropuestasFinanciadas(nicknamePedido);

            request.setAttribute("propuestas", propuestas);
            request.getRequestDispatcher("cancelarPropuesta.jsp").forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("errorMensaje", "Error al cargar las propuestas financiadas: " + e.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        
        //TENGO QUE CONTROLAR Q SI NO HAY NADA Y LE DAS AL BOTON NO DE ERROR
        
  request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        String titulo = request.getParameter("titulo");

        if (titulo == null || titulo.isEmpty()) {
            request.setAttribute("errorMensaje", "Debe seleccionar una propuesta para cancelar.");
            request.getRequestDispatcher("cancelarPropuesta.jsp").forward(request, response);
            return;
        }

        // Cliente del Web Service
        IctrlServicioService service = new IctrlServicioService();
        IctrlServicio port = service.getIctrlServicioPort();

        try {
            // Cancelar propuesta mediante el WS
            port.cancelarPropuesta(titulo);
            response.sendRedirect("home.jsp");

        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("errorMensaje", "Error al cancelar la propuesta: " + e.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
