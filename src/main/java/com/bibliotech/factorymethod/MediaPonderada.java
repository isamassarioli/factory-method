package com.bibliotech.factorymethod;

public class MediaPonderada implements MediaMetricas {

    private double[] pesos;

    public MediaPonderada(double[] pesos){
        this.pesos = pesos;
    }

    @Override
    public double calcular(double[] notas) {

        double soma = 0;
        double somaPesos = 0;

        for(int i = 0; i < notas.length; i++){
            soma += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }

        return soma / somaPesos;
    }
}