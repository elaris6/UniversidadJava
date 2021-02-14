package es.local.avanzados.modificadoresacceso.paquete1;

/* "private" no se puede aplicar como modificador de acceso sobre clases. */
public class Clase1Private {

    /* No se puede modificar desde otras clases, bajo ninguna circunstancia.
    * Solo podrán accederse mediante getter y setters. */
    private String atribPrivate;

    /* Un constructor "private" solo podrá usarse dentro de la clase en
    * la que se define. */
    private Clase1Private(){
        this.atribPrivate = "privadito";
        System.out.println("Constructor private clase private.");
    }

    /* Creamos un constructor public para poder tener una clase hija. */
    protected Clase1Private(String arg1){
        this(); // Desde la propia clase si podemos llamar al constructor "private".
        System.out.println("Constructor public de la clase private.");
    }

    /* Un método "private" solo podrá usarse dentro de la clase en
     * la que se define. */
    private void metodoPrivate(){
        System.out.println("Método private.");
    }

    /* Mediante los getter y setter se podrá acceder a los atributos "private"
    * desde fuera de la clase padre. */
    public String getAtribPrivate() {
        return this.atribPrivate;
    }

    public void setAtribPrivate(String atribPrivate) {
        this.atribPrivate = atribPrivate;
    }
}
