/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

/* 
info:
modificar el backend para q los usuarios tengan contrasena. regenerar el json y reimportarlo.
*/

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
import clienteWS.Usuario;
import clienteWS.UsuarioDTO;

/**
 *
 * @author Juanpi
 */

@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        String usuario = request.getParameter("usuario");
        String clave = request.getParameter("clave");

        // Crear la sesión
        HttpSession sesion = request.getSession();
        sesion.setAttribute("usuarioSesion", usuario);

        // Casos especiales hardcodeados
        if ("admin".equalsIgnoreCase(usuario) && "admin".equalsIgnoreCase(clave)) {
            sesion.setAttribute("usuarioLogueado", "admin");
            sesion.setAttribute("rol", "admin");
            response.sendRedirect("home.jsp");
            return;
        }

        if ("visitante".equalsIgnoreCase(usuario)) {
            sesion.setAttribute("usuarioLogueado", "visitante");
            sesion.setAttribute("rol", "visitante");
            response.sendRedirect("home.jsp");
            return;
        }

        // Conexión al Web Service
        System.setProperty("file.encoding", "UTF-8");
        IctrlServicioService service = new IctrlServicioService();
        IctrlServicio port = service.getIctrlServicioPort();

        try {
            // === Validar usuario ===
            boolean valido = port.validarUsuario(usuario, clave);

            if (valido) {
                // Obtener el rol del usuario
                String rol = port.buscoRol(usuario);

                // Obtener el objeto Usuario completo
                //Usuario user = port.buscoUsuario(usuario); //ACA CAMBIE
                UsuarioDTO user = port.buscoUsuarioDTO(usuario);

                // Guardar en sesión
                sesion.setAttribute("usuarioLogueado", usuario);
                sesion.setAttribute("usuarioObjeto", user);
                sesion.setAttribute("rol", rol);
                sesion.setAttribute("usuarioEnSesion", user);

                response.sendRedirect("home.jsp");

            } else {
                // Usuario o contraseña incorrectos
                request.setAttribute("mensaje", "Usuario o contraseña incorrectos");
                request.getRequestDispatcher("inicioSesion.jsp").forward(request, response);
            }

        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("mensaje", "Error al iniciar sesión: " + e.getMessage());
            request.getRequestDispatcher("inicioSesion.jsp").forward(request, response);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
