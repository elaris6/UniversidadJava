package es.local.avanzados.colecciones;

import java.util.*;

/* SET - HASHSET */

public class ColeccionesSet {

    public static void main(String[] args) {

        /* Una colección de tipo SET no guarda el orden de inserción.
        * Es más bien un conjunto de elementos UNICOS que una lista. */
        /* Si no se requiere guardar un orden concreto, y hay que añadir
        * o eliminar muchos elementos, un Set puede ser una buena opción,
        * porque tiene mejor rendimiento que "List" en este caso. */

        /* Se pueden crear objetos "HashSet" sobre variables del tipo
        * de la clase padre "Set" y esto es una buena práctica. */
        Set miSet = new HashSet();

        /* Podemos usar los métodos de clase para realizar operaciones
         * sobre los elementos.
         * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/HashSet.html */

        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miércoles");
        miSet.add("Jueves");
        miSet.add("Viernes");

        /* Podemos recorrer los SET como recorreríamos un array, pero
        * hay que recordar que los elementos no llevarán un orden. */

        miSet.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });

        imprimeColeccion(miSet);
    }

    /* Es posible crear un método que trate cualquier tipo de colección
    * aludiendo a la clase padre "Collection". */
    public static void imprimeColeccion(Collection coleccion){
        coleccion.forEach(elemento -> {
            System.out.println("elemento desde método genérico = " + elemento);
        });
    }
}
