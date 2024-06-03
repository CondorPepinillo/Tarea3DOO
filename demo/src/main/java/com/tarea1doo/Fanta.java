package com.tarea3doo;

public class Fanta extends Producto{
    /**
     * Constructor de la clase Fanta.
     * @param serie Serie del producto.
     * @param cantidad Cantidad de producto.
     */
    public Fanta(int serie, int cantidad){
        super(serie, cantidad);
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