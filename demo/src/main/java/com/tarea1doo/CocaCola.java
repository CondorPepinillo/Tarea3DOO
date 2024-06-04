package com.tarea1doo;

public class CocaCola extends Producto{
    public CocaCola(int serialNumber){
        super(serialNumber);
    }

    @Override
    public String getNombre() {
        return "CocaCola";
    }
    @Override
    public String beber() {
        return "Glug glug, ¡qué refrescante CocaCola!";
    }
}