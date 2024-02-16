import model.Coche;

public class Entrada {
    public static void main(String[] args) {
        Coche cocheAzul = new Coche((int) (Math.random() * 200), (int) (Math.random() * 200),
                (int) (Math.random() * 200), 0.0, "Audi", "2Fast BLUE", "1234ABC");

        Coche cocheRojo = new Coche ((int)(Math.random() * 200), (int) (Math.random() * 200),
                (int) (Math.random() * 200), 0.0, "BMW", "2Furious RED", "5678DFG");

        //cocheAzul.acelerar();
        //cocheRojo.acelerar();

        //cocheAzul.mostrarDatos();
        //cocheRojo.mostrarDatos();





    }
}
