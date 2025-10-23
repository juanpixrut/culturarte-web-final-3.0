package logica;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.colaborador;
import logica.propuesta;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-10-22T21:29:33", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(comentario.class)
public class comentario_ { 

    public static volatile SingularAttribute<comentario, String> texto;
    public static volatile SingularAttribute<comentario, Date> fecha;
    public static volatile SingularAttribute<comentario, propuesta> propuesta;
    public static volatile SingularAttribute<comentario, Long> id;
    public static volatile SingularAttribute<comentario, colaborador> autor;

}