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
import java.util.List;
import logica.Proponente;
import logica.Propuesta;

import logica.*;
import persistencia.*;

public class ProponenteDTO extends UsuarioDTO implements Serializable {

    private String direccion;
    private String biografia;
    private String linkSitio;
    private List<PropuestaDTO> propuestas;

    // ----- Constructores -----
    public ProponenteDTO() {
        super();
        this.propuestas = new ArrayList<>();
    }

    public ProponenteDTO(String nickname, String nombre, String apellido, String correo, byte[] imagen,
                         String direccion, String biografia, String linkSitio) {
        super(nickname, nombre, apellido, correo);
        this.direccion = direccion;
        this.biografia = biografia;
        this.linkSitio = linkSitio;
        this.propuestas = new ArrayList<>();
    }

    // ----- Getters y Setters -----
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getBiografia() { return biografia; }
    public void setBiografia(String biografia) { this.biografia = biografia; }

    public String getLinkSitio() { return linkSitio; }
    public void setLinkSitio(String linkSitio) { this.linkSitio = linkSitio; }

    public List<PropuestaDTO> getPropuestas() { return propuestas; }
    public void setPropuestas(List<PropuestaDTO> propuestas) { this.propuestas = propuestas; }

    // ----- Conversión desde entidad -----
public static ProponenteDTO fromEntity(Proponente p) {
    if (p == null) return null;

    ProponenteDTO dto = new ProponenteDTO(
            p.getNickname(),
            p.getNombre(),
            p.getApellido(),
            p.getEmail(),
            null, // imagen
            p.getDireccion(),
            p.getBiografia(),
            p.getLink()
    );

    // Convertimos solo propuestas directas del proponente, sin recursión
    if (p.getPropuestas() != null && !p.getPropuestas().isEmpty()) {
        List<PropuestaDTO> propuestasDTO = new ArrayList<>();
        for (Propuesta prop : p.getPropuestas()) {
            PropuestaDTO pDto = new PropuestaDTO();
            pDto.setTitulo(prop.getTitulo());
            pDto.setDescripcion(prop.getDescripcion());
            pDto.setLugar(prop.getLugar());
            pDto.setMontoNecesario(prop.getMonto());
            pDto.setMontoRecaudado(prop.getRecaudado());
            pDto.setEstadoActual(EstadoPropuestaDTO.valueOf(prop.getEstadoActual().name()));
            propuestasDTO.add(pDto);
        }
        dto.setPropuestas(propuestasDTO);
    } else {
        dto.setPropuestas(new ArrayList<>());
    }

    return dto;
}



    @Override
    public String toString() {
        return "ProponenteDTO{" +
                "nickname='" + getNickname() + '\'' +
                ", direccion='" + direccion + '\'' +
                ", linkSitio='" + linkSitio + '\'' +
                ", propuestas=" + (propuestas != null ? propuestas.size() : 0) +
                '}';
    }
}

