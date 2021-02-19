package es.local.avanzados.excepciones;


/* LANZAR EXCEPCIONES */

public class Aritmetica {

    /* Si se construye un método que incluya el lanzamiento de una excepción de forma controlada,
    * es necesario informar en la firma del método esta posibilidad mediante la palabra reservada
    * "throws" seguida del tipo de excepción que será lanzada. */
    public static int division(int dividendo, int divisor) throws OperacionExcepcion{
        if (divisor == 0){
            /* Es posible forzar el lanzamiento de una excepción mediante la palabra reservada "throw",
             * que deberá ir acompañada del tipo de excepción que debe lanzar, creando un nuevo objeto
             * de esa clase de excepción. */
            throw new OperacionExcepcion("División entre cero no permitida.");
        } else return dividendo / divisor;
    }

    public static int multiplicacion(int multiplicando, int multiplicador) throws OperacionExcepcionRuntime{

        if (multiplicador > 100000){
            throw new OperacionExcepcionRuntime("Operación con resultado demasiado grande.");
        } else return multiplicando * multiplicador;
    }
}
