package com.tarea3doo;

public class NoHayProductoException extends Exception{
    public NoHayProductoException(){
        super("No hay producto");
    }
}
