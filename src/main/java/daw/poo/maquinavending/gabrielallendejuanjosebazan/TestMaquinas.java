package daw.poo.maquinavending.gabrielallendejuanjosebazan;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel & Juan José
 */
public class TestMaquinas {

    public static void main(String[] args) {
        //Instanciación de objetos.

        //Productos creados
        Productos cocaCola = new Productos("Coca-Cola 500ml", 120);
        Productos kitKat = new Productos("Kit-Kat", 150);
        Productos agua = new Productos("Agua 500ml", 100);
        Productos smint = new Productos("Caramelos Smint", 100);
        Productos fantaNaranja = new Productos("Fanta Naranja 500ml", 120);
        Productos haribbo = new Productos("Caramelos Haribbo", 200);
        Bandejas bandeja1 = new Bandejas(cocaCola, 10, 1);
        Bandejas bandeja2 = new Bandejas(kitKat, 10, 2);
        Bandejas bandeja3 = new Bandejas(agua, 10, 3);
        Bandejas bandeja4 = new Bandejas(smint, 10, 4);
        Bandejas bandeja5 = new Bandejas(fantaNaranja, 10, 5);
        Bandejas bandeja6 = new Bandejas(haribbo, 10, 6);
        Tarjetas tarjeta1 = new Tarjetas();
        Tarjetas tarjeta2 = new Tarjetas();
        Tarjetas tarjeta3 = new Tarjetas();
        Contenedor contenedor = new Contenedor();
        Efectivo efectivo = new Efectivo();
        Maquinas maquina1 = new Maquinas(bandeja1, bandeja2, bandeja3, bandeja4, bandeja5, bandeja6, tarjeta1, tarjeta2, tarjeta3, false, false, contenedor, efectivo);
        Productos productoElegido;

        
        JOptionPane.showMessageDialog(null, "Bienvenido a la Máquina Vending 3000", "¡Hola usuario!", 1);
        //Array para implementar en el JOptionPane de métodos de pago.
        String[] arrayOpciones = {"Efectivo", "Tarjeta", "Cancelar"};
        //JOptionPane para elegir entre Efectivo, Tarjeta o Cancelar la compra.
        int opcionesInt = JOptionPane.showOptionDialog(null, "Seleccione un método de pago: ", null, 0, 1, null, arrayOpciones, null);
        //If's para intercambiar entre las opciones elegidas, pudiendo ser: Efectivo, Tarjeta o Cancelar.
        //If que entra en las interacciones de Efectivo.
        if(opcionesInt == 0){
        String opcionString = (JOptionPane.showInputDialog("Introduzca un código: " + "\n" + bandeja1.getCodBandeja() + "    " + cocaCola.getNombreProducto() + " --> 1,20€"
                + "\n" + bandeja2.getCodBandeja() + "    " + kitKat.getNombreProducto() + " --> 1,50€"
                + "\n" + bandeja3.getCodBandeja() + "    " + agua.getNombreProducto() + " --> 1€"
                + "\n" + bandeja4.getCodBandeja() + "    " + smint.getNombreProducto() + " --> 1€"
                + "\n" + bandeja5.getCodBandeja() + "    " + fantaNaranja.getNombreProducto() + " --> 1,20€"
                + "\n" + bandeja6.getCodBandeja() + "    " + haribbo.getNombreProducto() + " --> 2€"));
        int opcionInt = Integer.parseInt(opcionString);

        //Variable boolean auxiliar para salir del bucle.
        boolean aux = true;

        
        int cantidad = 0;
        //Int que nos devuelve el JOptionPane.showOptionDialog.
        int pago;
        String[] valorMonedas = {"0,10€", "0,20€", "0,50€", "1€", "2€", "5€", "10€", "20€", "Pagar."};
        double cantidadDouble = 0;
        
        do {
            switch (opcionInt) {
                case 1:
                    do {
                        do {
            pago = JOptionPane.showOptionDialog(null, "Ha seleccionado " + cocaCola.getNombreProducto() + ". Introduzca el dinero: \nDinero actual: " + (cantidadDouble / 100) + "€", null, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, valorMonedas, null);
            switch (pago) {
                case 0:
                    cantidad += 10;
                    cantidadDouble += 10;
                    efectivo.agregarMoneda(0, cantidad/10);
                    break;
                case 1:
                    cantidad += 20;
                    cantidadDouble += 20;
                    efectivo.agregarMoneda(1, cantidad/20);
                    break;
                case 2:
                    cantidad += 50;                    
                    cantidadDouble += 50;
                    efectivo.agregarMoneda(2, cantidad/50);
                    break;
                case 3:
                    cantidad += 100;
                    cantidadDouble += 100;
                    efectivo.agregarMoneda(3, cantidad/100);
                    break;
                case 4:
                    cantidad += 200;
                    cantidadDouble += 200;
                    efectivo.agregarMoneda(4, cantidad/200);
                    break;
                case 5:
                    cantidad += 500;
                    cantidadDouble += 500;
                    efectivo.agregarMoneda(5, cantidad/500);
                    break;
                case 6:
                    cantidad += 1000;
                    cantidadDouble += 1000;
                    efectivo.agregarMoneda(6, cantidad/1000);
                    break;
                case 7:
                    cantidad += 2000;
                    cantidadDouble += 2000;
                    efectivo.agregarMoneda(7, cantidad/2000);
                    break;
                case 8:
                    continue;
                default:
                    
                    break;
            }
        } while (pago != 8 && cantidad <= cocaCola.getPrecioProducto());
                        if (cantidad < cocaCola.getPrecioProducto()) {
                            JOptionPane.showMessageDialog(null, "Cantidad insuficiente.");
                        }
                    } while (cantidad < cocaCola.getPrecioProducto());

                    if (cantidad == cocaCola.getPrecioProducto()) {
                        JOptionPane.showMessageDialog(null, "Ha introducido la cantidad exacta. No tendrá cambio.");
                    } else {
                        cantidad -= cocaCola.getPrecioProducto();
                        JOptionPane.showMessageDialog(null, "El cambio será de:");
                        if (cantidad / 1000 > 0) {
                            efectivo.retirarMoneda(6, cantidad/1000);
                            JOptionPane.showMessageDialog(null, "Billetes de 10€: " + cantidad / 1000);
                            cantidad %= 1000;
                        }
                        if (cantidad / 500 > 0) {
                            efectivo.retirarMoneda(5, cantidad/500);
                            JOptionPane.showMessageDialog(null, "Billetes de 5€: " + cantidad / 500);
                            cantidad %= 500;
                        }
                        if (cantidad / 200 > 0) {
                            efectivo.retirarMoneda(4, cantidad/200);
                            JOptionPane.showMessageDialog(null, "Monedas de 2€: " + cantidad / 200);
                            cantidad %= 200;
                        }
                        if (cantidad / 100 > 0) {
                            efectivo.retirarMoneda(3, cantidad/100);
                            JOptionPane.showMessageDialog(null, "Monedas de 1€: " + cantidad / 100);
                            cantidad %= 100;
                        }
                        if (cantidad / 50 > 0) {
                            efectivo.retirarMoneda(2, cantidad/50);
                            JOptionPane.showMessageDialog(null, "Monedas de 0,50€: " + cantidad / 50);
                            cantidad %= 50;
                        }
                        if (cantidad / 20 > 0) {
                            efectivo.retirarMoneda(1, cantidad/20);
                            JOptionPane.showMessageDialog(null, "Monedas de 0,20€: " + cantidad / 20);
                            cantidad %= 20;
                        }
                        if (cantidad / 10 > 0) {
                            efectivo.retirarMoneda(0, cantidad/10);
                            JOptionPane.showMessageDialog(null, "Monedas de 0,10€: " + cantidad / 10);
                            cantidad %= 10;
                        }
                    }
                    JOptionPane.showMessageDialog(null, "¡Gracias por su compra!");
                    // Incio de proceso de entrega de producto y modificación del stack
                    bandeja1.productoVendido();
                    productoElegido = cocaCola;
                    // fin de este proceso
                    aux = true;
                    break;
                case 2:
                    do {
                        do {
            pago = JOptionPane.showOptionDialog(null, "Ha seleccionado " + kitKat.getNombreProducto() + ". Introduzca el dinero: \nDinero actual: " + (cantidadDouble / 100) + "€", null, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, valorMonedas, null);
            switch (pago) {
                case 0:
                    cantidad += 10;
                    cantidadDouble += 10;
                    efectivo.agregarMoneda(0, cantidad/10);
                    break;
                case 1:
                    cantidad += 20;
                    cantidadDouble += 20;
                    efectivo.agregarMoneda(1, cantidad/20);
                    break;
                case 2:
                    cantidad += 50;                    
                    cantidadDouble += 50;
                    efectivo.agregarMoneda(2, cantidad/50);
                    break;
                case 3:
                    cantidad += 100;
                    cantidadDouble += 100;
                    efectivo.agregarMoneda(3, cantidad/100);
                    break;
                case 4:
                    cantidad += 200;
                    cantidadDouble += 200;
                    efectivo.agregarMoneda(4, cantidad/200);
                    break;
                case 5:
                    cantidad += 500;
                    cantidadDouble += 500;
                    efectivo.agregarMoneda(5, cantidad/500);
                    break;
                case 6:
                    cantidad += 1000;
                    cantidadDouble += 1000;
                    efectivo.agregarMoneda(6, cantidad/1000);
                    break;
                case 7:
                    cantidad += 2000;
                    cantidadDouble += 2000;
                    efectivo.agregarMoneda(7, cantidad/2000);
                    break;
                case 8:
                    continue;
                default:
                    
                    break;
            }
        } while (pago != 8 && cantidad <= kitKat.getPrecioProducto());
                        if (cantidad < kitKat.getPrecioProducto()) {
                            JOptionPane.showMessageDialog(null, "Cantidad insuficiente.");
                        }
                    } while (cantidad < kitKat.getPrecioProducto());

                    if (cantidad == kitKat.getPrecioProducto()) {
                        JOptionPane.showMessageDialog(null, "Ha introducido la cantidad exacta. No tendrá cambio.");
                    } else {
                        cantidad -= kitKat.getPrecioProducto();
                        JOptionPane.showMessageDialog(null, "El cambio será de:");
                        if (cantidad / 1000 > 0) {
                            efectivo.retirarMoneda(6, cantidad/1000);
                            JOptionPane.showMessageDialog(null, "Billetes de 10€: " + cantidad / 1000);
                            cantidad %= 1000;
                        }
                        if (cantidad / 500 > 0) {
                            efectivo.retirarMoneda(5, cantidad/500);
                            JOptionPane.showMessageDialog(null, "Billetes de 5€: " + cantidad / 500);
                            cantidad %= 500;
                        }
                        if (cantidad / 200 > 0) {
                            efectivo.retirarMoneda(4, cantidad/200);
                            JOptionPane.showMessageDialog(null, "Monedas de 2€: " + cantidad / 200);
                            cantidad %= 200;
                        }
                        if (cantidad / 100 > 0) {
                            efectivo.retirarMoneda(3, cantidad/100);
                            JOptionPane.showMessageDialog(null, "Monedas de 1€: " + cantidad / 100);
                            cantidad %= 100;
                        }
                        if (cantidad / 50 > 0) {
                            efectivo.retirarMoneda(2, cantidad/50);
                            JOptionPane.showMessageDialog(null, "Monedas de 0,50€: " + cantidad / 50);
                            cantidad %= 50;
                        }
                        if (cantidad / 20 > 0) {
                            efectivo.retirarMoneda(1, cantidad/20);
                            JOptionPane.showMessageDialog(null, "Monedas de 0,20€: " + cantidad / 20);
                            cantidad %= 20;
                        }
                        if (cantidad / 10 > 0) {
                            efectivo.retirarMoneda(0, cantidad/10);
                            JOptionPane.showMessageDialog(null, "Monedas de 0,10€: " + cantidad / 10);
                            cantidad %= 10;
                        }
                    }
                    JOptionPane.showMessageDialog(null, "¡Gracias por su compra!");
                    // Incio de proceso de entrega de producto y modificación del stack
                    bandeja2.productoVendido();
                    productoElegido = kitKat;
                    // fin de este proceso
                    aux = true;
                    break;
                case 3:
                    do {
                        do {
            pago = JOptionPane.showOptionDialog(null, "Ha seleccionado " + agua.getNombreProducto() + ". Introduzca el dinero: \nDinero actual: " + (cantidadDouble / 100) + "€", null, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, valorMonedas, null);
            switch (pago) {
                case 0:
                    cantidad += 10;
                    cantidadDouble += 10;
                    efectivo.agregarMoneda(0, cantidad/10);
                    break;
                case 1:
                    cantidad += 20;
                    cantidadDouble += 20;
                    efectivo.agregarMoneda(1, cantidad/20);
                    break;
                case 2:
                    cantidad += 50;                    
                    cantidadDouble += 50;
                    efectivo.agregarMoneda(2, cantidad/50);
                    break;
                case 3:
                    cantidad += 100;
                    cantidadDouble += 100;
                    efectivo.agregarMoneda(3, cantidad/100);
                    break;
                case 4:
                    cantidad += 200;
                    cantidadDouble += 200;
                    efectivo.agregarMoneda(4, cantidad/200);
                    break;
                case 5:
                    cantidad += 500;
                    cantidadDouble += 500;
                    efectivo.agregarMoneda(5, cantidad/500);
                    break;
                case 6:
                    cantidad += 1000;
                    cantidadDouble += 1000;
                    efectivo.agregarMoneda(6, cantidad/1000);
                    break;
                case 7:
                    cantidad += 2000;
                    cantidadDouble += 2000;
                    efectivo.agregarMoneda(7, cantidad/2000);
                    break;
                case 8:
                    continue;
                default:
                    
                    break;
            }
        } while (pago != 8 && cantidad <= agua.getPrecioProducto());
                        if (cantidad < agua.getPrecioProducto()) {
                            JOptionPane.showMessageDialog(null, "Cantidad insuficiente.");
                        }
                    } while (cantidad < agua.getPrecioProducto());

                    if (cantidad == agua.getPrecioProducto()) {
                        JOptionPane.showMessageDialog(null, "Ha introducido la cantidad exacta. No tendrá cambio.");
                    } else {
                        cantidad -= agua.getPrecioProducto();
                        JOptionPane.showMessageDialog(null, "El cambio será de:");
                        if (cantidad / 1000 > 0) {
                            efectivo.retirarMoneda(6, cantidad/1000);
                            JOptionPane.showMessageDialog(null, "Billetes de 10€: " + cantidad / 1000);
                            cantidad %= 1000;
                        }
                        if (cantidad / 500 > 0) {
                            efectivo.retirarMoneda(5, cantidad/500);
                            JOptionPane.showMessageDialog(null, "Billetes de 5€: " + cantidad / 500);
                            cantidad %= 500;
                        }
                        if (cantidad / 200 > 0) {
                            efectivo.retirarMoneda(4, cantidad/200);
                            JOptionPane.showMessageDialog(null, "Monedas de 2€: " + cantidad / 200);
                            cantidad %= 200;
                        }
                        if (cantidad / 100 > 0) {
                            efectivo.retirarMoneda(3, cantidad/100);
                            JOptionPane.showMessageDialog(null, "Monedas de 1€: " + cantidad / 100);
                            cantidad %= 100;
                        }
                        if (cantidad / 50 > 0) {
                            efectivo.retirarMoneda(2, cantidad/50);
                            JOptionPane.showMessageDialog(null, "Monedas de 0,50€: " + cantidad / 50);
                            cantidad %= 50;
                        }
                        if (cantidad / 20 > 0) {
                            efectivo.retirarMoneda(1, cantidad/20);
                            JOptionPane.showMessageDialog(null, "Monedas de 0,20€: " + cantidad / 20);
                            cantidad %= 20;
                        }
                        if (cantidad / 10 > 0) {
                            efectivo.retirarMoneda(0, cantidad/10);
                            JOptionPane.showMessageDialog(null, "Monedas de 0,10€: " + cantidad / 10);
                            cantidad %= 10;
                        }
                    }
                    JOptionPane.showMessageDialog(null, "¡Gracias por su compra!");
                    // Incio de proceso de entrega de producto y modificación del stack
                    bandeja3.productoVendido();
                    productoElegido = agua;
                    // fin de este proceso
                    aux = true;
                    break;
                case 4:
                    do {do {
            pago = JOptionPane.showOptionDialog(null, "Ha seleccionado " + smint.getNombreProducto() + ". Introduzca el dinero: \nDinero actual: " + (cantidadDouble / 100) + "€", null, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, valorMonedas, null);
            switch (pago) {
                case 0:
                    cantidad += 10;
                    cantidadDouble += 10;
                    efectivo.agregarMoneda(0, cantidad/10);
                    break;
                case 1:
                    cantidad += 20;
                    cantidadDouble += 20;
                    efectivo.agregarMoneda(1, cantidad/20);
                    break;
                case 2:
                    cantidad += 50;                    
                    cantidadDouble += 50;
                    efectivo.agregarMoneda(2, cantidad/50);
                    break;
                case 3:
                    cantidad += 100;
                    cantidadDouble += 100;
                    efectivo.agregarMoneda(3, cantidad/100);
                    break;
                case 4:
                    cantidad += 200;
                    cantidadDouble += 200;
                    efectivo.agregarMoneda(4, cantidad/200);
                    break;
                case 5:
                    cantidad += 500;
                    cantidadDouble += 500;
                    efectivo.agregarMoneda(5, cantidad/500);
                    break;
                case 6:
                    cantidad += 1000;
                    cantidadDouble += 1000;
                    efectivo.agregarMoneda(6, cantidad/1000);
                    break;
                case 7:
                    cantidad += 2000;
                    cantidadDouble += 2000;
                    efectivo.agregarMoneda(7, cantidad/2000);
                    break;
                case 8:
                    continue;
                default:
                    
                    break;
            }
        } while (pago != 8 && cantidad <= smint.getPrecioProducto());
                        if (cantidad < smint.getPrecioProducto()) {
                            JOptionPane.showMessageDialog(null, "Cantidad insuficiente.");
                        }
                    } while (cantidad < smint.getPrecioProducto());

                    if (cantidad == smint.getPrecioProducto()) {
                        JOptionPane.showMessageDialog(null, "Ha introducido la cantidad exacta. No tendrá cambio.");
                    } else {
                        cantidad -= smint.getPrecioProducto();
                        JOptionPane.showMessageDialog(null, "El cambio será de:");
                        if (cantidad / 1000 > 0) {
                            efectivo.retirarMoneda(6, cantidad/1000);
                            JOptionPane.showMessageDialog(null, "Billetes de 10€: " + cantidad / 1000);
                            cantidad %= 1000;
                        }
                        if (cantidad / 500 > 0) {
                            efectivo.retirarMoneda(5, cantidad/500);
                            JOptionPane.showMessageDialog(null, "Billetes de 5€: " + cantidad / 500);
                            cantidad %= 500;
                        }
                        if (cantidad / 200 > 0) {
                            efectivo.retirarMoneda(4, cantidad/200);
                            JOptionPane.showMessageDialog(null, "Monedas de 2€: " + cantidad / 200);
                            cantidad %= 200;
                        }
                        if (cantidad / 100 > 0) {
                            efectivo.retirarMoneda(3, cantidad/100);
                            JOptionPane.showMessageDialog(null, "Monedas de 1€: " + cantidad / 100);
                            cantidad %= 100;
                        }
                        if (cantidad / 50 > 0) {
                            efectivo.retirarMoneda(2, cantidad/50);
                            JOptionPane.showMessageDialog(null, "Monedas de 0,50€: " + cantidad / 50);
                            cantidad %= 50;
                        }
                        if (cantidad / 20 > 0) {
                            efectivo.retirarMoneda(1, cantidad/20);
                            JOptionPane.showMessageDialog(null, "Monedas de 0,20€: " + cantidad / 20);
                            cantidad %= 20;
                        }
                        if (cantidad / 10 > 0) {
                            efectivo.retirarMoneda(0, cantidad/10);
                            JOptionPane.showMessageDialog(null, "Monedas de 0,10€: " + cantidad / 10);
                            cantidad %= 10;
                        }
                    }
                    JOptionPane.showMessageDialog(null, "¡Gracias por su compra!");
                    // Incio de proceso de entrega de producto y modificación del stack
                    bandeja4.productoVendido();
                    productoElegido = smint;
                    // fin de este proceso
                    aux = true;
                    break;
                case 5:
                    do {do {
            pago = JOptionPane.showOptionDialog(null, "Ha seleccionado " + fantaNaranja.getNombreProducto() + ". Introduzca el dinero: \nDinero actual: " + (cantidadDouble / 100) + "€", null, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, valorMonedas, null);
            switch (pago) {
                case 0:
                    cantidad += 10;
                    cantidadDouble += 10;
                    efectivo.agregarMoneda(0, cantidad/10);
                    break;
                case 1:
                    cantidad += 20;
                    cantidadDouble += 20;
                    efectivo.agregarMoneda(1, cantidad/20);
                    break;
                case 2:
                    cantidad += 50;                    
                    cantidadDouble += 50;
                    efectivo.agregarMoneda(2, cantidad/50);
                    break;
                case 3:
                    cantidad += 100;
                    cantidadDouble += 100;
                    efectivo.agregarMoneda(3, cantidad/100);
                    break;
                case 4:
                    cantidad += 200;
                    cantidadDouble += 200;
                    efectivo.agregarMoneda(4, cantidad/200);
                    break;
                case 5:
                    cantidad += 500;
                    cantidadDouble += 500;
                    efectivo.agregarMoneda(5, cantidad/500);
                    break;
                case 6:
                    cantidad += 1000;
                    cantidadDouble += 1000;
                    efectivo.agregarMoneda(6, cantidad/1000);
                    break;
                case 7:
                    cantidad += 2000;
                    cantidadDouble += 2000;
                    efectivo.agregarMoneda(7, cantidad/2000);
                    break;
                case 8:
                    continue;
                default:
                    
                    break;
            }
        } while (pago != 8 && cantidad <= fantaNaranja.getPrecioProducto());
                        if (cantidad < fantaNaranja.getPrecioProducto()) {
                            JOptionPane.showMessageDialog(null, "Cantidad insuficiente.");
                        }
                    } while (cantidad < fantaNaranja.getPrecioProducto());

                    if (cantidad == fantaNaranja.getPrecioProducto()) {
                        JOptionPane.showMessageDialog(null, "Ha introducido la cantidad exacta. No tendrá cambio.");
                    } else {
                        cantidad -= fantaNaranja.getPrecioProducto();
                        JOptionPane.showMessageDialog(null, "El cambio será de:");
                        if (cantidad / 1000 > 0) {
                            efectivo.retirarMoneda(6, cantidad/1000);
                            JOptionPane.showMessageDialog(null, "Billetes de 10€: " + cantidad / 1000);
                            cantidad %= 1000;
                        }
                        if (cantidad / 500 > 0) {
                            efectivo.retirarMoneda(5, cantidad/500);
                            JOptionPane.showMessageDialog(null, "Billetes de 5€: " + cantidad / 500);
                            cantidad %= 500;
                        }
                        if (cantidad / 200 > 0) {
                            efectivo.retirarMoneda(4, cantidad/200);
                            JOptionPane.showMessageDialog(null, "Monedas de 2€: " + cantidad / 200);
                            cantidad %= 200;
                        }
                        if (cantidad / 100 > 0) {
                            efectivo.retirarMoneda(3, cantidad/100);
                            JOptionPane.showMessageDialog(null, "Monedas de 1€: " + cantidad / 100);
                            cantidad %= 100;
                        }
                        if (cantidad / 50 > 0) {
                            efectivo.retirarMoneda(2, cantidad/50);
                            JOptionPane.showMessageDialog(null, "Monedas de 0,50€: " + cantidad / 50);
                            cantidad %= 50;
                        }
                        if (cantidad / 20 > 0) {
                            efectivo.retirarMoneda(1, cantidad/20);
                            JOptionPane.showMessageDialog(null, "Monedas de 0,20€: " + cantidad / 20);
                            cantidad %= 20;
                        }
                        if (cantidad / 10 > 0) {
                            efectivo.retirarMoneda(0, cantidad/10);
                            JOptionPane.showMessageDialog(null, "Monedas de 0,10€: " + cantidad / 10);
                            cantidad %= 10;
                        }
                    }
                    JOptionPane.showMessageDialog(null, "¡Gracias por su compra!");
                    // Incio de proceso de entrega de producto y modificación del stack
                    bandeja5.productoVendido();
                    productoElegido = fantaNaranja;
                    // fin de este proceso
                    aux = true;
                    break;
                case 6:
                    do {
                        do {
            pago = JOptionPane.showOptionDialog(null, "Ha seleccionado " + haribbo.getNombreProducto() + ". Introduzca el dinero: \nDinero actual: " + (cantidadDouble / 100) + "€", null, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, valorMonedas, null);
            switch (pago) {
                case 0:
                    cantidad += 10;
                    cantidadDouble += 10;
                    efectivo.agregarMoneda(0, cantidad/10);
                    break;
                case 1:
                    cantidad += 20;
                    cantidadDouble += 20;
                    efectivo.agregarMoneda(1, cantidad/20);
                    break;
                case 2:
                    cantidad += 50;                    
                    cantidadDouble += 50;
                    efectivo.agregarMoneda(2, cantidad/50);
                    break;
                case 3:
                    cantidad += 100;
                    cantidadDouble += 100;
                    efectivo.agregarMoneda(3, cantidad/100);
                    break;
                case 4:
                    cantidad += 200;
                    cantidadDouble += 200;
                    efectivo.agregarMoneda(4, cantidad/200);
                    break;
                case 5:
                    cantidad += 500;
                    cantidadDouble += 500;
                    efectivo.agregarMoneda(5, cantidad/500);
                    break;
                case 6:
                    cantidad += 1000;
                    cantidadDouble += 1000;
                    efectivo.agregarMoneda(6, cantidad/1000);
                    break;
                case 7:
                    cantidad += 2000;
                    cantidadDouble += 2000;
                    efectivo.agregarMoneda(7, cantidad/2000);
                    break;
                case 8:
                    continue;
                default:
                    
                    break;
            }
        } while (pago != 8 && cantidad <= haribbo.getPrecioProducto());
                        if (cantidad < haribbo.getPrecioProducto()) {
                            JOptionPane.showMessageDialog(null, "Cantidad insuficiente.");
                        }
                    } while (cantidad < haribbo.getPrecioProducto());

                    if (cantidad == haribbo.getPrecioProducto()) {
                        JOptionPane.showMessageDialog(null, "Ha introducido la cantidad exacta. No tendrá cambio.");
                    } else {
                        cantidad -= haribbo.getPrecioProducto();
                        JOptionPane.showMessageDialog(null, "El cambio será de:");
                        if (cantidad / 1000 > 0) {
                            efectivo.retirarMoneda(6, cantidad/1000);
                            JOptionPane.showMessageDialog(null, "Billetes de 10€: " + cantidad / 1000);
                            cantidad %= 1000;
                        }
                        if (cantidad / 500 > 0) {
                            efectivo.retirarMoneda(5, cantidad/500);
                            JOptionPane.showMessageDialog(null, "Billetes de 5€: " + cantidad / 500);
                            cantidad %= 500;
                        }
                        if (cantidad / 200 > 0) {
                            efectivo.retirarMoneda(4, cantidad/200);
                            JOptionPane.showMessageDialog(null, "Monedas de 2€: " + cantidad / 200);
                            cantidad %= 200;
                        }
                        if (cantidad / 100 > 0) {
                            efectivo.retirarMoneda(3, cantidad/100);
                            JOptionPane.showMessageDialog(null, "Monedas de 1€: " + cantidad / 100);
                            cantidad %= 100;
                        }
                        if (cantidad / 50 > 0) {
                            efectivo.retirarMoneda(2, cantidad/50);
                            JOptionPane.showMessageDialog(null, "Monedas de 0,50€: " + cantidad / 50);
                            cantidad %= 50;
                        }
                        if (cantidad / 20 > 0) {
                            efectivo.retirarMoneda(1, cantidad/20);
                            JOptionPane.showMessageDialog(null, "Monedas de 0,20€: " + cantidad / 20);
                            cantidad %= 20;
                        }
                        if (cantidad / 10 > 0) {
                            efectivo.retirarMoneda(0, cantidad/10);
                            JOptionPane.showMessageDialog(null, "Monedas de 0,10€: " + cantidad / 10);
                            cantidad %= 10;
                        }
                    }
                    JOptionPane.showMessageDialog(null, "¡Gracias por su compra!");
                    // Incio de proceso de entrega de producto y modificación del stack
                    bandeja6.productoVendido();
                    productoElegido = haribbo;
                    // fin de este proceso
                    aux = true;
                    break;
            }
        } while (!aux);
        }
        if (opcionesInt == 1){
            //PAGO CON TARJETA.
        } if(opcionesInt == 2){
            JOptionPane.showMessageDialog(null, "Salir de la compra.");
        }
        
    }
    
}
