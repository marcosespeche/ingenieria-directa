package Video3.DSS;

import java.time.LocalDateTime;

public class EstadoReclamo {

    private int codEstadoReclamo;

    private String nombreEstadoReclamo;

    private String descripcionEstadoReclamo;

    private LocalDateTime fechaHoraBajaEstadoReclamo;

    public EstadoReclamo(int codEstadoReclamo, String nombreEstadoReclamo, String descripcionEstadoReclamo, LocalDateTime fechaHoraBajaEstadoReclamo) {
        this.codEstadoReclamo = codEstadoReclamo;
        this.nombreEstadoReclamo = nombreEstadoReclamo;
        this.descripcionEstadoReclamo = descripcionEstadoReclamo;
        this.fechaHoraBajaEstadoReclamo = fechaHoraBajaEstadoReclamo;
    }

    public int getCodEstadoReclamo() {
        return codEstadoReclamo;
    }

    public void setCodEstadoReclamo(int codEstadoReclamo) {
        this.codEstadoReclamo = codEstadoReclamo;
    }

    public String getNombreEstadoReclamo() {
        return nombreEstadoReclamo;
    }

    public void setNombreEstadoReclamo(String nombreEstadoReclamo) {
        this.nombreEstadoReclamo = nombreEstadoReclamo;
    }

    public String getDescripcionEstadoReclamo() {
        return descripcionEstadoReclamo;
    }

    public void setDescripcionEstadoReclamo(String descripcionEstadoReclamo) {
        this.descripcionEstadoReclamo = descripcionEstadoReclamo;
    }

    public LocalDateTime getFechaHoraBajaEstadoReclamo() {
        return fechaHoraBajaEstadoReclamo;
    }

    public void setFechaHoraBajaEstadoReclamo(LocalDateTime fechaHoraBajaEstadoReclamo) {
        this.fechaHoraBajaEstadoReclamo = fechaHoraBajaEstadoReclamo;
    }
}
