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

// Cliente WS
import clienteWS.IctrlServicio;
import clienteWS.IctrlServicioService;
import clienteWS.PropuestaDTO;
import clienteWS.ColaboradorDTO;
import clienteWS.ColaboracionDTO;

/**
 *
 * @author Juanpi
 */
@WebServlet(name = "consultaPropuestaColaboracion", urlPatterns = {"/consultaPropuestaColaboracion"})
public class consultaPropuestaColaboracion extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        
       request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        HttpSession session = request.getSession();
        String usuarioSesion = (String) session.getAttribute("usuarioSesion");
        String titulo = request.getParameter("titulo");

        // Crear cliente del Web Service
        System.setProperty("file.encoding", "UTF-8");
        IctrlServicioService service = new IctrlServicioService();
        IctrlServicio port = service.getIctrlServicioPort();

        try {
            // Buscar propuesta completa por título
            PropuestaDTO propuesta = port.buscoPropuestaDTO(titulo);
            if (propuesta == null) {
                request.setAttribute("errorMensaje", "No se encontró la propuesta especificada.");
                request.getRequestDispatcher("error.jsp").forward(request, response);
                return;
            }

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
            request.setAttribute("propuesta", propuesta);
            request.setAttribute("titulo", titulo);

            request.getRequestDispatcher("detallePropuestaColaboracion.jsp").forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("errorMensaje", "Error al consultar la propuesta: " + e.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);
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
