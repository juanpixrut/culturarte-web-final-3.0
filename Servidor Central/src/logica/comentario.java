/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

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
@Entity
public class Comentario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "colaborador_id")
    private Colaborador autor;

    @ManyToOne
    @JoinColumn(name = "propuesta_id")
    private Propuesta propuesta;

    @Basic
    private String texto;
    @Temporal(TemporalType.TIMESTAMP) //timestamp para hora tamb.
    private Date fecha;

    public Comentario() {
        this.fecha = new Date();
    }

    public Comentario(Colaborador autor, Propuesta propuesta, String texto) {
        this.autor = autor;
        this.propuesta = propuesta;
        this.texto = texto;
        this.fecha = new Date();
    }

    public Long getId() {
        return id;
    }

    public Colaborador getAutor() {
        return autor;
    }

    public void setAutor(Colaborador autor) {
        this.autor = autor;
    }

    public Propuesta getPropuesta() {
        return propuesta;
    }

    public void setPropuesta(Propuesta propuesta) {
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
