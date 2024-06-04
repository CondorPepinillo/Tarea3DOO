package com.tarea3doo;

// En Ventana.java
import javax.swing.*;

public class Ventana extends JFrame {
    public Ventana() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setTitle("Expendedor de bebidas y dulces");

        PanelPrincipal panelPrincipal = new PanelPrincipal();
        this.add(panelPrincipal);

        this.setVisible(true);
    }
}