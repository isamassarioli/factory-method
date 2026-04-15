package com.bibliotech.factorymethod;

public class Main {

    public static void main(String[] args) {

        double[] notas = {8.0, 7.5, 9.0};

        /*MediaFactory factory = new MediaAritmeticaFactory();

        MediaMetricas media = factory.criarMedia();

        System.out.println("Média Aritmética: " + media.calcular(notas));*/

        double[] pesos = {2, 3, 5};

        MediaFactory factory = new MediaPonderadaFactory(pesos);

        MediaMetricas media = factory.criarMedia();

        System.out.println("Média Ponderada: " + media.calcular(notas));
    }
}
