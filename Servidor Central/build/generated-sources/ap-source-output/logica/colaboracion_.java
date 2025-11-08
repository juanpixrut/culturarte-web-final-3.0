package logica;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Colaborador;
import logica.Propuesta;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-11-08T16:17:43", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Colaboracion.class)
public class Colaboracion_ { 

    public static volatile SingularAttribute<Colaboracion, Colaborador> colaborador;
    public static volatile SingularAttribute<Colaboracion, Date> fecha;
    public static volatile SingularAttribute<Colaboracion, String> tipoRetorno;
    public static volatile SingularAttribute<Colaboracion, Propuesta> propuesta;
    public static volatile SingularAttribute<Colaboracion, Float> montoAportado;
    public static volatile SingularAttribute<Colaboracion, Integer> id;

}