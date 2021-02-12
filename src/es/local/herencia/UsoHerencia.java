package es.local.herencia;

import es.local.herencia.clases.Cliente;
import es.local.herencia.clases.Empleado;

public class UsoHerencia {

    public static void main(String[] args) {

        /* Al crear objetos de clases que heredan de otras, se crea
        * un solo objeto, con todos los atributos propios y heredados.
        *
        *  No se crean objetos de las clases padre, abuela... pero si
        * se va llamando al constructor de cada una de ellas en el
        * árbol de herencia, para crear desde la raíz el objeto. */
        Empleado e1 = new Empleado("Juan",1500);
        e1.setNombre("Pepe");
        System.out.println("e1 = " + e1);


        Cliente c1 = new Cliente("María");
        System.out.println("c1 = " + c1);
        
    }
}
