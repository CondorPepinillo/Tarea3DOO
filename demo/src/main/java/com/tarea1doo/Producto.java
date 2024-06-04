package com.tarea1doo;

public abstract class Producto {
    private int serie;
    /**
     * Constructor de la clase Producto.
     * @param serie Es el numero de serie de el producto en cuestion.
     */
    public Producto(int serie){
        this.serie = serie;
    }
    /**
     * @return Numero de serie del producto.
     */
    public int getSerie(){
        return serie;
    }
    }

