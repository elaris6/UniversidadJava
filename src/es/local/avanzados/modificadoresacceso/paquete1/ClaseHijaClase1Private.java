package es.local.avanzados.modificadoresacceso.paquete1;

public class ClaseHijaClase1Private extends Clase1Private {

    public ClaseHijaClase1Private() {
        //super(); //No se puede llamar al constructor private.
        super("arg1");

        //this.atribPrivate = "valor"; // No se puede llamar al atributo private.
        //this.metodoPrivate(); // No se puede llamar al atributo private.

        /* Si podemos acceder a un atributo "private" mediante getters y setters. */
        System.out.println(this.getAtribPrivate());
        this.setAtribPrivate("privadote");
        System.out.println(this.getAtribPrivate());
    }
}
