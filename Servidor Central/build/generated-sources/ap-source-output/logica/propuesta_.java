package logica;

import java.time.LocalTime;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Colaboracion;
import logica.Comentario;
import logica.EstadoPropuesta;
import logica.HistorialEstado;
import logica.Proponente;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-11-08T16:17:43", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Propuesta.class)
public class Propuesta_ { 

    public static volatile SingularAttribute<Propuesta, String> descripcion;
    public static volatile SingularAttribute<Propuesta, LocalTime> hora;
    public static volatile SingularAttribute<Propuesta, String> lugar;
    public static volatile SingularAttribute<Propuesta, Float> montoNecesario;
    public static volatile SingularAttribute<Propuesta, String> titulo;
    public static volatile SingularAttribute<Propuesta, byte[]> imagen;
    public static volatile SingularAttribute<Propuesta, String> tipoEspectaculo;
    public static volatile SingularAttribute<Propuesta, Float> precioEntrada;
    public static volatile SingularAttribute<Propuesta, EstadoPropuesta> estadoActual;
    public static volatile SingularAttribute<Propuesta, Date> fechaRealizacion;
    public static volatile SingularAttribute<Propuesta, String> tipoRetorno;
    public static volatile ListAttribute<Propuesta, Colaboracion> colaboraciones;
    public static volatile SingularAttribute<Propuesta, Proponente> prop;
    public static volatile SingularAttribute<Propuesta, Date> fechaPublicada;
    public static volatile ListAttribute<Propuesta, HistorialEstado> historial;
    public static volatile SingularAttribute<Propuesta, Float> montoRecaudado;
    public static volatile ListAttribute<Propuesta, Comentario> comentarios;

}