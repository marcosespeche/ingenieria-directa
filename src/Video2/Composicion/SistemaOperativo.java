package Video2.Composicion;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SistemaOperativo {

    private String nombreSO;

    private String versionSO;

    private boolean firewallActivo;

    private List<Proceso> procesos = new ArrayList<>();

    public void addProceso (int pid, int memoriaRamOcupada, LocalDateTime horaInicio) {
        Proceso proceso = new Proceso(pid, memoriaRamOcupada, horaInicio);
        procesos.add(proceso);
    }

    public SistemaOperativo(String nombreSO, String versionSO, boolean firewallActivo) {
        this.nombreSO = nombreSO;
        this.versionSO = versionSO;
        this.firewallActivo = firewallActivo;
    }

    public String getNombreSO() {
        return nombreSO;
    }

    public void setNombreSO(String nombreSO) {
        this.nombreSO = nombreSO;
    }

    public String getVersionSO() {
        return versionSO;
    }

    public void setVersionSO(String versionSO) {
        this.versionSO = versionSO;
    }

    public boolean isFirewallActivo() {
        return firewallActivo;
    }

    public void setFirewallActivo(boolean firewallActivo) {
        this.firewallActivo = firewallActivo;
    }
}
