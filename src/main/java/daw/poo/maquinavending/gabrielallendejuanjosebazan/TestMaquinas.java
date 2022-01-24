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
        //Instanciación de objetos.
        Productos cocaCola = new Productos("Coca-Cola 500ml", 120);
        Productos kitKat = new Productos("Kit-Kat", 150);
        Productos agua = new Productos("Agua 500ml", 100);
        Productos smint = new Productos("Caramelos Smint", 100);
        Productos fantaNaranja = new Productos("Fanta Naranja 500ml", 120);
        Productos haribbo = new Productos("Caramelos Haribbo", 200);
        Scanner entrada = new Scanner(System.in);
        //AQUI ARRIBA FALTAN INSTANCIAR LAS BANDEJAS, QUE CONTENDRÁN CADA UNA LOS DIFERENTES PRODUCTOS.

        Integer.parseInt(JOptionPane.showInputDialog("Introduzca un código: "));
        int opcionElegida = entrada.nextInt();
        //Variable boolean auxiliar para salir del bucle.
        boolean aux = true;

        //Variable centimos
        int centimos;
        do {
            switch (opcionElegida) {
                //CAMBIAR LOS CASE POR CÓDIGO DE BANDEJAS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 
                case 1:
                    do {
                        Integer.parseInt(JOptionPane.showInputDialog("Ha seleccionado Coca-Cola 500ml. Introduzca el dinero: "));
                        centimos = entrada.nextInt();
                        if (centimos < cocaCola.getPrecioProducto()) {
                            Integer.parseInt(JOptionPane.showInputDialog("Cantidad insuficiente."));
                        }
                    } while (centimos < cocaCola.getPrecioProducto());

                    if (centimos == cocaCola.getPrecioProducto()) {
                        Integer.parseInt(JOptionPane.showInputDialog("Ha introducido la cantidad exacta. No tendrá cambio."));
                    } else {
                        centimos -= cocaCola.getPrecioProducto();
                        Integer.parseInt(JOptionPane.showInputDialog("El cambio será de:"));
                        if (centimos / 200 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("Monedas de 2€: %d" + centimos / 200));
                            centimos %= 200;
                        }
                        if (centimos / 100 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("Monedas de 1€: %d" + centimos / 100));
                            centimos %= 100;
                        }
                        if (centimos / 50 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,50€: %d" + centimos / 50));
                            centimos %= 50;
                        }
                        if (centimos / 20 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,20€: %d" + centimos / 20));
                            centimos %= 20;
                        }
                        if (centimos / 10 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,10€: %d" + centimos / 10));
                            centimos %= 10;
                        }
                        if (centimos / 5 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,05€: %d" + centimos / 5));
                            centimos %= 5;
                        }
                        if (centimos / 2 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,02€: %d" + centimos / 2));
                            centimos %= 2;
                        }
                        if (centimos > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,01€: %d", centimos));
                        }
                    }
                    JOptionPane.showInputDialog("¡Gracias por su compra!");
                    aux = false;
                    break;
                case 2:
                    do {
                        Integer.parseInt(JOptionPane.showInputDialog("Ha seleccionado Kit-Kat. Introduzca el dinero: "));
                        centimos = entrada.nextInt();
                        if (centimos < kitKat.getPrecioProducto()) {
                            Integer.parseInt(JOptionPane.showInputDialog("Cantidad insuficiente."));
                        }
                    } while (centimos < kitKat.getPrecioProducto());

                    if (centimos == kitKat.getPrecioProducto()) {
                        Integer.parseInt(JOptionPane.showInputDialog("Ha introducido la cantidad exacta. No tendrá cambio."));
                    } else {
                        centimos -= kitKat.getPrecioProducto();
                        Integer.parseInt(JOptionPane.showInputDialog("El cambio será de:"));
                        if (centimos / 200 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("Monedas de 2€: %d" + centimos / 200));
                            centimos %= 200;
                        }
                        if (centimos / 100 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("Monedas de 1€: %d" + centimos / 100));
                            centimos %= 100;
                        }
                        if (centimos / 50 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,50€: %d" + centimos / 50));
                            centimos %= 50;
                        }
                        if (centimos / 20 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,20€: %d" + centimos / 20));
                            centimos %= 20;
                        }
                        if (centimos / 10 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,10€: %d" + centimos / 10));
                            centimos %= 10;
                        }
                        if (centimos / 5 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,05€: %d" + centimos / 5));
                            centimos %= 5;
                        }
                        if (centimos / 2 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,02€: %d" + centimos / 2));
                            centimos %= 2;
                        }
                        if (centimos > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,01€: %d", centimos));
                        }
                    }
                    JOptionPane.showInputDialog("¡Gracias por su compra!");
                    aux = false;
                    break;
                case 3:
                    do {
                        Integer.parseInt(JOptionPane.showInputDialog("Ha seleccionado Agua 500ml. Introduzca el dinero: "));
                        centimos = entrada.nextInt();
                        if (centimos < agua.getPrecioProducto()) {
                            Integer.parseInt(JOptionPane.showInputDialog("Cantidad insuficiente."));
                        }
                    } while (centimos < agua.getPrecioProducto());

                    if (centimos == agua.getPrecioProducto()) {
                        Integer.parseInt(JOptionPane.showInputDialog("Ha introducido la cantidad exacta. No tendrá cambio."));
                    } else {
                        centimos -= agua.getPrecioProducto();
                        Integer.parseInt(JOptionPane.showInputDialog("El cambio será de:"));
                        if (centimos / 200 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("Monedas de 2€: %d" + centimos / 200));
                            centimos %= 200;
                        }
                        if (centimos / 100 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("Monedas de 1€: %d" + centimos / 100));
                            centimos %= 100;
                        }
                        if (centimos / 50 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,50€: %d" + centimos / 50));
                            centimos %= 50;
                        }
                        if (centimos / 20 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,20€: %d" + centimos / 20));
                            centimos %= 20;
                        }
                        if (centimos / 10 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,10€: %d" + centimos / 10));
                            centimos %= 10;
                        }
                        if (centimos / 5 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,05€: %d" + centimos / 5));
                            centimos %= 5;
                        }
                        if (centimos / 2 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,02€: %d" + centimos / 2));
                            centimos %= 2;
                        }
                        if (centimos > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,01€: %d", centimos));
                        }
                    }
                    JOptionPane.showInputDialog("¡Gracias por su compra!");
                    aux = false;
                    break;
                case 4:
                    do {
                        Integer.parseInt(JOptionPane.showInputDialog("Introduzca el dinero: "));
                        centimos = entrada.nextInt();
                        if (centimos < smint.getPrecioProducto()) {
                            Integer.parseInt(JOptionPane.showInputDialog("Cantidad insuficiente."));
                        }
                    } while (centimos < smint.getPrecioProducto());

                    if (centimos == smint.getPrecioProducto()) {
                        Integer.parseInt(JOptionPane.showInputDialog("Ha introducido la cantidad exacta. No tendrá cambio."));
                    } else {
                        centimos -= smint.getPrecioProducto();
                        Integer.parseInt(JOptionPane.showInputDialog("El cambio será de:"));
                        if (centimos / 200 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("Monedas de 2€: %d" + centimos / 200));
                            centimos %= 200;
                        }
                        if (centimos / 100 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("Monedas de 1€: %d" + centimos / 100));
                            centimos %= 100;
                        }
                        if (centimos / 50 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,50€: %d" + centimos / 50));
                            centimos %= 50;
                        }
                        if (centimos / 20 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,20€: %d" + centimos / 20));
                            centimos %= 20;
                        }
                        if (centimos / 10 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,10€: %d" + centimos / 10));
                            centimos %= 10;
                        }
                        if (centimos / 5 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,05€: %d" + centimos / 5));
                            centimos %= 5;
                        }
                        if (centimos / 2 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,02€: %d" + centimos / 2));
                            centimos %= 2;
                        }
                        if (centimos > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,01€: %d", centimos));
                        }
                    }
                    JOptionPane.showInputDialog("¡Gracias por su compra!");
                    aux = false;
                    break;
                case 5:
                    do {
                        Integer.parseInt(JOptionPane.showInputDialog("Ha seleccionado Fanta Naranja 500ml. Introduzca el dinero: "));
                        centimos = entrada.nextInt();
                        if (centimos < fantaNaranja.getPrecioProducto()) {
                            Integer.parseInt(JOptionPane.showInputDialog("Cantidad insuficiente."));
                        }
                    } while (centimos < fantaNaranja.getPrecioProducto());

                    if (centimos == fantaNaranja.getPrecioProducto()) {
                        Integer.parseInt(JOptionPane.showInputDialog("Ha introducido la cantidad exacta. No tendrá cambio."));
                    } else {
                        centimos -= fantaNaranja.getPrecioProducto();
                        Integer.parseInt(JOptionPane.showInputDialog("El cambio será de:"));
                        if (centimos / 200 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("Monedas de 2€: %d" + centimos / 200));
                            centimos %= 200;
                        }
                        if (centimos / 100 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("Monedas de 1€: %d" + centimos / 100));
                            centimos %= 100;
                        }
                        if (centimos / 50 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,50€: %d" + centimos / 50));
                            centimos %= 50;
                        }
                        if (centimos / 20 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,20€: %d" + centimos / 20));
                            centimos %= 20;
                        }
                        if (centimos / 10 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,10€: %d" + centimos / 10));
                            centimos %= 10;
                        }
                        if (centimos / 5 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,05€: %d" + centimos / 5));
                            centimos %= 5;
                        }
                        if (centimos / 2 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,02€: %d" + centimos / 2));
                            centimos %= 2;
                        }
                        if (centimos > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,01€: %d", centimos));
                        }
                    }
                    JOptionPane.showInputDialog("¡Gracias por su compra!");
                    aux = false;
                    break;
                case 6:
                    do {
                        Integer.parseInt(JOptionPane.showInputDialog("Ha seleccionado Caramelos Haribbo. Introduzca el dinero: "));
                        centimos = entrada.nextInt();
                        if (centimos < haribbo.getPrecioProducto()) {
                            Integer.parseInt(JOptionPane.showInputDialog("Cantidad insuficiente."));
                        }
                    } while (centimos < haribbo.getPrecioProducto());

                    if (centimos == haribbo.getPrecioProducto()) {
                        Integer.parseInt(JOptionPane.showInputDialog("Ha introducido la cantidad exacta. No tendrá cambio."));
                    } else {
                        centimos -= haribbo.getPrecioProducto();
                        Integer.parseInt(JOptionPane.showInputDialog("El cambio será de:"));
                        if (centimos / 200 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("Monedas de 2€: %d" + centimos / 200));
                            centimos %= 200;
                        }
                        if (centimos / 100 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("Monedas de 1€: %d" + centimos / 100));
                            centimos %= 100;
                        }
                        if (centimos / 50 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,50€: %d" + centimos / 50));
                            centimos %= 50;
                        }
                        if (centimos / 20 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,20€: %d" + centimos / 20));
                            centimos %= 20;
                        }
                        if (centimos / 10 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,10€: %d" + centimos / 10));
                            centimos %= 10;
                        }
                        if (centimos / 5 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,05€: %d" + centimos / 5));
                            centimos %= 5;
                        }
                        if (centimos / 2 > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,02€: %d" + centimos / 2));
                            centimos %= 2;
                        }
                        if (centimos > 0) {
                            Integer.parseInt(JOptionPane.showInputDialog("%nMonedas de 0,01€: %d", centimos));
                        }
                    }
                    JOptionPane.showInputDialog("¡Gracias por su compra!");
                    aux = false;
                    break;
            }
        } while (!aux);
    }
}
