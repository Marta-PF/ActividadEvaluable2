package model;

public class Carrera {

    private Coche participante1, participante2;

    private Coche ganador;
    private int kmTotales;
    private int numVueltas;




    public Carrera() {
    }

    public Carrera(Coche participante1, Coche participante2, int kmTotales, int numVueltas) {
        this.kmTotales = kmTotales;
        this.numVueltas = numVueltas;
    }

    public Coche getParticipante1() {
        return participante1;
    }

    public void setParticipante1(Coche participante1) {
        this.participante1 = participante1;
    }

    public Coche getParticipante2() {
        return participante2;
    }

    public void setParticipante2(Coche participante2) {
        this.participante2 = participante2;
    }

    public double getKmTotales() {
        return kmTotales;
    }

    public void setKmTotales(int kmTotales) {
        this.kmTotales = kmTotales;
    }

    public int getNumVueltas() {
        return numVueltas;
    }

    public void setNumVueltas(int numVueltas) {
        this.numVueltas = numVueltas;
    }

    public void iniciarCarrera(Coche participante1, Coche participante2) {

        participante1.mostrarDatos();
        participante2.mostrarDatos();

        do {
                System.out.println("¡Los coches aceleran!");
                System.out.println("Velocidad " + participante1.getModelo() + " :" + participante1.getVelocidad());
                System.out.println("Velocidad " + participante2.getModelo() + " :" + participante2.getVelocidad());
                participante1.acelerar();
                participante2.acelerar();

        }while (participante1.getKmRecorridos()<= kmTotales || participante2.getKmRecorridos()<=kmTotales);


        /*for (int i = 0; i < numVueltas; i++) {
            System.out.println("¡Los coches aceleran!");
            System.out.println("Velocidad " + participante1.getModelo() + " :" + participante1.getVelocidad());
            System.out.println("Velocidad " + participante2.getModelo() + " :" + participante2.getVelocidad());
            participante1.acelerar();
            participante2.acelerar();
            if(participante1.getKmRecorridos()>= kmTotales){
                System.out.println("Ganador "+participante1.getModelo() +"!");
                break;
        } else if (participante2.getKmRecorridos()>=kmTotales) {
                System.out.println("Ganador "+participante2.getModelo() +"!");
                break;
            }

        }*/ participante1.mostrarDatos();
        participante2.mostrarDatos();



    }


}


