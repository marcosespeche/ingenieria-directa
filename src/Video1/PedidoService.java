package Video1;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class PedidoService {

    private Pedido pedido;

    public void registrarPedido() {

        iniciarObjetos();

        double resultado = calcularTotal();

        System.out.println("El resultado es: " + resultado);

    }

    public void iniciarObjetos() {
        EstadoPedido estado = new EstadoPedido();

        estado.setCodEstadoPedido(1);
        estado.setNombreEstadoPedido("En camino");
        estado.setDescripcionEstadoPedido("Soy una descripción");
        estado.setFechaHoraBajaEstadoPedido(null);

        pedido = new Pedido();

        pedido.setNroPedido(1);
        pedido.setFechaHoraRegistroPedido(LocalDateTime.now());
        pedido.setFechaHoraEntregaPedido(null);
        pedido.setEstadoPedido(estado);

        DetallePedido detalle1 = new DetallePedido();

        detalle1.setCantidad(10);
        detalle1.setSubtotal(10000);

        DetallePedido detalle2 = new DetallePedido();

        detalle2.setCantidad(5);
        detalle2.setSubtotal(5000);

        ArrayList<DetallePedido> detalles = new ArrayList<>();

        detalles.add(detalle1);
        detalles.add(detalle2);

        pedido.setDetallesPedido(detalles);
    }

    public double calcularTotal() {
        return pedido.getDetallesPedido()
                .stream()
                .map(DetallePedido::getSubtotal)
                .mapToDouble(Double::doubleValue)
                .sum();
    }
}
