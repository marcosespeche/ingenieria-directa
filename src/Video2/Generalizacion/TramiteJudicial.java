package Video2.Generalizacion;

public class TramiteJudicial extends Tramite {

    private String nombreJuez;

    private String ubicacionJuzgado;

    public TramiteJudicial(int nroTramite, String nombreJuez, String ubicacionJuzgado) {
        super(nroTramite);
        this.nombreJuez = nombreJuez;
        this.ubicacionJuzgado = ubicacionJuzgado;
    }

    public String getNombreJuez() {
        return nombreJuez;
    }

    public void setNombreJuez(String nombreJuez) {
        this.nombreJuez = nombreJuez;
    }

    public String getUbicacionJuzgado() {
        return ubicacionJuzgado;
    }

    public void setUbicacionJuzgado(String ubicacionJuzgado) {
        this.ubicacionJuzgado = ubicacionJuzgado;
    }
}
