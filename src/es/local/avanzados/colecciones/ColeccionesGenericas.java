package es.local.avanzados.colecciones;

import java.util.*;

/* Todas las clases que heredan de "Collection" soportan tipos
* genéricos. */
public class ColeccionesGenericas {

    public static void main(String[] args) {

        /* Si definimos un tipo entre pico paréntesis en un objeto de tipo
        * "List", estaremos añadiendo una validación de tipo a la hora de
        * añadir los elementos en tiempo de compilación. */
        List<String> miLista = new ArrayList<>();

        miLista.add("Lunes");
        miLista.add("Viernes");
        //miLista.add(2); --> Error

        /* A la hora de recuperar los elementos, no será necesario hacer
        * conversión de tipos, ya que el método "get" de la interfaz "List"
        * no devolverá elementos de tipo "Object", sino del tipo indicado.  */
        String cadena = miLista.get(0);
        imprimeColeccion(miLista);

        /* Todo lo indicado para "List", aplica a "Set" */
        Set<String> miSet = new HashSet<>();


        /* En el caso de "Map", se puede indicar un tipo genérico para la
        * clave y otro para el valor.
        * Tendremos los mismos beneficios comentados sobre "List" y "Set"
        * en cuanto a la validación y conversión de tipos. */

        Map<Integer,String> miMapa = new HashMap<>();
        miMapa.put(1,"Primero");
        miMapa.put(2,"Segundo");
        miMapa.put(3,"Tercero");
        //miMapa.put("Cuarto",4); --> Error
        miMapa.put(5,"Quinto");

        miMapa.values().forEach(valor ->{
            System.out.println("valor = " + valor.toUpperCase());
        });
    }

    /* Los tipos genéricos también se pueden aplicar a métodos creados para
    * el uso de elementos iterables de tipo "Collection", aplicando así la
    * validación de tipo de entrada y la conversión automática en la salida. */
    public static void imprimeColeccion(Collection<String> coleccion){
        coleccion.forEach(elemento -> {
            /* Al devolver el tipo almacenado, ya se pueden usar sus atributos
            * o métodos directamente. Por ejemplo, el método "length" de String. */
            System.out.println("elemento desde metodo generico = " + elemento.length());
        });
    }
}
