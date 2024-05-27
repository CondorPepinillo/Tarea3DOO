package com.tarea3doo;

public abstract class Moneda{
    public Moneda(){

    }

    public Moneda getSerie(){
        return this;
    };

    public abstract int getValor();
}
