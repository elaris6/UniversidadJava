package es.local.avanzados.colecciones;

import java.util.*;

/* LIST - ARRAYLIST */

public class ColeccionesList {

    public static void main(String[] args) {

        /* Una lista es básicamente un array mejorado, que permite modificar
        * el tamaño de forma dinámica.
        * El orden de la lista es el orden de agregación. */

        List miLista = new ArrayList();

        /* Podemos usar los métodos de clase para realizar operaciones
        * sobre los elementos.
        * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/ArrayList.html */

        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miércoles");
        miLista.add("Jueves");
        miLista.add("Viernes");

        /* La lista devuele un objeto de tipo Object. */

        /* Podemos recorrer el ArrayList con un bucle "for each", como
        * haríamos con un array ordinario. */
        for(Object dia:miLista){
            System.out.println("día: "+dia);
        }

        /* Desde Java 8 en la que se implementaron funciones lambda,
        * se puede recorrer la lista mediante estas funciones. */
        miLista.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });

        imprimeColeccion(miLista);

    }
    /* Es posible crear un método que trate cualquier tipo de colección
     * aludiendo a la clase padre "Collection". */
    public static void imprimeColeccion(Collection coleccion){
        coleccion.forEach(elemento -> {
            System.out.println("elemento desde metodo generico = " + elemento);
        });
    }
}
