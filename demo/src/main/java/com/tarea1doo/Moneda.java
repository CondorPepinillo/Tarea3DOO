package com.tarea1doo;

public class Moneda {
    private static int nextSerie = 1;
    private int serie;
    private int valor;

    public Moneda(int valor){
        this.serie =nextSerie++;
    }

    public int getSerie(){
        return serie;
    }

    public void usar(){
        System.out.println("Usada moneda con valor " + valor + " y numero de serie " + serie);
    }
}