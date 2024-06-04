package com.tarea1doo;

public class Super8 extends Producto{
    public Super8(int serialNumber){
        super(serialNumber);
    }

    @Override
    public String getNombre() {
        return "Super 8";
    }
    @Override
    public String beber() {
        return "Glug glug, ¡qué rico Super 8!";
    }
}