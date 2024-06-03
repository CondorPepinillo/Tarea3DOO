package com.tarea3doo;

public abstract class Producto{
    private int serie;
    private int cantidad;

    public Producto(int serie, int cantidad){
        this.serie = serie;
        this.cantidad = cantidad;
    }

    public int getSerie(){
        return serie;
    }

    public int getCantidad(){
        return cantidad;
    }

    public void disminuirCantidad(){
        if (cantidad > 0){
            cantidad--;
        }
    }

    public abstract String beber();

    }

