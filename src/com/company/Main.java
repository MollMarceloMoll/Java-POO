package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vehiculo coche = new Vehiculo();
        coche.setTipo("Coupe");
        coche.setVelocidadMaxima(120);
        coche.setRapido(true);

        System.out.println(coche.getTipo());
        System.out.println(coche.getVelocidadMaxima());
        System.out.println(coche.getRapido());

        Vehiculo moto = new Vehiculo();
        moto.setTipo("Scotter");
        moto.setVelocidadMaxima(50);
        moto.setRapido(false);

        System.out.println(moto.getTipo());
        System.out.println(moto.getVelocidadMaxima());
        System.out.println(moto.getRapido());

        Automovil automovil = new Automovil();
        EjecutaAcelerar(automovil);

    }
    public static void EjecutaAcelerar(Car car){
        car.Acelerar(15);
    }
}
class Vehiculo {
    private String tipo;
    private int velocidadMaxima;
    private boolean rapido;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return this.tipo;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    public int getVelocidadMaxima() {
        return this.velocidadMaxima;
    }

    public void setRapido(boolean rapido) {
        this.rapido = rapido;
    }
    public boolean getRapido() {
        return this.rapido;
    }
}

// Interface
interface Car {
    void Acelerar(int cuantaVelocidad);
    void Frenar(int cuantaVelocidad);
}

class Automovil implements Car {
    public void Acelerar(int cuantaVelocidad){
        System.out.println("Coche() -> Acelerar()");
    }
    public void Frenar(int cuantaVelocidad) {
        System.out.println("Coche() -> Frenar()");
    }
}