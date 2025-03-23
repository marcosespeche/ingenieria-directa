package Video3.Polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Polimorfismo {

    public void testPolimorfismo() {

        Animal perro = new Perro(); // Correcto
        perro.hacerSonido(); // Correcto
        //perro.pasear();  Erroneo

        // Animal perro2 = new Animal(); Erroneo

        Perro perro3 = new Perro(); // Correcto

        // List<Object> lista = new List(); Erroneo

        List<Object> lista2 = new ArrayList<>(); // Correcto

        lista2.add(new Object()); // Correcto
    }
}
