package Video2.Generalizacion;

public class TramiteInmobiliario extends Tramite {

    private double superficieInmueble;

    private String ubicacionInmueble;

    public TramiteInmobiliario(int nroTramite, double superficieInmueble, String ubicacionInmueble) {
        super(nroTramite);
        this.superficieInmueble = superficieInmueble;
        this.ubicacionInmueble = ubicacionInmueble;
    }

    public double getSuperficieInmueble() {
        return superficieInmueble;
    }

    public void setSuperficieInmueble(double superficieInmueble) {
        this.superficieInmueble = superficieInmueble;
    }

    public String getUbicacionInmueble() {
        return ubicacionInmueble;
    }

    public void setUbicacionInmueble(String ubicacionInmueble) {
        this.ubicacionInmueble = ubicacionInmueble;
    }
}
