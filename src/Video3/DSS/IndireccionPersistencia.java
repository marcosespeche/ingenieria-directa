package Video3.DSS;

import java.util.List;

public interface IndireccionPersistencia {

    public List<Object> buscar (String clase, String criterio);

    public void guardar (Object object);
}
