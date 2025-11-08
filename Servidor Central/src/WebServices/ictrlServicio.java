/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WebServices;

/**
 *
 * @author Juanpi
 */
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.WebParam;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import logica.*;
import logica.dtos.CategoriaDTO;
import logica.dtos.ColaboracionDTO;
import logica.dtos.ColaboradorDTO;
import logica.dtos.ComentarioDTO;
import logica.dtos.EstadoPropuestaDTO;
import logica.dtos.ProponenteDTO;
import logica.dtos.PropuestaDTO;
import logica.dtos.UsuarioDTO;
import persistencia.ControladoraPersistencia;

@WebService
public class ictrlServicio {

    private ControladoraPersistencia controlP = new ControladoraPersistencia();

    @WebMethod
    public String saludar(@WebParam(name = "nombre") String nombre) {
        return "Hola " + nombre + "!";
    }

    public List<Proponente> listarProponentes() {
        return controlP.listarProponentes();
    }

    public List<Colaborador> listarColaboradores() {
        return controlP.listarColaboradores();
    }

    @WebMethod
    public Proponente buscoProponente(String nickname) {

        Proponente seleccionado = null;
        for (Proponente p : this.listarProponentes()) {
            if (p.getNickname().equalsIgnoreCase(nickname)) {
                seleccionado = p;
                break;
            }
        }
        return seleccionado;
    }

    @WebMethod
    public Colaborador buscoColaborador(String nickname) {

        Colaborador seleccionado = null;
        for (Colaborador c : this.listarColaboradores()) {
            if (c.getNickname().equalsIgnoreCase(nickname)) {
                seleccionado = c;
                break;
            }
        }
        return seleccionado;
    }

    @WebMethod
    public ColaboradorDTO buscoColaboradorDTO(String nickname) {

        Colaborador seleccionado = null;
        for (Colaborador c : this.listarColaboradores()) {
            if (c.getNickname().equalsIgnoreCase(nickname)) {
                seleccionado = c;
                break;
            }
        }
        ColaboradorDTO colDTO = ColaboradorDTO.fromEntity(seleccionado);
        return colDTO;
    }

    @WebMethod
    public boolean validarUsuario(String usuario, String clave) {
        boolean valido = false;
        for (Proponente p : this.listarProponentes()) {
            if (p.getNickname().equalsIgnoreCase(usuario)) {
                if (p.getContrasena().equalsIgnoreCase(clave)) {
                    valido = true;
                    break;
                }
            }
        }

        for (Colaborador c : this.listarColaboradores()) {
            if (c.getNickname().equalsIgnoreCase(usuario)) {
                if (c.getNickname().equalsIgnoreCase(usuario)) {
                    if (c.getContrasena().equalsIgnoreCase(clave)) {
                        valido = true;
                        break;
                    }
                }
            }
        }
        return valido;
    }

    @WebMethod
    public String buscoRol(String usuario) {
        String rol = null;
        for (Proponente p : this.listarProponentes()) {
            if (p.getNickname().equalsIgnoreCase(usuario)) {
                rol = "proponente";
                break;
            }
        }
        for (Colaborador c : this.listarColaboradores()) {
            if (c.getNickname().equalsIgnoreCase(usuario)) {
                rol = "colaborador";
                break;
            }
        }
        return rol;
    }

    @WebMethod
    public Usuario buscoUsuario(String nickname) {
        Colaborador col = this.buscoColaborador(nickname);
        Proponente prop = this.buscoProponente(nickname);
        Usuario usuario = null;
        if (col != null) {
            usuario = col;
        } else if (prop != null) {
            usuario = prop;
        }
        return usuario;
    }

    @WebMethod
    public List<PropuestaDTO> listarPropuestasDTO() {
        List<Propuesta> entidades = this.listarPropuestas();
        List<PropuestaDTO> dtos = new ArrayList<>();

        for (Propuesta p : entidades) {
            dtos.add(new PropuestaDTO(
                    p.getProponente(),
                    p.getTitulo(),
                    p.getDescripcion(),
                    p.getTipo(),
                    p.getLugar(),
                    p.getFecha(),
                    p.getHora(),
                    p.getEntrada(),
                    p.getMonto(),
                    p.getRecaudado(),
                    p.getFechaPublicada(),
                    EstadoPropuestaDTO.fromEntity(p.getEstadoActual()),
                    p.getTipoRetorno()
            ));
        }
        return dtos;
    }

    public List<Propuesta> listarPropuestas() {
        return controlP.listarPropuestas();
    }

    @WebMethod
    public Propuesta buscoPropuesta(String titulo) {
        Propuesta prop = null;
        for (Propuesta p : this.listarPropuestas()) {
            if (p.getTitulo().equalsIgnoreCase(titulo)) {
                prop = p;
                break;
            }
        }
        return prop;
    }

    @WebMethod
    public void altaPerfilProponente(String nickname, String nombre, String apellido, String correo, byte[] imagenBytes, String direccion, String biografia, String linkSitio, String contrasena) {
        //imagen opcional
        //si el nickname o el correo esta en uso o un campo vacio o formato incorrecto, el sistema avisa.

        //una vez creado le paso el Usuario que sea a controlP
        Proponente p = new Proponente(nickname, nombre, apellido, correo, imagenBytes, contrasena, direccion, biografia, linkSitio);
        //controlP.crearUsuario(u);
        controlP.crearUsuarioProponente(p);
    }

    @WebMethod
    public void altaPerfilColaborador(String nickname, String nombre, String apellido, String correo, byte[] imagenBytes, String contrasena) {
        Colaborador c = new Colaborador(nickname, nombre, apellido, correo, imagenBytes, contrasena);
        controlP.crearUsuarioColaborador(c);
    }

    @WebMethod
    public List<Categoria> listarCategoria() {
        return controlP.listarCategoria();
    }

    @WebMethod
    public List<CategoriaDTO> listarCategoriaDTO() {
        List<Categoria> categorias = controlP.listarCategoria();
        List<CategoriaDTO> categoriasDTO = new ArrayList<>();

        for (Categoria c : categorias) {
            categoriasDTO.add(CategoriaDTO.fromEntity(c));
        }

        return categoriasDTO;
    }

    @WebMethod
    public List<PropuestaDTO> listarPropuestasFinanciadas(String nickname) {
        List<PropuestaDTO> dtos = this.listarPropuestasDTO();
        List<PropuestaDTO> financiadas = new ArrayList<>();
        for (PropuestaDTO p : dtos) {
            String estado = p.getEstadoActual().toString();
            if (estado.equalsIgnoreCase("FINANCIADA") && p.getProponenteNickname().equalsIgnoreCase(nickname)) {
                financiadas.add(p);
            }
        }
        return financiadas;
    }

    @WebMethod
    public void cancelarPropuesta(String titulo) {
        //la busco.
        Propuesta prop = this.buscoPropuesta(titulo);
        prop.setEstado(EstadoPropuesta.CANCELADA);
        prop.registrarCambioEstado(EstadoPropuesta.CANCELADA);
        this.modificoPropuesta(prop);
    }

    @WebMethod
    public Usuario buscoUsuario2(String nickname) {
        return controlP.buscarUsuarioConRelaciones(nickname);
    }

    @WebMethod
    public UsuarioDTO buscoUsuarioDTO(String nickname) {
        try {
            Usuario u = controlP.buscarUsuarioConRelaciones(nickname);
            if (u == null) {
                System.out.println("⚠️ Usuario no encontrado: " + nickname);
                return null; // o lanzar una excepción controlada
            }
            UsuarioDTO usuDTO = UsuarioDTO.fromEntity(u);
            return usuDTO;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @WebMethod
    public boolean usuarioSigueA(String nicknameSesion, String nicknameBuscado) {
        // Buscar al usuario logueado (el que sigue)
        Usuario seguidor = this.buscoUsuario(nicknameSesion);
        if (seguidor == null) {
            return false;
        }

        // Forzar carga de seguidos si es lazy
        List<Usuario> seguidos = seguidor.getSeguidos();
        if (seguidos == null || seguidos.isEmpty()) {
            return false;
        }

        // Recorrer sus seguidos y ver si contiene al otro usuario
        for (Usuario seguido : seguidos) {
            if (seguido.getNickname().equalsIgnoreCase(nicknameBuscado)) {
                return true;
            }
        }
        return false;
    }

    @WebMethod
    public PropuestaDTO buscoPropuestaDTO(String titulo) {
        Propuesta prop = this.buscoPropuesta(titulo);
        PropuestaDTO propDTO = PropuestaDTO.fromEntity(prop);
        return propDTO;
    }

    @WebMethod
    public List<Colaboracion> listarColaboraciones() {
        return controlP.listarColaboraciones();
    }

    @WebMethod
    public List<ColaboracionDTO> listarColaboracionesDTO() {
        List<Colaboracion> entidades = controlP.listarColaboraciones();
        List<ColaboracionDTO> dtos = new ArrayList<>();

        for (Colaboracion c : entidades) {
            dtos.add(ColaboracionDTO.fromEntity(c));
        }

        return dtos;
    }

    @WebMethod
    public List<ComentarioDTO> listarComentariosDePropuesta(String tituloPropuesta) {
        PropuestaDTO p = this.buscoPropuestaDTO(tituloPropuesta);
        return p != null ? p.getComentarios() : new ArrayList<>();
    }

    @WebMethod
    public List<PropuestaDTO> listarPropuestasNoIngresadas() {
        List<PropuestaDTO> dtos = this.listarPropuestasDTO();
        List<PropuestaDTO> resultado = new ArrayList<>();
        for (PropuestaDTO p : dtos) {
            String estado = p.getEstadoActual().toString();
            if (!estado.equalsIgnoreCase("INGRESADA")) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    @WebMethod
    public List<PropuestaDTO> listarPropuestasIngresadas(String nickname) {
        List<PropuestaDTO> dtos = this.listarPropuestasDTO();
        List<PropuestaDTO> pub = new ArrayList<>();
        for (PropuestaDTO p : dtos) {
            String estado = p.getEstadoActual().toString();
            if (estado.equalsIgnoreCase("INGRESADA") && p.getProponenteNickname().equalsIgnoreCase(nickname)) {
                pub.add(p);
            }
        }
        return pub;
    }

    @WebMethod
    public List<PropuestaDTO> listarPropuestasFavoritas(String nickname) {
        String rol = buscoRol(nickname);
        Usuario u = null;
        if (rol.equalsIgnoreCase("proponente")) {
            Proponente prop = this.buscoProponente(nickname);
            u = prop;
        } else if (rol.equalsIgnoreCase("colaborador")) {
            Colaborador col = this.buscoColaborador(nickname);
            u = col;
        }

        List<PropuestaDTO> resultado = new ArrayList<>();

        if (u != null && u.getFavoritas() != null) {
            for (Propuesta p : u.getFavoritas()) {
                resultado.add(PropuestaDTO.fromEntity(p));
            }
        }

        return resultado;
    }

    @WebMethod
    public List<UsuarioDTO> buscarSeguidos(String nickname) {
        Usuario u = controlP.buscarUsuarioConRelaciones(nickname); // trae seguidos y seguidores con JOIN FETCH
        if (u == null) {
            throw new IllegalArgumentException("El usuario no existe: " + nickname);
        }

        // Forzar carga (por si es Lazy)
        if (u.getSeguidos() != null) {
            u.getSeguidos().size();
        }

        UsuarioDTO usuDTO = UsuarioDTO.fromEntity(u);

        return new ArrayList<>(usuDTO.getSeguidos());
    }

    @WebMethod
    public List<UsuarioDTO> buscarSeguidores(String nickname) {
        Usuario u = controlP.buscarUsuarioConRelaciones(nickname); // mismo método
        if (u == null) {
            throw new IllegalArgumentException("El usuario no existe: " + nickname);
        }

        if (u.getSeguidores() != null) {
            u.getSeguidores().size();
        }

        UsuarioDTO usuDTO = UsuarioDTO.fromEntity(u);

        return new ArrayList<>(usuDTO.getSeguidores());
    }

    @WebMethod
    public List<PropuestaDTO> listarPropuestasPublicadas(String nickname) {
        String rol = buscoRol(nickname);
        Usuario u = null;
        if (rol.equalsIgnoreCase("proponente")) {
            Proponente prop = this.buscoProponente(nickname);
            u = prop;
        } else if (rol.equalsIgnoreCase("colaborador")) {
            Colaborador col = this.buscoColaborador(nickname);
            u = col;
        }

        List<PropuestaDTO> dtos = this.listarPropuestasDTO();
        List<PropuestaDTO> resultado = new ArrayList<>();

        if (u != null) {
            for (PropuestaDTO p : dtos) {
                String estado = p.getEstadoActual().toString();
                if (estado.equalsIgnoreCase("PUBLICADA") && p.getProponenteNickname().equalsIgnoreCase(nickname)) {
                    resultado.add(p);
                }
            }
        }

        return resultado;
    }

    @WebMethod
    public List<ProponenteDTO> listarProponentesDTO() {
        List<Proponente> entidades = this.listarProponentes();
        List<ProponenteDTO> dtos = new ArrayList<>();
        for (Proponente p : entidades) {
            dtos.add(ProponenteDTO.fromEntity(p));
        }
        return dtos;
    }

    @WebMethod
    public List<ColaboradorDTO> listarColaboradoresDTO() {
        List<Colaborador> entidades = this.listarColaboradores();
        List<ColaboradorDTO> dtos = new ArrayList<>();
        for (Colaborador c : entidades) {
            dtos.add(ColaboradorDTO.fromEntity(c));
        }
        return dtos;
    }

    @WebMethod
    public void dejarComentario(String nickname, String titulo, String texto) {
        Colaborador c = this.buscoColaborador(nickname);
        Propuesta p = this.buscoPropuesta(titulo);
        Comentario nuevo = new Comentario(c, p, texto);
        p.agregarComentario(nuevo);
        this.modificoPropuesta(p);
    }

    @WebMethod
    public void dejarSeguir(String seguidorNick, String seguidoNick) {

        //
        controlP.dejarDeSeguir(seguidorNick, seguidoNick);
        controlP.limpiarCache();
    }

    @WebMethod
    public void seguirUsuario(String seguidorNick, String seguidoNick) {

        //
        controlP.seguirUsuario(seguidorNick, seguidoNick);
        controlP.limpiarCache();
    }

    public void modificoPropuesta(Propuesta prop) {
        controlP.modificoPropuesta(prop);
    }

    @WebMethod
    public void cambiarEstadoPropuesta(String titulo, String estado) {
        Propuesta p = this.buscoPropuesta(titulo);
        switch (estado) {
            case "INGRESADA":
                p.cambiarEstado(EstadoPropuesta.INGRESADA);
                break;

            case "PUBLICADA":
                p.cambiarEstado(EstadoPropuesta.PUBLICADA);
                break;

            case "EN_FINANCIACION":
                p.cambiarEstado(EstadoPropuesta.EN_FINANCIACION);
                break;

            case "FINANCIADA":
                p.cambiarEstado(EstadoPropuesta.FINANCIADA);
                break;

            case "NO_FINANCIADA":
                p.cambiarEstado(EstadoPropuesta.NO_FINANCIADA);
                break;

            case "CANCELADA":
                p.cambiarEstado(EstadoPropuesta.CANCELADA);
                break;
        }

        this.modificoPropuesta(p);

    }

    @WebMethod
    public void altaColaboracion(String nicknameColaborador, String titulo, Float montoAportado, String tipoRetorno, String fecha) {
        Propuesta prop = this.buscoPropuesta(titulo);
        prop.setMontoRecaudado(montoAportado);
        //cambiar estado  de Propuesta dependiendo
        if (prop.getEstadoActual().toString().equalsIgnoreCase("INGRESADA")) {
            prop.setEstado(EstadoPropuesta.EN_FINANCIACION);
        } else if (prop.getEstadoActual().toString().equalsIgnoreCase("EN_FINANCIACION")) {
            Float total = prop.getRecaudado() + montoAportado;
            if (total >= prop.getMonto()) {
                prop.setEstado(EstadoPropuesta.FINANCIADA);
            }
        }

        controlP.modificoPropuesta(prop);

        Colaborador colab = this.buscoColaborador(nicknameColaborador);
        Colaboracion col = new Colaboracion(colab, prop, montoAportado, tipoRetorno);
        controlP.crearColaboracion(col);
    }

    @WebMethod
    public void altaPropuesta(
            Proponente proponente,
            String titulo,
            String descripcion,
            String tipoEspectaculo,
            String lugar,
            String fechaRealizacion, // ejemplo: "2025-11-04"
            String hora, // ejemplo: "14:30"
            float precioEntrada,
            float montoNecesario,
            String tipoRetorno,
            byte[] imagenBytes,
            String estado
    ) {
        try {
            // Parsear la fecha desde el string
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date fecha = sdf.parse(fechaRealizacion);

            LocalTime horaLocal = LocalTime.parse(hora);
            EstadoPropuesta estadoEnum = EstadoPropuesta.valueOf(estado);

            Propuesta prop = new Propuesta(
                    proponente,
                    titulo,
                    descripcion,
                    tipoEspectaculo,
                    lugar,
                    fecha,
                    horaLocal,
                    precioEntrada,
                    montoNecesario,
                    tipoRetorno
            );

            prop.setImagen(imagenBytes);
            prop.setEstado(estadoEnum);
            controlP.crearPropuesta(prop);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error al crear la propuesta: " + e.getMessage());
        }
    }

    
    //filtro
    @WebMethod
    public void registrarAcceso(String ip, String url, String browser, String so){
        controlP.registrarAcceso(ip, url, browser, so);
    }
    
    
    
    
}
