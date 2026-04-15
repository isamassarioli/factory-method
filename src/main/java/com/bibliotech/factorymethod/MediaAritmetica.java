package com.bibliotech.factorymethod;

public class MediaAritmetica implements MediaMetricas {

    @Override
    public double calcular(double[] notas) {

        double soma = 0;

        for(double nota : notas){
            soma += nota;
        }

        return soma / notas.length;
    }
}