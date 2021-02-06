package com.local.aaaTareas;

import java.util.Scanner;

public class SolicitaInfoLibro {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        /* El método "nextLine" siempre devuelve un String. */
        System.out.print("Título del libro: ");
        var titulo = consola.nextLine();

        System.out.print("Indica un id: ");
        var id = Integer.parseInt(consola.nextLine());

        System.out.print("Indica un un precio: ");
        var precio = Double. parseDouble(consola.nextLine());

        System.out.print("Indica si el envío es gratuito: ");
        var envio = Boolean.parseBoolean(consola.nextLine());


        System.out.println("\""+titulo+"\""+" #"+id+"\nPrecio: "+precio+"€"+"\nEnvío Gratuito: "+String.valueOf(envio));

    }
}
