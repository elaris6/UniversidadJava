package com.local.aaaTareas;

import java.util.Scanner;

public class Permitetro {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        System.out.print("Indica un alto para el rectángulo: ");
        var alto = Double.parseDouble(consola.nextLine());
        System.out.print("Indica un ancho para el rectángulo: ");
        var ancho = Double.parseDouble(consola.nextLine());

        System.out.println("Área: "+(alto*ancho)+"\nPerímetro: "+(alto+ancho)*2);
    }
}
