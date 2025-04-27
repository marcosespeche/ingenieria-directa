package Video3.DSS;

import java.time.LocalDateTime;

public class ReclamoPaso {

    private int orden;

    private LocalDateTime fechaHoraInicio;

    private LocalDateTime fechaHoraFin;

    private EstadoReclamoPaso estadoReclamoPaso;

    private Especialista especialista;

    public ReclamoPaso(int orden, LocalDateTime fechaHoraInicio, LocalDateTime fechaHoraFin) {
        this.orden = orden;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
    }

    public Especialista getEspecialista() {
        return especialista;
    }

    public void setEspecialista(Especialista especialista) {
        this.especialista = especialista;
    }

    public EstadoReclamoPaso getEstadoReclamoPaso() {
        return estadoReclamoPaso;
    }

    public void setEstadoReclamoPaso(EstadoReclamoPaso estadoReclamoPaso) {
        this.estadoReclamoPaso = estadoReclamoPaso;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public LocalDateTime getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public LocalDateTime getFechaHoraFin() {
        return fechaHoraFin;
    }

    public void setFechaHoraFin(LocalDateTime fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }
}
