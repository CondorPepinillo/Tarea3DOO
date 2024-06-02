package com.tarea3doo;

import com.tarea1doo.*;
import javax.swing.*;

public class Ventana extends JFrame {
    public Ventana() {
        PanelPrincipal panelPrincipal = new PanelPrincipal();
        this.add(panelPrincipal);
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Ventana();
    }
}
