package es.local.avanzados.modificadoresacceso.paquete1;

import es.local.avanzados.modificadoresacceso.paquete2.ClaseHIjaClase1Protected;

public class ClaseHijaClase1Default extends Clase1Default{

    public ClaseHijaClase1Default(){
        // Podemos llamar al constructor de la clase padre al estar en el mismo paquete
        super();
        // Podemos usar un atributo default de la clase padre al estar en el mismo paquete
        this.atribDefault = "valor";
        // Podemos usar un método defualt de la clase padre al estar en el mismo paquete
        super.motodoDefault();
    }
}
