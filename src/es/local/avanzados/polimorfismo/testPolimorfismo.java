package es.local.avanzados.polimorfismo;

public class testPolimorfismo {

    public static void main(String[] args) {

        Empleado e1 = new Empleado("Jesús",1800);
        /* Se usa el método de la clase Empleado */
        System.out.println(e1.obtenerDetalles());

        Gerente g1 = new Gerente("Juan", 2500,"Contabilidad");
        /* Se usa el método de la clase hija Gerente */
        System.out.println(g1.obtenerDetalles());

        /* En este caso el método trata el parámetro como un objeto de tipo
        * "Empleado" y usa el método "obtenerDetalles" de esta clase. */
        imprimir(e1);

        /* En este caso el método trata el parámetro como un objeto de tipo
         * "Gerente" y usa el método "obtenerDetalles" de esta clase. */
        imprimir(g1);

        /* El POLIMORFISMO también aplica directamente sobre la asignación
        * de valores a variables. En el ejemplo siguiente asignamos un
        * tipo hijo, a una variable creada para un tipo padre. */
        e1 = new Gerente("Manuel", 2450,"Ventas");
    }

    /* El POLIMORFISMO es la propiedad que permite a un objeto de una clase,
    * comportarse como si fuese otra de la que hereda y su utilidad es la de
    * hacer los métodos más genéricos y reutilizables.
    * Para aplicar esto, se debe usar como base, la clase más genérica o más
    * elevada en el árbol de herencia de entre las posibles, pero no tiene
    * porque ser la más alta de todas en el árbol, solo de las que se vayan
    * a necesitar. */
    /* El POLIMORFISMO es posible porque la variable realmente solo está
    * almacenando en la memoria STACK, la referencia al espacio reservado
    * en la memoria HEAP donde realmente se crea el objeto, y por tanto,
    * puede admitir atributos y métodos que no tendría si fuese la clase
    * que está un peldaño anterior en la herencia. */
    public static void imprimir(Empleado emp){
        System.out.println("\nImpresión con polimorfismo.");
        /* En tiempo de ejecución. el método que se va a utilizar va a ser
        * el perteneciente a la clase que corresponda, aunque aparentemente
        * se haya definido para una de ellas. */
        /* Si se puede aplicar el polimorfismo entre dos clases se dice que
        * son clases COMPATIBLES. */
        System.out.println("emp = " + emp.obtenerDetalles());
    }
}
