package Video2.Generalizacion;

public class TramiteBancario extends Tramite {

    private String nombreBanco;

    private int nroCuentaBancaria;

    public TramiteBancario(int nroTramite, String nombreBanco, int nroCuentaBancaria) {
        super(nroTramite);
        this.nombreBanco = nombreBanco;
        this.nroCuentaBancaria = nroCuentaBancaria;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public int getNroCuentaBancaria() {
        return nroCuentaBancaria;
    }

    public void setNroCuentaBancaria(int nroCuentaBancaria) {
        this.nroCuentaBancaria = nroCuentaBancaria;
    }
}
