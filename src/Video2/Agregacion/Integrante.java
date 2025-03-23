package Video2.Agregacion;

import java.time.LocalDateTime;

public class Integrante {

    private int legajoIntergante;

    private String nombreIntegrante;

    private LocalDateTime fechaHoraBajaIntegrante;

    public Integrante(int nroLegajoIntergante, String nombreIntegrante, LocalDateTime fechaHoraBajaIntegrante) {
        this.legajoIntergante = nroLegajoIntergante;
        this.nombreIntegrante = nombreIntegrante;
        this.fechaHoraBajaIntegrante = fechaHoraBajaIntegrante;
    }

    public int getLegajoIntergante() {
        return legajoIntergante;
    }

    public void setLegajoIntergante(int legajoIntergante) {
        this.legajoIntergante = legajoIntergante;
    }

    public String getNombreIntegrante() {
        return nombreIntegrante;
    }

    public void setNombreIntegrante(String nombreIntegrante) {
        this.nombreIntegrante = nombreIntegrante;
    }

    public LocalDateTime getFechaHoraBajaIntegrante() {
        return fechaHoraBajaIntegrante;
    }

    public void setFechaHoraBajaIntegrante(LocalDateTime fechaHoraBajaIntegrante) {
        this.fechaHoraBajaIntegrante = fechaHoraBajaIntegrante;
    }
}
