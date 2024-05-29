package com.tarea3doo;

import javax.swing.*;
import java.awt.*;
import java.sql.DriverAction;

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

    public VentanaExp(){
        JFrame frame = new JFrame("Ventana Exp");
        frame.getContentPane().add(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    };

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
