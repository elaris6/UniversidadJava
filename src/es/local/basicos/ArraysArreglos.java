package es.local.basicos;

import es.local.herencia.clases.*;

public class ArraysArreglos {

    /* ARRAYS O ARREGLOS */

    /* Los Arrays o Arreglos son conjuntos de elementos que pueden almacenar tanto
    * tipos primitivos como Object.
    * El tamaño de los arrays es FIJO y cada elemento se almacena en una posición,
    * llamada índice. Las posiciones van enumeradas de menor a mayor, comenzando
    * por cero "0". */

    public static void main(String[] args) {

        /* La sintaxis se compone del tipo o clase de objeto seguido del nombre
        * de variable y posteriormente corchetes de apertura y cierre. Los corchetes
        * también se pueden poner delante del nombre de la variable, aunque lo común
        * es ponerlos detrás.
        * Después se deberá inicializar la variable de tipo array indicando de nuevo
        * el tipo o clase seguido del tamaño FIJO del array entre corchetes.
        * El tamaño definido NO PODRÁ MODIFICARSE una vez creado el array.
        * Object nombreVar[] = new Object[n] donde "n" es el tamaño neto  */

        int edades[] = new int[3];
        System.out.println("edades = " + edades);

        /* También se puede inicializar el array directamente en la creación.
        * A esto se le conoce como sintaxis resumida y los índices se asignan
        * en el orden en el que se informan en la creación (0, 1, 2, 3...). */

        String frutas[] = {"manzana","pera","naranja","platano","melocotón"};
        
        /* La forma de acceder para leer o escribir cada posición del array
        * será mediante el nombre de la variable, y la posición entre corchetes. */
        
        edades[0] = 10;
        System.out.println("edades[0] = " + edades[0]);

        /* Si se intenta acceder a un índice fuera del tamaño del array, en
        * tiempo de compilación no se devolverá error, el error se producirá
        * en tiempo de ejecución. */

        //edades[6] = 3;

        /* La forma usual de recorrer un array es mediante un bucle FOR,
        * usando el contador del bucle como índice del array.
        * Los objetos de tipo Array son una clase y como tal tienen atributos
        * o propiedades. Una de ellas es "length" que almacena el tamaño neto
        * del array. Esto es, el número total de elementos que se pueden
        * almacenar. Por lo tanto, para recorrer el array, lo ideal es indicar
        * que el contador del bucle FOR, llegue hasta la posición anterior
        * al tamaño máximo, ya que el índice del array comienza por cero
        * y no por uno. */

        for (int i = 0;i < edades.length; i++){
            System.out.println("edades["+i+"] = "+edades[i]);
        }
        
        /* Los arrays pueden contener tanto primitivos como tipos Object.
        * La forma de gestionar el array es exactamente igual. */
        
        Persona personas[] = new Persona[3];
        personas[0] = new Persona("Alicia");
        personas[1] = new Persona("Natalia");
        personas[2] = new Persona("Mari");
        
        for(Persona p:personas){
            System.out.println("p = " + p);
        }

    }
}
