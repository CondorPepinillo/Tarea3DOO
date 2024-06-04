package com.tarea1doo;

public class Fanta extends Producto{
    public Fanta(int serialNumber){
        super(serialNumber);
    }

    @Override
    public String getNombre() {
        return "Fanta";
    }
    @Override
    public String beber() {
        return "Glug glug, ¡qué refrescante Fanta!";
    }
}