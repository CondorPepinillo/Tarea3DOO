package com.tarea1doo;

public abstract class Producto {
    private static int nextSerie = 1;
    private int serie;

    public Producto(int serieInicial){
        this.serie = serieInicial + nextSerie++;
    }

    public int getSerie(){
        return serie;
    }

    public abstract String beber();

    }

