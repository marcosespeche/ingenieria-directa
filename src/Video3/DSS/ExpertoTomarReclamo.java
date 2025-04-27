package Video3.DSS;

import javax.management.InstanceNotFoundException;
import java.util.List;

public class ExpertoTomarReclamo {

    private IndireccionPersistencia bd;

    private Reclamo reclamo;

    private ReclamoPaso pasoDisponible;

    private Especialista especialista;

//    3. Ingresar datos (nroLegajoEspecialista, nroReclamo)
    public ReclamoPaso obtenerReclamo(int nroLegajoEspecialista, int nroReclamo) throws Exception {

        /*
        4.2 Buscar instancia de Especialista con:
        •	nroLegajoEspecialista = nroLegajoEspecialista ingresado
        •	fechaHoraBajaEspecialista = null */
        this.especialista = (Especialista) bd.buscar(
                "Especialista",
                "nroLegajoEspecialista = " + nroLegajoEspecialista + " AND fechaHoraBajaEspecialista = NULL");

        // CA N2
        if (especialista == null) throw new InstanceNotFoundException("No se encontró un especialista con legajo " + nroLegajoEspecialista);

        /*
        4.3 Buscar instancia de Reclamo con:
            •	nroCaso = nroCaso ingresado */
        this.reclamo = (Reclamo) bd.buscar(
                "Reclamo",
                "nroReclamo = " + nroReclamo);

        // CA N3
        if (reclamo == null) throw new InstanceNotFoundException("No se encontró un reclamo con número " + nroReclamo);

        this.pasoDisponible = validarDisponibilidadReclamo();

        return this.pasoDisponible;
    }

    public ReclamoPaso validarDisponibilidadReclamo() throws Exception{

        /*
        4.4 Leer de instancia de Reclamo
            •	relación con instancia de EstadoReclamo
        4.5 Leer de instancia de EstadoReclamo (4.4)
            •	nombreEstadoReclamo
        4.6 Verificar que nombreEstadoReclamo = “Disponible” */
        EstadoReclamo estadoReclamo = reclamo.getEstadoReclamo();

        // CA N4
        if (!"Disponible".equals(estadoReclamo.getNombreEstadoReclamo()))
            throw new RuntimeException("Error: el reclamo no está disponible");

        /*
        4.7 Leer de instancia de Reclamo
            •	relación con instancias de ReclamoPaso */
        List<ReclamoPaso> pasos = reclamo.getPasos();

        /* 4.8 POR CADA instancia de ReclamoPaso (4.7)  */
        for (ReclamoPaso paso : pasos) {
            /*
            4.8.1 Leer de instancia de ReclamoPaso
                •	relación con EstadoReclamoPaso
            4.8.2 Leer de instancia de EstadoReclamoPaso
                •	nombreEstadoReclamoPaso */
            EstadoReclamoPaso estadoPaso = paso.getEstadoReclamoPaso();
            /*
            4.9 Seleccionar instancia de ReclamoPaso con:
                •	nombreEstadoReclamoPaso = “Disponible” */
            if ("Disponible".equals(estadoPaso.getNombreEstadoReclamoPaso()))
                return paso;
        }
        // CA N5
        throw new RuntimeException("Error: no hay pasos disponibles para este reclamo");
    }

    public void asignarReclamo(boolean confirmacion) throws Exception {

        // 6.2 Comprobar que la respuesta ingresada sea positiva
        if (!confirmacion) throw new RuntimeException("No se confirma la asignación");

        /* 6.1 Buscar instancia de EstadoReclamo
          •	con nombreEstadoReclamo = “Asignado” */
        EstadoReclamo estadoReclamoAAsignar = (EstadoReclamo) bd.buscar(
                "EstadoReclamo",
                "nombreEstadoReclamo = 'Asignado' AND fechaHoraBajaEstadoReclamo = NULL");

        // CA N8
        if (estadoReclamoAAsignar == null) throw new Exception("No se encontró el Estado de Reclamo 'Asignado'");

        /* 6.2 Buscar instancia de EstadoReclamoPaso
          •	con nombreEstadoReclamoPaso = “Asignado” */
        EstadoReclamoPaso estadoReclamoPasoAAsignar = (EstadoReclamoPaso) bd.buscar(
                "EstadoReclamoPaso",
                "nombreEstadoReclamoPaso = 'Asignado' AND fechaHoraBajaEstadoReclamoPaso = NULL");

        // CA N9
        if (estadoReclamoPasoAAsignar == null) throw new Exception("No se encontró el Estado de Paso 'Asignado'");

        // 7. Guardar cambios
        this.reclamo.setEstadoReclamo(estadoReclamoAAsignar);
        this.pasoDisponible.setEstadoReclamoPaso(estadoReclamoPasoAAsignar);
        this.pasoDisponible.setEspecialista(especialista);

        bd.guardar(reclamo);
    }
}
