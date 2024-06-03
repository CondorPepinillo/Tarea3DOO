package com.tarea3doo;

public class Sprite extends Producto{
    /**
     * Constructor de la clase Sprite.
     * @param serie Serie del producto.
     * @param cantidad Cantidad de producto.
     */
    public Sprite(int serie, int cantidad){
        super(serie, cantidad);
    }
    /**
     * Método que simula el acto de beber el producto.
     *
     * @return Nombre del producto.
     */
    public String beber(){
        return new String("sprite");
    }
}
