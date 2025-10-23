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

import logica.*;
import logica.dtos.PropuestaDTO;
import persistencia.*;

/**
 *
 * @author Juanpi
 */
@WebServlet(name = "consultaPropuestaColaboracion", urlPatterns = {"/consultaPropuestaColaboracion"})
public class consultaPropuestaColaboracion extends HttpServlet {
    
    ControladoraNueva Sistema = new ControladoraNueva();

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
        
        PropuestaDTO propuesta = Sistema.buscoPropuestaDTO(titulo);
        
        //NEWWWWW
        //si es colaborador y colaboro con la propuesta.
        colaborador col = Sistema.buscoColaborador(usuarioSesion);
        boolean colaboro = false;
        boolean puedeColaborar = false;
        
        if (col != null) {
            List<colaboracion> misColabs = Sistema.listarColaboraciones();
            for (colaboracion c : misColabs) {
                if (c.getPropuesta() != null && c.getPropuesta().getTitulo().trim().equalsIgnoreCase(titulo.trim()) && c.getColaborador().getNickname().equalsIgnoreCase(usuarioSesion)) {
                    colaboro = true;
                    break; // ya encontramos una coincidencia, no seguimos buscando
                }
            }
        }
        
        if(col != null && colaboro == false){
        puedeColaborar = true;
        }
        
        request.setAttribute("colaboro", colaboro);
        request.setAttribute("puedeColaborar", puedeColaborar);
        
        request.setAttribute("propuesta", propuesta);
        request.setAttribute("titulo", titulo);
        request.getRequestDispatcher("detallePropuestaColaboracion.jsp").forward(request, response);
        
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
