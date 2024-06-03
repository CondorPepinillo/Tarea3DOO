package com.tarea3doo;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaExp extends JFrame{
    private JPanel panel1;
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
    private JPanel PreciosPanel;
    private JLabel dineroIngresado;
    private JLabel precioCoca;
    private JLabel precioSprite;
    private JLabel precioFanta;
    private JLabel precioSnickers;
    private JLabel precioSuper8;

    private int cocaColaPrice = 300;
    private int spritePrice = 300;
    private int fantaPrice = 300;
    private int snickersPrice = 500;
    private int super8Price = 500;
    private int dineroUsuario = 0;


    public VentanaExp(){
        JFrame frame = new JFrame("Ventana Exp");
        frame.getContentPane().add(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dineroIngresado.setText("Dinero ingresado: " + dineroUsuario);
        precioCoca.setText("$"+cocaColaPrice);
        precioSprite.setText("$"+spritePrice);
        precioFanta.setText("$"+fantaPrice);
        precioSnickers.setText("$"+snickersPrice);
        precioSnickers.setText("$"+super8Price);

        frame.pack();
        frame.setVisible(true);
        Moneda100.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dineroUsuario += 100;
                dineroIngresado.setText("Dinero ingresado: " + dineroUsuario);
            }
        });
        Moneda500.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dineroUsuario += 500;
                dineroIngresado.setText("Dinero ingresado: " + dineroUsuario);
            }
        });
        Moneda1000.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dineroUsuario += 1000;
                dineroIngresado.setText("Dinero ingresado: " + dineroUsuario);
            }
        });
        Moneda1500.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dineroUsuario += 1500;
                dineroIngresado.setText("Dinero ingresado: " + dineroUsuario);
            }
        });
        CocaCola.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(dineroUsuario >= cocaColaPrice){
                    new VentanaConImagen(ProductList.COCA);
                    dineroUsuario = dineroUsuario - cocaColaPrice;
                    dineroIngresado.setText("Dinero ingresado: " + dineroUsuario);
                }
            }
        });
        Sprite.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(dineroUsuario >= spritePrice){
                    new VentanaConImagen(ProductList.SPRITE);
                    dineroUsuario = dineroUsuario - spritePrice;
                    dineroIngresado.setText("Dinero ingresado: " + dineroUsuario);
                }
            }
        });
        Fanta.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(dineroUsuario >= fantaPrice){
                    new VentanaConImagen(ProductList.FANTA);
                    dineroUsuario = dineroUsuario - fantaPrice;
                    dineroIngresado.setText("Dinero ingresado: " + dineroUsuario);
                }
            }
        });
        Snickers.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(dineroUsuario >= snickersPrice){
                    new VentanaConImagen(ProductList.SNICKERS);
                    dineroUsuario = dineroUsuario - snickersPrice;
                    dineroIngresado.setText("Dinero ingresado: " + dineroUsuario);
                }
            }
        });
        Super8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(dineroUsuario >= super8Price){
                    new VentanaConImagen(ProductList.SUPER8);
                    dineroUsuario = dineroUsuario - super8Price;
                    dineroIngresado.setText("Dinero ingresado: " + dineroUsuario);
                }
            }
        });
    };

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
