package es.local.basicos.herencia.clases;

/* FINAL */

/* El uso de "final" sobre una clase lo que hace es convertir a esa clase en
* NO HEREDABLE. */

public final class ClaseFinal {

    /* El uso de "final" sobre un método hace que éste no pueda ser sobreescrito
    * en sus clases hijas si las tuviera. */

    public final void imprimir(String s){
        System.out.println("Impreso desde método imprimir de la clase ClaseFinal: "+s);
    }
}

