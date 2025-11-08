/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package culturarte;

/**
 *
 * @author Juanpi
 */

import logica.Fabrica;
import logica.Ictrl;

import persistencia.ControladoraPersistencia;

import presentacion.Pantalla;

import jakarta.xml.ws.Endpoint;

import WebServices.ictrlServicio;

public class Culturarte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Pantalla panta = new Pantalla();
        panta.setVisible(true); //no se la diferencia con .show que use en QT c++, investigar.
        panta.setLocationRelativeTo(null); //ponela relativa a nada. ponerla en el medio y listo.
        
        ictrlServicio servicio = new ictrlServicio();
        String url = "http://localhost:8085/servicio";
        Endpoint.publish(url, servicio);
        System.out.println("Servicio publicado en: " + url + "?wsdl");
        
    }
    
}
