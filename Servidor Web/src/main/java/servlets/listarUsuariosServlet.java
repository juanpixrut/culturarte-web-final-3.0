/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Imports del cliente WS
import clienteWS.IctrlServicio;
import clienteWS.IctrlServicioService;
import clienteWS.Proponente;
import clienteWS.Colaborador;

/**
 *
 * @author Juanpi
 */
@WebServlet(name = "listarUsuariosServlet", urlPatterns = {"/listarUsuariosServlet"})
public class listarUsuariosServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Crear cliente WS
        System.setProperty("file.encoding", "UTF-8");
        IctrlServicioService service = new IctrlServicioService();
        IctrlServicio port = service.getIctrlServicioPort();

        try {
            // Llamar a los métodos remotos del Web Service
            List<Proponente> proponentes = port.listarProponentes();
            List<Colaborador> colaboradores = port.listarColaboradores();

            // Enviar a la vista JSP
            request.setAttribute("proponentes", proponentes);
            request.setAttribute("colaboradores", colaboradores);
            request.getRequestDispatcher("otrosPerfiles.jsp").forward(request, response);

        } catch (Exception e) {
            // Si algo falla, mostramos error en consola y redirigimos a una página de error
            e.printStackTrace();
            request.setAttribute("errorMensaje", "Error al listar usuarios: " + e.getMessage());
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
