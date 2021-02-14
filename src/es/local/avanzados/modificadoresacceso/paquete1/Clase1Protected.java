package es.local.avanzados.modificadoresacceso.paquete1;

/* NO se puede aplicar "protected" sobre una clase. */
public class Clase1Protected {

    /* Un atributo "protected" podrá ser accedido desde la clase padre, como
     * desde las clases hijas dentro del mismo paquete. */
    protected String atribProtected;

    /* Un constructor "protected" solo podrá usarse desde las clases hijas. */
    protected Clase1Protected(){
        System.out.println("Constructor protected.");
    }

    public Clase1Protected(String arg1){
        System.out.println("Constructor public de la clase Clase1Protected. "+arg1);
    }

    /* Un método "protected" se podrá usar solo de las clases hijas. */
    protected void metodoProtected() {
        System.out.println("Método protected.");

    }
}