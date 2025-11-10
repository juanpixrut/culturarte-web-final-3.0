package logica;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-11-08T16:37:24", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Registro.class)
public class Registro_ { 

    public static volatile SingularAttribute<Registro, Date> fecha;
    public static volatile SingularAttribute<Registro, String> ip;
    public static volatile SingularAttribute<Registro, String> browser;
    public static volatile SingularAttribute<Registro, Integer> id;
    public static volatile SingularAttribute<Registro, String> so;
    public static volatile SingularAttribute<Registro, String> url;

}