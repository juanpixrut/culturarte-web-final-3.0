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

// Import del cliente del Web Service
import clienteWS.IctrlServicio;
import clienteWS.IctrlServicioService;
import clienteWS.UsuarioDTO;

/**
 *
 * @author Juanpi
 */
@WebServlet(name = "dejarSeguirUsuarioServlet", urlPatterns = {"/dejarSeguirUsuarioServlet"})
public class dejarSeguirUsuarioServlet extends HttpServlet {

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

        // Recuperar la sesion actual
        HttpSession session = request.getSession(false);

        if (session == null || session.getAttribute("usuarioObjeto") == null) {
            response.sendRedirect("inicioSesion.jsp");
            return;
        }

        // Usuario logueado (el que deja de seguir a otro)
        UsuarioDTO usuarioSesion = (UsuarioDTO) session.getAttribute("usuarioObjeto");
        String nicknameSeguidor = usuarioSesion.getNickname();

        // Usuario a dejar de seguir (viene por parametro del formulario jsp)
        String nicknameDejarSeguir = request.getParameter("nicknameSeguido");

        if (nicknameDejarSeguir == null || nicknameDejarSeguir.isEmpty()) {
            response.sendRedirect("index.jsp");
            return;
        }

        // Crear cliente WS
        System.setProperty("file.encoding", "UTF-8");
        IctrlServicioService service = new IctrlServicioService();
        IctrlServicio port = service.getIctrlServicioPort();

        try {
            // Llamada al WS para dejar de seguir
            port.dejarSeguir(nicknameSeguidor, nicknameDejarSeguir);

            // Obtener versión actualizada del usuario logueado
            UsuarioDTO usuarioActualizado = port.buscoUsuarioDTO(nicknameSeguidor);

            // Actualizar la sesión
            session.setAttribute("usuarioObjeto", usuarioActualizado);

            // Redirigir al perfil del usuario que se dejó de seguir
            response.sendRedirect("consultaPerfilServlet?nickname=" + nicknameDejarSeguir);

        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("errorMensaje", "Error al dejar de seguir usuario: " + e.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }

@Override
public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
