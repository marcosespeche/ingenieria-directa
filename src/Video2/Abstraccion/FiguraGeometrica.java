package Video2.Abstraccion;

public abstract class FiguraGeometrica {

    private String nombre;

    public void saludar() {
        System.out.println("Hola, soy " + nombre);
    }

    public abstract void calcularPerimetro();

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
