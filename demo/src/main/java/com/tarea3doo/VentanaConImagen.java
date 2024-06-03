package com.tarea3doo;
import com.tarea1doo.*;

import javax.swing.*;
import java.awt.*;

public class VentanaConImagen extends JFrame {

    public VentanaConImagen(ProductList producto, int i) {
        // Configurar la ventana
        setTitle("Producto");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        // Crear un panel para colocar la imagen
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Cargar la imagen
                ImageIcon imagen = null;
                if (producto == ProductList.COCA) {
                    imagen = new ImageIcon("../Tarea3DOO/demo/src/main/resources/cocacolabottle.png");
                    Producto coca = new CocaCola(100 + i);
                    System.out.println("Dispensada Cococola con numero de serie "+ coca.getSerie());
                }
                else if (producto == ProductList.SPRITE) {
                    imagen = new ImageIcon("../Tarea3DOO/demo/src/main/resources/BebidaSprite500mlx.png");
                    Producto sprite = new Sprite(200 + i);
                    System.out.println("Dispensada Sprite con numero de serie "+ sprite.getSerie());
                }
                else if (producto == ProductList.FANTA){
                    imagen = new ImageIcon("../Tarea3DOO/demo/src/main/resources/fanta-botella.png");
                    Producto fanta = new Fanta(300 + i);
                    System.out.println("Dispensada Fanta con numero de serie "+ fanta.getSerie());
                }
                else if (producto == ProductList.SNICKERS){
                    imagen = new ImageIcon("../Tarea3DOO/demo/src/main/resources/Chocolate-Peanut-53-g.png");
                    Producto snickers = new CocaCola(400 + i);
                    System.out.println("Dispensada Cococola con numero de serie "+ snickers.getSerie());
                }
                else if (producto == ProductList.SUPER8){
                    imagen = new ImageIcon("../Tarea3DOO/demo/src/main/resources/supero829g (1).png");
                    Producto super8 = new CocaCola(500 + i);
                    System.out.println("Dispensada Cococola con numero de serie "+ super8.getSerie());
                }
                // Dibujar la imagen en el panel
                g.drawImage(imagen.getImage(), 0, 0, getWidth(), getHeight(), null);
            }
        };

        // Añadir el panel a la ventana
        add(panel);

        // Hacer visible la ventana
        setVisible(true);
    }
}
