package Video2.Abstraccion;

public class Circulo extends FiguraGeometrica{

    private double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El perimetro es: " + (2 * 3.14 * radio));
    }
}
