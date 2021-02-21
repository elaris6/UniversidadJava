package es.local.avanzados.colecciones;

/* MAP - HASHMAP */

import java.util.*;

public class ColeccionesMap {

    public static void main(String[] args) {

        /* Una colección de tipo "Map" es unn conjunto de elementos,
        * pero almacenados con el modelo "clave : valor". Cada "clave"
        * lleva asociado un valor concreto, como si fuese un diccionario.
        * Las claves no pueden estar duplicadas pues actúan como
        * identificadores únicos de cada elemento.
        *  */

        /* Es una buena práctica crear el objeto asociado a una variable
        * del tipo más genérico. */
        Map miMapa = new HashMap();

        /* Podemos manipular los elementos de un "HashMap" mediante los métodos
        * de clase, que en este caso no son heredados de la interfaz "Collection"
        * sino de "Map".
        * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/HashMap.html */

        /* El método de adición "put" requiere una clave y un valor, y acepta en
        * ambos parámetros, elementos de tipo "Object". */
        miMapa.put("dia1","Lunes");
        miMapa.put("dia2","Martes");
        miMapa.put("dia3","Miércoles");
        miMapa.put("dia4","Jueves");
        miMapa.put("dia5","Viernes");

        /* El método "put" además de insertar, actualiza un valor asociado a una
        * clave. */
        miMapa.put("dia1","Domingo");

        /* El método de consulta "get", devuelve objetos de tipo "Object", por lo
        * que habrá que estar atentos a la necesidad de casting, según el caso. */
        System.out.println(miMapa.get("dia5"));

        /* Para recorrer todo el "HashMap" se usará el meétodo "keySet()", que
        * devolverá un objeto de tipo "Set", con todas las claves, que
        * posteriormente debermos recorrer.
        * También tenemos el método "values()", que devolerá todos los valores. */

        System.out.println(miMapa.keySet());
        System.out.println(miMapa.values());

    }
}
