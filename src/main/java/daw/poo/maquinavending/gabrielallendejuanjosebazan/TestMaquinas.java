package daw.poo.maquinavending.gabrielallendejuanjosebazan;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel & Juan José
 */
public class TestMaquinas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PRUEBAS DE DEVOLUCIÓN DE MONEDAS
        //Instanciación de objetos tipo Productos.
        Productos cocaCola = new Productos("Coca-Cola 500ml", 120);
        Productos kitKat = new Productos("Kit-Kat", 150);
        Productos agua = new Productos("Agua 500ml", 100);
        Productos smint = new Productos("Caramelos Smint", 100);
        Productos fantaNaranja = new Productos("Fanta Naranja 500ml", 120);
        Productos haribbo = new Productos("Caramelos Haribbo", 200);
        Scanner entrada = new Scanner(System.in);
        //AQUI ARRIBA FALTAN INSTANCIAR LAS BANDEJAS, QUE CONTENDRÁN CADA UNA LOS DIFERENTES PRODUCTOS.
        
        //Conversión implícita de String a int, mediante la clase Integer.
        Integer.parseInt(JOptionPane.showInputDialog("Introduzca un código: "));
        int opcionElegida = entrada.nextInt();
        
        //Bucle que controle la cantidad de monedas a devolver en caso de haber cambio.
        int centimos;
        do {
            Integer.parseInt(JOptionPane.showInputDialog("Introduzca el dinero: "));
            centimos = entrada.nextInt();
            if(centimos < cocaCola.getPrecioProducto()){
                Integer.parseInt(JOptionPane.showInputDialog("Cantidad insuficiente."));
            }
        } while (centimos < cocaCola.getPrecioProducto());
         
        if(centimos == cocaCola.getPrecioProducto()){
            Integer.parseInt(JOptionPane.showInputDialog("Ha introducido la cantidad exacta. No tendrá cambio."));
        } else {
            centimos -= cocaCola.getPrecioProducto();
            Integer.parseInt(JOptionPane.showInputDialog("El cambio será de:"));
            if(centimos/200 > 0){
                Integer.parseInt(JOptionPane.showInputDialog("Monedas de 2€: %d" + centimos/200));
                centimos %= 200;
            }
            if(centimos/100>0){
                Integer.parseInt(JOptionPane.showInputDialog("Monedas de 1€: %d" + centimos/100));
                centimos %= 100;
            }
            if(centimos/50>0){
                Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,50€: %d" + centimos/50));
                centimos %= 50;
            }
            if(centimos/20>0){
                Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,20€: %d" + centimos/20));
                centimos %= 20;
            }
            if(centimos/10>0){
                Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,10€: %d" + centimos/10));
                centimos %= 10;
            }
            if(centimos/5>0){
                Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,05€: %d" + centimos/5));
                centimos %= 5;
            }
            if(centimos/2>0){
                Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,02€: %d" + centimos/2));
                centimos %= 2;
            }
            if(centimos>0){
                Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,01€: %d", centimos));
            }
        }
        JOptionPane.showInputDialog("¡Gracias por su compra!");
    }
}
   
