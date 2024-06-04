package com.tarea3doo;
import com.tarea1doo.*;
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
    private JButton rellenarMaquina;

    private int cocaColaPrice = 300;
    private int spritePrice = 300;
    private int fantaPrice = 300;
    private int snickersPrice = 500;
    private int super8Price = 500;

    private int cantidadDefault = 5;

    private int cantidadCoca = cantidadDefault;
    private int cantidadSprite = cantidadDefault;
    private int cantidadFanta = cantidadDefault;
    private int cantidadSnickers = cantidadDefault;
    private int cantidadSuper8 = cantidadDefault;

    private int dineroUsuario = 0;

    DepositoMonedas depositoMonedas = new DepositoMonedas();

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
                Moneda moneda = new Moneda(100);
                depositoMonedas.agregarMoneda(moneda);
                dineroIngresado.setText("Dinero ingresado: " + dineroUsuario);
            }
        });
        Moneda500.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dineroUsuario += 500;
                Moneda moneda = new Moneda(500);
                depositoMonedas.agregarMoneda(moneda);
                dineroIngresado.setText("Dinero ingresado: " + dineroUsuario);
            }
        });
        Moneda1000.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dineroUsuario += 1000;
                Moneda moneda = new Moneda(1000);
                depositoMonedas.agregarMoneda(moneda);
                dineroIngresado.setText("Dinero ingresado: " + dineroUsuario);
            }
        });
        Moneda1500.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dineroUsuario += 1500;
                Moneda moneda = new Moneda(1500);
                depositoMonedas.agregarMoneda(moneda);
                dineroIngresado.setText("Dinero ingresado: " + dineroUsuario);
            }
        });
        CocaCola.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(dineroUsuario >= cocaColaPrice && cantidadCoca > 0){
                    new VentanaConImagen(ProductList.COCA);
                    dineroUsuario = dineroUsuario - cocaColaPrice;
                    cantidadCoca--;
                    System.out.println("Quedan " + cantidadCoca + " CocaCola en deposito");
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
                    new VentanaConImagen(ProductList.SPRITE);
                    dineroUsuario = dineroUsuario - spritePrice;
                    cantidadSprite--;
                    System.out.println("Quedan " + cantidadSprite + " Sprite en deposito");
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
                    new VentanaConImagen(ProductList.FANTA);
                    dineroUsuario = dineroUsuario - fantaPrice;
                    cantidadFanta--;
                    System.out.println("Quedan " + cantidadFanta + " Fanta en deposito");
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
                    new VentanaConImagen(ProductList.SNICKERS);
                    dineroUsuario = dineroUsuario - snickersPrice;
                    cantidadSnickers--;
                    System.out.println("Quedan " + cantidadSnickers + " Snickers en deposito");
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
                    new VentanaConImagen(ProductList.SUPER8);
                    dineroUsuario = dineroUsuario - super8Price;
                    cantidadSuper8--;
                    System.out.println("Quedan " + cantidadSuper8 + " Super8 en deposito");
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
                int[] valoresMoneda = {1500, 1000, 500, 100};
                for (int valorMoneda : valoresMoneda) {
                    while (dineroUsuario >= valorMoneda) {
                        dineroUsuario -= valorMoneda;
                        Moneda moneda = new Moneda(valorMoneda);
                        System.out.println("Devuelta moneda con valor " + valorMoneda + " y numero de serie " + moneda.getSerie());
                        new VentanaConMoneda(valorMoneda);
                    }
                }
                dineroIngresado.setText("Dinero ingresado: " + dineroUsuario);
            }
        });
        rellenarMaquina.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                cantidadCoca = cantidadDefault;
                cantidadSprite = cantidadDefault;
                cantidadFanta = cantidadDefault;
                cantidadSnickers = cantidadDefault;
                cantidadSuper8 = cantidadDefault;
                precioCoca.setVisible(true);
                precioSprite.setVisible(true);
                precioFanta.setVisible(true);
                precioSnickers.setVisible(true);
                precioSuper8.setVisible(true);
            }
        });
    };

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
