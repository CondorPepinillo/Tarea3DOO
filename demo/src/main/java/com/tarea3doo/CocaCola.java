package com.tarea3doo;

public class CocaCola extends Producto{
    /**
     * Constructor de la clase Cola-Cola.
     * @param serie Serie del producto.
     * @param cantidad Cantidad de producto.
     */
    public CocaCola(int serie, int cantidad){
        super(serie, cantidad);
    }
    /**
     * Método que simula el acto de beber el producto.
     *
     * @return Nombre del producto.
     */
    public String beber(){
        return new String("cocacola");
    }
}