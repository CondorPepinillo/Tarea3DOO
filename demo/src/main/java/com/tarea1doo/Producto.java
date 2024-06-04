package com.tarea1doo;

import javax.swing.JComponent;
import java.awt.Graphics;

public abstract class Producto extends JComponent {
    private static int nextSerialNumber = 1;
    private int serialNumber;
    private String nombre;

    public Producto(int serie){
        this.serialNumber = nextSerialNumber++;
    }

    public String getNombre() {
        return nombre;
    }
    public int getSerialNumber(){
        return serialNumber;
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibuja el producto como un rectángulo
        g.drawRect(0, 0, getWidth(), getHeight());
        // Dibuja el número de serie del producto
        g.drawString(String.valueOf(serialNumber), getWidth() / 2, getHeight() / 2);
    }

    public abstract String beber();
}

