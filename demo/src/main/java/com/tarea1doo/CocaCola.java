package com.tarea1doo;

public class CocaCola extends Producto{
    /**
     * Constructor de la clase CocaCola.
     * @param i Es un valor que que se le agrega a 100 para crear la serie del producto.
     */
    public CocaCola(int i){
        super(100 + i);
    }
}