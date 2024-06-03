package com.tarea3doo;

public class Snickers extends Producto{
    /**
     * Constructor de la clase Snickers.
     * @param serie Serie del producto.
     * @param cantidad Cantidad de producto.
     */
    public Snickers(int serie, int cantidad){
        super(serie, cantidad);
    }
    /**
     * Método que simula el acto de comer el producto.
     *
     * @return Nombre del producto.
     */
    public String beber(){
        return new String("snickers");
    }
}