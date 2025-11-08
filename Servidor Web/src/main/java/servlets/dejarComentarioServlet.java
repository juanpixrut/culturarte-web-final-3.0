/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
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
import clienteWS.Propuesta;
import clienteWS.Comentario;

/**
 *
 * @author Juanpi
 */
@WebServlet(name = "dejarComentarioServlet", urlPatterns = {"/dejarComentarioServlet"})
public class dejarComentarioServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);

        String titulo = request.getParameter("titulo");
        String texto = request.getParameter("comentario");

        HttpSession sesion = request.getSession(false);
        if (sesion == null || sesion.getAttribute("usuarioLogueado") == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        String nickname = (String) sesion.getAttribute("usuarioSesion");

        // Crear cliente del Web Service
        System.setProperty("file.encoding", "UTF-8");
        IctrlServicioService service = new IctrlServicioService();
        IctrlServicio port = service.getIctrlServicioPort();

        try {

            // Registrar comentario (a través del WS)
            port.dejarComentario(nickname, titulo, texto);

            sesion.setAttribute("mensajeExito", "Tu comentario fue publicado correctamente.");
            response.sendRedirect("consultaPropuestaFullServlet?titulo=" + titulo);

        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("mensajeError", "Ocurrió un error al guardar tu comentario.");
            response.setContentType("text/plain;charset=UTF-8");
            response.getWriter().println("Error al dejar comentario: " + e.getMessage());
            return;
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
