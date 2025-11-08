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

// Cliente del Web Service
import clienteWS.IctrlServicio;
import clienteWS.IctrlServicioService;
import clienteWS.PropuestaDTO;
import clienteWS.ColaboracionDTO;
import clienteWS.ColaboradorDTO;
import clienteWS.Comentario;
import clienteWS.ComentarioDTO;

/**
 *
 * @author Juanpi
 */
@WebServlet(name = "consultaPropuestaFullServlet", urlPatterns = {"/consultaPropuestaFullServlet"})
public class consultaPropuestaFullServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        HttpSession session = request.getSession();
        String usuarioSesion = (String) session.getAttribute("usuarioSesion");

        String titulo = request.getParameter("titulo");
        String origen = request.getParameter("origen"); // nuevo agregado
        request.setAttribute("origen", origen);

        // Crear cliente del Web Service
        System.setProperty("file.encoding", "UTF-8");
        IctrlServicioService service = new IctrlServicioService();
        IctrlServicio port = service.getIctrlServicioPort();

        try {
            // Buscar propuesta completa por título
            PropuestaDTO propuesta = port.buscoPropuestaDTO(titulo);

            if (propuesta == null) {
                request.setAttribute("errorMensaje", "No se encontró la propuesta especificada.");
                
                response.setContentType("text/plain;charset=UTF-8");
                response.getWriter().println("Error al consultar usuario: propuesta null");

                //request.getRequestDispatcher("error.jsp").forward(request, response);
                return;
            }

            // Determinar si el usuario logueado es el dueño de la propuesta
            String nicknameProponente = propuesta.getProponenteNickname();
            boolean esPropioPerfil = usuarioSesion != null && usuarioSesion.equalsIgnoreCase(nicknameProponente);
            request.setAttribute("esPropioPerfil", esPropioPerfil);

            // Determinar si el usuario colaboró o puede colaborar
            boolean colaboro = false;
            boolean puedeColaborar = false;

            if (usuarioSesion != null) {
                ColaboradorDTO col = port.buscoColaboradorDTO(usuarioSesion);

                if (col != null) {
                    List<ColaboracionDTO> misColabs = port.listarColaboracionesDTO();
                    for (ColaboracionDTO c : misColabs) {
                        if (c.getPropuestaTitulo() != null
                                && c.getPropuestaTitulo().equalsIgnoreCase(titulo)
                                && c.getColaboradorNickname().equalsIgnoreCase(usuarioSesion)) {
                            colaboro = true;
                            break;
                        }
                    }
                    if (!colaboro) puedeColaborar = true;
                }
            }

            request.setAttribute("colaboro", colaboro);
            request.setAttribute("puedeColaborar", puedeColaborar);

            // Convertir imagen a Base64 si existe
            if (propuesta.getImagen() != null) {
                String base64 = Base64.getEncoder().encodeToString(propuesta.getImagen());
                request.setAttribute("imagenBase64", base64);
            }

            // Obtener comentarios de la propuesta
            List<ComentarioDTO> comentarios = port.listarComentariosDePropuesta(titulo);

            // Obtener lista de colaboraciones
            List<ColaboracionDTO> colaboradores = propuesta.getColaboraciones();

            // Enviar todo a la JSP
            request.setAttribute("comentarios", comentarios);
            request.setAttribute("colaboraciones", colaboradores);
            request.setAttribute("propuesta", propuesta);

            request.getRequestDispatcher("detallePropuestaUsuario.jsp").forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("errorMensaje", "Error al consultar la propuesta: " + e.getMessage());
            
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
