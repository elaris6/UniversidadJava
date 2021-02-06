package com.local.basicos;

import java.util.Scanner;

public class UsoClaseScanner {

    public static void main(String[] args) {

        /* Creamos un objeto de la clase "Scanner".
        * https://docs.oracle.com/javase/10/docs/api/java/util/Scanner.html
        * y pasamos como parámetro el "System.in" que es un objeto de tipo
        * "InputStream".
        * https://docs.oracle.com/javase/10/docs/api/java/lang/System.html
        * */
        Scanner consola = new Scanner(System.in);

        /* El método "nextLine" siempre devuelve un String. */
        System.out.print("Escribe un nombre: ");
        var usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);

        System.out.print("Escribe un título: ");
        var titulo = consola.nextLine();
        System.out.println("titulo = " + titulo);

    }
}
