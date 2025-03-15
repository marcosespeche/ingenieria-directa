package Video1;

import java.time.LocalDateTime;

public class EstadoPedido {

    private int codEstadoPedido;

    private String nombreEstadoPedido;

    private String descripcionEstadoPedido;

    private LocalDateTime fechaHoraBajaEstadoPedido;

    public int getCodEstadoPedido() {
        return codEstadoPedido;
    }

    public void setCodEstadoPedido(int codEstadoPedido) {
        this.codEstadoPedido = codEstadoPedido;
    }

    public String getNombreEstadoPedido() {
        return nombreEstadoPedido;
    }

    public void setNombreEstadoPedido(String nombreEstadoPedido) {
        this.nombreEstadoPedido = nombreEstadoPedido;
    }

    public String getDescripcionEstadoPedido() {
        return descripcionEstadoPedido;
    }

    public void setDescripcionEstadoPedido(String descripcionEstadoPedido) {
        this.descripcionEstadoPedido = descripcionEstadoPedido;
    }

    public LocalDateTime getFechaHoraBajaEstadoPedido() {
        return fechaHoraBajaEstadoPedido;
    }

    public void setFechaHoraBajaEstadoPedido(LocalDateTime fechaHoraBajaEstadoPedido) {
        this.fechaHoraBajaEstadoPedido = fechaHoraBajaEstadoPedido;
    }

    public EstadoPedido() {}
}
