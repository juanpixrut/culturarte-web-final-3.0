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

// ✅ Import del cliente WS (generado por wsimport)
import clienteWS.IctrlServicio;
import clienteWS.IctrlServicioService;
import clienteWS.Usuario;
import clienteWS.UsuarioDTO;

/**
 *
 * @author Juanpi
 */
@WebServlet(name = "seguirUsuarioServlet", urlPatterns = {"/seguirUsuarioServlet"})
public class seguirUsuarioServlet extends HttpServlet {

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

        // Usuario logueado (el que sigue a otro)
        UsuarioDTO usuarioSesion = (UsuarioDTO) session.getAttribute("usuarioObjeto");
        String nicknameSeguidor = usuarioSesion.getNickname();

        // Usuario a seguir (viene por parametro del formulario jsp)
        String nicknameSeguido = request.getParameter("nicknameSeguido");

        if (nicknameSeguido == null || nicknameSeguido.isEmpty()) {
            response.sendRedirect("index.jsp");
            return;
        }

        // ✅ Crear cliente del Web Service
        System.setProperty("file.encoding", "UTF-8");
        IctrlServicioService service = new IctrlServicioService();
        IctrlServicio port = service.getIctrlServicioPort();

        // ✅ Registrar el seguimiento en el servidor (llamada remota)
        port.seguirUsuario(nicknameSeguidor, nicknameSeguido);
        
        UsuarioDTO usuarioActualizado = port.buscoUsuarioDTO(nicknameSeguidor);
        session.setAttribute("usuarioObjeto", usuarioActualizado);

        // Redirigir al perfil del usuario seguido
        response.sendRedirect("consultaPerfilServlet?nickname=" + nicknameSeguido);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
