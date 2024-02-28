import model.Carrera;
import model.Coche;

//MARTA PEREZ FRAILE 1º DAW
//ACTIVIDAD EVALUABLE 2: CARRERA DE COCHES

public class Entrada {
    public static void main(String[] args) {
        Coche cocheAzul = new Coche((int) (Math.random() * 200), (int) (Math.random() * 200),
                (int) (Math.random() * 100), 0, "Audi", "2Fast BLUE", "1234ABC");

        Coche cocheRojo = new Coche((int) (Math.random() * 200), (int) (Math.random() * 200),
                (int) (Math.random() * 100), 0, "BMW", "2Furious RED", "5678DFG");


        Carrera carrera = new Carrera(cocheAzul, cocheRojo, 1000, 5);


        carrera.iniciarCarrera(cocheAzul, cocheRojo);

    }
}
