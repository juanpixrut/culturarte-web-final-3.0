/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.dtos;

/**
 *
 * @author Juanpi
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import logica.Usuario;

public class UsuarioDTO implements Serializable {

    private String nickname;
    private String nombre;
    private String apellido;
    private String correo;
    private byte[] imagen;
    private Date fechaNacimiento;

    // relaciones
    private List<UsuarioDTO> seguidos;
    private List<UsuarioDTO> seguidores;

    // ----- Constructores -----
    public UsuarioDTO() {
        this.seguidos = new ArrayList<>();
        this.seguidores = new ArrayList<>();
    }

    public UsuarioDTO(String nickname, String nombre, String apellido, String correo) {
        this.nickname = nickname;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }
    
        public UsuarioDTO(String nickname, String nombre, String apellido, String correo, byte[] imagen) {
        this.nickname = nickname;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.imagen = imagen;
    }

    // ----- Getters y Setters -----
    public String getNickname() { return nickname; }
    public void setNickname(String nickname) { this.nickname = nickname; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public byte[] getImagen() { return imagen; }
    public void setImagen(byte[] imagen) { this.imagen = imagen; }

    public Date getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(Date fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public List<UsuarioDTO> getSeguidos() { return seguidos; }
    public void setSeguidos(List<UsuarioDTO> seguidos) { this.seguidos = seguidos; }

    public List<UsuarioDTO> getSeguidores() { return seguidores; }
    public void setSeguidores(List<UsuarioDTO> seguidores) { this.seguidores = seguidores; }

    // ----- Conversión desde entidad -----
public static UsuarioDTO fromEntity(Usuario u) {
    if (u == null) return null;

    UsuarioDTO dto = new UsuarioDTO(
            u.getNickname(),
            u.getNombre(),
            u.getApellido(),
            u.getEmail(),
            u.getImagen()
    );

    //dto.setFechaNacimiento(u.getFechaNacimiento());

    // Relaciones (sin recursión infinita ni datos innecesarios)
    if (u.getSeguidos() != null && !u.getSeguidos().isEmpty()) {
        List<UsuarioDTO> seguidosDTO = new ArrayList<>();
        for (Usuario seguido : u.getSeguidos()) {
            // DTO liviano: solo datos básicos, sin imagen ni listas
            UsuarioDTO seguidoDTO = new UsuarioDTO();
            seguidoDTO.setNickname(seguido.getNickname());
            seguidoDTO.setNombre(seguido.getNombre());
            seguidoDTO.setApellido(seguido.getApellido());
            seguidoDTO.setCorreo(seguido.getEmail());
            seguidosDTO.add(seguidoDTO);
        }
        dto.setSeguidos(seguidosDTO);
    } else {
        dto.setSeguidos(new ArrayList<>());
    }

    if (u.getSeguidores() != null && !u.getSeguidores().isEmpty()) {
        List<UsuarioDTO> seguidoresDTO = new ArrayList<>();
        for (Usuario seguidor : u.getSeguidores()) {
            UsuarioDTO seguidorDTO = new UsuarioDTO();
            seguidorDTO.setNickname(seguidor.getNickname());
            seguidorDTO.setNombre(seguidor.getNombre());
            seguidorDTO.setApellido(seguidor.getApellido());
            seguidorDTO.setCorreo(seguidor.getEmail());
            seguidoresDTO.add(seguidorDTO);
        }
        dto.setSeguidores(seguidoresDTO);
    } else {
        dto.setSeguidores(new ArrayList<>());
    }

    return dto;
}


    @Override
    public String toString() {
        return nickname + " (" + nombre + " " + apellido + ")";
    }
}

