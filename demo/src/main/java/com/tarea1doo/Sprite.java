package com.tarea1doo;

public class Sprite extends Producto{
    public Sprite(int serialNumber){
        super(serialNumber);
    }

    @Override
    public String getNombre() {
        return "Sprite";
    }
    @Override
    public String beber() {
        return "Glug glug, ¡qué refrescante Sprite!";
    }
}
