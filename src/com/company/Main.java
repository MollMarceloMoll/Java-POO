package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Coche coche = new Coche("Mercedes Benz",2,250,100);
        System.out.println("Marca del auto : "+coche.marca);
        System.out.println("Cantidad de puertas : "+coche.numeroDePuertas);
        System.out.println("Velocidad maxima : "+coche.velocidadMaxima);
        System.out.println("Velocidad actual : "+coche.velocidadActual);
    }
}
class Coche {
    String marca;
    int numeroDePuertas;
    int velocidadMaxima;
    float velocidadActual;

    public Coche(String marcaC, int puertas, int velocidad, int velocidadActua) {
        marca = marcaC;
        numeroDePuertas = puertas;
        velocidadMaxima = velocidad;
        velocidadActual = velocidadActua;
    }
}
