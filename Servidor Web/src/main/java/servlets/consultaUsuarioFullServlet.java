/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import java.util.Base64;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

// Cliente WS
import clienteWS.IctrlServicio;
import clienteWS.IctrlServicioService;
import clienteWS.UsuarioDTO;
import clienteWS.PropuestaDTO;
import clienteWS.ColaboracionDTO;
import clienteWS.ColaboradorDTO;
import clienteWS.Usuario;

/**
 *
 * @author Juanpi
 */
@WebServlet(name = "consultaUsuarioFullServlet", urlPatterns = {"/consultaUsuarioFullServlet"})
public class consultaUsuarioFullServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);

        String nicknamePedido = request.getParameter("nickname"); //
        HttpSession session = request.getSession();
        
        // nickname del usuario logueado real
        String usuarioSesion = (String) session.getAttribute("usuarioSesion");
        
        // Crear cliente WS
        System.setProperty("file.encoding", "UTF-8");
        IctrlServicioService service = new IctrlServicioService();
        IctrlServicio port = service.getIctrlServicioPort();

         try {
            // Si vino por parámetro, lo guardamos en sesión
            if (nicknamePedido != null && !nicknamePedido.isEmpty()) {
                session.setAttribute("nicknamePedido", nicknamePedido);
            } else {
                nicknamePedido = (String) session.getAttribute("nicknamePedido");
            }

            // Obtener datos del usuario
            String rol = port.buscoRol(nicknamePedido);
            UsuarioDTO usuario = port.buscoUsuarioDTO(nicknamePedido);

            boolean esPropioPerfil = nicknamePedido.equalsIgnoreCase(usuarioSesion);
            request.setAttribute("esPropioPerfil", esPropioPerfil);

            // Si consulta su propio perfil
            if (esPropioPerfil && rol.equalsIgnoreCase("proponente")) {
                List<PropuestaDTO> listaIngresadas = port.listarPropuestasIngresadas(nicknamePedido);
                request.setAttribute("listaPropuestasIng", listaIngresadas);
            }

            if (esPropioPerfil && rol.equalsIgnoreCase("colaborador")) {
                // Ejemplo: podrías mostrar colaboraciones con monto y fecha si el WS tiene el método
                ColaboradorDTO colab = port.buscoColaboradorDTO(nicknamePedido);
                List<ColaboracionDTO> colaboraciones = colab.getColaboraciones();
                request.setAttribute("colaboraciones", colaboraciones);
            }

            // Listar propuestas favoritas
            List<PropuestaDTO> listaPropuestasFav = port.listarPropuestasFavoritas(nicknamePedido);

            // Listar seguidores y seguidos
            List<UsuarioDTO> listaSeguidos = port.buscarSeguidos(nicknamePedido);
            List<UsuarioDTO> listaSeguidores = port.buscarSeguidores(nicknamePedido);

            // Si es proponente, listar propuestas publicadas
            if (rol.equalsIgnoreCase("proponente")) {
                List<PropuestaDTO> listaPropuestasPub = port.listarPropuestasPublicadas(nicknamePedido);
                request.setAttribute("listaPropuestasPub", listaPropuestasPub);
            }

            // Convertir imagen a base64 si existe
            if (usuario.getImagen() != null) {
                String base64 = Base64.getEncoder().encodeToString(usuario.getImagen());
                request.setAttribute("imagenBase64", base64);
            }

            // Pasar todos los datos a la JSP
            request.setAttribute("usuario", usuario);
            request.setAttribute("listaSeguidos", listaSeguidos);
            request.setAttribute("listaSeguidores", listaSeguidores);
            request.setAttribute("listaPropuestasFav", listaPropuestasFav);

            request.getRequestDispatcher("detalleUsuario.jsp").forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("errorMensaje", "Error al consultar usuario: " + e.getMessage());
                response.setContentType("text/plain;charset=UTF-8");
                response.getWriter().println("Error al consultar usuario: " + e.getMessage());
                return;
            //request.getRequestDispatcher("error.jsp").forward(request, response);
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
