package es.local.avanzados.autoboxingunboxing;

public class TestAutoboxingUnboxing {

    public static void main(String[] args) {

        /* Las clases wrapper o envolventes de los tipos primitivos
        * son las clases que se pueden usar para manejar tipos
        * primitivos, pero añadiendo atributos y métodos que dotarán
        * de mayor funcionalidad a las variables.
        * No es recomendable usar las clases envolvente si se van a
        * realizar cálculos muy complejos.
        *
        * char - Character
        * byte - Byte
        * short - Short
        * int - Integer
        * long - Long
        * float - Float
        * double - Double
        * boolean - Boolean
        * etc... */

        int entero1 = 10;

        /* AUTOBOXING
        * Envolver un valor primitivo en un tipo Object. */

        Integer entero2 = 12; // Autoboxing
        System.out.println("entero2 devuelve el valor entero = " + entero2);
        System.out.println("entero2.toString() devuelve un String = " + entero2.toString());
        System.out.println("entero2.doubleValue() devuelve ya un double = " + entero2.doubleValue());

        /* UNBOXING
        * Recuperar el valor de un tipo Object envolvente para un
        * tipo primitivo. */

        int entero3 = entero2; // Unboxing
        System.out.println("entero3 = " + entero3);

    }
}
