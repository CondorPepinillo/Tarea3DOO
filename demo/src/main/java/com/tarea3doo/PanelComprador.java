package com.tarea3doo;

import com.tarea1doo.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelComprador extends JPanel {
    private Comprador comprador;

    public PanelComprador() {
        comprador = new Comprador();


    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibuja los depósitos y los productos
        // ... código para dibujar los depósitos y los productos ...
    }
}