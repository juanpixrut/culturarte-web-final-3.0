package logica;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.EstadoPropuesta;
import logica.Propuesta;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-11-08T16:37:24", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(HistorialEstado.class)
public class HistorialEstado_ { 

    public static volatile SingularAttribute<HistorialEstado, Date> fecha;
    public static volatile SingularAttribute<HistorialEstado, EstadoPropuesta> estado;
    public static volatile SingularAttribute<HistorialEstado, Propuesta> propuesta;
    public static volatile SingularAttribute<HistorialEstado, Integer> id;

}