package com.tarea3doo;

public class PagoIncorrectoException extends Exception{
    public  PagoIncorrectoException(){
        super("No se introdujo moneda");
    }
}
