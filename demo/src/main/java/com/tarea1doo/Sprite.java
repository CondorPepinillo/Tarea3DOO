package com.tarea1doo;

public class Sprite extends Producto{
    /**
     * Constructor de la clase Sprite.
     * @param i Es un valor que que se le agrega a 300 para crear la serie del producto.
     */
    public Sprite(int i){
        super(300 + i);
    }
}
