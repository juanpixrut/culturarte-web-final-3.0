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
public class comentario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "colaborador_id")
    private colaborador autor;

    @ManyToOne
    @JoinColumn(name = "propuesta_id")
    private propuesta propuesta;

    @Basic
    private String texto;
    @Temporal(TemporalType.TIMESTAMP) //timestamp para hora tamb.
    private Date fecha;

    public comentario() {
        this.fecha = new Date();
    }

    public comentario(colaborador autor, propuesta propuesta, String texto) {
        this.autor = autor;
        this.propuesta = propuesta;
        this.texto = texto;
        this.fecha = new Date();
    }

    public Long getId() {
        return id;
    }

    public colaborador getAutor() {
        return autor;
    }

    public void setAutor(colaborador autor) {
        this.autor = autor;
    }

    public propuesta getPropuesta() {
        return propuesta;
    }

    public void setPropuesta(propuesta propuesta) {
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
