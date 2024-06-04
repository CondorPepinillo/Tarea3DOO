package com.tarea1doo;

import javax.swing.*;
import java.awt.*;

public abstract class Moneda extends JComponent {
    private static int nextSerialNumber = 1;
    private int serialNumber;
    public Moneda(){
        this.serialNumber = nextSerialNumber++;
    }

    public int getSerialNumber() {
        return this.serialNumber;
    }
    public abstract int getValor();

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibuja la moneda como un círculo
        g.drawOval(0, 0, getWidth(), getHeight());
        // Dibuja el número de serie de la moneda
        g.drawString(String.valueOf(serialNumber), getWidth() / 2, getHeight() / 2);
    }
}
