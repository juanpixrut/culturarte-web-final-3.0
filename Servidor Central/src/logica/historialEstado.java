/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Juanpi
 */

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class HistorialEstado implements Serializable {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="propuesta_titulo")
    private Propuesta propuesta;
    
    @Enumerated(EnumType.STRING)
    private EstadoPropuesta estado;

    @Temporal(TemporalType.DATE)
    private Date fecha = Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant()); //

    public HistorialEstado() {
    
    }
    
    public HistorialEstado(Propuesta p, EstadoPropuesta e){ 
        this.propuesta = p; 
        this.estado = e; 
    }
    
    public int getId(){
    return this.id;
    }
    
    public EstadoPropuesta getEstado(){
    return this.estado;
    }
    
    public void setPropuesta(Propuesta p){
    this.propuesta = p;
    }
    
        public void setEstado(EstadoPropuesta e){
        this.estado = e; 
        }
        
        public void setFecha(Date fecha){
        this.fecha = fecha;
        }
    
}
