package es.local.avanzados.modificadoresacceso.paquete1;

/* Si no se indica modificador de acceso, se aplica el "default" ó "package"
* que hace que esa clase solo pueda ser usada dentro del mismo paquete. */
class Clase1Default {

    String atribDefault;

    /* Un constructor con modificador "default"/"package" solo puede usarse
    * desde el mismo paquete. */
    Clase1Default(){
        System.out.println("Constructor clase default.");
    }

    /* Un método con modificador "default"/"package" solo puede usarse
     * desde el mismo paquete. */
    void motodoDefault(){
        System.out.println("Método default o package.");
    }

}
