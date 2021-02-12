package es.local.herencia.clases;

public class ClaseMetodoFinal {

    protected int atribNormal = 0;
    public final static int ATRIB_FINAL = 10;

    public void metodoHeredable (String s){
        System.out.println("Impreso desde metodoHeredable de la clase ClaseMetodoFinal = " + s);
    }

    public final void metodoFinal(String s){
        System.out.println("Impreso desde metodoFinal de la clase ClaseMetodoFinal = " + s);
    }
}
