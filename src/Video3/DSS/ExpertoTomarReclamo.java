package Video3.DSS;

import java.util.List;

public class ExpertoTomarReclamo {

    private Reclamo reclamo;

    public ReclamoPaso obtenerPasoDisponible() throws Exception{

        EstadoReclamo estadoReclamo = reclamo.getEstadoReclamo();

        if (!"Disponible".equals(estadoReclamo.getNombreEstadoReclamo()))
            throw new Exception("Error: el reclamo no está disponible");

        List<ReclamoPaso> pasos = reclamo.getPasos();

        for (ReclamoPaso paso : pasos) {

            EstadoReclamoPaso estadoPaso = paso.getEstadoReclamoPaso();

            if ("Disponible".equals(estadoPaso.getNombreEstadoReclamoPaso()))
                return paso;
        }

        throw new Exception("Error: no hay pasos disponibles para este reclamo");
    }
}
