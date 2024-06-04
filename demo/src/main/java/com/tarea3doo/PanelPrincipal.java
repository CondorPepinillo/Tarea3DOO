package com.tarea3doo;

import com.tarea1doo.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelPrincipal extends JPanel {
    private PanelComprador com;
    private PanelExpendedor exp;

    public PanelPrincipal () {
        exp = new PanelExpendedor();
        com = new PanelComprador();
        this.setBackground(Color.WHITE);
        this.setLayout(new GridLayout());
        this.add(exp, BorderLayout.NORTH);
        this.add(com, BorderLayout.SOUTH);
    }
}