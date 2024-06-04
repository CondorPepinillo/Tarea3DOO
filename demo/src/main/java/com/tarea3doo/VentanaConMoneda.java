package com.tarea3doo;

import javax.swing.*;

public class VentanaConMoneda extends JFrame {
    private JPanel panel1;
    private JLabel label1;

    public VentanaConMoneda(int valorMoneda) {
        panel1 = new JPanel();
        label1 = new JLabel();

        ImageIcon imageIcon;
        switch (valorMoneda) {
            case 100:
                imageIcon = new ImageIcon("../Tarea3DOO/demo/src/main/resources/coin100.png");
                break;
            case 500:
                imageIcon = new ImageIcon("../Tarea3DOO/demo/src/main/resources/coin500.png");
                break;
            case 1000:
                imageIcon = new ImageIcon("../Tarea3DOO/demo/src/main/resources/coin1000.png");
                break;
            case 1500:
                imageIcon = new ImageIcon("../Tarea3DOO/demo/src/main/resources/coin1500.png");
                break;
            default:
                throw new IllegalArgumentException("Valor de moneda no válido");
        }

        label1.setIcon(imageIcon);
        panel1.add(label1);

        JFrame frame =new JFrame("Ventana con moneda");
        frame.getContentPane().add(panel1);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        label1.setText("Moneda con valor " + valorMoneda + " devuelta");
        frame.pack();
        frame.setVisible(true);
    }
}
