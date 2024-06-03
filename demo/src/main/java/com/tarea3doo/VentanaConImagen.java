package com.tarea3doo;
import javax.swing.*;
import java.awt.*;

public class VentanaConImagen extends JFrame {

    public VentanaConImagen(ProductList producto) {
        // Configurar la ventana
        setTitle("Ventana con Imagen");
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
                }
                else if (producto == ProductList.SPRITE) {
                    imagen = new ImageIcon("../Tarea3DOO/demo/src/main/resources/BebidaSprite500mlx.png");
                }
                else if (producto == ProductList.FANTA){
                    imagen = new ImageIcon("../Tarea3DOO/demo/src/main/resources/fanta-botella.png");
                }
                else if (producto == ProductList.SNICKERS){
                    imagen = new ImageIcon("../Tarea3DOO/demo/src/main/resources/Chocolate-Peanut-53-g.png");
                }
                else if (producto == ProductList.SUPER8){
                    imagen = new ImageIcon("../Tarea3DOO/demo/src/main/resources/supero829g (1).png");
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
