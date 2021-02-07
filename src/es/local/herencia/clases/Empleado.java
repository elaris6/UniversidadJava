package es.local.herencia.clases;

/* HERENCIA */
/* Para indicar que una clase hereda de otra superior, se usa la palabra reservada
* "extends" seguida del nombre de la clase a heredar. En Java no existe el concepto
* de herencia múltiple como en otros lengajes, pero se puede conseguir un efecto
* similar con el uso de interfaces.
* Si no se informa herencia, el compilador informa de manera automática la
* herencia de la clase universal "extends Object". */
public class Empleado extends Persona{

    /* Si la clase no va a tener otras clases hijas, es buena práctica que sus
    * atributos de clase se definan como private para mayor seguridad.
    * No habría problema en definirlos como "protected", pero se dejarían más
    * expuestos. */

    /* Agregamos el modificador "final", que tiene como función hacer un
    * atributo no modificable tras la creación de la instancia del objeto. */
    private final int idEmpleado;
    private double sueldo;
    /* Al no inicializarlo, por defecto el contador se inicializará con valor 0.*/
    private static int contadorId;

    /* Los constructores no se heredan, pero se pueden acceder a través de la
    * palabra reservada "super".
    * Auqnue no se hereden los constructores personalizados, el constructor
    * vacío por defecto, siempre será usable. */

    public Empleado(String nombre, double sueldo) {
        /* Si se desea incluir un constructor de la clase padre, obligatoriamente
         * será informado en la primera posición del constructor. */
        super(nombre);
        /* Dependiendo de si pre-incrementamos o pos-incrementamos el contador,
        * el primer objeto se creará con valor 0 ó 1. */
        this.idEmpleado = Empleado.contadorId++;
        this.sueldo = sueldo;
    }

    public Empleado(String nombre, char genero, int edad, String direccion, int idEmpleado, double sueldo) {
        /* Si se desea incluir un constructor de la clase padre, obligatoriamente
        * será informado en la primera posición del constructor. */
        super(nombre, genero, edad, direccion);
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        /* Para optimizar el uso d3e cadenas se puede usar el método "append" de la
        * clase "string", a través de un clase hija llamada "StringBuilder" que
        * realiza las concatenaciones.
        * La opcimización se debe a que los Objetos de tipo "String" son inmutables,
        * no se pueden modificar, por lo que si concatenamos con "+", en realidad se
        * están creando constantemente nuevos objetos en memoria.
        * Mediante la clase "StringBuilder" se evita este problema. */
        final StringBuilder sb = new StringBuilder("Empleado{");
        sb.append("idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        /* Agregamos a mano la impresión de los atributos de la clase padre invocando
        * el método "toString" de la clase padre junto con la palabra reservada
        * "super". */
        sb.append(super.toString());
        sb.append('}');
        /* Para devolver un string es necesario invocar el método "toString" sobre
        * variable de tipo "StringBuilder". */
        return sb.toString();
    }
}
