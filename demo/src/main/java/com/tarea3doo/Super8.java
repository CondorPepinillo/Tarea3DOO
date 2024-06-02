package com.tarea3doo;

public class Super8 extends Producto{
    /**
     * Constructor de la clase Super8.
     * @param serie Serie del producto.
     */
    public Super8(int serie, int cantidad){
        super(serie, cantidad);
    }
    /**
     * Método que simula el acto de comer el producto.
     *
     * @return Nombre del producto.
     */
    public String beber(){
        return new String("super8");
    }
}