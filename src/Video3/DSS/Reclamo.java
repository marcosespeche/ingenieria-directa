package Video3.DSS;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Reclamo {

    private int nroReclamo;

    private LocalDateTime fechaHoraRegistroReclamo;

    private LocalDateTime fechaHoraFinalizacionReclamo;

    private EstadoReclamo estadoReclamo;

    private List<ReclamoPaso> pasos = new ArrayList<>();

    private void addPaso (ReclamoPaso paso) {
        pasos.add(paso);
    }

    public Reclamo(int nroReclamo, LocalDateTime fechaHoraRegistroReclamo, LocalDateTime fechaHoraFinalizacionReclamo, EstadoReclamo estadoReclamo) {
        this.nroReclamo = nroReclamo;
        this.fechaHoraRegistroReclamo = fechaHoraRegistroReclamo;
        this.fechaHoraFinalizacionReclamo = fechaHoraFinalizacionReclamo;
        this.estadoReclamo = estadoReclamo;
    }

    public List<ReclamoPaso> getPasos() {
        return pasos;
    }

    public int getNroReclamo() {
        return nroReclamo;
    }

    public void setNroReclamo(int nroReclamo) {
        this.nroReclamo = nroReclamo;
    }

    public LocalDateTime getFechaHoraRegistroReclamo() {
        return fechaHoraRegistroReclamo;
    }

    public void setFechaHoraRegistroReclamo(LocalDateTime fechaHoraRegistroReclamo) {
        this.fechaHoraRegistroReclamo = fechaHoraRegistroReclamo;
    }

    public LocalDateTime getFechaHoraFinalizacionReclamo() {
        return fechaHoraFinalizacionReclamo;
    }

    public void setFechaHoraFinalizacionReclamo(LocalDateTime fechaHoraFinalizacionReclamo) {
        this.fechaHoraFinalizacionReclamo = fechaHoraFinalizacionReclamo;
    }

    public EstadoReclamo getEstadoReclamo() {
        return estadoReclamo;
    }

    public void setEstadoReclamo(EstadoReclamo estadoReclamo) {
        this.estadoReclamo = estadoReclamo;
    }
}
