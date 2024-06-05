package com.tarea3doo;
import com.tarea1doo.*;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Clase PanelPrincipal
 * Esta clase se encarga de crear la ventana principal del proyecto,
 * tambien se encarga de crear los paneles y dar acceso a las funciones del resto de las clases.
 */
public class PanelPrincipal extends JFrame{
    /**
     * Lo relacionado con la creacion de los elementos visuales de la ventana
     */
    private JPanel PanelPrincipal;
    private JButton Snickers;
    private JButton Fanta;
    private JButton Sprite;
    private JButton CocaCola;
    private JButton Moneda1000;
    private JButton Moneda500;
    private JButton Moneda100;
    private JButton Moneda1500;
    private JButton Super8;
    private JPanel MonedasPanel;
    private JPanel PanelExpendedor;
    private JLabel dineroIngresado;
    private JLabel precioCoca;
    private JLabel precioSprite;
    private JLabel precioFanta;
    private JLabel precioSnickers;
    private JLabel precioSuper8;
    private JButton devolverVuelto;
    private JButton rellenarMaquina;
    private JPanel PanelComprador;

    /**
     * Los precios de los distintos productos de la maquina expendedora
     */
    private int cocaColaPrice = 300;
    private int spritePrice = 300;
    private int fantaPrice = 300;
    private int snickersPrice = 500;
    private int super8Price = 500;

    /**
     * Variables auxiliares para asignar los numeros de serie de los productos
     */
    private int i1 = 0;
    private int i2 = 0;
    private int i3 = 0;
    private int i4 = 0;
    private int i5 = 0;

    /**
     * Unidades inicicales de los productos
     */
    private int cantidadDefault = 5;

    private int cantidadCoca = cantidadDefault;
    private int cantidadSprite = cantidadDefault;
    private int cantidadFanta = cantidadDefault;
    private int cantidadSnickers = cantidadDefault;
    private int cantidadSuper8 = cantidadDefault;

    /**
     * El dinero que ha sido ingresado a la maquina
     */
    private int dineroUsuario = 0;

    /**
     * Crea el deposito para las monedas
     */
    DepositoMonedas depositoMonedas = new DepositoMonedas();

    /**
     * Constructor de la clase PanelPrincipal
     */
    public PanelPrincipal(){
        /**
         * Se crea la ventana y sus elementos principales
         */
        JFrame frame = new JFrame("Panel Principal");
        frame.getContentPane().add(PanelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dineroIngresado.setText("Dinero ingresado: " + dineroUsuario);
        precioCoca.setText("$"+cocaColaPrice);
        precioSprite.setText("$"+spritePrice);
        precioFanta.setText("$"+fantaPrice);
        precioSnickers.setText("$"+snickersPrice);
        precioSnickers.setText("$"+super8Price);

        frame.pack();
        frame.setVisible(true);
        /**
         * Al presionar el boton se mete una moneda de 100 a la maquina
         */
        Moneda100.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dineroUsuario += 100;
                Moneda moneda = new Moneda(100);
                depositoMonedas.agregarMoneda(moneda);
                dineroIngresado.setText("Dinero ingresado: " + dineroUsuario);
            }
        });
        /**
         * Al presionar el boton se mete una moneda de 500 a la maquina
         */
        Moneda500.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dineroUsuario += 500;
                Moneda moneda = new Moneda(500);
                depositoMonedas.agregarMoneda(moneda);
                dineroIngresado.setText("Dinero ingresado: " + dineroUsuario);
            }
        });
        /**
         * Al presionar el boton se mete una moneda de 1000 a la maquina
         */
        Moneda1000.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dineroUsuario += 1000;
                Moneda moneda = new Moneda(1000);
                depositoMonedas.agregarMoneda(moneda);
                dineroIngresado.setText("Dinero ingresado: " + dineroUsuario);
            }
        });
        /**
         * Al presionar el boton se mete una moneda de 1500 a la maquina
         */
        Moneda1500.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dineroUsuario += 1500;
                Moneda moneda = new Moneda(1500);
                depositoMonedas.agregarMoneda(moneda);
                dineroIngresado.setText("Dinero ingresado: " + dineroUsuario);
            }
        });
        /**
         * Al presionar el boton se compra una CocaCola
         */
        CocaCola.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(dineroUsuario >= cocaColaPrice && cantidadCoca > 0){
                    new VentanaConImagen(ProductList.COCA, i1);
                    dineroUsuario = dineroUsuario - cocaColaPrice;
                    cantidadCoca--;
                    i1++;
                    System.out.println("Quedan " + cantidadCoca + " CocaCola en deposito");
                    dineroIngresado.setText("Dinero ingresado: " + dineroUsuario);
                    if(cantidadCoca == 0){
                        precioCoca.setVisible(false);
                    }
                }
            }
        });
        /**
         * Al presionar el boton se compra una Sprite
         */
        Sprite.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(dineroUsuario >= spritePrice && cantidadSprite > 0){
                    new VentanaConImagen(ProductList.SPRITE, i2);
                    dineroUsuario = dineroUsuario - spritePrice;
                    cantidadSprite--;
                    i2++;
                    System.out.println("Quedan " + cantidadSprite + " Sprite en deposito");
                    dineroIngresado.setText("Dinero ingresado: " + dineroUsuario);
                    if(cantidadSprite == 0){
                        precioSprite.setVisible(false);
                    }
                }
            }
        });
        /**
         * Al presionar el boton se compra una Fanta
         */
        Fanta.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(dineroUsuario >= fantaPrice && cantidadFanta > 0){
                    new VentanaConImagen(ProductList.FANTA, i3);
                    dineroUsuario = dineroUsuario - fantaPrice;
                    cantidadFanta--;
                    i3++;
                    System.out.println("Quedan " + cantidadFanta + " Fanta en deposito");
                    dineroIngresado.setText("Dinero ingresado: " + dineroUsuario);
                    if(cantidadFanta == 0){
                        precioFanta.setVisible(false);
                    }
                }
            }
        });
        /**
         * Al presionar el boton se compra una Snickers
         */
        Snickers.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(dineroUsuario >= snickersPrice && cantidadSnickers > 0){
                    new VentanaConImagen(ProductList.SNICKERS, i4);
                    dineroUsuario = dineroUsuario - snickersPrice;
                    cantidadSnickers--;
                    i4++;
                    System.out.println("Quedan " + cantidadSnickers + " Snickers en deposito");
                    dineroIngresado.setText("Dinero ingresado: " + dineroUsuario);
                    if(cantidadSnickers == 0){
                        precioSnickers.setVisible(false);
                    }
                }
            }
        });
        /**
         * Al presionar el boton se compra un Super8
         */
        Super8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(dineroUsuario >= super8Price && cantidadSuper8 > 0){
                    new VentanaConImagen(ProductList.SUPER8, i5);
                    dineroUsuario = dineroUsuario - super8Price;
                    cantidadSuper8--;
                    i5++;
                    System.out.println("Quedan " + cantidadSuper8 + " Super8 en deposito");
                    dineroIngresado.setText("Dinero ingresado: " + dineroUsuario);
                    if(cantidadSuper8 == 0){
                        precioSuper8.setVisible(false);
                    }
                }
            }
        });
        /**
         * Al presionar el boton se te devulve el vuelto de la maquina
         */
        devolverVuelto.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int[] valoresMoneda = {1500, 1000, 500, 100};
                for (int valorMoneda : valoresMoneda) {
                    while (dineroUsuario >= valorMoneda) {
                        dineroUsuario -= valorMoneda;
                        Moneda moneda = new Moneda(valorMoneda);
                        System.out.println("Devuelta moneda con valor " + valorMoneda + " y numero de serie " + moneda.getSerie());
                        new VentanaConMoneda(valorMoneda);
                    }
                }
                dineroIngresado.setText("Dinero ingresado: " + dineroUsuario);
            }
        });
        /**
         * Al presionar el boton se rellenan los productos de la maquina
         */
        rellenarMaquina.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                cantidadCoca = cantidadDefault;
                cantidadSprite = cantidadDefault;
                cantidadFanta = cantidadDefault;
                cantidadSnickers = cantidadDefault;
                cantidadSuper8 = cantidadDefault;
                precioCoca.setVisible(true);
                precioSprite.setVisible(true);
                precioFanta.setVisible(true);
                precioSnickers.setVisible(true);
                precioSuper8.setVisible(true);
            }
        });
    };

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
