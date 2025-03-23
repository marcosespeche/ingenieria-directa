package Video2.Composicion;

import java.time.LocalDateTime;

public class Proceso {

    private int PID;

    private int memoriaRamOcupada;

    private LocalDateTime horaInicio;

    public Proceso(int PID, int memoriaRamOcupada, LocalDateTime horaInicio) {
        this.PID = PID;
        this.memoriaRamOcupada = memoriaRamOcupada;
        this.horaInicio = horaInicio;
    }

    public int getPID() {
        return PID;
    }

    public void setPID(int PID) {
        this.PID = PID;
    }

    public int getMemoriaRamOcupada() {
        return memoriaRamOcupada;
    }

    public void setMemoriaRamOcupada(int memoriaRamOcupada) {
        this.memoriaRamOcupada = memoriaRamOcupada;
    }

    public LocalDateTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalDateTime horaInicio) {
        this.horaInicio = horaInicio;
    }
}

