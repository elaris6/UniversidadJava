package com.local.aaaTareas;

import java.util.Scanner;

public class MayorNum {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        System.out.print("Introduce el número 1: ");
        var num1 = Integer.parseInt(consola.nextLine());

        System.out.print("Introduce el número 2: ");
        var num2 = Integer.parseInt(consola.nextLine());

        var mayor = (num1 > num2) ? "El número 1 es mayor":"El número 2 es mayor";
        System.out.println(mayor);

    }
}
