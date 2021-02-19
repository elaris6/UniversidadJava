package es.local.avanzados.excepciones;

/* EXCEPCIONES */

/* El control de excepciones o errores en tiempo ejecución se realiza mediante un bloque
* de control usando las palabras reservadas "try" y "catch".
* Dentro edl bloque "try" se incluye el código que podría resultar en una excepción y
* en el bloque "catch" se intenta capturar la excepción y se realizan las acciones
* que se consideren oportunas en caso de haberse producido dicha excepción. */

/* La clase padre de todas las excepciones es "Throwable", pero ésta no será normalmente
* usada, usando en su lugar como excepción más genérica la clase "Exception".
* Existen clases del api estándar de Java que heredan directamente de la clase "Exception"
* Estas clases se conocen como "check exception" (excepción comprobada) y para ellas el
* compilador obliga a agregar un bloque "try catch". Se pueden crear clases personalizadas
* que hereden de "Exception".
* Por otro lado están las clases genéricas de java que heredan de "RuntimeException", que
* se denominan "unchecked exception" (excepciones no comprobadas) y para ellas el compilador
* no obliga a incluir un bloque "try catch", pudiendo si no se hace, resultar en errores en
* tiempo de ejecución.*/

public class TestExcepciones {

    public static void main(String[] args) {

        /* Es necesario declarar e inicializar FUERA del bloque "try catch" las variables
        * que vayan a ser usadas fuera de este, ya que si se produce la excepción, éstas
        * podrían no ser creadas o inicializadas.  */
        var resultado = 0;

        try{
            resultado = 10/0;

        } catch (Exception e){
            /* Para imprimir la traza de la cola del error se usa el método "printStackTrace"
            * sobre el objeto excepción.
            * Es buena práctica indicar que la salida será hacia "System.out", pero no es
            * obligatorio.  */
            e.printStackTrace(System.out);

            /* Si no se requiere enviar la cola completa del error y solo se quiere informar
            * el mensaje, se puede imprimir la salida del método "getMessage" sobre el objeto
            * de excepción. */
            System.out.println(e.getMessage());
        }
        System.out.println("resultado = " + resultado);

        try {
            Aritmetica.division(10,0);
        } catch (OperacionExcepcion e){
            e.printStackTrace(System.out);

            /* En caso de una clase de excepción personalizada, este mensaje es el enviado a
            * la clase padre. */
            System.out.println(e.getMessage());
        }
        System.out.println("resultado = " + resultado);

        /* El la estructura de un bloque "try catch" se pueden añadir bloques "catch" adicionales
         * para capturar más tipos de excepciones, en el caso de querer controlar varios tipos de
         * excepciones producidas en el bloque "try". En caso de tener varios bloques "catch" se
         * deben declarar con las excepciones de menor a mayor prioridad. */
        try {
            resultado = Aritmetica.multiplicacion(56,8);
        } catch (OperacionExcepcionRuntime e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            e.printStackTrace(System.out);
        }
        /* En una estructura "try catch" también es posible usar un bloque especial "finally" que
        * SIEMPRE será ejecutado.
        * El uso habitual de este bloque es cerrar recursos que pudieran quedar abiertos durante
        * la ejecución del bloque "try" como conexiones a BBDD o ficheros. */
        finally {
            System.out.println("El resultado es: " + resultado);
        }
    }
}
