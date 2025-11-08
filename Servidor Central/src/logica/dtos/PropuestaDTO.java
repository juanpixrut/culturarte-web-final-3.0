/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.dtos;

/**
 *
 * @author Juanpi
 */
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import logica.*;

public class PropuestaDTO implements Serializable {

    private String proponenteNickname;
    private String titulo;
    private String descripcion;
    private byte[] imagen;
    private String tipoEspectaculo;
    private String lugar;
    private Date fechaRealizacion;
    private float precioEntrada;
    private float montoNecesario;
    private float montoRecaudado;
    private Date fechaPublicada;
    private EstadoPropuestaDTO estadoActual;
    //private List<HistorialEstadoDTO> historial;
    private List<ColaboracionDTO> colaboraciones;
    private String tipoRetorno;
    private LocalTime hora;
    private List<ComentarioDTO> comentarios;

    private String fechaRealizacionFormateada;  // NUEVO CAMPO

    // ----- Constructores -----
    public PropuestaDTO() {
        //historial = new ArrayList<>();
        colaboraciones = new ArrayList<>();
    }

    public PropuestaDTO(String prop, String titulo, String descripcion, String tipoEspectaculo,
            String lugar, Date fechaRealizacion, LocalTime hora, float precioEntrada, float montoNecesario,
            float montoRecaudado, Date fechaPublicada, EstadoPropuestaDTO estadoActual,
            //List<HistorialEstadoDTO> historial, List<ColaboracionDTO> colaboraciones,
            String tipoRetorno) {
        this.proponenteNickname = prop;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tipoEspectaculo = tipoEspectaculo;
        this.lugar = lugar;
        this.fechaRealizacion = fechaRealizacion;
        this.precioEntrada = precioEntrada;
        this.montoNecesario = montoNecesario;
        this.montoRecaudado = montoRecaudado;
        this.fechaPublicada = fechaPublicada;
        this.estadoActual = estadoActual;
        //this.historial = historial != null ? historial : new ArrayList<>();
        this.colaboraciones = colaboraciones != null ? colaboraciones : new ArrayList<>();
        this.comentarios = comentarios != null ? comentarios : new ArrayList<>();
        this.tipoRetorno = tipoRetorno;
        this.hora = hora;
    }

    // ----- Getters y Setters -----
    public String getFechaRealizacionFormateada() {
        return fechaRealizacionFormateada;
    }

    public void setFechaRealizacionFormateada(String fechaRealizacionFormateada) {
        this.fechaRealizacionFormateada = fechaRealizacionFormateada;
    }

    public String getProponenteNickname() {
        return proponenteNickname;
    }

    public void setProponenteNickname(String prop) {
        this.proponenteNickname = prop;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public String getTipoEspectaculo() {
        return tipoEspectaculo;
    }

    public void setTipoEspectaculo(String tipoEspectaculo) {
        this.tipoEspectaculo = tipoEspectaculo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Date getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(Date fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public float getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(float precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public float getMontoNecesario() {
        return montoNecesario;
    }

    public void setMontoNecesario(float montoNecesario) {
        this.montoNecesario = montoNecesario;
    }

    public float getMontoRecaudado() {
        return montoRecaudado;
    }

    public void setMontoRecaudado(float montoRecaudado) {
        this.montoRecaudado = montoRecaudado;
    }

    public Date getFechaPublicada() {
        return fechaPublicada;
    }

    public void setFechaPublicada(Date fechaPublicada) {
        this.fechaPublicada = fechaPublicada;
    }

    public EstadoPropuestaDTO getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(EstadoPropuestaDTO estadoActual) {
        this.estadoActual = estadoActual;
    }

    //public List<HistorialEstadoDTO> getHistorial() { return historial; }
    //public void setHistorial(List<HistorialEstadoDTO> historial) { this.historial = historial; }
    public List<ColaboracionDTO> getColaboraciones() {
        return colaboraciones;
    }

    public void setColaboraciones(List<ColaboracionDTO> colaboraciones) {
        this.colaboraciones = colaboraciones;
    }

    public String getTipoRetorno() {
        return tipoRetorno;
    }

    public void setTipoRetorno(String tipoRetorno) {
        this.tipoRetorno = tipoRetorno;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setComentarios(List<ComentarioDTO> comentarios) {
        this.comentarios = comentarios;
    }

    public List<ComentarioDTO> getComentarios() {
        return comentarios;
    }

    // ----- Conversión desde entidad -----
    public static PropuestaDTO fromEntity(Propuesta p) {
        if (p == null) {
            return null;
        }

        PropuestaDTO dto = new PropuestaDTO();

        // Datos básicos
        dto.setProponenteNickname(p.getProponente()); // suponiendo que devuelve String
        dto.setTitulo(p.getTitulo());
        dto.setDescripcion(p.getDescripcion());
        dto.setLugar(p.getLugar());
        dto.setTipoEspectaculo(p.getTipo());
        dto.setPrecioEntrada(p.getEntrada());
        dto.setMontoNecesario(p.getMonto());
        dto.setMontoRecaudado(p.getRecaudado());
        dto.setFechaRealizacion(p.getFecha());
        if (p.getFecha() != null) {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            dto.setFechaRealizacionFormateada(formato.format(p.getFecha()));
        }
        dto.setTipoRetorno(p.getTipoRetorno());
        dto.setHora(p.getHora());

        if (p.getEstadoActual() != null) {
            dto.setEstadoActual(EstadoPropuestaDTO.valueOf(p.getEstadoActual().name()));
        }

        // 🔒 Colaboraciones: solo lo necesario, sin recursión
        if (p.getColaboraciones() != null && !p.getColaboraciones().isEmpty()) {
            List<ColaboracionDTO> colaboracionesDTO = new ArrayList<>();
            for (Colaboracion c : p.getColaboraciones()) {
                ColaboracionDTO cDto = new ColaboracionDTO();
                cDto.setMontoAportado(c.getMontoAportado());
                cDto.setFecha(c.getFecha());

                // Colaborador “liviano”: solo nickname o datos básicos
                if (c.getColaborador() != null) {
                    Usuario u = c.getColaborador();
                    ColaboradorDTO colabDTO = new ColaboradorDTO();
                    colabDTO.setNickname(u.getNickname());
                    colabDTO.setNombre(u.getNombre());
                    colabDTO.setApellido(u.getApellido());
                    colabDTO.setCorreo(u.getEmail());
                    // sin listas, sin imagen
                    cDto.setColaboradorNickname(colabDTO.getNickname());
                }

                colaboracionesDTO.add(cDto);
            }
            dto.setColaboraciones(colaboracionesDTO);
        } else {
            dto.setColaboraciones(new ArrayList<>());
        }

        // 🔹 Comentarios
        if (p.getComentarios() != null && !p.getComentarios().isEmpty()) {
            List<ComentarioDTO> comentariosDTO = new ArrayList<>();
            for (Comentario c : p.getComentarios()) {
                ComentarioDTO cDto = new ComentarioDTO();
                cDto.setTexto(c.getTexto());
                cDto.setFecha(c.getFecha());
                if (c.getAutor() != null) {
                    cDto.setAutor(ColaboradorDTO.fromEntity(c.getAutor()));
                }
                comentariosDTO.add(cDto);
            }
            dto.setComentarios(comentariosDTO);
        } else {
            dto.setComentarios(new ArrayList<>());
        }

        return dto;
    }

    @Override
    public String toString() {
        return "PropuestaDTO{"
                + "titulo='" + titulo + '\''
                + ", proponente=" + (proponenteNickname != null ? proponenteNickname : "null")
                + ", estado=" + estadoActual
                + '}';
    }
}
