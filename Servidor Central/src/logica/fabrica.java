/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Juanpi
 */
public class Fabrica {
    
    public Fabrica(){
    
    }
    
    public Ictrl getIctrl(){
    return Ctrl.getInstancia();
    }
    
}
