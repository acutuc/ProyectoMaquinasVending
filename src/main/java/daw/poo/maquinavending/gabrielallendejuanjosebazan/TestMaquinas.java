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
        // crear bandejas
        Bandejas bandeja1 = new Bandejas(cocaCola, 1);
        Bandejas bandeja2 = new Bandejas(kitKat, 2);
        Bandejas bandeja3 = new Bandejas(agua, 3);
        Bandejas bandeja4 = new Bandejas(smint, 4);
        Bandejas bandeja5 = new Bandejas(fantaNaranja, 5);
        Bandejas bandeja6 = new Bandejas(haribbo, 6);
        

        String opcionString = (JOptionPane.showInputDialog("Introduzca un código: "));
        int opcionInt = Integer.parseInt(opcionString);
        //Variable boolean auxiliar para salir del bucle.
        boolean aux = true;

        //Variable centimos
        int centimos;
        do {
            switch (opcionInt) {
                //CAMBIAR LOS CASE POR CÓDIGO DE BANDEJAS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 
                case "bandeja1":
                    do {
                        String centimosString = (JOptionPane.showInputDialog("Ha seleccionado Coca-Cola 500ml. Introduzca el dinero: "));
                        centimos = Integer.parseInt(centimosString);
                        if (centimos < cocaCola.getPrecioProducto()) {
                            JOptionPane.showMessageDialog(null, "Cantidad insuficiente.");
                        }
                    } while (centimos < cocaCola.getPrecioProducto());

                    if (centimos == cocaCola.getPrecioProducto()) {
                        JOptionPane.showMessageDialog(null, "Ha introducido la cantidad exacta. No tendrá cambio.");
                    } else {
                        centimos -= cocaCola.getPrecioProducto();
                        JOptionPane.showMessageDialog(null, "El cambio será de:");
                        if (centimos / 200 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 2€: " + centimos / 200);
                            centimos %= 200;
                        }
                        if (centimos / 100 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 1€: " + centimos / 100);
                            centimos %= 100;
                        }
                        if (centimos / 50 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 0,50€: " + centimos / 50);
                            centimos %= 50;
                        }
                        if (centimos / 20 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 0,20€: " + centimos / 20);
                            centimos %= 20;
                        }
                        if (centimos / 10 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 0,10€: " + centimos / 10);
                            centimos %= 10;
                        }
                        if (centimos / 5 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 0,05€: " + centimos / 5);
                            centimos %= 5;
                        }
                        if (centimos / 2 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 0,02€: " + centimos / 2);
                            centimos %= 2;
                        }
                        if (centimos > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 0,01€: " + centimos);
                        }
                    }
                    JOptionPane.showMessageDialog(null, "¡Gracias por su compra!");
                    aux = true;
                    break;
                case bandeja2:
                    do {
                        String centimosString = (JOptionPane.showInputDialog("Ha seleccionado Coca-Cola 500ml. Introduzca el dinero: "));
                        centimos = Integer.parseInt(centimosString);
                        if (centimos < kitKat.getPrecioProducto()) {
                            JOptionPane.showMessageDialog(null, "Cantidad insuficiente.");
                        }
                    } while (centimos < kitKat.getPrecioProducto());

                    if (centimos == kitKat.getPrecioProducto()) {
                        JOptionPane.showMessageDialog(null, "Ha introducido la cantidad exacta. No tendrá cambio.");
                    } else {
                        centimos -= kitKat.getPrecioProducto();
                        JOptionPane.showMessageDialog(null, "El cambio será de:");
                        if (centimos / 200 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 2€: " + centimos / 200);
                            centimos %= 200;
                        }
                        if (centimos / 100 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 1€: " + centimos / 100);
                            centimos %= 100;
                        }
                        if (centimos / 50 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 0,50€: " + centimos / 50);
                            centimos %= 50;
                        }
                        if (centimos / 20 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 0,20€: " + centimos / 20);
                            centimos %= 20;
                        }
                        if (centimos / 10 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 0,10€: " + centimos / 10);
                            centimos %= 10;
                        }
                        if (centimos / 5 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 0,05€: " + centimos / 5);
                            centimos %= 5;
                        }
                        if (centimos / 2 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 0,02€: " + centimos / 2);
                            centimos %= 2;
                        }
                        if (centimos > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 0,01€: " + centimos);
                        }
                    }
                    JOptionPane.showMessageDialog(null, "¡Gracias por su compra!");
                    aux = true;
                    break;
                case bandeja3:
                    do {
                        String centimosString = (JOptionPane.showInputDialog("Ha seleccionado Coca-Cola 500ml. Introduzca el dinero: "));
                        centimos = Integer.parseInt(centimosString);
                        if (centimos < agua.getPrecioProducto()) {
                            JOptionPane.showMessageDialog(null, "Cantidad insuficiente.");
                        }
                    } while (centimos < agua.getPrecioProducto());

                    if (centimos == agua.getPrecioProducto()) {
                        JOptionPane.showMessageDialog(null, "Ha introducido la cantidad exacta. No tendrá cambio.");
                    } else {
                        centimos -= agua.getPrecioProducto();
                        JOptionPane.showMessageDialog(null, "El cambio será de:");
                        if (centimos / 200 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 2€: " + centimos / 200);
                            centimos %= 200;
                        }
                        if (centimos / 100 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 1€: " + centimos / 100);
                            centimos %= 100;
                        }
                        if (centimos / 50 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 0,50€: " + centimos / 50);
                            centimos %= 50;
                        }
                        if (centimos / 20 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 0,20€: " + centimos / 20);
                            centimos %= 20;
                        }
                        if (centimos / 10 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 0,10€: " + centimos / 10);
                            centimos %= 10;
                        }
                        if (centimos / 5 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 0,05€: " + centimos / 5);
                            centimos %= 5;
                        }
                        if (centimos / 2 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 0,02€: " + centimos / 2);
                            centimos %= 2;
                        }
                        if (centimos > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 0,01€: " + centimos);
                        }
                    }
                    JOptionPane.showMessageDialog(null, "¡Gracias por su compra!");
                    aux = true;
                    break;
                case bandeja4:
                    do {
                        String centimosString = (JOptionPane.showInputDialog("Ha seleccionado Coca-Cola 500ml. Introduzca el dinero: "));
                        centimos = Integer.parseInt(centimosString);
                        if (centimos < smint.getPrecioProducto()) {
                            JOptionPane.showMessageDialog(null, "Cantidad insuficiente.");
                        }
                    } while (centimos < smint.getPrecioProducto());

                    if (centimos == smint.getPrecioProducto()) {
                        JOptionPane.showMessageDialog(null, "Ha introducido la cantidad exacta. No tendrá cambio.");
                    } else {
                        centimos -= smint.getPrecioProducto();
                        JOptionPane.showMessageDialog(null, "El cambio será de:");
                        if (centimos / 200 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 2€: " + centimos / 200);
                            centimos %= 200;
                        }
                        if (centimos / 100 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 1€: " + centimos / 100);
                            centimos %= 100;
                        }
                        if (centimos / 50 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 0,50€: " + centimos / 50);
                            centimos %= 50;
                        }
                        if (centimos / 20 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 0,20€: " + centimos / 20);
                            centimos %= 20;
                        }
                        if (centimos / 10 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 0,10€: " + centimos / 10);
                            centimos %= 10;
                        }
                        if (centimos / 5 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 0,05€: " + centimos / 5);
                            centimos %= 5;
                        }
                        if (centimos / 2 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 0,02€: " + centimos / 2);
                            centimos %= 2;
                        }
                        if (centimos > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 0,01€: " + centimos);
                        }
                    }
                    JOptionPane.showMessageDialog(null, "¡Gracias por su compra!");
                    aux = true;
                    break;
                case bandeja5:
                    do {
                        String centimosString = (JOptionPane.showInputDialog("Ha seleccionado Coca-Cola 500ml. Introduzca el dinero: "));
                        centimos = Integer.parseInt(centimosString);
                        if (centimos < fantaNaranja.getPrecioProducto()) {
                            JOptionPane.showMessageDialog(null, "Cantidad insuficiente.");
                        }
                    } while (centimos < fantaNaranja.getPrecioProducto());

                    if (centimos == fantaNaranja.getPrecioProducto()) {
                        JOptionPane.showMessageDialog(null, "Ha introducido la cantidad exacta. No tendrá cambio.");
                    } else {
                        centimos -= fantaNaranja.getPrecioProducto();
                        JOptionPane.showMessageDialog(null, "El cambio será de:");
                        if (centimos / 200 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 2€: " + centimos / 200);
                            centimos %= 200;
                        }
                        if (centimos / 100 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 1€: " + centimos / 100);
                            centimos %= 100;
                        }
                        if (centimos / 50 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 0,50€: " + centimos / 50);
                            centimos %= 50;
                        }
                        if (centimos / 20 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 0,20€: " + centimos / 20);
                            centimos %= 20;
                        }
                        if (centimos / 10 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 0,10€: " + centimos / 10);
                            centimos %= 10;
                        }
                        if (centimos / 5 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 0,05€: " + centimos / 5);
                            centimos %= 5;
                        }
                        if (centimos / 2 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 0,02€: " + centimos / 2);
                            centimos %= 2;
                        }
                        if (centimos > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 0,01€: " + centimos);
                        }
                    }
                    JOptionPane.showMessageDialog(null, "¡Gracias por su compra!");
                    aux = true;
                    break;
                case bandeja6:
                    do {
                        String centimosString = (JOptionPane.showInputDialog("Ha seleccionado Coca-Cola 500ml. Introduzca el dinero: "));
                        centimos = Integer.parseInt(centimosString);
                        if (centimos < haribbo.getPrecioProducto()) {
                            JOptionPane.showMessageDialog(null, "Cantidad insuficiente.");
                        }
                    } while (centimos < haribbo.getPrecioProducto());

                    if (centimos == haribbo.getPrecioProducto()) {
                        JOptionPane.showMessageDialog(null, "Ha introducido la cantidad exacta. No tendrá cambio.");
                    } else {
                        centimos -= haribbo.getPrecioProducto();
                        JOptionPane.showMessageDialog(null, "El cambio será de:");
                        if (centimos / 200 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 2€: " + centimos / 200);
                            centimos %= 200;
                        }
                        if (centimos / 100 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 1€: " + centimos / 100);
                            centimos %= 100;
                        }
                        if (centimos / 50 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 0,50€: " + centimos / 50);
                            centimos %= 50;
                        }
                        if (centimos / 20 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 0,20€: " + centimos / 20);
                            centimos %= 20;
                        }
                        if (centimos / 10 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 0,10€: " + centimos / 10);
                            centimos %= 10;
                        }
                        if (centimos / 5 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 0,05€: " + centimos / 5);
                            centimos %= 5;
                        }
                        if (centimos / 2 > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 0,02€: " + centimos / 2);
                            centimos %= 2;
                        }
                        if (centimos > 0) {
                            JOptionPane.showMessageDialog(null, "Monedas de 0,01€: " + centimos);
                        }
                    }
                    JOptionPane.showMessageDialog(null, "¡Gracias por su compra!");
                    aux = true;
                    break;
            }
        } while (!aux);
    }
}
