package model;

public class Coche {
    private int cv, cc, velocidad,kmRecorridos;

    private String marca, modelo, matricula;

    public Coche() {
    }

    public Coche(int cv, int cc, int velocidad, int kmRecorridos, String marca, String modelo, String matricula) {
        this.cv = cv;
        this.cc = cc;
        this.velocidad = velocidad;
        this.kmRecorridos = kmRecorridos;
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }


    public void acelerar() {
        System.out.println("El modelo " + modelo + " lleva una velocidad de " + velocidad + " y está acelerando...");
        if (cv < 100) {
            velocidad += (int) ((Math.random() * 40) + getVelocidad());
        } else velocidad += (int) (((Math.random() * 40) + 10) + getVelocidad());
        kmRecorridos += (kmRecorridos + (velocidad / 2));

        //Me salen unas velocidades algo disparatadas
        //No estoy muy segura de qué hacer con "deberá acelerar como mínimo 10km/h", ¿no se supone que eso es lo que
        //indica el else?

        System.out.println("¡El modelo " + modelo + " ahora lleva una velocidad de " + velocidad + "!");
        System.out.println("-----------------");
    }

    public void mostrarDatos() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Matrícula: " + matricula);
        System.out.println("CV: " + cv);
        System.out.println("CC: " + cc);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Km Recorridos: " + kmRecorridos);
        System.out.println("-----------------");

    }


    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(int kmRecorridos) {
        this.kmRecorridos=kmRecorridos;
    }

    public java.lang.String getMarca() {
        return marca;
    }

    public void setMarca(java.lang.String marca) {
        this.marca = marca;
    }

    public java.lang.String getModelo() {
        return modelo;
    }

    public void setModelo(java.lang.String modelo) {
        this.modelo = modelo;
    }
}
