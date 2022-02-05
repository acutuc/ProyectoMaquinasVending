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
    private Tarjetas tarjeta1;
    private Tarjetas tarjeta2;
    private Tarjetas tarjeta3;
    private boolean modoUsuario; //false modo usuario; true modo administrador; MIRAR EN EL MAIN PARA CAMBIARLO POR UN SWITCH.!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    private boolean metodoPago; //false efectivo; true tarjeta.                 MIRAR EN EL MAIN PARA CAMBIARLO POR UN SWITCH.!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    private static UUID numeroSerie;
    private Contenedor contenedor = new Contenedor();

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
        Maquinas.numeroSerie = UUID.randomUUID();

    }

    //Método NUMERO SERIE ¿?
    /* borrador: public static UUID numeroSerie() {
        

        return numeroSerie;
    } */
    @Override
    public String toString() {
        return "Maquinas{" + "bandeja1=" + bandeja1 + ", bandeja2=" + bandeja2 + ", bandeja3=" + bandeja3 + ", bandeja4=" + bandeja4 + ", bandeja5=" + bandeja5 + ", bandeja6=" + bandeja6 + ", tarjeta1=" + tarjeta1 + ", tarjeta2=" + tarjeta2 + ", tarjeta3=" + tarjeta3 + ", modoUsuario=" + modoUsuario + ", metodoPago=" + metodoPago + ", contenedor=" + contenedor + '}';
    }

    //Getters.
    public Bandejas getBandeja(Bandejas bandeja) {
        return bandeja;
    }

//    public Bandejas getBandeja2() {
//        return bandeja2;
//    }
//
//    public Bandejas getBandeja3() {
//        return bandeja3;
//    }
//
//    public Bandejas getBandeja4() {
//        return bandeja4;
//    }
//
//    public Bandejas getBandeja5() {
//        return bandeja5;
//    }
//
//    public Bandejas getBandeja6() {
//        return bandeja6;
//    }
    public boolean isModoUsuario() {
        return modoUsuario;
    }

    public boolean isMetodoPago() {
        return metodoPago;
    }

    public static UUID getNumeroSerie() {
        return numeroSerie;
    }

    //Setters. Set modo usuario y método de pago no hay. Cambiados por métodos.
    public void setBandeja(Bandejas bandeja, Bandejas bandejaNuevo) {
        bandeja = bandejaNuevo;
    }

//    public void setBandeja2(Bandejas bandeja2) {
//        this.bandeja2 = bandeja2;
//    }
//
//    public void setBandeja3(Bandejas bandeja3) {
//        this.bandeja3 = bandeja3;
//    }
//
//    public void setBandeja4(Bandejas bandeja4) {
//        this.bandeja4 = bandeja4;
//    }
//
//    public void setBandeja5(Bandejas bandeja5) {
//        this.bandeja5 = bandeja5;
//    }
//
//    public void setBandeja6(Bandejas bandeja6) {
//        this.bandeja6 = bandeja6;
//    }
    public void metodoPago() {
        if (this.metodoPago == false) {
            //Método de pago en efectivo.
        } else {
            //Método de pago en tarjeta.
        }

    }

    public void modoUsuario() {
        if (this.modoUsuario == false) {
            //Modo usuario activado.
        } else {
            //Modo admin activado.
        }
    }

    public Contenedor getContenedor() {
        return contenedor;
    }

    public void setContenedor(Contenedor contenedor) {
        this.contenedor = contenedor;
    }
    
    
}
