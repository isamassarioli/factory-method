package com.bibliotech.factorymethod;

public class MediaPonderadaFactory extends MediaFactory {

    private double[] pesos;

    public MediaPonderadaFactory(double[] pesos){
        this.pesos = pesos;
    }

    @Override
    public MediaMetricas criarMedia() {
        return new MediaPonderada(pesos);
    }
}