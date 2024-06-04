package com.tarea1doo;

public class Fanta extends Producto{
    /**
     * Constructor de la clase Fanta.
     * @param serie Serie del producto.
     */
    public Fanta(){
        super(200);
    }
    /**
     * Método que simula el acto de beber el producto.
     *
     * @return Nombre del producto.
     */
    public String beber(){
        return new String("fanta");
    }
}