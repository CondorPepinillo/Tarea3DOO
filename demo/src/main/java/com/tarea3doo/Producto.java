package com.tarea3doo;

public abstract class Producto{
    private int serie;
    public Producto(int serie){
        this.serie = serie;
    }

    public int getSerie(){
        return serie;
    }
    public abstract String beber();

    }

