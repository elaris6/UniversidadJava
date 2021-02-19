package es.local.avanzados.claseobject;

/* CLASE OBJECT */

/* Todas las clases heredan de la clase OBJECT de alguna u otra manera.
* A la clase OBJECT se le llama clase atómica o clase cósmica también. */

/* Es muy importante conocer los siguientes métodos base de la clase OBJECT:
* - equals
* - hashCode
* - toString */

/* En J2EE (Java empresarial) o en los Frameworks avanzados de Java se podrá
* hacer uso de estos métodos de forma automática y si no están correctamente
* implementados, los resultados podrían ser erróneos. */

public class ClaseObject {

    public static void main(String[] args) {

        /* MÉTODO EQUALS. Comparación de objetos
        * Cuando creamos una instancia de clase u objeto, lo que se crea es una nueva variable y una nueva
        * referencia en la memoria HEAP que contiene ese nuevo objeto. Por ello, aunque los valores lógicos
        * de los atributos de dos instancias puedan parecer iguales, son objetos distintos en realidad.
        *
        * Para realizar comparación de objetos mediante el método "equals" será necesario implementar
        * dicho método heredado de la clase "Object", aplicando la lógica necesaria para determinar si
        * dos objetos son o no iguales.
        *
        * Las buenas prácticas recomiendan que siempre que se implemente el método "equals", se implemetne
        * también el método "hasCode", que debe proporcionar un "int" lo más único posible en base un
        * cálculo sobre los atributos de la clase. */

        Empleado e1 = new Empleado("Emple1",2000);
        Empleado e2 = new Empleado("Emple1",2000);

        /* Si comparamos dos objetos, a través de las variables que los referencian con el operador de
        * comparación "==" lo que hacemos es preguntar si tienen la misma referencia en memoria.
        * En este caso, la comparación debe devolver FALSE, pues son variables que apuntan a objetos
        * creados de forma separada. */

        System.out.println("Comparación con == es: "+ String.valueOf(e1 == e2));

        System.out.println("Comparación con hasCode es: "+ (e1.hashCode() == e2.hashCode()));

        System.out.println("Comparación con equals es: "+ String.valueOf(e1.equals(e2)));


        /* En este caso, la comparación con "==" devolverá TRUE, pues ambas variablen referencian
        * al mismo objeto en la memoria HEAP. */
        Empleado e3 = e1;

        System.out.println("Comparación con == es: "+ String.valueOf(e3 == e1));
    }
}
