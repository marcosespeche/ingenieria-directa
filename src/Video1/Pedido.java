package Video1;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {

    private int nroPedido;

    private LocalDateTime fechaHoraRegistroPedido;

    private LocalDateTime fechaHoraEntregaPedido;

    private EstadoPedido estadoPedido;

    public List<DetallePedido> getDetallesPedido() {
        return detallesPedido;
    }

    public void setDetallesPedido(List<DetallePedido> detallesPedido) {
        this.detallesPedido = detallesPedido;
    }

    public EstadoPedido getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(EstadoPedido estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    private List<DetallePedido> detallesPedido;

    public int getNroPedido() {
        return this.nroPedido;
    }

    public void setNroPedido(int nroPedido) {
        this.nroPedido = nroPedido;
    }

    public LocalDateTime getFechaHoraRegistroPedido() {
        return fechaHoraRegistroPedido;
    }

    public void setFechaHoraRegistroPedido(LocalDateTime fechaHoraRegistroPedido) {
        this.fechaHoraRegistroPedido = fechaHoraRegistroPedido;
    }

    public LocalDateTime getFechaHoraEntregaPedido() {
        return fechaHoraEntregaPedido;
    }

    public void setFechaHoraEntregaPedido(LocalDateTime fechaHoraEntregaPedido) {
        this.fechaHoraEntregaPedido = fechaHoraEntregaPedido;
    }

    public Pedido() {}
}
