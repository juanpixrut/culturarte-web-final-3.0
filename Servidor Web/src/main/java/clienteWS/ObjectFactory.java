
package clienteWS;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the clienteWS package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _AltaColaboracion_QNAME = new QName("http://WebServices/", "altaColaboracion");
    private static final QName _AltaColaboracionResponse_QNAME = new QName("http://WebServices/", "altaColaboracionResponse");
    private static final QName _AltaPerfilColaborador_QNAME = new QName("http://WebServices/", "altaPerfilColaborador");
    private static final QName _AltaPerfilColaboradorResponse_QNAME = new QName("http://WebServices/", "altaPerfilColaboradorResponse");
    private static final QName _AltaPerfilProponente_QNAME = new QName("http://WebServices/", "altaPerfilProponente");
    private static final QName _AltaPerfilProponenteResponse_QNAME = new QName("http://WebServices/", "altaPerfilProponenteResponse");
    private static final QName _AltaPropuesta_QNAME = new QName("http://WebServices/", "altaPropuesta");
    private static final QName _AltaPropuestaResponse_QNAME = new QName("http://WebServices/", "altaPropuestaResponse");
    private static final QName _BuscarSeguidores_QNAME = new QName("http://WebServices/", "buscarSeguidores");
    private static final QName _BuscarSeguidoresResponse_QNAME = new QName("http://WebServices/", "buscarSeguidoresResponse");
    private static final QName _BuscarSeguidos_QNAME = new QName("http://WebServices/", "buscarSeguidos");
    private static final QName _BuscarSeguidosResponse_QNAME = new QName("http://WebServices/", "buscarSeguidosResponse");
    private static final QName _BuscoColaborador_QNAME = new QName("http://WebServices/", "buscoColaborador");
    private static final QName _BuscoColaboradorDTO_QNAME = new QName("http://WebServices/", "buscoColaboradorDTO");
    private static final QName _BuscoColaboradorDTOResponse_QNAME = new QName("http://WebServices/", "buscoColaboradorDTOResponse");
    private static final QName _BuscoColaboradorResponse_QNAME = new QName("http://WebServices/", "buscoColaboradorResponse");
    private static final QName _BuscoProponente_QNAME = new QName("http://WebServices/", "buscoProponente");
    private static final QName _BuscoProponenteResponse_QNAME = new QName("http://WebServices/", "buscoProponenteResponse");
    private static final QName _BuscoPropuesta_QNAME = new QName("http://WebServices/", "buscoPropuesta");
    private static final QName _BuscoPropuestaDTO_QNAME = new QName("http://WebServices/", "buscoPropuestaDTO");
    private static final QName _BuscoPropuestaDTOResponse_QNAME = new QName("http://WebServices/", "buscoPropuestaDTOResponse");
    private static final QName _BuscoPropuestaResponse_QNAME = new QName("http://WebServices/", "buscoPropuestaResponse");
    private static final QName _BuscoRol_QNAME = new QName("http://WebServices/", "buscoRol");
    private static final QName _BuscoRolResponse_QNAME = new QName("http://WebServices/", "buscoRolResponse");
    private static final QName _BuscoUsuario_QNAME = new QName("http://WebServices/", "buscoUsuario");
    private static final QName _BuscoUsuario2_QNAME = new QName("http://WebServices/", "buscoUsuario2");
    private static final QName _BuscoUsuario2Response_QNAME = new QName("http://WebServices/", "buscoUsuario2Response");
    private static final QName _BuscoUsuarioDTO_QNAME = new QName("http://WebServices/", "buscoUsuarioDTO");
    private static final QName _BuscoUsuarioDTOResponse_QNAME = new QName("http://WebServices/", "buscoUsuarioDTOResponse");
    private static final QName _BuscoUsuarioResponse_QNAME = new QName("http://WebServices/", "buscoUsuarioResponse");
    private static final QName _CambiarEstadoPropuesta_QNAME = new QName("http://WebServices/", "cambiarEstadoPropuesta");
    private static final QName _CambiarEstadoPropuestaResponse_QNAME = new QName("http://WebServices/", "cambiarEstadoPropuestaResponse");
    private static final QName _CancelarPropuesta_QNAME = new QName("http://WebServices/", "cancelarPropuesta");
    private static final QName _CancelarPropuestaResponse_QNAME = new QName("http://WebServices/", "cancelarPropuestaResponse");
    private static final QName _DejarComentario_QNAME = new QName("http://WebServices/", "dejarComentario");
    private static final QName _DejarComentarioResponse_QNAME = new QName("http://WebServices/", "dejarComentarioResponse");
    private static final QName _DejarSeguir_QNAME = new QName("http://WebServices/", "dejarSeguir");
    private static final QName _DejarSeguirResponse_QNAME = new QName("http://WebServices/", "dejarSeguirResponse");
    private static final QName _ListarCategoria_QNAME = new QName("http://WebServices/", "listarCategoria");
    private static final QName _ListarCategoriaDTO_QNAME = new QName("http://WebServices/", "listarCategoriaDTO");
    private static final QName _ListarCategoriaDTOResponse_QNAME = new QName("http://WebServices/", "listarCategoriaDTOResponse");
    private static final QName _ListarCategoriaResponse_QNAME = new QName("http://WebServices/", "listarCategoriaResponse");
    private static final QName _ListarColaboraciones_QNAME = new QName("http://WebServices/", "listarColaboraciones");
    private static final QName _ListarColaboracionesDTO_QNAME = new QName("http://WebServices/", "listarColaboracionesDTO");
    private static final QName _ListarColaboracionesDTOResponse_QNAME = new QName("http://WebServices/", "listarColaboracionesDTOResponse");
    private static final QName _ListarColaboracionesResponse_QNAME = new QName("http://WebServices/", "listarColaboracionesResponse");
    private static final QName _ListarColaboradores_QNAME = new QName("http://WebServices/", "listarColaboradores");
    private static final QName _ListarColaboradoresDTO_QNAME = new QName("http://WebServices/", "listarColaboradoresDTO");
    private static final QName _ListarColaboradoresDTOResponse_QNAME = new QName("http://WebServices/", "listarColaboradoresDTOResponse");
    private static final QName _ListarColaboradoresResponse_QNAME = new QName("http://WebServices/", "listarColaboradoresResponse");
    private static final QName _ListarComentariosDePropuesta_QNAME = new QName("http://WebServices/", "listarComentariosDePropuesta");
    private static final QName _ListarComentariosDePropuestaResponse_QNAME = new QName("http://WebServices/", "listarComentariosDePropuestaResponse");
    private static final QName _ListarProponentes_QNAME = new QName("http://WebServices/", "listarProponentes");
    private static final QName _ListarProponentesDTO_QNAME = new QName("http://WebServices/", "listarProponentesDTO");
    private static final QName _ListarProponentesDTOResponse_QNAME = new QName("http://WebServices/", "listarProponentesDTOResponse");
    private static final QName _ListarProponentesResponse_QNAME = new QName("http://WebServices/", "listarProponentesResponse");
    private static final QName _ListarPropuestas_QNAME = new QName("http://WebServices/", "listarPropuestas");
    private static final QName _ListarPropuestasDTO_QNAME = new QName("http://WebServices/", "listarPropuestasDTO");
    private static final QName _ListarPropuestasDTOResponse_QNAME = new QName("http://WebServices/", "listarPropuestasDTOResponse");
    private static final QName _ListarPropuestasFavoritas_QNAME = new QName("http://WebServices/", "listarPropuestasFavoritas");
    private static final QName _ListarPropuestasFavoritasResponse_QNAME = new QName("http://WebServices/", "listarPropuestasFavoritasResponse");
    private static final QName _ListarPropuestasFinanciadas_QNAME = new QName("http://WebServices/", "listarPropuestasFinanciadas");
    private static final QName _ListarPropuestasFinanciadasResponse_QNAME = new QName("http://WebServices/", "listarPropuestasFinanciadasResponse");
    private static final QName _ListarPropuestasIngresadas_QNAME = new QName("http://WebServices/", "listarPropuestasIngresadas");
    private static final QName _ListarPropuestasIngresadasResponse_QNAME = new QName("http://WebServices/", "listarPropuestasIngresadasResponse");
    private static final QName _ListarPropuestasNoIngresadas_QNAME = new QName("http://WebServices/", "listarPropuestasNoIngresadas");
    private static final QName _ListarPropuestasNoIngresadasResponse_QNAME = new QName("http://WebServices/", "listarPropuestasNoIngresadasResponse");
    private static final QName _ListarPropuestasPublicadas_QNAME = new QName("http://WebServices/", "listarPropuestasPublicadas");
    private static final QName _ListarPropuestasPublicadasResponse_QNAME = new QName("http://WebServices/", "listarPropuestasPublicadasResponse");
    private static final QName _ListarPropuestasResponse_QNAME = new QName("http://WebServices/", "listarPropuestasResponse");
    private static final QName _ModificoPropuesta_QNAME = new QName("http://WebServices/", "modificoPropuesta");
    private static final QName _ModificoPropuestaResponse_QNAME = new QName("http://WebServices/", "modificoPropuestaResponse");
    private static final QName _RegistrarAcceso_QNAME = new QName("http://WebServices/", "registrarAcceso");
    private static final QName _RegistrarAccesoResponse_QNAME = new QName("http://WebServices/", "registrarAccesoResponse");
    private static final QName _Saludar_QNAME = new QName("http://WebServices/", "saludar");
    private static final QName _SaludarResponse_QNAME = new QName("http://WebServices/", "saludarResponse");
    private static final QName _SeguirUsuario_QNAME = new QName("http://WebServices/", "seguirUsuario");
    private static final QName _SeguirUsuarioResponse_QNAME = new QName("http://WebServices/", "seguirUsuarioResponse");
    private static final QName _UsuarioSigueA_QNAME = new QName("http://WebServices/", "usuarioSigueA");
    private static final QName _UsuarioSigueAResponse_QNAME = new QName("http://WebServices/", "usuarioSigueAResponse");
    private static final QName _ValidarUsuario_QNAME = new QName("http://WebServices/", "validarUsuario");
    private static final QName _ValidarUsuarioResponse_QNAME = new QName("http://WebServices/", "validarUsuarioResponse");
    private static final QName _AltaPropuestaArg10_QNAME = new QName("", "arg10");
    private static final QName _AltaPerfilProponenteArg4_QNAME = new QName("", "arg4");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clienteWS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AltaColaboracion }
     * 
     * @return
     *     the new instance of {@link AltaColaboracion }
     */
    public AltaColaboracion createAltaColaboracion() {
        return new AltaColaboracion();
    }

    /**
     * Create an instance of {@link AltaColaboracionResponse }
     * 
     * @return
     *     the new instance of {@link AltaColaboracionResponse }
     */
    public AltaColaboracionResponse createAltaColaboracionResponse() {
        return new AltaColaboracionResponse();
    }

    /**
     * Create an instance of {@link AltaPerfilColaborador }
     * 
     * @return
     *     the new instance of {@link AltaPerfilColaborador }
     */
    public AltaPerfilColaborador createAltaPerfilColaborador() {
        return new AltaPerfilColaborador();
    }

    /**
     * Create an instance of {@link AltaPerfilColaboradorResponse }
     * 
     * @return
     *     the new instance of {@link AltaPerfilColaboradorResponse }
     */
    public AltaPerfilColaboradorResponse createAltaPerfilColaboradorResponse() {
        return new AltaPerfilColaboradorResponse();
    }

    /**
     * Create an instance of {@link AltaPerfilProponente }
     * 
     * @return
     *     the new instance of {@link AltaPerfilProponente }
     */
    public AltaPerfilProponente createAltaPerfilProponente() {
        return new AltaPerfilProponente();
    }

    /**
     * Create an instance of {@link AltaPerfilProponenteResponse }
     * 
     * @return
     *     the new instance of {@link AltaPerfilProponenteResponse }
     */
    public AltaPerfilProponenteResponse createAltaPerfilProponenteResponse() {
        return new AltaPerfilProponenteResponse();
    }

    /**
     * Create an instance of {@link AltaPropuesta }
     * 
     * @return
     *     the new instance of {@link AltaPropuesta }
     */
    public AltaPropuesta createAltaPropuesta() {
        return new AltaPropuesta();
    }

    /**
     * Create an instance of {@link AltaPropuestaResponse }
     * 
     * @return
     *     the new instance of {@link AltaPropuestaResponse }
     */
    public AltaPropuestaResponse createAltaPropuestaResponse() {
        return new AltaPropuestaResponse();
    }

    /**
     * Create an instance of {@link BuscarSeguidores }
     * 
     * @return
     *     the new instance of {@link BuscarSeguidores }
     */
    public BuscarSeguidores createBuscarSeguidores() {
        return new BuscarSeguidores();
    }

    /**
     * Create an instance of {@link BuscarSeguidoresResponse }
     * 
     * @return
     *     the new instance of {@link BuscarSeguidoresResponse }
     */
    public BuscarSeguidoresResponse createBuscarSeguidoresResponse() {
        return new BuscarSeguidoresResponse();
    }

    /**
     * Create an instance of {@link BuscarSeguidos }
     * 
     * @return
     *     the new instance of {@link BuscarSeguidos }
     */
    public BuscarSeguidos createBuscarSeguidos() {
        return new BuscarSeguidos();
    }

    /**
     * Create an instance of {@link BuscarSeguidosResponse }
     * 
     * @return
     *     the new instance of {@link BuscarSeguidosResponse }
     */
    public BuscarSeguidosResponse createBuscarSeguidosResponse() {
        return new BuscarSeguidosResponse();
    }

    /**
     * Create an instance of {@link BuscoColaborador }
     * 
     * @return
     *     the new instance of {@link BuscoColaborador }
     */
    public BuscoColaborador createBuscoColaborador() {
        return new BuscoColaborador();
    }

    /**
     * Create an instance of {@link BuscoColaboradorDTO }
     * 
     * @return
     *     the new instance of {@link BuscoColaboradorDTO }
     */
    public BuscoColaboradorDTO createBuscoColaboradorDTO() {
        return new BuscoColaboradorDTO();
    }

    /**
     * Create an instance of {@link BuscoColaboradorDTOResponse }
     * 
     * @return
     *     the new instance of {@link BuscoColaboradorDTOResponse }
     */
    public BuscoColaboradorDTOResponse createBuscoColaboradorDTOResponse() {
        return new BuscoColaboradorDTOResponse();
    }

    /**
     * Create an instance of {@link BuscoColaboradorResponse }
     * 
     * @return
     *     the new instance of {@link BuscoColaboradorResponse }
     */
    public BuscoColaboradorResponse createBuscoColaboradorResponse() {
        return new BuscoColaboradorResponse();
    }

    /**
     * Create an instance of {@link BuscoProponente }
     * 
     * @return
     *     the new instance of {@link BuscoProponente }
     */
    public BuscoProponente createBuscoProponente() {
        return new BuscoProponente();
    }

    /**
     * Create an instance of {@link BuscoProponenteResponse }
     * 
     * @return
     *     the new instance of {@link BuscoProponenteResponse }
     */
    public BuscoProponenteResponse createBuscoProponenteResponse() {
        return new BuscoProponenteResponse();
    }

    /**
     * Create an instance of {@link BuscoPropuesta }
     * 
     * @return
     *     the new instance of {@link BuscoPropuesta }
     */
    public BuscoPropuesta createBuscoPropuesta() {
        return new BuscoPropuesta();
    }

    /**
     * Create an instance of {@link BuscoPropuestaDTO }
     * 
     * @return
     *     the new instance of {@link BuscoPropuestaDTO }
     */
    public BuscoPropuestaDTO createBuscoPropuestaDTO() {
        return new BuscoPropuestaDTO();
    }

    /**
     * Create an instance of {@link BuscoPropuestaDTOResponse }
     * 
     * @return
     *     the new instance of {@link BuscoPropuestaDTOResponse }
     */
    public BuscoPropuestaDTOResponse createBuscoPropuestaDTOResponse() {
        return new BuscoPropuestaDTOResponse();
    }

    /**
     * Create an instance of {@link BuscoPropuestaResponse }
     * 
     * @return
     *     the new instance of {@link BuscoPropuestaResponse }
     */
    public BuscoPropuestaResponse createBuscoPropuestaResponse() {
        return new BuscoPropuestaResponse();
    }

    /**
     * Create an instance of {@link BuscoRol }
     * 
     * @return
     *     the new instance of {@link BuscoRol }
     */
    public BuscoRol createBuscoRol() {
        return new BuscoRol();
    }

    /**
     * Create an instance of {@link BuscoRolResponse }
     * 
     * @return
     *     the new instance of {@link BuscoRolResponse }
     */
    public BuscoRolResponse createBuscoRolResponse() {
        return new BuscoRolResponse();
    }

    /**
     * Create an instance of {@link BuscoUsuario }
     * 
     * @return
     *     the new instance of {@link BuscoUsuario }
     */
    public BuscoUsuario createBuscoUsuario() {
        return new BuscoUsuario();
    }

    /**
     * Create an instance of {@link BuscoUsuario2 }
     * 
     * @return
     *     the new instance of {@link BuscoUsuario2 }
     */
    public BuscoUsuario2 createBuscoUsuario2() {
        return new BuscoUsuario2();
    }

    /**
     * Create an instance of {@link BuscoUsuario2Response }
     * 
     * @return
     *     the new instance of {@link BuscoUsuario2Response }
     */
    public BuscoUsuario2Response createBuscoUsuario2Response() {
        return new BuscoUsuario2Response();
    }

    /**
     * Create an instance of {@link BuscoUsuarioDTO }
     * 
     * @return
     *     the new instance of {@link BuscoUsuarioDTO }
     */
    public BuscoUsuarioDTO createBuscoUsuarioDTO() {
        return new BuscoUsuarioDTO();
    }

    /**
     * Create an instance of {@link BuscoUsuarioDTOResponse }
     * 
     * @return
     *     the new instance of {@link BuscoUsuarioDTOResponse }
     */
    public BuscoUsuarioDTOResponse createBuscoUsuarioDTOResponse() {
        return new BuscoUsuarioDTOResponse();
    }

    /**
     * Create an instance of {@link BuscoUsuarioResponse }
     * 
     * @return
     *     the new instance of {@link BuscoUsuarioResponse }
     */
    public BuscoUsuarioResponse createBuscoUsuarioResponse() {
        return new BuscoUsuarioResponse();
    }

    /**
     * Create an instance of {@link CambiarEstadoPropuesta }
     * 
     * @return
     *     the new instance of {@link CambiarEstadoPropuesta }
     */
    public CambiarEstadoPropuesta createCambiarEstadoPropuesta() {
        return new CambiarEstadoPropuesta();
    }

    /**
     * Create an instance of {@link CambiarEstadoPropuestaResponse }
     * 
     * @return
     *     the new instance of {@link CambiarEstadoPropuestaResponse }
     */
    public CambiarEstadoPropuestaResponse createCambiarEstadoPropuestaResponse() {
        return new CambiarEstadoPropuestaResponse();
    }

    /**
     * Create an instance of {@link CancelarPropuesta }
     * 
     * @return
     *     the new instance of {@link CancelarPropuesta }
     */
    public CancelarPropuesta createCancelarPropuesta() {
        return new CancelarPropuesta();
    }

    /**
     * Create an instance of {@link CancelarPropuestaResponse }
     * 
     * @return
     *     the new instance of {@link CancelarPropuestaResponse }
     */
    public CancelarPropuestaResponse createCancelarPropuestaResponse() {
        return new CancelarPropuestaResponse();
    }

    /**
     * Create an instance of {@link DejarComentario }
     * 
     * @return
     *     the new instance of {@link DejarComentario }
     */
    public DejarComentario createDejarComentario() {
        return new DejarComentario();
    }

    /**
     * Create an instance of {@link DejarComentarioResponse }
     * 
     * @return
     *     the new instance of {@link DejarComentarioResponse }
     */
    public DejarComentarioResponse createDejarComentarioResponse() {
        return new DejarComentarioResponse();
    }

    /**
     * Create an instance of {@link DejarSeguir }
     * 
     * @return
     *     the new instance of {@link DejarSeguir }
     */
    public DejarSeguir createDejarSeguir() {
        return new DejarSeguir();
    }

    /**
     * Create an instance of {@link DejarSeguirResponse }
     * 
     * @return
     *     the new instance of {@link DejarSeguirResponse }
     */
    public DejarSeguirResponse createDejarSeguirResponse() {
        return new DejarSeguirResponse();
    }

    /**
     * Create an instance of {@link ListarCategoria }
     * 
     * @return
     *     the new instance of {@link ListarCategoria }
     */
    public ListarCategoria createListarCategoria() {
        return new ListarCategoria();
    }

    /**
     * Create an instance of {@link ListarCategoriaDTO }
     * 
     * @return
     *     the new instance of {@link ListarCategoriaDTO }
     */
    public ListarCategoriaDTO createListarCategoriaDTO() {
        return new ListarCategoriaDTO();
    }

    /**
     * Create an instance of {@link ListarCategoriaDTOResponse }
     * 
     * @return
     *     the new instance of {@link ListarCategoriaDTOResponse }
     */
    public ListarCategoriaDTOResponse createListarCategoriaDTOResponse() {
        return new ListarCategoriaDTOResponse();
    }

    /**
     * Create an instance of {@link ListarCategoriaResponse }
     * 
     * @return
     *     the new instance of {@link ListarCategoriaResponse }
     */
    public ListarCategoriaResponse createListarCategoriaResponse() {
        return new ListarCategoriaResponse();
    }

    /**
     * Create an instance of {@link ListarColaboraciones }
     * 
     * @return
     *     the new instance of {@link ListarColaboraciones }
     */
    public ListarColaboraciones createListarColaboraciones() {
        return new ListarColaboraciones();
    }

    /**
     * Create an instance of {@link ListarColaboracionesDTO }
     * 
     * @return
     *     the new instance of {@link ListarColaboracionesDTO }
     */
    public ListarColaboracionesDTO createListarColaboracionesDTO() {
        return new ListarColaboracionesDTO();
    }

    /**
     * Create an instance of {@link ListarColaboracionesDTOResponse }
     * 
     * @return
     *     the new instance of {@link ListarColaboracionesDTOResponse }
     */
    public ListarColaboracionesDTOResponse createListarColaboracionesDTOResponse() {
        return new ListarColaboracionesDTOResponse();
    }

    /**
     * Create an instance of {@link ListarColaboracionesResponse }
     * 
     * @return
     *     the new instance of {@link ListarColaboracionesResponse }
     */
    public ListarColaboracionesResponse createListarColaboracionesResponse() {
        return new ListarColaboracionesResponse();
    }

    /**
     * Create an instance of {@link ListarColaboradores }
     * 
     * @return
     *     the new instance of {@link ListarColaboradores }
     */
    public ListarColaboradores createListarColaboradores() {
        return new ListarColaboradores();
    }

    /**
     * Create an instance of {@link ListarColaboradoresDTO }
     * 
     * @return
     *     the new instance of {@link ListarColaboradoresDTO }
     */
    public ListarColaboradoresDTO createListarColaboradoresDTO() {
        return new ListarColaboradoresDTO();
    }

    /**
     * Create an instance of {@link ListarColaboradoresDTOResponse }
     * 
     * @return
     *     the new instance of {@link ListarColaboradoresDTOResponse }
     */
    public ListarColaboradoresDTOResponse createListarColaboradoresDTOResponse() {
        return new ListarColaboradoresDTOResponse();
    }

    /**
     * Create an instance of {@link ListarColaboradoresResponse }
     * 
     * @return
     *     the new instance of {@link ListarColaboradoresResponse }
     */
    public ListarColaboradoresResponse createListarColaboradoresResponse() {
        return new ListarColaboradoresResponse();
    }

    /**
     * Create an instance of {@link ListarComentariosDePropuesta }
     * 
     * @return
     *     the new instance of {@link ListarComentariosDePropuesta }
     */
    public ListarComentariosDePropuesta createListarComentariosDePropuesta() {
        return new ListarComentariosDePropuesta();
    }

    /**
     * Create an instance of {@link ListarComentariosDePropuestaResponse }
     * 
     * @return
     *     the new instance of {@link ListarComentariosDePropuestaResponse }
     */
    public ListarComentariosDePropuestaResponse createListarComentariosDePropuestaResponse() {
        return new ListarComentariosDePropuestaResponse();
    }

    /**
     * Create an instance of {@link ListarProponentes }
     * 
     * @return
     *     the new instance of {@link ListarProponentes }
     */
    public ListarProponentes createListarProponentes() {
        return new ListarProponentes();
    }

    /**
     * Create an instance of {@link ListarProponentesDTO }
     * 
     * @return
     *     the new instance of {@link ListarProponentesDTO }
     */
    public ListarProponentesDTO createListarProponentesDTO() {
        return new ListarProponentesDTO();
    }

    /**
     * Create an instance of {@link ListarProponentesDTOResponse }
     * 
     * @return
     *     the new instance of {@link ListarProponentesDTOResponse }
     */
    public ListarProponentesDTOResponse createListarProponentesDTOResponse() {
        return new ListarProponentesDTOResponse();
    }

    /**
     * Create an instance of {@link ListarProponentesResponse }
     * 
     * @return
     *     the new instance of {@link ListarProponentesResponse }
     */
    public ListarProponentesResponse createListarProponentesResponse() {
        return new ListarProponentesResponse();
    }

    /**
     * Create an instance of {@link ListarPropuestas }
     * 
     * @return
     *     the new instance of {@link ListarPropuestas }
     */
    public ListarPropuestas createListarPropuestas() {
        return new ListarPropuestas();
    }

    /**
     * Create an instance of {@link ListarPropuestasDTO }
     * 
     * @return
     *     the new instance of {@link ListarPropuestasDTO }
     */
    public ListarPropuestasDTO createListarPropuestasDTO() {
        return new ListarPropuestasDTO();
    }

    /**
     * Create an instance of {@link ListarPropuestasDTOResponse }
     * 
     * @return
     *     the new instance of {@link ListarPropuestasDTOResponse }
     */
    public ListarPropuestasDTOResponse createListarPropuestasDTOResponse() {
        return new ListarPropuestasDTOResponse();
    }

    /**
     * Create an instance of {@link ListarPropuestasFavoritas }
     * 
     * @return
     *     the new instance of {@link ListarPropuestasFavoritas }
     */
    public ListarPropuestasFavoritas createListarPropuestasFavoritas() {
        return new ListarPropuestasFavoritas();
    }

    /**
     * Create an instance of {@link ListarPropuestasFavoritasResponse }
     * 
     * @return
     *     the new instance of {@link ListarPropuestasFavoritasResponse }
     */
    public ListarPropuestasFavoritasResponse createListarPropuestasFavoritasResponse() {
        return new ListarPropuestasFavoritasResponse();
    }

    /**
     * Create an instance of {@link ListarPropuestasFinanciadas }
     * 
     * @return
     *     the new instance of {@link ListarPropuestasFinanciadas }
     */
    public ListarPropuestasFinanciadas createListarPropuestasFinanciadas() {
        return new ListarPropuestasFinanciadas();
    }

    /**
     * Create an instance of {@link ListarPropuestasFinanciadasResponse }
     * 
     * @return
     *     the new instance of {@link ListarPropuestasFinanciadasResponse }
     */
    public ListarPropuestasFinanciadasResponse createListarPropuestasFinanciadasResponse() {
        return new ListarPropuestasFinanciadasResponse();
    }

    /**
     * Create an instance of {@link ListarPropuestasIngresadas }
     * 
     * @return
     *     the new instance of {@link ListarPropuestasIngresadas }
     */
    public ListarPropuestasIngresadas createListarPropuestasIngresadas() {
        return new ListarPropuestasIngresadas();
    }

    /**
     * Create an instance of {@link ListarPropuestasIngresadasResponse }
     * 
     * @return
     *     the new instance of {@link ListarPropuestasIngresadasResponse }
     */
    public ListarPropuestasIngresadasResponse createListarPropuestasIngresadasResponse() {
        return new ListarPropuestasIngresadasResponse();
    }

    /**
     * Create an instance of {@link ListarPropuestasNoIngresadas }
     * 
     * @return
     *     the new instance of {@link ListarPropuestasNoIngresadas }
     */
    public ListarPropuestasNoIngresadas createListarPropuestasNoIngresadas() {
        return new ListarPropuestasNoIngresadas();
    }

    /**
     * Create an instance of {@link ListarPropuestasNoIngresadasResponse }
     * 
     * @return
     *     the new instance of {@link ListarPropuestasNoIngresadasResponse }
     */
    public ListarPropuestasNoIngresadasResponse createListarPropuestasNoIngresadasResponse() {
        return new ListarPropuestasNoIngresadasResponse();
    }

    /**
     * Create an instance of {@link ListarPropuestasPublicadas }
     * 
     * @return
     *     the new instance of {@link ListarPropuestasPublicadas }
     */
    public ListarPropuestasPublicadas createListarPropuestasPublicadas() {
        return new ListarPropuestasPublicadas();
    }

    /**
     * Create an instance of {@link ListarPropuestasPublicadasResponse }
     * 
     * @return
     *     the new instance of {@link ListarPropuestasPublicadasResponse }
     */
    public ListarPropuestasPublicadasResponse createListarPropuestasPublicadasResponse() {
        return new ListarPropuestasPublicadasResponse();
    }

    /**
     * Create an instance of {@link ListarPropuestasResponse }
     * 
     * @return
     *     the new instance of {@link ListarPropuestasResponse }
     */
    public ListarPropuestasResponse createListarPropuestasResponse() {
        return new ListarPropuestasResponse();
    }

    /**
     * Create an instance of {@link ModificoPropuesta }
     * 
     * @return
     *     the new instance of {@link ModificoPropuesta }
     */
    public ModificoPropuesta createModificoPropuesta() {
        return new ModificoPropuesta();
    }

    /**
     * Create an instance of {@link ModificoPropuestaResponse }
     * 
     * @return
     *     the new instance of {@link ModificoPropuestaResponse }
     */
    public ModificoPropuestaResponse createModificoPropuestaResponse() {
        return new ModificoPropuestaResponse();
    }

    /**
     * Create an instance of {@link RegistrarAcceso }
     * 
     * @return
     *     the new instance of {@link RegistrarAcceso }
     */
    public RegistrarAcceso createRegistrarAcceso() {
        return new RegistrarAcceso();
    }

    /**
     * Create an instance of {@link RegistrarAccesoResponse }
     * 
     * @return
     *     the new instance of {@link RegistrarAccesoResponse }
     */
    public RegistrarAccesoResponse createRegistrarAccesoResponse() {
        return new RegistrarAccesoResponse();
    }

    /**
     * Create an instance of {@link Saludar }
     * 
     * @return
     *     the new instance of {@link Saludar }
     */
    public Saludar createSaludar() {
        return new Saludar();
    }

    /**
     * Create an instance of {@link SaludarResponse }
     * 
     * @return
     *     the new instance of {@link SaludarResponse }
     */
    public SaludarResponse createSaludarResponse() {
        return new SaludarResponse();
    }

    /**
     * Create an instance of {@link SeguirUsuario }
     * 
     * @return
     *     the new instance of {@link SeguirUsuario }
     */
    public SeguirUsuario createSeguirUsuario() {
        return new SeguirUsuario();
    }

    /**
     * Create an instance of {@link SeguirUsuarioResponse }
     * 
     * @return
     *     the new instance of {@link SeguirUsuarioResponse }
     */
    public SeguirUsuarioResponse createSeguirUsuarioResponse() {
        return new SeguirUsuarioResponse();
    }

    /**
     * Create an instance of {@link UsuarioSigueA }
     * 
     * @return
     *     the new instance of {@link UsuarioSigueA }
     */
    public UsuarioSigueA createUsuarioSigueA() {
        return new UsuarioSigueA();
    }

    /**
     * Create an instance of {@link UsuarioSigueAResponse }
     * 
     * @return
     *     the new instance of {@link UsuarioSigueAResponse }
     */
    public UsuarioSigueAResponse createUsuarioSigueAResponse() {
        return new UsuarioSigueAResponse();
    }

    /**
     * Create an instance of {@link ValidarUsuario }
     * 
     * @return
     *     the new instance of {@link ValidarUsuario }
     */
    public ValidarUsuario createValidarUsuario() {
        return new ValidarUsuario();
    }

    /**
     * Create an instance of {@link ValidarUsuarioResponse }
     * 
     * @return
     *     the new instance of {@link ValidarUsuarioResponse }
     */
    public ValidarUsuarioResponse createValidarUsuarioResponse() {
        return new ValidarUsuarioResponse();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     * @return
     *     the new instance of {@link Usuario }
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link Propuesta }
     * 
     * @return
     *     the new instance of {@link Propuesta }
     */
    public Propuesta createPropuesta() {
        return new Propuesta();
    }

    /**
     * Create an instance of {@link Comentario }
     * 
     * @return
     *     the new instance of {@link Comentario }
     */
    public Comentario createComentario() {
        return new Comentario();
    }

    /**
     * Create an instance of {@link Colaborador }
     * 
     * @return
     *     the new instance of {@link Colaborador }
     */
    public Colaborador createColaborador() {
        return new Colaborador();
    }

    /**
     * Create an instance of {@link LocalTime }
     * 
     * @return
     *     the new instance of {@link LocalTime }
     */
    public LocalTime createLocalTime() {
        return new LocalTime();
    }

    /**
     * Create an instance of {@link PropuestaDTO }
     * 
     * @return
     *     the new instance of {@link PropuestaDTO }
     */
    public PropuestaDTO createPropuestaDTO() {
        return new PropuestaDTO();
    }

    /**
     * Create an instance of {@link ColaboracionDTO }
     * 
     * @return
     *     the new instance of {@link ColaboracionDTO }
     */
    public ColaboracionDTO createColaboracionDTO() {
        return new ColaboracionDTO();
    }

    /**
     * Create an instance of {@link ComentarioDTO }
     * 
     * @return
     *     the new instance of {@link ComentarioDTO }
     */
    public ComentarioDTO createComentarioDTO() {
        return new ComentarioDTO();
    }

    /**
     * Create an instance of {@link ColaboradorDTO }
     * 
     * @return
     *     the new instance of {@link ColaboradorDTO }
     */
    public ColaboradorDTO createColaboradorDTO() {
        return new ColaboradorDTO();
    }

    /**
     * Create an instance of {@link UsuarioDTO }
     * 
     * @return
     *     the new instance of {@link UsuarioDTO }
     */
    public UsuarioDTO createUsuarioDTO() {
        return new UsuarioDTO();
    }

    /**
     * Create an instance of {@link Proponente }
     * 
     * @return
     *     the new instance of {@link Proponente }
     */
    public Proponente createProponente() {
        return new Proponente();
    }

    /**
     * Create an instance of {@link Colaboracion }
     * 
     * @return
     *     the new instance of {@link Colaboracion }
     */
    public Colaboracion createColaboracion() {
        return new Colaboracion();
    }

    /**
     * Create an instance of {@link ProponenteDTO }
     * 
     * @return
     *     the new instance of {@link ProponenteDTO }
     */
    public ProponenteDTO createProponenteDTO() {
        return new ProponenteDTO();
    }

    /**
     * Create an instance of {@link Categoria }
     * 
     * @return
     *     the new instance of {@link Categoria }
     */
    public Categoria createCategoria() {
        return new Categoria();
    }

    /**
     * Create an instance of {@link CategoriaDTO }
     * 
     * @return
     *     the new instance of {@link CategoriaDTO }
     */
    public CategoriaDTO createCategoriaDTO() {
        return new CategoriaDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaColaboracion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltaColaboracion }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "altaColaboracion")
    public JAXBElement<AltaColaboracion> createAltaColaboracion(AltaColaboracion value) {
        return new JAXBElement<>(_AltaColaboracion_QNAME, AltaColaboracion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaColaboracionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltaColaboracionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "altaColaboracionResponse")
    public JAXBElement<AltaColaboracionResponse> createAltaColaboracionResponse(AltaColaboracionResponse value) {
        return new JAXBElement<>(_AltaColaboracionResponse_QNAME, AltaColaboracionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaPerfilColaborador }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltaPerfilColaborador }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "altaPerfilColaborador")
    public JAXBElement<AltaPerfilColaborador> createAltaPerfilColaborador(AltaPerfilColaborador value) {
        return new JAXBElement<>(_AltaPerfilColaborador_QNAME, AltaPerfilColaborador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaPerfilColaboradorResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltaPerfilColaboradorResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "altaPerfilColaboradorResponse")
    public JAXBElement<AltaPerfilColaboradorResponse> createAltaPerfilColaboradorResponse(AltaPerfilColaboradorResponse value) {
        return new JAXBElement<>(_AltaPerfilColaboradorResponse_QNAME, AltaPerfilColaboradorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaPerfilProponente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltaPerfilProponente }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "altaPerfilProponente")
    public JAXBElement<AltaPerfilProponente> createAltaPerfilProponente(AltaPerfilProponente value) {
        return new JAXBElement<>(_AltaPerfilProponente_QNAME, AltaPerfilProponente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaPerfilProponenteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltaPerfilProponenteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "altaPerfilProponenteResponse")
    public JAXBElement<AltaPerfilProponenteResponse> createAltaPerfilProponenteResponse(AltaPerfilProponenteResponse value) {
        return new JAXBElement<>(_AltaPerfilProponenteResponse_QNAME, AltaPerfilProponenteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaPropuesta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltaPropuesta }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "altaPropuesta")
    public JAXBElement<AltaPropuesta> createAltaPropuesta(AltaPropuesta value) {
        return new JAXBElement<>(_AltaPropuesta_QNAME, AltaPropuesta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaPropuestaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltaPropuestaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "altaPropuestaResponse")
    public JAXBElement<AltaPropuestaResponse> createAltaPropuestaResponse(AltaPropuestaResponse value) {
        return new JAXBElement<>(_AltaPropuestaResponse_QNAME, AltaPropuestaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarSeguidores }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarSeguidores }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "buscarSeguidores")
    public JAXBElement<BuscarSeguidores> createBuscarSeguidores(BuscarSeguidores value) {
        return new JAXBElement<>(_BuscarSeguidores_QNAME, BuscarSeguidores.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarSeguidoresResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarSeguidoresResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "buscarSeguidoresResponse")
    public JAXBElement<BuscarSeguidoresResponse> createBuscarSeguidoresResponse(BuscarSeguidoresResponse value) {
        return new JAXBElement<>(_BuscarSeguidoresResponse_QNAME, BuscarSeguidoresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarSeguidos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarSeguidos }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "buscarSeguidos")
    public JAXBElement<BuscarSeguidos> createBuscarSeguidos(BuscarSeguidos value) {
        return new JAXBElement<>(_BuscarSeguidos_QNAME, BuscarSeguidos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarSeguidosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarSeguidosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "buscarSeguidosResponse")
    public JAXBElement<BuscarSeguidosResponse> createBuscarSeguidosResponse(BuscarSeguidosResponse value) {
        return new JAXBElement<>(_BuscarSeguidosResponse_QNAME, BuscarSeguidosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscoColaborador }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscoColaborador }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "buscoColaborador")
    public JAXBElement<BuscoColaborador> createBuscoColaborador(BuscoColaborador value) {
        return new JAXBElement<>(_BuscoColaborador_QNAME, BuscoColaborador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscoColaboradorDTO }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscoColaboradorDTO }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "buscoColaboradorDTO")
    public JAXBElement<BuscoColaboradorDTO> createBuscoColaboradorDTO(BuscoColaboradorDTO value) {
        return new JAXBElement<>(_BuscoColaboradorDTO_QNAME, BuscoColaboradorDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscoColaboradorDTOResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscoColaboradorDTOResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "buscoColaboradorDTOResponse")
    public JAXBElement<BuscoColaboradorDTOResponse> createBuscoColaboradorDTOResponse(BuscoColaboradorDTOResponse value) {
        return new JAXBElement<>(_BuscoColaboradorDTOResponse_QNAME, BuscoColaboradorDTOResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscoColaboradorResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscoColaboradorResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "buscoColaboradorResponse")
    public JAXBElement<BuscoColaboradorResponse> createBuscoColaboradorResponse(BuscoColaboradorResponse value) {
        return new JAXBElement<>(_BuscoColaboradorResponse_QNAME, BuscoColaboradorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscoProponente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscoProponente }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "buscoProponente")
    public JAXBElement<BuscoProponente> createBuscoProponente(BuscoProponente value) {
        return new JAXBElement<>(_BuscoProponente_QNAME, BuscoProponente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscoProponenteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscoProponenteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "buscoProponenteResponse")
    public JAXBElement<BuscoProponenteResponse> createBuscoProponenteResponse(BuscoProponenteResponse value) {
        return new JAXBElement<>(_BuscoProponenteResponse_QNAME, BuscoProponenteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscoPropuesta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscoPropuesta }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "buscoPropuesta")
    public JAXBElement<BuscoPropuesta> createBuscoPropuesta(BuscoPropuesta value) {
        return new JAXBElement<>(_BuscoPropuesta_QNAME, BuscoPropuesta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscoPropuestaDTO }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscoPropuestaDTO }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "buscoPropuestaDTO")
    public JAXBElement<BuscoPropuestaDTO> createBuscoPropuestaDTO(BuscoPropuestaDTO value) {
        return new JAXBElement<>(_BuscoPropuestaDTO_QNAME, BuscoPropuestaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscoPropuestaDTOResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscoPropuestaDTOResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "buscoPropuestaDTOResponse")
    public JAXBElement<BuscoPropuestaDTOResponse> createBuscoPropuestaDTOResponse(BuscoPropuestaDTOResponse value) {
        return new JAXBElement<>(_BuscoPropuestaDTOResponse_QNAME, BuscoPropuestaDTOResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscoPropuestaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscoPropuestaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "buscoPropuestaResponse")
    public JAXBElement<BuscoPropuestaResponse> createBuscoPropuestaResponse(BuscoPropuestaResponse value) {
        return new JAXBElement<>(_BuscoPropuestaResponse_QNAME, BuscoPropuestaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscoRol }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscoRol }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "buscoRol")
    public JAXBElement<BuscoRol> createBuscoRol(BuscoRol value) {
        return new JAXBElement<>(_BuscoRol_QNAME, BuscoRol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscoRolResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscoRolResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "buscoRolResponse")
    public JAXBElement<BuscoRolResponse> createBuscoRolResponse(BuscoRolResponse value) {
        return new JAXBElement<>(_BuscoRolResponse_QNAME, BuscoRolResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscoUsuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscoUsuario }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "buscoUsuario")
    public JAXBElement<BuscoUsuario> createBuscoUsuario(BuscoUsuario value) {
        return new JAXBElement<>(_BuscoUsuario_QNAME, BuscoUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscoUsuario2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscoUsuario2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "buscoUsuario2")
    public JAXBElement<BuscoUsuario2> createBuscoUsuario2(BuscoUsuario2 value) {
        return new JAXBElement<>(_BuscoUsuario2_QNAME, BuscoUsuario2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscoUsuario2Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscoUsuario2Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "buscoUsuario2Response")
    public JAXBElement<BuscoUsuario2Response> createBuscoUsuario2Response(BuscoUsuario2Response value) {
        return new JAXBElement<>(_BuscoUsuario2Response_QNAME, BuscoUsuario2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscoUsuarioDTO }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscoUsuarioDTO }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "buscoUsuarioDTO")
    public JAXBElement<BuscoUsuarioDTO> createBuscoUsuarioDTO(BuscoUsuarioDTO value) {
        return new JAXBElement<>(_BuscoUsuarioDTO_QNAME, BuscoUsuarioDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscoUsuarioDTOResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscoUsuarioDTOResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "buscoUsuarioDTOResponse")
    public JAXBElement<BuscoUsuarioDTOResponse> createBuscoUsuarioDTOResponse(BuscoUsuarioDTOResponse value) {
        return new JAXBElement<>(_BuscoUsuarioDTOResponse_QNAME, BuscoUsuarioDTOResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscoUsuarioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscoUsuarioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "buscoUsuarioResponse")
    public JAXBElement<BuscoUsuarioResponse> createBuscoUsuarioResponse(BuscoUsuarioResponse value) {
        return new JAXBElement<>(_BuscoUsuarioResponse_QNAME, BuscoUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CambiarEstadoPropuesta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CambiarEstadoPropuesta }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "cambiarEstadoPropuesta")
    public JAXBElement<CambiarEstadoPropuesta> createCambiarEstadoPropuesta(CambiarEstadoPropuesta value) {
        return new JAXBElement<>(_CambiarEstadoPropuesta_QNAME, CambiarEstadoPropuesta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CambiarEstadoPropuestaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CambiarEstadoPropuestaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "cambiarEstadoPropuestaResponse")
    public JAXBElement<CambiarEstadoPropuestaResponse> createCambiarEstadoPropuestaResponse(CambiarEstadoPropuestaResponse value) {
        return new JAXBElement<>(_CambiarEstadoPropuestaResponse_QNAME, CambiarEstadoPropuestaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelarPropuesta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelarPropuesta }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "cancelarPropuesta")
    public JAXBElement<CancelarPropuesta> createCancelarPropuesta(CancelarPropuesta value) {
        return new JAXBElement<>(_CancelarPropuesta_QNAME, CancelarPropuesta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelarPropuestaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelarPropuestaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "cancelarPropuestaResponse")
    public JAXBElement<CancelarPropuestaResponse> createCancelarPropuestaResponse(CancelarPropuestaResponse value) {
        return new JAXBElement<>(_CancelarPropuestaResponse_QNAME, CancelarPropuestaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DejarComentario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DejarComentario }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "dejarComentario")
    public JAXBElement<DejarComentario> createDejarComentario(DejarComentario value) {
        return new JAXBElement<>(_DejarComentario_QNAME, DejarComentario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DejarComentarioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DejarComentarioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "dejarComentarioResponse")
    public JAXBElement<DejarComentarioResponse> createDejarComentarioResponse(DejarComentarioResponse value) {
        return new JAXBElement<>(_DejarComentarioResponse_QNAME, DejarComentarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DejarSeguir }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DejarSeguir }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "dejarSeguir")
    public JAXBElement<DejarSeguir> createDejarSeguir(DejarSeguir value) {
        return new JAXBElement<>(_DejarSeguir_QNAME, DejarSeguir.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DejarSeguirResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DejarSeguirResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "dejarSeguirResponse")
    public JAXBElement<DejarSeguirResponse> createDejarSeguirResponse(DejarSeguirResponse value) {
        return new JAXBElement<>(_DejarSeguirResponse_QNAME, DejarSeguirResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarCategoria }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarCategoria }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "listarCategoria")
    public JAXBElement<ListarCategoria> createListarCategoria(ListarCategoria value) {
        return new JAXBElement<>(_ListarCategoria_QNAME, ListarCategoria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarCategoriaDTO }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarCategoriaDTO }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "listarCategoriaDTO")
    public JAXBElement<ListarCategoriaDTO> createListarCategoriaDTO(ListarCategoriaDTO value) {
        return new JAXBElement<>(_ListarCategoriaDTO_QNAME, ListarCategoriaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarCategoriaDTOResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarCategoriaDTOResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "listarCategoriaDTOResponse")
    public JAXBElement<ListarCategoriaDTOResponse> createListarCategoriaDTOResponse(ListarCategoriaDTOResponse value) {
        return new JAXBElement<>(_ListarCategoriaDTOResponse_QNAME, ListarCategoriaDTOResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarCategoriaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarCategoriaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "listarCategoriaResponse")
    public JAXBElement<ListarCategoriaResponse> createListarCategoriaResponse(ListarCategoriaResponse value) {
        return new JAXBElement<>(_ListarCategoriaResponse_QNAME, ListarCategoriaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarColaboraciones }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarColaboraciones }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "listarColaboraciones")
    public JAXBElement<ListarColaboraciones> createListarColaboraciones(ListarColaboraciones value) {
        return new JAXBElement<>(_ListarColaboraciones_QNAME, ListarColaboraciones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarColaboracionesDTO }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarColaboracionesDTO }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "listarColaboracionesDTO")
    public JAXBElement<ListarColaboracionesDTO> createListarColaboracionesDTO(ListarColaboracionesDTO value) {
        return new JAXBElement<>(_ListarColaboracionesDTO_QNAME, ListarColaboracionesDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarColaboracionesDTOResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarColaboracionesDTOResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "listarColaboracionesDTOResponse")
    public JAXBElement<ListarColaboracionesDTOResponse> createListarColaboracionesDTOResponse(ListarColaboracionesDTOResponse value) {
        return new JAXBElement<>(_ListarColaboracionesDTOResponse_QNAME, ListarColaboracionesDTOResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarColaboracionesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarColaboracionesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "listarColaboracionesResponse")
    public JAXBElement<ListarColaboracionesResponse> createListarColaboracionesResponse(ListarColaboracionesResponse value) {
        return new JAXBElement<>(_ListarColaboracionesResponse_QNAME, ListarColaboracionesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarColaboradores }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarColaboradores }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "listarColaboradores")
    public JAXBElement<ListarColaboradores> createListarColaboradores(ListarColaboradores value) {
        return new JAXBElement<>(_ListarColaboradores_QNAME, ListarColaboradores.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarColaboradoresDTO }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarColaboradoresDTO }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "listarColaboradoresDTO")
    public JAXBElement<ListarColaboradoresDTO> createListarColaboradoresDTO(ListarColaboradoresDTO value) {
        return new JAXBElement<>(_ListarColaboradoresDTO_QNAME, ListarColaboradoresDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarColaboradoresDTOResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarColaboradoresDTOResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "listarColaboradoresDTOResponse")
    public JAXBElement<ListarColaboradoresDTOResponse> createListarColaboradoresDTOResponse(ListarColaboradoresDTOResponse value) {
        return new JAXBElement<>(_ListarColaboradoresDTOResponse_QNAME, ListarColaboradoresDTOResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarColaboradoresResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarColaboradoresResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "listarColaboradoresResponse")
    public JAXBElement<ListarColaboradoresResponse> createListarColaboradoresResponse(ListarColaboradoresResponse value) {
        return new JAXBElement<>(_ListarColaboradoresResponse_QNAME, ListarColaboradoresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarComentariosDePropuesta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarComentariosDePropuesta }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "listarComentariosDePropuesta")
    public JAXBElement<ListarComentariosDePropuesta> createListarComentariosDePropuesta(ListarComentariosDePropuesta value) {
        return new JAXBElement<>(_ListarComentariosDePropuesta_QNAME, ListarComentariosDePropuesta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarComentariosDePropuestaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarComentariosDePropuestaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "listarComentariosDePropuestaResponse")
    public JAXBElement<ListarComentariosDePropuestaResponse> createListarComentariosDePropuestaResponse(ListarComentariosDePropuestaResponse value) {
        return new JAXBElement<>(_ListarComentariosDePropuestaResponse_QNAME, ListarComentariosDePropuestaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarProponentes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarProponentes }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "listarProponentes")
    public JAXBElement<ListarProponentes> createListarProponentes(ListarProponentes value) {
        return new JAXBElement<>(_ListarProponentes_QNAME, ListarProponentes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarProponentesDTO }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarProponentesDTO }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "listarProponentesDTO")
    public JAXBElement<ListarProponentesDTO> createListarProponentesDTO(ListarProponentesDTO value) {
        return new JAXBElement<>(_ListarProponentesDTO_QNAME, ListarProponentesDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarProponentesDTOResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarProponentesDTOResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "listarProponentesDTOResponse")
    public JAXBElement<ListarProponentesDTOResponse> createListarProponentesDTOResponse(ListarProponentesDTOResponse value) {
        return new JAXBElement<>(_ListarProponentesDTOResponse_QNAME, ListarProponentesDTOResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarProponentesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarProponentesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "listarProponentesResponse")
    public JAXBElement<ListarProponentesResponse> createListarProponentesResponse(ListarProponentesResponse value) {
        return new JAXBElement<>(_ListarProponentesResponse_QNAME, ListarProponentesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPropuestas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarPropuestas }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "listarPropuestas")
    public JAXBElement<ListarPropuestas> createListarPropuestas(ListarPropuestas value) {
        return new JAXBElement<>(_ListarPropuestas_QNAME, ListarPropuestas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPropuestasDTO }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarPropuestasDTO }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "listarPropuestasDTO")
    public JAXBElement<ListarPropuestasDTO> createListarPropuestasDTO(ListarPropuestasDTO value) {
        return new JAXBElement<>(_ListarPropuestasDTO_QNAME, ListarPropuestasDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPropuestasDTOResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarPropuestasDTOResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "listarPropuestasDTOResponse")
    public JAXBElement<ListarPropuestasDTOResponse> createListarPropuestasDTOResponse(ListarPropuestasDTOResponse value) {
        return new JAXBElement<>(_ListarPropuestasDTOResponse_QNAME, ListarPropuestasDTOResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPropuestasFavoritas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarPropuestasFavoritas }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "listarPropuestasFavoritas")
    public JAXBElement<ListarPropuestasFavoritas> createListarPropuestasFavoritas(ListarPropuestasFavoritas value) {
        return new JAXBElement<>(_ListarPropuestasFavoritas_QNAME, ListarPropuestasFavoritas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPropuestasFavoritasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarPropuestasFavoritasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "listarPropuestasFavoritasResponse")
    public JAXBElement<ListarPropuestasFavoritasResponse> createListarPropuestasFavoritasResponse(ListarPropuestasFavoritasResponse value) {
        return new JAXBElement<>(_ListarPropuestasFavoritasResponse_QNAME, ListarPropuestasFavoritasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPropuestasFinanciadas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarPropuestasFinanciadas }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "listarPropuestasFinanciadas")
    public JAXBElement<ListarPropuestasFinanciadas> createListarPropuestasFinanciadas(ListarPropuestasFinanciadas value) {
        return new JAXBElement<>(_ListarPropuestasFinanciadas_QNAME, ListarPropuestasFinanciadas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPropuestasFinanciadasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarPropuestasFinanciadasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "listarPropuestasFinanciadasResponse")
    public JAXBElement<ListarPropuestasFinanciadasResponse> createListarPropuestasFinanciadasResponse(ListarPropuestasFinanciadasResponse value) {
        return new JAXBElement<>(_ListarPropuestasFinanciadasResponse_QNAME, ListarPropuestasFinanciadasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPropuestasIngresadas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarPropuestasIngresadas }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "listarPropuestasIngresadas")
    public JAXBElement<ListarPropuestasIngresadas> createListarPropuestasIngresadas(ListarPropuestasIngresadas value) {
        return new JAXBElement<>(_ListarPropuestasIngresadas_QNAME, ListarPropuestasIngresadas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPropuestasIngresadasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarPropuestasIngresadasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "listarPropuestasIngresadasResponse")
    public JAXBElement<ListarPropuestasIngresadasResponse> createListarPropuestasIngresadasResponse(ListarPropuestasIngresadasResponse value) {
        return new JAXBElement<>(_ListarPropuestasIngresadasResponse_QNAME, ListarPropuestasIngresadasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPropuestasNoIngresadas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarPropuestasNoIngresadas }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "listarPropuestasNoIngresadas")
    public JAXBElement<ListarPropuestasNoIngresadas> createListarPropuestasNoIngresadas(ListarPropuestasNoIngresadas value) {
        return new JAXBElement<>(_ListarPropuestasNoIngresadas_QNAME, ListarPropuestasNoIngresadas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPropuestasNoIngresadasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarPropuestasNoIngresadasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "listarPropuestasNoIngresadasResponse")
    public JAXBElement<ListarPropuestasNoIngresadasResponse> createListarPropuestasNoIngresadasResponse(ListarPropuestasNoIngresadasResponse value) {
        return new JAXBElement<>(_ListarPropuestasNoIngresadasResponse_QNAME, ListarPropuestasNoIngresadasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPropuestasPublicadas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarPropuestasPublicadas }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "listarPropuestasPublicadas")
    public JAXBElement<ListarPropuestasPublicadas> createListarPropuestasPublicadas(ListarPropuestasPublicadas value) {
        return new JAXBElement<>(_ListarPropuestasPublicadas_QNAME, ListarPropuestasPublicadas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPropuestasPublicadasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarPropuestasPublicadasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "listarPropuestasPublicadasResponse")
    public JAXBElement<ListarPropuestasPublicadasResponse> createListarPropuestasPublicadasResponse(ListarPropuestasPublicadasResponse value) {
        return new JAXBElement<>(_ListarPropuestasPublicadasResponse_QNAME, ListarPropuestasPublicadasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPropuestasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarPropuestasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "listarPropuestasResponse")
    public JAXBElement<ListarPropuestasResponse> createListarPropuestasResponse(ListarPropuestasResponse value) {
        return new JAXBElement<>(_ListarPropuestasResponse_QNAME, ListarPropuestasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificoPropuesta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModificoPropuesta }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "modificoPropuesta")
    public JAXBElement<ModificoPropuesta> createModificoPropuesta(ModificoPropuesta value) {
        return new JAXBElement<>(_ModificoPropuesta_QNAME, ModificoPropuesta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificoPropuestaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModificoPropuestaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "modificoPropuestaResponse")
    public JAXBElement<ModificoPropuestaResponse> createModificoPropuestaResponse(ModificoPropuestaResponse value) {
        return new JAXBElement<>(_ModificoPropuestaResponse_QNAME, ModificoPropuestaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarAcceso }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistrarAcceso }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "registrarAcceso")
    public JAXBElement<RegistrarAcceso> createRegistrarAcceso(RegistrarAcceso value) {
        return new JAXBElement<>(_RegistrarAcceso_QNAME, RegistrarAcceso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarAccesoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistrarAccesoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "registrarAccesoResponse")
    public JAXBElement<RegistrarAccesoResponse> createRegistrarAccesoResponse(RegistrarAccesoResponse value) {
        return new JAXBElement<>(_RegistrarAccesoResponse_QNAME, RegistrarAccesoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Saludar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Saludar }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "saludar")
    public JAXBElement<Saludar> createSaludar(Saludar value) {
        return new JAXBElement<>(_Saludar_QNAME, Saludar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaludarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaludarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "saludarResponse")
    public JAXBElement<SaludarResponse> createSaludarResponse(SaludarResponse value) {
        return new JAXBElement<>(_SaludarResponse_QNAME, SaludarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeguirUsuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SeguirUsuario }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "seguirUsuario")
    public JAXBElement<SeguirUsuario> createSeguirUsuario(SeguirUsuario value) {
        return new JAXBElement<>(_SeguirUsuario_QNAME, SeguirUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeguirUsuarioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SeguirUsuarioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "seguirUsuarioResponse")
    public JAXBElement<SeguirUsuarioResponse> createSeguirUsuarioResponse(SeguirUsuarioResponse value) {
        return new JAXBElement<>(_SeguirUsuarioResponse_QNAME, SeguirUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsuarioSigueA }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UsuarioSigueA }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "usuarioSigueA")
    public JAXBElement<UsuarioSigueA> createUsuarioSigueA(UsuarioSigueA value) {
        return new JAXBElement<>(_UsuarioSigueA_QNAME, UsuarioSigueA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsuarioSigueAResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UsuarioSigueAResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "usuarioSigueAResponse")
    public JAXBElement<UsuarioSigueAResponse> createUsuarioSigueAResponse(UsuarioSigueAResponse value) {
        return new JAXBElement<>(_UsuarioSigueAResponse_QNAME, UsuarioSigueAResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarUsuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidarUsuario }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "validarUsuario")
    public JAXBElement<ValidarUsuario> createValidarUsuario(ValidarUsuario value) {
        return new JAXBElement<>(_ValidarUsuario_QNAME, ValidarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarUsuarioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidarUsuarioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "validarUsuarioResponse")
    public JAXBElement<ValidarUsuarioResponse> createValidarUsuarioResponse(ValidarUsuarioResponse value) {
        return new JAXBElement<>(_ValidarUsuarioResponse_QNAME, ValidarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "", name = "arg10", scope = AltaPropuesta.class)
    public JAXBElement<byte[]> createAltaPropuestaArg10(byte[] value) {
        return new JAXBElement<>(_AltaPropuestaArg10_QNAME, byte[].class, AltaPropuesta.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "", name = "arg4", scope = AltaPerfilProponente.class)
    public JAXBElement<byte[]> createAltaPerfilProponenteArg4(byte[] value) {
        return new JAXBElement<>(_AltaPerfilProponenteArg4_QNAME, byte[].class, AltaPerfilProponente.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "", name = "arg4", scope = AltaPerfilColaborador.class)
    public JAXBElement<byte[]> createAltaPerfilColaboradorArg4(byte[] value) {
        return new JAXBElement<>(_AltaPerfilProponenteArg4_QNAME, byte[].class, AltaPerfilColaborador.class, ((byte[]) value));
    }

}
