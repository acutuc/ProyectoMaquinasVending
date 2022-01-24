package daw.poo.maquinavending.gabrielallendejuanjosebazan;

import java.util.UUID;

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
    private UUID numeroSerie;

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
    
    //Método NUMERO SERIE ¿?
    public UUID numeroSerie(){
        numeroSerie = UUID.randomUUID();
        
        return numeroSerie;
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

    public UUID getNumeroSerie() {
        return numeroSerie;
    }
    
    //Setters. Set modo usuario y método de pago no hay. Cambiados por métodos.
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
    

    // Revisar ->
    public void setNumeroSerie(UUID numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    
    public void pagarEfectivo(){
        this.metodoPago = false;
        
    }
    
    public void pagarTarjeta(){
        this.metodoPago = true;
    }
    
    public void modoUsuario(){
        this.modoUsuario = false;
    }
    
    public void modoAdmin(){
        this.modoUsuario = true;
    }
    
}
