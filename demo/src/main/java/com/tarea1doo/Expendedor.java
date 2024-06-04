package com.tarea1doo;
/**
 * Esta clase representa un expendedor de bebidas y dulces.
 * El expendedor tiene depósitos para cada tipo de bebida y dulce (Coca-Cola, Sprite, Fanta, Snickers y Super8) y un depósito para las monedas.
 * El expendedor también tiene un precio para cada tipo de bebida y dulce.
 */
public class Expendedor{
    /* El depósito de Coca-Cola.*/
    private Deposito coca;
    /* El depósito de Sprite.*/
    private Deposito sprite;
    /* El depósito de Fanta.*/
    private Deposito fanta;
    /* El depósito de Snickers.*/
    private Deposito snickers;
    /* El depósito de Super8.*/
    private Deposito super8;
    /* El depósito de monedas vuelto.*/
    private DepositoM monVu;
    /* El deposito del producto comprado.*/
    private Deposito depositoUnico;
    /* El deposito de las monedas recibidas*/
    private DepositoM monedas;
    private int precio;

    /**
     * Crea un nuevo expendedor con el número especificado de productos y el tipo de producto especificado.
     *
     * @param numProductos El número de productos a añadir al expendedor.
     * @param Producto El tipo de producto a añadir al expendedor.
     */
    public Expendedor(int numProductos, ProductList Producto){
        switch (Producto) {
            case COCA:
                this.precio = 300;
                break;
            case SPRITE:
                this.precio = 600;
                break;
            case FANTA:
                this.precio = 500;
                break;
            case SNICKERS:
                this.precio = 1000;
                break;
                case SUPER8:
                this.precio = 800;
                break;
            default:
                break;
        }
        coca = new Deposito();
        sprite = new Deposito();
        fanta = new Deposito();
        snickers = new Deposito();
        super8 = new Deposito();
        monVu = new DepositoM();
        for(int i = 0;i < numProductos;i++){
            coca.addProducto(new CocaCola(100 + i));
            sprite.addProducto(new Sprite(200 + i));
            fanta.addProducto(new Fanta(300 + i));
            snickers.addProducto(new Snickers(400 + i));
            super8.addProducto(new Super8(500 + i));
        }

        depositoUnico = new Deposito();
        monedas = new DepositoM();
    }

    /**
     * Compra un producto del expendedor.
     *
     * @param m La moneda utilizada para comprar el producto.
     * @param cual El número del producto a comprar.
     * @return El producto comprado.
     * @throws PagoIncorrectoException Si la moneda no es válida.
     * @throws NoHayProductoException Si el producto no está disponible.
     * @throws PagoInsuficienteException Si la moneda no tiene suficiente valor para comprar el producto.
     */
    public void comprarProducto(Moneda m, int cual) throws PagoIncorrectoException, NoHayProductoException, PagoInsuficienteException{
        if(m == null){
            throw new PagoIncorrectoException();
        }

        if(m.getValor() < precio){
            monVu.addMoneda(m);
            throw new PagoInsuficienteException();
        } 

        monedas.addMoneda(m);

        switch (cual) {
            case 1:
                if(coca.checkSize()){
                    monVu.addMoneda(m);
                    throw new NoHayProductoException();
                } else {
                    for(int i = 0;i < (m.getValor() - precio)/100;i++){
                        monVu.addMoneda(new Moneda100());
                    }
                    depositoUnico.addProducto(coca.getProducto());
                }
                break;
            case 2:
                if(sprite.checkSize()){
                    monVu.addMoneda(m);
                    throw new NoHayProductoException();
                } else {
                    for(int i = 0;i < (m.getValor() - precio)/100;i++){
                        monVu.addMoneda(new Moneda100());
                    }
                    depositoUnico.addProducto(sprite.getProducto());
                }
                break;
            case 3:
                if(fanta.checkSize()){
                    monVu.addMoneda(m);
                    throw new NoHayProductoException();
                } else {
                    for(int i = 0;i < (m.getValor() - precio)/100;i++){
                        monVu.addMoneda(new Moneda100());
                    }
                    depositoUnico.addProducto(fanta.getProducto());
                }
                break;
            case 4:
                if(snickers.checkSize()){
                    monVu.addMoneda(m);
                    throw new NoHayProductoException();
                } else {
                    for(int i = 0;i < (m.getValor() - precio)/100;i++){
                        monVu.addMoneda(new Moneda100());
                    }
                    depositoUnico.addProducto(snickers.getProducto());
                }
                break;
            case 5:
                if(super8.checkSize()){
                    monVu.addMoneda(m);
                    throw new NoHayProductoException();
                } else {
                    for(int i = 0;i < (m.getValor() - precio)/100;i++){
                        monVu.addMoneda(new Moneda100());
                    }
                    depositoUnico.addProducto(super8.getProducto());
                }
                break;
            default:
                break;
        }
    }
    
    /**
     * Devuelve el vuelto del pago.
     *
     * @return El vuelto del pago.
     */
    public Moneda getVuelto(){
        return monVu.getMoneda();
    }

    /**
     * Devuelve el producto comprado.
     *
     * @return El producto comprado.
     */
    public Producto getProducto(){
        return depositoUnico.getProducto();
    }
}
