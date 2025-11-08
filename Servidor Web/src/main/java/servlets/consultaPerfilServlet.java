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
import clienteWS.UsuarioDTO;

/**
 *
 * @author Juanpi
 */
@WebServlet(name = "consultaPerfilServlet", urlPatterns = {"/consultaPerfilServlet"})
public class consultaPerfilServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);

        HttpSession session = request.getSession();
        String nicknameSesion = null;
        UsuarioDTO usuarioSesion = null;

        // Crear cliente del Web Service
        System.setProperty("file.encoding", "UTF-8");
        IctrlServicioService service = new IctrlServicioService();
        IctrlServicio port = service.getIctrlServicioPort();

        // Recuperar usuario logueado desde la sesión
        if (session.getAttribute("usuarioObjeto") != null) {
            usuarioSesion = (UsuarioDTO) session.getAttribute("usuarioObjeto");
            nicknameSesion = usuarioSesion.getNickname();
            
            // Refrescar el usuario desde el WS
            usuarioSesion = port.buscoUsuarioDTO(nicknameSesion);
            session.setAttribute("usuarioObjeto", usuarioSesion);
        }

        // Refrescar los datos del usuario en sesión desde el WS
        if (nicknameSesion != null) {
            nicknameSesion = usuarioSesion.getNickname();
            UsuarioDTO actualizado = port.buscoUsuarioDTO(nicknameSesion);
            session.setAttribute("usuarioObjeto", actualizado);
        }

        // Obtener el nickname del perfil a consultar
        String nicknameBuscado = request.getParameter("nickname");
        if (nicknameBuscado == null || nicknameBuscado.isEmpty()) {
            response.sendRedirect("index.jsp");
            return;
        }

        String rol = port.buscoRol(nicknameBuscado);
        request.setAttribute("rol", rol);

        // Buscar el usuario a mostrar
        UsuarioDTO usuarioBuscado = port.buscoUsuarioDTO(nicknameBuscado);
        if (usuarioBuscado == null) {
            response.sendRedirect("index.jsp");
            return;
        }

        // Verificar si el perfil es el mismo
        boolean mismoPerfil = false;
        if (nicknameSesion != null && nicknameBuscado.equalsIgnoreCase(nicknameSesion)) {
            mismoPerfil = true;
        }
        request.setAttribute("mismoPerfil", mismoPerfil);

        // Convertir imagen a Base64 si existe
        if (usuarioBuscado.getImagen() != null) {
            String base64 = java.util.Base64.getEncoder().encodeToString(usuarioBuscado.getImagen());
            request.setAttribute("imagenBase64", base64);
        }

        // Verificar si el usuario en sesión ya sigue al usuario buscado
        boolean yaLoSigue = false;
        if (usuarioSesion != null) {
        yaLoSigue = port.usuarioSigueA(usuarioSesion.getNickname(), nicknameBuscado);
        }
        request.setAttribute("yaLoSigue", yaLoSigue);

        // Pasar el usuario buscado al JSP
        request.setAttribute("usuarioBuscado", usuarioBuscado);

        // Redirigir al JSP
        request.getRequestDispatcher("/consultaPerfil.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
