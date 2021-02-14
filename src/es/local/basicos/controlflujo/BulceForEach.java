package es.local.basicos.controlflujo;

import es.local.basicos.herencia.clases.*;

public class BulceForEach {

    public static void main(String[] args) {

        /* FOR EACH es un FOR mejorado, que sobre todo tiene
        * utilidad al trabajar con colecciones. */

        int primos[] = {1,2,3,5,7,11,13,17,19,23};

        /* Uso bucle FOR tradicional */
        for (int i = 0;i< primos.length;i++){
            System.out.print(primos[i]+" ");
        }

        /* Uso bucle FOR EACH */
        /* En lugar de definir un índice, se define una variable del
        * tipo de la colección a recorrer, y el compilador se encargará
        * de ir iterando a lo largo de dicha colección.
        * Esto simplifica bastante el uso, pero se pierde el índice, que
        * de ser necesario hace recomendable el uso del FOR tradicional. */
        for (int p:primos) {
            System.out.print(p+" ");
        }

        /* Uso bucle FOR EACH para recorrer una colección de objetos que
        * no sean tipos primitivos. */

        Persona personas[] = {new Persona("Israel"), new Persona("Mari"), new Persona("Alicia"), new Persona("Natalia")};
        System.out.println();

        for(Persona p:personas){
            System.out.println(p);
        }


    }
}

