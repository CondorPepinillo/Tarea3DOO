package com.tarea3doo;

import com.tarea1doo.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelPrincipal extends JPanel {
    private PanelComprador com;
    private PanelExpendedor exp;

    public PanelPrincipal () {
        exp = new PanelExpendedor ();
        com = new PanelComprador();
        this.setBackground(Color.white);

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                // Obtén las coordenadas del clic
                int x = e.getX();
                int y = e.getY();

                // Verifica si el clic ocurrió dentro de PanelComprador
                if (com.getBounds().contains(x, y)) {
                    com.handleClick(e);
                }

                // Verifica si el clic ocurrió dentro de PanelExpendedor
                if (exp.getBounds().contains(x, y)) {
                    exp.handleClick(e);
                }

                // Llama a repaint para actualizar la interfaz gráfica
                repaint();
            }
        });
    }

    @Override
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        com.paintComponent(g);
        exp.paintComponent(g);
    }
}