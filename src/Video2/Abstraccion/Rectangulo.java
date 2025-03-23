package Video2.Abstraccion;

public class Rectangulo extends FiguraGeometrica {

    private double base;

    private double altura;

    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El perimetro es: " + (2 * base + 2 * altura));
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
