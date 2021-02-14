package es.local.avanzados.polimorfismo;

public class testCasting {

    public static void main(String[] args) {

        /* El CASTING es la conversión de una clase en otra compatible. */

        /* Asignar a una variable que almacena una referencia a un tipo padre,
        * una variable a una referencia de un tipo hijo se conoce como
        * "DOWNCASTING". */

        /* Asignar a una variable que almacena una referencia a un tipo hijo,
        * una variable a una referencia de un tipo padre se conoce como
        * "UPCASTING". */


        Empleado emp1 = new Empleado("Juan",1500);
        Editor edi1 = new Editor("Rubén",2000,TipoLiteratura.NOVELA);
        Corrector cor1 = new Corrector("Pepe", 1800,TipoLiteratura.CLASICA,200);

        /* Polimorfismo con "upcasting". No es necesario hacer una conversión
        * específica. */
        Empleado emp;
        emp = cor1;
        //emp = (Empleado) cor1; --> implícito
        /* Podemos acceder al método sobreescrito directamente porque es común
        * a ambas clases. */
        System.out.println(emp.obtenerDetalles());
        /* Sin embargo, para acceder a un método específico de la clase hija
        * será necesario hacer un casting (downcasting).  */
        System.out.println(((Corrector) emp).getVelocidadCorreccion());

        /* Polimorfismo con "downcasting". En este caso es neceasario hacer
        * la conversión explícita. */
        Corrector corr;
        corr = (Corrector) emp1;


    }
}
