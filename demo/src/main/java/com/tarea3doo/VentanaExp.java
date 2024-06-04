package com.tarea3doo;
import com.tarea1doo.ProductList;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaExp extends JFrame{
    private JPanel panel1;
    private JButton Snickers;
    private JButton Fanta;
    private JButton Sprite;
    private JButton CocaCola;
    private JButton Moneda1000;
    private JButton Moneda500;
    private JButton Moneda100;
    private JButton Moneda1500;
    private JButton Super8;
    private JPanel MonedasPanel;
    private JPanel PreciosPanel;
    private JLabel dineroIngresado;
    private JLabel precioCoca;
    private JLabel precioSprite;
    private JLabel precioFanta;
    private JLabel precioSnickers;
    private JLabel precioSuper8;
    private JButton devolverVuelto;

    private int cocaColaPrice = 300;
    private int spritePrice = 300;
    private int fantaPrice = 300;
    private int snickersPrice = 500;
    private int super8Price = 500;

    private int cantidadCoca = 5;
    private int cantidadSprite = 5;
    private int cantidadFanta = 5;
    private int cantidadSnickers = 5;
    private int cantidadSuper8 = 5;

    private  int i1 = 0;
    private int i2 = 0;
    private int i3 = 0;
    private int i4 = 0;
    private int i5 = 0;

    private int dineroUsuario = 0;


    public VentanaExp(){
        JFrame frame = new JFrame("Ventana Exp");
        frame.getContentPane().add(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dineroIngresado.setText("Dinero ingresado: " + dineroUsuario);
        precioCoca.setText("$"+cocaColaPrice);
        precioSprite.setText("$"+spritePrice);
        precioFanta.setText("$"+fantaPrice);
        precioSnickers.setText("$"+snickersPrice);
        precioSnickers.setText("$"+super8Price);

        frame.pack();
        frame.setVisible(true);
        Moneda100.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dineroUsuario += 100;
                dineroIngresado.setText("Dinero ingresado: " + dineroUsuario);
            }
        });
        Moneda500.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dineroUsuario += 500;
                dineroIngresado.setText("Dinero ingresado: " + dineroUsuario);
            }
        });
        Moneda1000.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dineroUsuario += 1000;
                dineroIngresado.setText("Dinero ingresado: " + dineroUsuario);
            }
        });
        Moneda1500.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dineroUsuario += 1500;
                dineroIngresado.setText("Dinero ingresado: " + dineroUsuario);
            }
        });
        CocaCola.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(dineroUsuario >= cocaColaPrice && cantidadCoca > 0){
                    new VentanaConImagen(ProductList.COCA, i1);
                    dineroUsuario = dineroUsuario - cocaColaPrice;
                    cantidadCoca--;
                    System.out.println("Quedan " + cantidadCoca + " CocaCola en deposito");
                    i1++;
                    dineroIngresado.setText("Dinero ingresado: " + dineroUsuario);
                    if(cantidadCoca == 0){
                        precioCoca.setVisible(false);
                    }
                }
            }
        });
        Sprite.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(dineroUsuario >= spritePrice && cantidadSprite > 0){
                    new VentanaConImagen(ProductList.SPRITE,i2);
                    dineroUsuario = dineroUsuario - spritePrice;
                    cantidadSprite--;
                    System.out.println("Quedan " + cantidadSprite + " Sprite en deposito");
                    i2++;
                    dineroIngresado.setText("Dinero ingresado: " + dineroUsuario);
                    if(cantidadSprite == 0){
                        precioSprite.setVisible(false);
                    }
                }
            }
        });
        Fanta.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(dineroUsuario >= fantaPrice && cantidadFanta > 0){
                    new VentanaConImagen(ProductList.FANTA, i3);
                    dineroUsuario = dineroUsuario - fantaPrice;
                    cantidadFanta--;
                    System.out.println("Quedan " + cantidadFanta + " Fanta en deposito");
                    i3++;
                    dineroIngresado.setText("Dinero ingresado: " + dineroUsuario);
                    if(cantidadFanta == 0){
                        precioFanta.setVisible(false);
                    }
                }
            }
        });
        Snickers.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(dineroUsuario >= snickersPrice && cantidadSnickers > 0){
                    new VentanaConImagen(ProductList.SNICKERS, i4);
                    dineroUsuario = dineroUsuario - snickersPrice;
                    cantidadSnickers--;
                    System.out.println("Quedan " + cantidadSnickers + " Snickers en deposito");
                    i4++;
                    dineroIngresado.setText("Dinero ingresado: " + dineroUsuario);
                    if(cantidadSnickers == 0){
                        precioSnickers.setVisible(false);
                    }
                }
            }
        });
        Super8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(dineroUsuario >= super8Price && cantidadSuper8 > 0){
                    new VentanaConImagen(ProductList.SUPER8, i5);
                    dineroUsuario = dineroUsuario - super8Price;
                    cantidadSuper8--;
                    System.out.println("Quedan " + cantidadSuper8 + " Super8 en deposito");
                    i5++;
                    dineroIngresado.setText("Dinero ingresado: " + dineroUsuario);
                    if(cantidadSuper8 == 0){
                        precioSuper8.setVisible(false);
                    }
                }
            }
        });
        devolverVuelto.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dineroUsuario = 0;
                dineroIngresado.setText("Dinero ingresado: " + dineroUsuario);
            }
        });
    };

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}