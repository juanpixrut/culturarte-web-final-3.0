package test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Juanpi
 */
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import logica.*;
import persistencia.*;
import logica.dtos.*;
import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;

public class ControladoraTest {

    private Fabrica fab = new Fabrica();
    private Ictrl ic = fab.getIctrl();

    // Creamos una subclase para poder inyectar datos falsos
    class ControladoraMock extends Ictrl {

        private List<Proponente> proponentes = new ArrayList<>();
        private List<Colaborador> colaboradores = new ArrayList<>();
        private List<Propuesta> propuestas = new ArrayList<>();
        private List<Colaboracion> colaboraciones = new ArrayList<>();

        ControladoraPersistenciaMock persistenciaMock = new ControladoraPersistenciaMock();

        @Override
        public String buscoRol(String nickname) {
            for (Proponente p : listarProponentes()) {
                if (p != null && nickname.equalsIgnoreCase(p.getNickname())) {
                    return "proponente";
                }
            }
            for (Colaborador c : listarColaboradores()) {
                if (c != null && nickname.equalsIgnoreCase(c.getNickname())) {
                    return "colaborador";
                }
            }
            return null;
        }

        @Override
        public void altaPerfilProponente(String nickname, String nombre, String apellido, String correo, byte[] imagenBytes, String direccion, String biografia, String linkSitio, String contrasena) {
            Proponente p = new Proponente(nickname, nombre, apellido, correo, imagenBytes, contrasena, direccion, biografia, linkSitio);
            persistenciaMock.crearUsuarioProponente(p);
        }

        @Override
        public void altaPerfilColaborador(String nickname, String nombre, String apellido, String correo, byte[] imagenBytes) {
            Colaborador c = new Colaborador(nickname, nombre, apellido, correo, imagenBytes);
            persistenciaMock.crearUsuarioColaborador(c);
        }

        @Override
        public List<Proponente> listarProponentes() {
            return proponentes;
        }

        @Override
        public List<Colaborador> listarColaboradores() {
            return colaboradores;
        }

        @Override
        public List<Propuesta> listarPropuestas() {
            return propuestas;
        }

        @Override
        public List<Colaboracion> listarColaboraciones() {
            return colaboraciones;
        }

        public void agregarProponente(Proponente p) {
            proponentes.add(p);
        }

        public void agregarColaborador(Colaborador c) {
            colaboradores.add(c);
        }

        @Override
        public Proponente buscoProponente(String nickname) {
            for (Proponente p : this.listarProponentes()) {
                if (p.getNickname().equalsIgnoreCase(nickname)) {
                    return p;
                }
            }
            return null;
        }

        @Override
        public Colaborador buscoColaborador(String nickname) {
            for (Colaborador c : this.listarColaboradores()) {
                if (c.getNickname().equalsIgnoreCase(nickname)) {
                    return c;
                }
            }
            return null;
        }

        @Override
        public Usuario buscoUsuario(String nickname) {
            Colaborador col = mockCtrl.buscoColaborador(nickname);
            Proponente prop = mockCtrl.buscoProponente(nickname);

            if (col != null) {
                Usuario user = col;
                return user;
            }
            if (prop != null) {
                Usuario user = prop;
                return user;
            }
            return null;
        }

        public void agregarPropuesta(Propuesta prop) {
            propuestas.add(prop);
        }

        //public Propuesta buscoPropuesta(String titulo) {
        //    for (Propuesta p : propuestas) {
        //        if(p.getTitulo().equalsIgnoreCase(titulo)){
        //        return p;
        //        }
        //    }
        //   return null;
        //}
        public void agregarColaboracion(Colaboracion col) {
            colaboraciones.add(col);
        }

        public Colaboracion buscoColaboracion(int id) {
            for (Colaboracion c : colaboraciones) {
                if (c.getId() == 10) {
                    return c;
                }
            }
            return null;
        }

        @Override
        public List<PropuestaDTO> listarPropuestasFavoritas(String nickname) {
            String rol = buscoRol(nickname);
            Usuario u = null;

            if ("proponente".equalsIgnoreCase(rol)) {
                u = buscoProponente(nickname);
            } else if ("colaborador".equalsIgnoreCase(rol)) {
                u = buscoColaborador(nickname);
            }

            List<PropuestaDTO> resultado = new ArrayList<>();

            if (u != null && u.getFavoritas() != null) {
                for (Propuesta p : u.getFavoritas()) {
                    if (p != null) {
                        resultado.add(PropuestaDTO.fromEntity(p));
                    }
                }
            }

            return resultado;
        }

    }

    // mock del controlador de persistencia
    class ControladoraPersistenciaMock extends ControladoraPersistencia {

        public boolean llamado = false;
        public Proponente ultimoProponente = null;
        public Colaborador ultimoColaborador = null;

        @Override
        public void crearUsuarioProponente(Proponente p) {
            llamado = true;
            ultimoProponente = p;
        }

        @Override
        public void crearUsuarioColaborador(Colaborador c) {
            llamado = true;
            ultimoColaborador = c;
        }

    }

    private ControladoraMock mockCtrl;

    @Before
    public void setUp() {
        mockCtrl = new ControladoraMock();
    }

    @Test
    public void validarUsuarioExistenteYClaveCorrecta() {
        Proponente p = new Proponente();
        p.setNickname("juanpi");
        p.setContrasena("1234");
        mockCtrl.agregarProponente(p);

        boolean resultado = mockCtrl.validarUsuario("juanpi", "1234");
        assertTrue("El usuario debería ser válido con clave correcta", resultado);
    }

    @Test
    public void validarUsuarioExistenteYClaveIncorrecta() {
        Proponente p = new Proponente();
        p.setNickname("juanpi");
        p.setContrasena("1234");
        mockCtrl.agregarProponente(p);

        boolean resultado = mockCtrl.validarUsuario("juanpi", "0000");
        assertFalse("El usuario no debería ser válido con clave incorrecta", resultado);
    }

    @Test
    public void validarUsuarioInexistente() {
        Proponente p = new Proponente();
        p.setNickname("flor");
        p.setContrasena("abcd");
        mockCtrl.agregarProponente(p);

        boolean resultado = mockCtrl.validarUsuario("juanpi", "abcd");
        assertFalse("El usuario no debería ser válido si no existe", resultado);
    }

    @Test
    public void buscoRol() {
        Proponente p = new Proponente();
        p.setNickname("mario");
        mockCtrl.agregarProponente(p);

        Colaborador c = new Colaborador();
        c.setNickname("ana");
        mockCtrl.agregarColaborador(c);

        assertEquals("proponente", mockCtrl.buscoRol("mario"));
        assertEquals("colaborador", mockCtrl.buscoRol("ana"));
        assertNull(mockCtrl.buscoRol("inexistente"));
    }

    @Test
    public void buscoProponente() {
        Proponente p = new Proponente();
        p.setNickname("mario");
        mockCtrl.agregarProponente(p);

        assertEquals(p, mockCtrl.buscoProponente("mario"));
    }

    @Test
    public void buscoColaborador() {
        Colaborador c = new Colaborador();
        c.setNickname("mario");
        mockCtrl.agregarColaborador(c);

        assertEquals(c, mockCtrl.buscoColaborador("mario"));
    }

    @Test
    public void buscoUsuario() {
        Proponente p = new Proponente();
        p.setNickname("mario");
        mockCtrl.agregarProponente(p);
        Usuario user = p;

        assertEquals(user, mockCtrl.buscoUsuario("mario"));
    }

    @Test
    public void altaPropuesta() {
        Proponente p = new Proponente();
        p.setNickname("mario");
        Propuesta prop = new Propuesta(p, "prueba", null, null, null, null, 10, 10, null);
        mockCtrl.agregarPropuesta(prop);

        assertEquals(prop, mockCtrl.buscoPropuesta("prueba"));
    }

    @Test
    public void altaColaboracion() {
        Colaborador c = new Colaborador();
        c.setNickname("mario");

        Proponente p = new Proponente();
        p.setNickname("mario");
        Propuesta prop = new Propuesta(p, "prueba", null, null, null, null, 10, 10, null);

        Colaboracion col = new Colaboracion(c, prop, 10, null);
        col.setId(10);
        mockCtrl.agregarColaboracion(col);

        assertEquals(col, mockCtrl.buscoColaboracion(10));

    }

    @Test
    public void testBuscoPropuesta_ExisteExacta() {
        // preparamos los datos simulados
        Propuesta p1 = new Propuesta();
        p1.setTitulo("titulo p1");
        Propuesta p2 = new Propuesta();
        p2.setTitulo("titulo p2");

        mockCtrl.agregarPropuesta(p1);
        mockCtrl.agregarPropuesta(p2);

        // ejecutamos el método
        Propuesta resultado = mockCtrl.buscoPropuesta("titulo p1");

        // verificamos que encontró la correcta
        assertNotNull("Debe encontrar la propuesta con ese título", resultado);
        assertEquals("titulo p1", resultado.getTitulo());
    }

    @Test
    public void testBuscoPropuesta_Inexistente() {
        Propuesta p = new Propuesta();
        p.setTitulo("titulo p");
        mockCtrl.agregarPropuesta(p);

        Propuesta resultado = mockCtrl.buscoPropuesta("titulo erroneo");

        assertNull("Debe devolver null si no encuentra la propuesta", resultado);
    }

    @Test
    public void testBuscoColaborador_ExisteExacto() {
        Colaborador c1 = new Colaborador();
        c1.setNickname("juanpi");
        Colaborador c2 = new Colaborador();
        c2.setNickname("flor");

        mockCtrl.agregarColaborador(c1);
        mockCtrl.agregarColaborador(c2);

        Colaborador resultado = mockCtrl.buscoColaborador("flor");

        assertNotNull("Debe encontrar al colaborador con ese nickname", resultado);
        assertEquals("flor", resultado.getNickname());
    }

    @Test
    public void testBuscoColaborador_Inexistente() {
        Colaborador c = new Colaborador();
        c.setNickname("ana");
        mockCtrl.agregarColaborador(c);

        Colaborador resultado = mockCtrl.buscoColaborador("pepe");
        assertNull("Debe devolver null si no existe el colaborador", resultado);
    }

    @Test
    public void testAltaPerfilProponente_LlamaAPersistenciaYGuardaDatos() {
        byte[] imagen = new byte[]{1, 2, 3};

        mockCtrl.altaPerfilProponente(
                "juanpi",
                "Juan",
                "fontes",
                "juan@gmail.com",
                imagen,
                "Calle 123",
                "Programador",
                "www.juan.com",
                "1234"
        );

        ControladoraPersistenciaMock persistMock = mockCtrl.persistenciaMock;

        assertTrue("Debe haberse llamado a crearUsuarioProponente()", persistMock.llamado);
        assertNotNull("Debe haberse pasado un proponente al método", persistMock.ultimoProponente);
        assertEquals("juanpi", persistMock.ultimoProponente.getNickname());
        assertEquals("juan@gmail.com", persistMock.ultimoProponente.getEmail());
        assertEquals("Juan", persistMock.ultimoProponente.getNombre());
        assertEquals("fontes", persistMock.ultimoProponente.getApellido());
        assertArrayEquals(imagen, persistMock.ultimoProponente.getImagen());
    }

    @Test
    public void testAltaPerfilColaborador_LlamaAPersistenciaYGuardaDatos() {
        byte[] imagen = new byte[]{9, 8, 7};

        mockCtrl.altaPerfilColaborador(
                "flor",
                "Florencia",
                "apellido",
                "flor@gmail.com",
                imagen
        );

        ControladoraPersistenciaMock persistMock = mockCtrl.persistenciaMock;

        assertTrue("Debe haberse llamado a crearUsuarioColaborador()", persistMock.llamado);
        assertNotNull("Debe haberse pasado un colaborador al método", persistMock.ultimoColaborador);
        assertEquals("flor", persistMock.ultimoColaborador.getNickname());
        assertEquals("Florencia", persistMock.ultimoColaborador.getNombre());
        assertEquals("apellido", persistMock.ultimoColaborador.getApellido());
        assertEquals("flor@gmail.com", persistMock.ultimoColaborador.getEmail());
        assertArrayEquals(imagen, persistMock.ultimoColaborador.getImagen());
    }

    @Test
    public void testListarPropuestasFavoritas_DeProponente() {
        // Creamos un Proponente con una Propuesta favorita
        Proponente p = new Proponente();
        p.setNickname("juanpi");

        Propuesta prop = new Propuesta();
        prop.setTitulo("Festival de Música");
        prop.setDescripcion("Evento con bandas locales.");
        prop.setLugar("Montevideo");
        prop.setMonto(5000);
        prop.setProponente(p);
        prop.setEstado(EstadoPropuesta.INGRESADA);

        // Simulamos lista de favoritas
        List<Propuesta> favoritas = new ArrayList<>();
        favoritas.add(prop);
        p.setFavoritas(favoritas);

        mockCtrl.agregarProponente(p);

        // Ejecutamos
        List<PropuestaDTO> resultado = mockCtrl.listarPropuestasFavoritas("juanpi");

        // Verificaciones
        assertNotNull(resultado);
        assertEquals(1, resultado.size());
        PropuestaDTO dto = resultado.get(0);
        assertEquals("Festival de Música", dto.getTitulo());
        assertEquals("Montevideo", dto.getLugar());
        assertEquals(5000, dto.getMontoNecesario(), 0.01);
    }

    @Test
    public void testListarPropuestasPublicadas_DeProponente() {
        // 1. Creamos el Proponente
        Proponente p = new Proponente();
        p.setNickname("juanpi");
        mockCtrl.agregarProponente(p);

        // 2. Mockeamos las propuestas DTO
        PropuestaDTO propPublicada = new PropuestaDTO();
        propPublicada.setTitulo("Obra de Teatro");
        propPublicada.setProponenteNickname("juanpi");
        propPublicada.setEstadoActual(EstadoPropuestaDTO.PUBLICADA);

        PropuestaDTO propNoPublicada = new PropuestaDTO();
        propNoPublicada.setTitulo("Concierto");
        propNoPublicada.setProponenteNickname("juanpi");
        propNoPublicada.setEstadoActual(EstadoPropuestaDTO.INGRESADA);

        // 3. Sobrescribimos listarPropuestasDTO() en el mock
        mockCtrl = new ControladoraMock() {
            @Override
            public List<PropuestaDTO> listarPropuestasDTO() {
                List<PropuestaDTO> lista = new ArrayList<>();
                lista.add(propPublicada);
                lista.add(propNoPublicada);
                return lista;
            }

            @Override
            public String buscoRol(String nickname) {
                return "proponente";
            }

            @Override
            public Proponente buscoProponente(String nickname) {
                return p;
            }
        };

        // 4. Ejecutamos el método
        List<PropuestaDTO> resultado = mockCtrl.listarPropuestasPublicadas("juanpi");

        // 5. Verificamos resultados
        assertNotNull(resultado);
        assertEquals(1, resultado.size());
        assertEquals("Obra de Teatro", resultado.get(0).getTitulo());
        assertEquals(EstadoPropuestaDTO.PUBLICADA, resultado.get(0).getEstadoActual());
    }


}
