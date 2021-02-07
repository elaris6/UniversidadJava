package es.local.controlflujo;

import java.util.Scanner;

public class ejCalificaciones {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        System.out.print("Introduce la nota: ");
        var nota = Double.parseDouble(consola.nextLine());
        var calificacion = "";
        if (nota >= 0 && nota < 6) calificacion = "F";
        else if (nota < 7) calificacion = "D";
        else if (nota < 8) calificacion = "C";
        else if (nota < 9) calificacion = "B";
        else if (nota <= 10) calificacion = "A";
        else calificacion = "Nota inválida";
        System.out.println("La calificación es: " + calificacion);

    }
}
