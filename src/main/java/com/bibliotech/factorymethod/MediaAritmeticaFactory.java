package com.bibliotech.factorymethod;

public class MediaAritmeticaFactory extends MediaFactory {

    @Override
    public MediaMetricas criarMedia() {
        return new MediaAritmetica();
    }
}