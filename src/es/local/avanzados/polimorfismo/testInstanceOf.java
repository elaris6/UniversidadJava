package es.local.avanzados.polimorfismo;

public class testInstanceOf {

    public static void main(String[] args) {

        Empleado e1 = new Empleado("María",1800);
        Gerente g1 = new Gerente("Juan", 2500,"Contabilidad");
        getTipo(e1);
        getTipo(g1);
    }

    /* Mediante el uso de la palabra reservada INSTANCEOF, se puede determinar
    * si una variable apunta a un tipo en la memoria HEAP.
    * INSTANCEOF devolverá verdadero si la variable apunta al tipo cuestionado
    * o a un tipo más genérico que éste. Por tanto, para realizar el control
    * del flujo siempre se deberá cuestionar desde el tipo más específico
    * primero, yendo hacia el más genérico, pues si no, obtendremos un "true"
    * que puede no ser el esperado. */
    public static void getTipo(Empleado emp){

        if (emp instanceof Gerente ){
            System.out.println("La variable es de tipo Gerente.");
            /* Si se desea manejar algún atributo o método que no estaría disponible
            * en caso de que la variable fuese del tipo más genérico, se debe hacer
            * una invocación o "casting" sobre la variable local, para forzar la
            * conversión al tipo requerido. */
            /* El uso de INSTANCEOF es la forma de hacer un "casting" de forma
            * segura, pues el compilador no puede controlarlo durante la compilación
            * y tendríamos un error en tiempo de ejecución en caso de hacer un
            * "casting" incorrecto, pues este es el principio del plimorfismo.
            * Error "ClassCastException" */
            Gerente ger = (Gerente) emp;
            ger.getDepartamento();

            // También se puede hacer en un solo paso en un "casting" previo
            ((Gerente) emp).getDepartamento();
        }
        if (emp instanceof Empleado){
            System.out.println("La variable es de tipo Empleado.");
            /* Esto se permite en tiempo de compilación, pero daría error en
            * tiempo de ejecución:
            Gerente ger = (Gerente) emp;
            ger.getDepartamento();*/
        }
        if (emp instanceof Object){
            System.out.println("La variable es de tipo Object.");
        }
    }
}
