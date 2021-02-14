package es.local.basicos.clases;

/* NOTA: Al importar paquetes, si importamos todas las clases de un paquete con,
* por ejemplo:
* import es.local.basicos.clases.*
* Esto no significa que estemos cargando todas las clases en memoria y
* desperdiciando memoria si no las vamos a usar, solo se cargarán en
* memoria las clases que sean usadas del paquete.  */

import es.local.basicos.clases.encapsulamiento.Persona;

public class UsoEncapsulamiento {

    public static void main(String[] args) {

        Persona p1 = new Persona("Isra",2000.0,false);
        /* Siendo los atributos privados a la clase, ya no será posible acceder
        * directamente a dichos atributos desde fuera de la clase, deberá hacerse
        * a través de los métodos "getter" y "setter". */
        p1.setNombre("Israel");
        System.out.println("p1 = " + p1.getNombre()+" "+p1.getSueldo()+" "+p1.isEliminado());
        /* El método "print" y sus variantes realizan de manera automática una
        * llamada al método "toString()" del objeto que se requiere imprimir,
        * por lo tanto, no es necesario indicarlo, pero es posible hacerlo. */
        System.out.println("Con \"toString()\": "+p1.toString());
        System.out.println("Con \"toString()\": "+p1);
    }
}
