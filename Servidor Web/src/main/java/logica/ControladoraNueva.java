/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Juanpi
 */
import java.util.ArrayList;
import java.util.List;
import logica.*;
import persistencia.*;
import logica.dtos.*;

public class ControladoraNueva extends logica.Ictrl {

    private ControladoraPersistencia controlP = new ControladoraPersistencia();

    //mia
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

    //mia
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

    //solo admin
    public void evaluarPropuesta() {
        //se listan las propuestas registradas en la bd con estado = ingresada.

        //se selecciona una y se determina si se publica o se cancela pasando su estado a publicada o cancelada.
        //se registra la fecha del cambio.
    }

    //solo admin
    public void altaPerfil() {

    }

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

    public PropuestaDTO buscoPropuestaDTO(String titulo) {
        Propuesta prop = this.buscoPropuesta(titulo);
        PropuestaDTO propDTO = PropuestaDTO.fromEntity(prop);
        return propDTO;
    }

    public List<UsuarioDTO> listarUsuariosDTO() {
        List<Usuario> entidades = this.listarUsuarios();
        List<UsuarioDTO> dtos = new ArrayList<>();
        for (Usuario u : entidades) {
            dtos.add(UsuarioDTO.fromEntity(u));
        }
        return dtos;
    }

    public List<ProponenteDTO> listarProponentesDTO() {
        List<Proponente> entidades = this.listarProponentes();
        List<ProponenteDTO> dtos = new ArrayList<>();
        for (Proponente p : entidades) {
            dtos.add(ProponenteDTO.fromEntity(p));
        }
        return dtos;
    }

    public List<ColaboradorDTO> listarColaboradoresDTO() {
        List<Colaborador> entidades = this.listarColaboradores();
        List<ColaboradorDTO> dtos = new ArrayList<>();
        for (Colaborador c : entidades) {
            dtos.add(ColaboradorDTO.fromEntity(c));
        }
        return dtos;
    }

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
                if (estado.equalsIgnoreCase("PUBLICADA") && p.getProp().equalsIgnoreCase(nickname)) {
                    resultado.add(p);
                }
            }
        }

        return resultado;
    }

    public List<PropuestaDTO> listarPropuestasIngresadas(String nickname) {
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
        List<PropuestaDTO> pub = new ArrayList<>();

        if (u != null) {
            for (PropuestaDTO p : dtos) {
                String estado = p.getEstadoActual().toString();
                if (estado.equalsIgnoreCase("INGRESADA") && p.getProp().equalsIgnoreCase(nickname)) {
                    pub.add(p);
                }
            }
        }

        return pub;
    }

    public List<PropuestaDTO> listarPropuestasFinanciadas(String nickname) {
        List<PropuestaDTO> dtos = this.listarPropuestasDTO();
        List<PropuestaDTO> financiadas = new ArrayList<>();
        for (PropuestaDTO p : dtos) {
            String estado = p.getEstadoActual().toString();
            if (estado.equalsIgnoreCase("FINANCIADA") && p.getProp().equalsIgnoreCase(nickname)) {
                financiadas.add(p);
            }
        }
        return financiadas;
    }

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

    public Usuario buscoUsuario2(String nickname) {
        return controlP.buscarUsuarioConRelaciones(nickname);
    }

    public void cancelarPropuesta(String titulo) {
        //la busco.
        Propuesta prop = this.buscoPropuesta(titulo);
        prop.setEstado(EstadoPropuesta.CANCELADA);
        prop.registrarCambioEstado(EstadoPropuesta.CANCELADA);
        this.modificoPropuesta(prop);
    }

    public boolean usuarioSigueA(Usuario usuarioSesion, String nickname) {
        boolean loSigue = false;
        List<Usuario> seguidos = usuarioSesion.getSeguidos();
        for (Usuario u : seguidos) {
            if (u.getNickname().equalsIgnoreCase(nickname)) {
                loSigue = true;
            }
        }
        return loSigue;
    }

    public List<Usuario> buscarSeguidos(String nickname) {
        Usuario u = controlP.buscarUsuarioConRelaciones(nickname); // trae seguidos y seguidores con JOIN FETCH
        if (u == null) {
            throw new IllegalArgumentException("El usuario no existe: " + nickname);
        }

        // Forzar carga (por si es Lazy)
        if (u.getSeguidos() != null) {
            u.getSeguidos().size();
        }

        return new ArrayList<>(u.getSeguidos());
    }

    public List<Usuario> buscarSeguidores(String nickname) {
        Usuario u = controlP.buscarUsuarioConRelaciones(nickname); // mismo método
        if (u == null) {
            throw new IllegalArgumentException("El usuario no existe: " + nickname);
        }

        if (u.getSeguidores() != null) {
            u.getSeguidores().size();
        }

        return new ArrayList<>(u.getSeguidores());
    }

}
