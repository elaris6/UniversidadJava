package es.local.avanzados.modificadoresacceso.paquete2;

import es.local.avanzados.modificadoresacceso.paquete1.Clase1Protected;

public class ClaseHIjaClase1Protected extends Clase1Protected {

    public ClaseHIjaClase1Protected(){
        /* Desde una clase hija podemos usar constructores, atributos
        * y métodos "protected" de la clase padre, aunque estemos en
        * otro paquete. */
        super();
        this.atribProtected = "valor";
        super.metodoProtected();
    }
}
