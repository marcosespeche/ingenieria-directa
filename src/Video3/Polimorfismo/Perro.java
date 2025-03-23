package Video3.Polimorfismo;

public class Perro extends Animal {

    @Override
    public void hacerSonido() {
        System.out.println("Guau guau");
    }

    public void pasear() {
        System.out.println("Estoy saliendo a pasear");
    }
}
