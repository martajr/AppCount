package com.example.marta.appcount;

/**
 * Created by Marta on 30/01/2017.
 */

public class Presentador implements I_Presentador {
     private I_Modelo modelo;

    private static Presentador singleton = new Presentador( );

    private Presentador() {
        modelo= Modelo.getInstance();
    }

    public static Presentador getInstance( ) {
        return singleton;
    }
    @Override
    public int presentarContador() {
        return modelo.getContador();
    }

    @Override
    public void aumentarContador() {
        modelo.aumentarContador();

    }

    @Override
    public void disminuirContador() {
        modelo.disminuirContador();

    }
}
