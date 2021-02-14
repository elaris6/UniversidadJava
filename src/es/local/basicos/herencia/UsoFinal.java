package es.local.basicos.herencia;

import es.local.basicos.herencia.clases.ClaseMetodoFinal;
import es.local.basicos.herencia.clases.Persona;

public class UsoFinal {

    /* FINAL */

    /* El uso de "final" sobre variables hace que no sea posible modificarlas una vez son
     * inicializadas. Se convertirán en constantes desde ese momento.  */
    /* La forma adecuada de definir constantes de clase es usando los modificadores
     * "public static final", cuyo orden de escritura no es relevante para el compilador.
     * La forma de nombrar constantes es mediante mayúsculas y separando las palabras con
     * guión si hay más de una. */

    public static final int MI_CONSTANTE = 10;

    public static void main(String[] args) {

        System.out.println("miVariable = " + MI_CONSTANTE);

        //MI_CONSTANTE = 11; --> Error

        ClaseHijaDos c1 = new ClaseHijaDos();
        /* Usamos el método sobreescrito en la clase hija. */
        c1.metodoHeredable("Cadena a imprimir.");

        /* Usamos el método heredado de la clase padre. Aunque no podemos sobreescribirlo,
        * si podemos usarlo. */
        c1.metodoFinal("Cadena a imprimir");

        /* Si se aplica "final" a un objeto, ya no se permitirá modificar la referencia
        * de memoria HEAP asignada, pero si será posible modificar los atributos de dicho
        * objeto normalmente.  */
        final Persona p = new Persona();
        System.out.println("p = " + p);
        //p = new Persona(); --> Error
        p.setNombre("Isra");
        System.out.println("p = " + p);
        

    }
}

/* Esto da error, pues la clase "ClaseFinal" está marcada como "final".
class ClaseHijaUno extends ClaseFinal {

}*/

class ClaseHijaDos extends ClaseMetodoFinal {

    public ClaseHijaDos(){

        this.atribNormal = 20;
        /* No se puede modificar un atributo definido como "final" en la clase padre. */
        //this.ATRIB_FINAL = 30;
    }

    /* Se puede sobreescribir un método de la clase padre que sea heredable.
    * La anotación "@Override" es opcional. Indica al compilador que el método está
    * sobreescribiendo a otro de la clase padre. */
    @Override
    public void metodoHeredable(String s) {
        super.metodoHeredable(s+" añadido en método hijo");
    }

    /* No se puede sobreescribir un método declarado como "final" en la clase padre,
    *
    * Aunque si podemos usar este método en la clase hija mediante la palabra
    * reservada "super.métodoClasePadre". */
    /*@Override
    public void metodoFinal(String s) {
        super.metodoFinal(s+" añadido en método hijo");
    }*/

}