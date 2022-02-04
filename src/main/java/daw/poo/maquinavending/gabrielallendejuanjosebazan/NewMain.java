/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw.poo.maquinavending.gabrielallendejuanjosebazan;

import java.util.Scanner;

/**
 *
 * @author Naturalkid
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ModoAdmin ma = new ModoAdmin();

        ma.generarCodigoAdmin();

        System.out.println(ma.mostrarCodigoAdmin());
        
        Productos patata = new Productos("Producto1", 1);
        Bandejas patataBandeja = new Bandejas(patata, 1111);
        
        //Instanciación de objetos.
        Productos cocaCola = new Productos("Coca-Cola 500ml", 120);
        Productos kitKat = new Productos("Kit-Kat", 150);
        Productos agua = new Productos("Agua 500ml", 100);
        Productos smint = new Productos("Caramelos Smint", 100);
        Productos fantaNaranja = new Productos("Fanta Naranja 500ml", 120);
        Productos haribbo = new Productos("Caramelos Haribbo", 200);
        // crear bandejas
        Bandejas bandeja1 = new Bandejas(cocaCola, 1);
        Bandejas bandeja2 = new Bandejas(kitKat, 2);
        Bandejas bandeja3 = new Bandejas(agua, 3);
        Bandejas bandeja4 = new Bandejas(smint, 4);
        Bandejas bandeja5 = new Bandejas(fantaNaranja, 5);
        Bandejas bandeja6 = new Bandejas(haribbo, 6);
        
        
        Maquinas maquina1 = new Maquinas(bandeja1, bandeja2, bandeja3, bandeja4, bandeja5, bandeja6, true, true);
        
        
        maquina1.toString();

        
//          ma.consultarCodBandeja(maquina1);
//        ma.cambiarCodigoBandeja(patataBandeja, 1234);
//        ma.consultarCodBandeja(patataBandeja);


//        ma.consultarProducto(patataBandeja);
//        ma.cambiarProducto(patataBandeja, patata);
//        ma.consultarProducto(patataBandeja);
        
        
}

}
