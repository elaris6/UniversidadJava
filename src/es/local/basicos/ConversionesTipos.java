package com.local.basicos;

import java.util.Scanner;

public class ConversionesTipos {

    public static void main(String[] args) {

        // Conversión tipo String a tipo int
        var edad = Integer.parseInt("20");
        System.out.println("edad+1 = " + (edad+1));
        
        //Conversión tipo String a tipo double
        var pi = Double.parseDouble("3.14159");
        System.out.println("(pi*2) = " + (pi*2));

        // Pedir valor y convertiro a int
        Scanner consola = new Scanner(System.in);
        System.out.print("Introduce un valor numérico entero: ");
        var num = Integer.parseInt(consola.nextLine());
        System.out.println("num = " + num);

        /* Conversión tipos primitivos a tipo String
        El método "valueOf" soporta como argumento de entrada los tipos primitovos. */
        var numTexto = String.valueOf(17);
        System.out.println("(numTexto + 6) = " + (numTexto + 6));

        // Extraer un caracter de una cadena de texto
        var caracter = "hola".charAt(1);
        System.out.println("caracter = " + caracter);

    }
}
