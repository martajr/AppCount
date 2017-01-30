package com.example.marta.appcount;

/**
 * Created by Marta on 30/01/2017.
 */

public class Modelo implements I_Modelo {
    private int contador;

    private static Modelo singleton = new Modelo( );

    private Modelo() {
        contador = 0;
    }

    public static Modelo getInstance( ) {
        return singleton;
    }

    @Override
    public int getContador() {
        return contador;
    }

    @Override
    public void aumentarContador() {
        contador++;

    }

    @Override
    public void disminuirContador() {
        contador--;

    }
}
