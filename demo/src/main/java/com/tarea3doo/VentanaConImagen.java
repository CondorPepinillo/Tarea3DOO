package com.tarea3doo;
import com.tarea1doo.*;

import javax.swing.*;
import java.awt.*;

/**
 * Clase VentanaConImagen
 * Esta clase se encarga de crear las ventanas que representan cuando se dispensa un objeto
 */

public class VentanaConImagen extends JFrame {

    /**
     * Constructor de la clase Departamento
     * @param producto Indica el producto que se dispensa de la maquina, este saldra como imagen es su propia ventana.
     * @param i Variable auxiliar para el proceso de asignar numeros de serie.
     */
    public VentanaConImagen(ProductList producto, int i) {
        /**
         * Creacion y configuracion de la ventana
         */
        setTitle("Producto");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        /**
         * Creacion del panel de la ventana, saldra una imagen del @param producto.
         */
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Cargar la imagen
                ImageIcon imagen = null;
                if (producto == ProductList.COCA) {
                    imagen = new ImageIcon("../Tarea3DOO/demo/src/main/resources/cocacolabottle.png");
                    Producto coca = new CocaCola(i);
                    System.out.println("Dispensada Cococola con numero de serie "+ coca.getSerie());
                }
                else if (producto == ProductList.SPRITE) {
                    imagen = new ImageIcon("../Tarea3DOO/demo/src/main/resources/BebidaSprite500mlx (1).png");
                    Producto sprite = new Sprite(i);
                    System.out.println("Dispensada Sprite con numero de serie "+ sprite.getSerie());
                }
                else if (producto == ProductList.FANTA){
                    imagen = new ImageIcon("../Tarea3DOO/demo/src/main/resources/fanta-botella.png");
                    Producto fanta = new Fanta(i);
                    System.out.println("Dispensada Fanta con numero de serie "+ fanta.getSerie());
                }
                else if (producto == ProductList.SNICKERS){
                    imagen = new ImageIcon("../Tarea3DOO/demo/src/main/resources/Chocolate-Peanut-53-g.png");
                    Producto snickers = new Snickers(i);
                    System.out.println("Dispensado Snicker con numero de serie "+ snickers.getSerie());
                }
                else if (producto == ProductList.SUPER8){
                    imagen = new ImageIcon("../Tarea3DOO/demo/src/main/resources/supero829g (1).png");
                    Producto super8 = new Super8(i);
                    System.out.println("Dispensado Super 8 con numero de serie "+ super8.getSerie());
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
