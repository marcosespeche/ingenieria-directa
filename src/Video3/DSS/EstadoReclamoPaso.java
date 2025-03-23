package Video3.DSS;

import java.time.LocalDateTime;

public class EstadoReclamoPaso {

    private int codEstadoReclamoPaso;

    private String nombreEstadoReclamoPaso;

    private String descripcionEstadoReclamoPaso;

    private LocalDateTime fechaHoraBajaEstadoReclamoPaso;

    public EstadoReclamoPaso(int codEstadoReclamoPaso, String nombreEstadoReclamoPaso, String descripcionEstadoReclamoPaso, LocalDateTime fechaHoraBajaEstadoReclamoPaso) {
        this.codEstadoReclamoPaso = codEstadoReclamoPaso;
        this.nombreEstadoReclamoPaso = nombreEstadoReclamoPaso;
        this.descripcionEstadoReclamoPaso = descripcionEstadoReclamoPaso;
        this.fechaHoraBajaEstadoReclamoPaso = fechaHoraBajaEstadoReclamoPaso;
    }

    public int getCodEstadoReclamoPaso() {
        return codEstadoReclamoPaso;
    }

    public void setCodEstadoReclamoPaso(int codEstadoReclamoPaso) {
        this.codEstadoReclamoPaso = codEstadoReclamoPaso;
    }

    public String getNombreEstadoReclamoPaso() {
        return nombreEstadoReclamoPaso;
    }

    public void setNombreEstadoReclamoPaso(String nombreEstadoReclamoPaso) {
        this.nombreEstadoReclamoPaso = nombreEstadoReclamoPaso;
    }

    public String getDescripcionEstadoReclamoPaso() {
        return descripcionEstadoReclamoPaso;
    }

    public void setDescripcionEstadoReclamoPaso(String descripcionEstadoReclamoPaso) {
        this.descripcionEstadoReclamoPaso = descripcionEstadoReclamoPaso;
    }

    public LocalDateTime getFechaHoraBajaEstadoReclamoPaso() {
        return fechaHoraBajaEstadoReclamoPaso;
    }

    public void setFechaHoraBajaEstadoReclamoPaso(LocalDateTime fechaHoraBajaEstadoReclamoPaso) {
        this.fechaHoraBajaEstadoReclamoPaso = fechaHoraBajaEstadoReclamoPaso;
    }
}
