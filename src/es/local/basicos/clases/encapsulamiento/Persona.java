package es.local.basicos.clases.encapsulamiento;

/* ENCAPSULAMIENTO */
public class Persona {

    /* Si aplicamos el modificacor "private" a los atributos de una clase,
    * éstos no podrán ser accedidos desde otra clase ni aunque esté en el
    * mismo paquete.
    * Es una buena práctica aplicar este modificador a los atributos, usando
    * los métodos "getter" y "setter" para leer y modificar respectivamente
    * dichos atributos.
    * Si no se aplica modificador de acceso, el que se aplica por defecto es
    * el "default" o "package", que hace el atributo accesible desde cualquier
    * clase del mismo paquete en el que se define. */
    private String nombre;
    private double sueldo;
    private boolean eliminado;

    public Persona(String nombre, double sueldo, boolean eliminado) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

    /* Los métodos "getter" y "setter" deben tener el modificar "public"
    * para que sea posible usarlos desde cualquier otra clase. */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /* Para un "getter" que devuelve un tipo boolean, la nomenclatura no
    * debe comenzar con "get" sino con "is" al ser una pregunta sobre
    * un boolean que devolverá true/false. */

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    /* Es habitual sobreescribir el método "toString()" de la clase
    * "Object", para dar un formato de salida a la clase si se requiere
    * imprimirla en consola.
    * Ei no lo sobreescribimos, se usara el método de "Object" que imprime
    * por defecto el nombre de la clase y una indicación de la referencia en
    * memoria. */
    public String toString(){
        return "Persona [nombre:"+this.nombre+", sueldo: "+this.sueldo+", eliminado: "+this.eliminado+"]";
    }
}
