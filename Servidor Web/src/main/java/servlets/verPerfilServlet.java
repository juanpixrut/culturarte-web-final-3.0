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

/**
 *
 * @author Juanpi
 */

// Import del cliente generado (por wsimport)
import clienteWS.IctrlServicio;
import clienteWS.IctrlServicioService;
import clienteWS.Proponente;
import clienteWS.Colaborador;

@WebServlet(name = "verPerfilServlet", urlPatterns = {"/verPerfilServlet"})
public class verPerfilServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String nickname = request.getParameter("nickname");
        
        // Crear cliente WS
        System.setProperty("file.encoding", "UTF-8");
        IctrlServicioService service = new IctrlServicioService();
        IctrlServicio port = service.getIctrlServicioPort();
        
        Proponente p = null;
        Colaborador c = null;
        p = port.buscoProponente(nickname);
        c = port.buscoColaborador(nickname);
        if(p == null){
        request.setAttribute("usuario", c);
        request.setAttribute("tipo", "colaborador");
        }else{
        request.setAttribute("usuario", p);
        request.setAttribute("tipo", "proponente");
        }

        request.getRequestDispatcher("verPerfil.jsp").forward(request, response);

        
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
