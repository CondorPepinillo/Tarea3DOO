package com.tarea3doo;

import com.tarea1doo.*;
import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
    private PanelComprador com;
    private PanelExpendedor exp;

    public PanelPrincipal() {
        exp = new PanelExpendedor(new Expendedor());
        com = new PanelComprador(new Comprador());
        this.setBackground(Color.white);
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        exp.paintComponent(g);
        com.paintComponent(g);
    }
}