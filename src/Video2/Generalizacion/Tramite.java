package Video2.Generalizacion;

import java.time.LocalDateTime;

public class Tramite {

    private int nroTramite;

    private LocalDateTime fechaHoraRegistroTramite;

    public Tramite(int nroTramite) {
        this.nroTramite = nroTramite;
        this.fechaHoraRegistroTramite = LocalDateTime.now();
    }

    public int getNroTramite() {
        return nroTramite;
    }

    public void setNroTramite(int nroTramite) {
        this.nroTramite = nroTramite;
    }

    public LocalDateTime getFechaHoraRegistroTramite() {
        return fechaHoraRegistroTramite;
    }

    public void setFechaHoraRegistroTramite(LocalDateTime fechaHoraRegistroTramite) {
        this.fechaHoraRegistroTramite = fechaHoraRegistroTramite;
    }
}
