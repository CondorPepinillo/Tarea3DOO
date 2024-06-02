package com.tarea3doo;

import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaExp {
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

    private int cocaColaPrice = 300;
    private int spritePrice = 300;

    private int dineroUsuario = 0;


    public VentanaExp(){
        JFrame frame = new JFrame("Ventana Exp");
        frame.getContentPane().add(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        Moneda100.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dineroUsuario += 100;
            }
        });
        Moneda500.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dineroUsuario += 500;
            }
        });
        Moneda1000.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dineroUsuario += 1000;
            }
        });
        Moneda1500.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dineroUsuario += 1500;
            }
        });
        CocaCola.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(dineroUsuario >= cocaColaPrice){
                    new VentanaConImagen(ProductList.COCA);
                    dineroUsuario =- cocaColaPrice;
                }
            }
        });
        Sprite.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(dineroUsuario >= cocaColaPrice){
                    new VentanaConImagen(ProductList.SPRITE);
                    dineroUsuario =- spritePrice;
                }
            }
        });
    };

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
