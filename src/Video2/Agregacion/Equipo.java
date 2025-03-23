package Video2.Agregacion;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private int codEquipo;

    private String nombreEquipo;

    private LocalDateTime fechaHoraBajaEquipo;

    private List<Integrante> integrantes = new ArrayList<>();

    private void addIntegrante (Integrante integrante) {
        integrantes.add(integrante);
    }

    private void removeIntegrante (Integrante integrante) {
        integrantes.remove(integrante);
    }

    public Equipo(int codEquipo, String nombreEquipo, LocalDateTime fechaHoraBajaEquipo) {
        this.codEquipo = codEquipo;
        this.nombreEquipo = nombreEquipo;
        this.fechaHoraBajaEquipo = fechaHoraBajaEquipo;
    }

    public int getCodEquipo() {
        return codEquipo;
    }

    public void setCodEquipo(int codEquipo) {
        this.codEquipo = codEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public LocalDateTime getFechaHoraBajaEquipo() {
        return fechaHoraBajaEquipo;
    }

    public void setFechaHoraBajaEquipo(LocalDateTime fechaHoraBajaEquipo) {
        this.fechaHoraBajaEquipo = fechaHoraBajaEquipo;
    }
}
