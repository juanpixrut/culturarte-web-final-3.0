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
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.swing.ImageIcon;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;

import java.util.List;
import java.util.ArrayList;

import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", discriminatorType = DiscriminatorType.STRING)
public class Usuario implements Serializable {
    @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE) esto no porque es String. no puedo auto incrementarse
    protected String nickname;
    @Basic
    protected String nombre;
    protected String apellido;
    protected String correo;
    protected byte[] imagen;
    @Temporal(TemporalType.DATE)
    protected Date fechaNacimiento;
    
    @ManyToMany
    protected List<Usuario> seguidos;
    
    @ManyToMany(mappedBy = "seguidos")
    protected List<Usuario> seguidores;
    
    @ManyToMany
    protected List<Propuesta> propuestasFavoritas;
    
    @Basic
    protected String contrasena;

    public Usuario(){
        
    }
    
    public Usuario(String nickname, String nombre, String apellido, String correo, byte[] imagenBytes){
        this.nickname = nickname;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.imagen = imagenBytes;
        this.seguidos = new ArrayList<>();
        this.seguidores = new ArrayList<>();
        this.propuestasFavoritas = new ArrayList<>();
    }
        public Usuario(String nickname, String nombre, String apellido, String correo, byte[] imagenBytes, String contrasena){
        this.nickname = nickname;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.imagen = imagenBytes;
        this.seguidos = new ArrayList<>();
        this.seguidores = new ArrayList<>();
        this.propuestasFavoritas = new ArrayList<>();
        this.contrasena = contrasena;
    }
    
    public String getNickname(){
    return nickname;
    }
    
    public String getNombre(){
    return nombre;
    }
    
    public String getApellido(){
    return apellido;
    }
  
    public ImageIcon bytesAIcon(){
    if(imagen == null || imagen.length == 0) return null;
    try{
    BufferedImage src = ImageIO.read(new ByteArrayInputStream(imagen));
    if(src == null) return null;
    return new ImageIcon(src);
    }catch(Exception e){
    return null;
    }
    }
    
    public String getEmail(){
    return this.correo;
    }
    
    public List<Usuario> getSeguidores(){
    return seguidores;
    }
    
    public List<Usuario> getSeguidos(){
    return seguidos;
    }
    
    public String getContrasena(){
    return contrasena;
    }
    
    public byte[] getImagen(){
    return this.imagen;
    }
    
    public List<Propuesta> getFavoritas(){
    return propuestasFavoritas;
    }
    
    public void setNickname(String nickname){
    this.nickname = nickname;
    }
    
    public void setContrasena(String contrasena){
    this.contrasena = contrasena;
    }
    
    public void setFavoritas(List<Propuesta> propuestas){
    this.propuestasFavoritas = propuestas;
    }
    
    public void setSeguidores(List<Usuario> seguidores){
    this.seguidores = seguidores;
    }
        
}
