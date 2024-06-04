package com.tarea1doo;

public class Snickers extends Producto{
    public Snickers(int serialNumber){
        super(serialNumber);
    }

    @Override
    public String getNombre() {
        return "Snickers";
    }
    @Override
    public String beber() {
        return "Glug glug, ¡qué rico Snicker!";
    }
}