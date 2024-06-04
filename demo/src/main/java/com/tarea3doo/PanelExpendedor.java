package com.tarea3doo;

import com.tarea1doo.*;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PanelExpendedor extends JPanel {
    private ArrayList<Expendedor> expendedores;
    private Map<ProductList, ImageIcon> productImages;

    public PanelExpendedor() {
        expendedores = new ArrayList<>();
        expendedores.add(new Expendedor(5, ProductList.COCA));
        expendedores.add(new Expendedor(5, ProductList.SPRITE));
        expendedores.add(new Expendedor(5, ProductList.FANTA));
        expendedores.add(new Expendedor(5, ProductList.SNICKERS));
        expendedores.add(new Expendedor(5, ProductList.SUPER8));

        // Carga las imágenes de los productos
        productImages = new HashMap<>();
        for (ProductList product : ProductList.values()) {
            ImageIcon icon = new ImageIcon("src/main/resources/images/" + product.name().toLowerCase() + ".png");
            productImages.put(product, icon);
        }

        this.setLayout(new GridLayout(1, 5)); // Ajusta esto según tus necesidades

        // Agrega los productos y sus precios
        for (Expendedor expendedor : expendedores) {
            for (Producto producto : expendedor.getProductos()) {
                // Carga la imagen del producto y la agrega al JLabel
                ImageIcon icon = productImages.get(producto.getTipo());
                JLabel label = new JLabel(producto.getNombre() + " - " + producto.getPrecio(), icon, JLabel.CENTER);
                label.setVerticalTextPosition(JLabel.BOTTOM);
                label.setHorizontalTextPosition(JLabel.CENTER);
                this.add(label);
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibuja los depósitos y los productos
        // ... código para dibujar los depósitos y los productos ...
    }
}