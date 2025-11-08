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
import logica.Colaborador;
import logica.Colaboracion;

import logica.*;
import persistencia.*;

public class ColaboradorDTO extends UsuarioDTO implements Serializable {

    private List<ColaboracionDTO> colaboraciones;

    public ColaboradorDTO() {
        this.colaboraciones = new ArrayList<>();
    }

    public ColaboradorDTO(String nickname, String nombre, String apellido, String correo) {
        super(nickname, nombre, apellido, correo);
        this.colaboraciones = new ArrayList<>();
    }

    public List<ColaboracionDTO> getColaboraciones() { return colaboraciones; }
    public void setColaboraciones(List<ColaboracionDTO> colaboraciones) { this.colaboraciones = colaboraciones; }

public static ColaboradorDTO fromEntity(Colaborador c) {
    if (c == null) return null;

    ColaboradorDTO dto = new ColaboradorDTO(
            c.getNickname(),
            c.getNombre(),
            c.getApellido(),
            c.getEmail()
    );

    // Convertimos solo colaboraciones directas, sin Propuesta completa adentro
    if (c.getColaboraciones() != null && !c.getColaboraciones().isEmpty()) {
        List<ColaboracionDTO> colaboracionesDTO = new ArrayList<>();
        for (Colaboracion colab : c.getColaboraciones()) {
            ColaboracionDTO cDto = new ColaboracionDTO();
            cDto.setMontoAportado(colab.getMontoAportado());
            cDto.setFecha(colab.getFecha());

            // Guardamos solo el título de la propuesta, no el objeto entero
            if (colab.getPropuesta() != null) {
                Propuesta prop = colab.getPropuesta();
                PropuestaDTO pDto = new PropuestaDTO();
                pDto.setTitulo(prop.getTitulo());
                cDto.setPropuestaTitulo(pDto.getTitulo());
            }

            colaboracionesDTO.add(cDto);
        }
        dto.setColaboraciones(colaboracionesDTO);
    } else {
        dto.setColaboraciones(new ArrayList<>());
    }

    return dto;
}


    @Override
    public String toString() {
        return "ColaboradorDTO{" +
                "nickname='" + getNickname() + '\'' +
                ", colaboraciones=" + (colaboraciones != null ? colaboraciones.size() : 0) +
                '}';
    }
}
