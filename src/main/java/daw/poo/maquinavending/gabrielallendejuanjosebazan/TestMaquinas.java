
package daw.poo.maquinavending.gabrielallendejuanjosebazan;

import java.util.Scanner;

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
        Productos producto1 = new Productos("Coca-Cola 500ml", 120);
        Scanner entrada = new Scanner(System.in);
        int centimos;
        //Bucle que controle la cantidad de monedas a devolver en caso de haber cambio.
        do {
            System.out.print("\nCantidad introducida (en céntimos): ");
            centimos = entrada.nextInt();
            if(centimos < producto1.getPrecioProducto()){
                System.out.println("Cantidad insuficiente.");
            }
        } while (centimos < producto1.getPrecioProducto());
         
        if(centimos == producto1.getPrecioProducto()){
            System.out.println("Has introducido la cantidad exacta.");
        } else {
            centimos -= producto1.getPrecioProducto();
            System.out.println("El cambio será:");
            if(centimos/200 > 0){
                System.out.println("Monedas de 2€: %d" + centimos/200);
                centimos %= 200;
            }
            if(centimos/100>0){
                System.out.println("Monedas de 1€: %d" + centimos/100);
                centimos %= 100;
            }
            if(centimos/50>0){
                System.out.println("%nMonedas de 0,50€: %d" + centimos/50);
                centimos %= 50;
            }
            if(centimos/20>0){
                System.out.println("%nMonedas de 0,20€: %d" + centimos/20);
                centimos %= 20;
            }
            if(centimos/10>0){
                System.out.println("%nMonedas de 0,10€: %d" + centimos/10);
                centimos %= 10;
            }
            if(centimos/5>0){
                System.out.println("%nMonedas de 0,05€: %d" + centimos/5);
                centimos %= 5;
            }
            if(centimos/2>0){
                System.out.println("%nMonedas de 0,02€: %d" + centimos/2);
                centimos %= 2;
            }
            if(centimos>0){
                System.out.printf("%nMonedas de 0,01€: %d", centimos);
            }
        }
        System.out.printf("%n%nGracias por su compra"); 
    }
}
   
