package daw.poo.maquinavending.gabrielallendejuanjosebazan;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel
 */
//Definición de la clase
public class Maquinas {
    //Atributos de la clase Maquinas.
    private Bandejas bandeja1;
    private Bandejas bandeja2;
    private Bandejas bandeja3;
    private Bandejas bandeja4;
    private Bandejas bandeja5;
    private Bandejas bandeja6;
    private boolean modoUsuario; //false modo usuario; true modo administrador;
    private boolean metodoPago; //false efectivo; true tarjeta.

    //Constructor con sus valores por defecto.
    public Maquinas() {
    }
    
    //Constructor parametrizado.

    public Maquinas(Bandejas bandeja1, Bandejas bandeja2, Bandejas bandeja3, Bandejas bandeja4, Bandejas bandeja5, Bandejas bandeja6, boolean modoUsuario, boolean metodoPago) {
        this.bandeja1 = bandeja1;
        this.bandeja2 = bandeja2;
        this.bandeja3 = bandeja3;
        this.bandeja4 = bandeja4;
        this.bandeja5 = bandeja5;
        this.bandeja6 = bandeja6;
        this.modoUsuario = modoUsuario;
        this.metodoPago = metodoPago;
    }
    
    //Getters.
    public Bandejas getBandeja1() {
        return bandeja1;
    }

    public Bandejas getBandeja2() {
        return bandeja2;
    }

    public Bandejas getBandeja3() {
        return bandeja3;
    }

    public Bandejas getBandeja4() {
        return bandeja4;
    }

    public Bandejas getBandeja5() {
        return bandeja5;
    }

    public Bandejas getBandeja6() {
        return bandeja6;
    }

    public boolean isModoUsuario() {
        return modoUsuario;
    }

    public boolean isMetodoPago() {
        return metodoPago;
    }
    
    
    //Setters.
    public void setBandeja1(Bandejas bandeja1) {
        this.bandeja1 = bandeja1;
    }

    public void setBandeja2(Bandejas bandeja2) {
        this.bandeja2 = bandeja2;
    }

    public void setBandeja3(Bandejas bandeja3) {
        this.bandeja3 = bandeja3;
    }

    public void setBandeja4(Bandejas bandeja4) {
        this.bandeja4 = bandeja4;
    }

    public void setBandeja5(Bandejas bandeja5) {
        this.bandeja5 = bandeja5;
    }

    public void setBandeja6(Bandejas bandeja6) {
        this.bandeja6 = bandeja6;
    }

    public void setModoUsuario(boolean modoUsuario) {
        this.modoUsuario = modoUsuario;
        Scanner teclado = new Scanner(System.in);
        
        if (this.modoUsuario == false){
            // que precio quieres poner? le he puesto 0 pa que no de error
            final int PRECIO = 0;
        int centimos;
        //Bucle que 
        do {
            System.out.print("\nCantidad introducida (en céntimos): ");
            centimos = teclado.nextInt();
            if(centimos<PRECIO){
                System.out.println("Cantidad insuficiente.");
            }
        } while (centimos<PRECIO);
         
        if(centimos==PRECIO){
            System.out.println("Has introducido la cantidad exacta.");
        } else {
            centimos -= PRECIO;
            System.out.printf("%nEl cambio a devolver es el siguiente:");
            if(centimos/200>0){
                System.out.printf("%nMonedas de 2 euros: %d", centimos/200);
                centimos %= 200;
            }
            if(centimos/100>0){
                System.out.printf("%nMonedas de 1 euro: %d", centimos/100);
                centimos %= 100;
            }
            if(centimos/50>0){
                System.out.printf("%nMonedas de 50 céntimos: %d", centimos/50);
                centimos %= 50;
            }
            if(centimos/20>0){
                System.out.printf("%nMonedas de 20 céntimos: %d", centimos/20);
                centimos %= 20;
            }
            if(centimos/10>0){
                System.out.printf("%nMonedas de 10 céntimos: %d", centimos/10);
                centimos %= 10;
            }
            if(centimos/5>0){
                System.out.printf("%nMonedas de 5 céntimos: %d", centimos/5);
                centimos %= 5;
            }
            if(centimos/2>0){
                System.out.printf("%nMonedas de 2 céntimos: %d", centimos/2);
                centimos %= 2;
            }
            if(centimos>0){
                System.out.printf("%nMonedas de 1 céntimo: %d", centimos);
            }
        }
        System.out.printf("%n%nGracias por su compra"); 
    }
}
        }
    

    public void setMetodoPago(boolean metodoPago) {
        this.metodoPago = metodoPago;
    }
    
    
}
