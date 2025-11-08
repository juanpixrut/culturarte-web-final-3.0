/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Juanpi
 */

import persistencia.ControladoraPersistencia;

public class Ctrl extends Ictrl{
       
    public static Ctrl getInstancia(){
        if(instancia == null){
        instancia = new Ctrl();
        }
        return instancia;
    }
    
    private static Ctrl instancia = null;
    
    private Ctrl(){
    
    }
}
