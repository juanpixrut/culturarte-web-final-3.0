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

// Import del cliente WS
import clienteWS.IctrlServicio;
import clienteWS.IctrlServicioService;
import clienteWS.ProponenteDTO;
import clienteWS.ColaboradorDTO;

/**
 *
 * @author Juanpi
 */
@WebServlet(name = "consultaUsuariosServlet", urlPatterns = {"/consultaUsuariosServlet"})
public class consultaUsuariosServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);

        // Crear cliente WS
        System.setProperty("file.encoding", "UTF-8");
        IctrlServicioService service = new IctrlServicioService();
        IctrlServicio port = service.getIctrlServicioPort();

        try {
            // Obtener listas desde el WS
            List<ProponenteDTO> proponentes = port.listarProponentesDTO();
            List<ColaboradorDTO> colaboradores = port.listarColaboradoresDTO();

            // Pasar los resultados a la JSP
            request.setAttribute("proponentes", proponentes);
            request.setAttribute("colaboradores", colaboradores);
            request.getRequestDispatcher("consultaUsuarios.jsp").forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("errorMensaje", "Error al consultar usuarios: " + e.getMessage());
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
