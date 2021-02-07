package es.local.clases;

import java.sql.SQLOutput;

public class UsoReturnYNull {

    public static void main(String[] args) {

        Persona p1 = new Persona();
        p1.nombre = "Mari";
        p1 = cambiaPersona(p1);
        System.out.println("p1.nombre = " + p1.nombre);
        
        cambiaPersonaDos(p1);
        System.out.println("p1.nombre = " + p1.nombre);
    }

    /* Los métodos pueden devolver tipos Object además de tipos primitivos. Para indicarlo
    * simplemente se debe informar en la FIRMA del método, el tipo Object que devolverá. */
    public static Persona cambiaPersona(Persona p){
        /* Pueden exisitir varias sentencias "return", si agregamos estructuras de control
        * de flujo. */
        if (p == null){
            /* Usamos un sencillo "if" para validar si el objeto está inicializado.
            * Para ello, se debe validar si la referencia de memoria de la variable
            * está apuntando a null (vacío). */
            System.out.println("Valor de persona inválido.");
            /* En caso oportuno, la instrucción "return" también puede devolver el valor
            * "null" (vacío). */
            return null;
        }
        System.out.println("p.nombre = " + p.nombre);
        p.nombre = "Isra";

        // Devolvemos un tipo Object
        return p;
    }

    /* Los métodos que no devuelven nada, en los que informamos un valor de retorno "void"
    * realmente si incluyen una instrucción "return" implícita, aunque no sea necesaario
    * escribirla. */
    public static void cambiaPersonaDos(Persona p){
        System.out.println("p.nombre = " + p.nombre);
        p.nombre = "Alicia";

        //Instrucción "return" implícita
        return ;
    }
}
