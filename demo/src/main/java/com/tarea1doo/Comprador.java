package com.tarea1doo;

public class Comprador{
    private String sonido;
    private int vuelto;
    private int cualProducto;
    private DepositoM monedas;
    private Deposito depositoUnico;

    public Comprador() {
        monedas = new DepositoM();
        depositoUnico = new Deposito();
    }

    public void comprarProducto(Moneda m, ProductList Producto, Expendedor exp) throws PagoIncorrectoException, NoHayProductoException, PagoInsuficienteException{
        switch (Producto) {
            case COCA:
                this.cualProducto = 1;
                break;
            case SPRITE:
                this.cualProducto = 2;
                break;
            case FANTA:
                this.cualProducto = 3;
                break;
            case SNICKERS:
                this.cualProducto = 4;
                break;
            case SUPER8:
                this.cualProducto = 5;
                break;

            default:
                break;
        }

        exp.comprarProducto(m, this.cualProducto);
        while(true){
            Moneda aux = exp.getVuelto();
            if(aux == null){
                break;
            } else{
                vuelto += aux.getValor();
            }
        }
        Producto b = exp.getProducto();
        if(b == null){
            sonido = null;
        }
        else{
            sonido = b.beber();
        }
    }

    public int cuantoVuelto(){
        return vuelto;
    }

    public String queBebiste(){
        if(cualProducto == 1 || cualProducto == 2 || cualProducto == 3){
            return sonido;
        }
        else{
            return "No se puede";
        }
    }

    public String queComiste(){
        if(cualProducto == 4 || cualProducto == 5){
            return sonido;
        }
        else{
            return "No se puede";
        }
    }
}