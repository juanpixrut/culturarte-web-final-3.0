/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.dtos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Juanpi
 */

public class ComentarioDTO implements Serializable {

    private Long id;
    private ColaboradorDTO autor;
    private PropuestaDTO propuesta;
    private String texto;
    private Date fecha;
    
    public ComentarioDTO() {
        this.fecha = new Date();
    }

    public ComentarioDTO(ColaboradorDTO autor, PropuestaDTO propuesta, String texto) {
        this.autor = autor;
        this.propuesta = propuesta;
        this.texto = texto;
        this.fecha = new Date();
    }

    public Long getId() {
        return id;
    }

    public ColaboradorDTO getAutor() {
        return autor;
    }

    public void setAutor(ColaboradorDTO autor) {
        this.autor = autor;
    }

    public PropuestaDTO getPropuesta() {
        return propuesta;
    }

    public void setPropuesta(PropuestaDTO propuesta) {
        this.propuesta = propuesta;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return String.format("[%1$td/%1$tm/%1$tY %1$tH:%1$tM] %2$s: %3$s",
            fecha, autor.getNickname(), texto);
    }

}
