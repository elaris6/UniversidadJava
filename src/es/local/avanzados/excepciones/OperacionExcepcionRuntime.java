package es.local.avanzados.excepciones;

/* EXCEPCIÓN PERSONALIZADA */

/* Es posible crear excepciones personalizadas que hereden de "RuntimeException".
* Actualmente las buenas prácticas son declarar las excepciones personalizadas como
* "RuntimeException" y controlando el lanzamiento de excepciones únicamente en los
* puntos en los que sea necesario, para hacer el código menos pesado y más legible. */
public class OperacionExcepcionRuntime extends RuntimeException {

    /* Normalmente lo primero que se hace cuando se crea una excepción personalizada
     * es mandar un mensaje de excepción hacia el constructor de la clase padre. */
    public OperacionExcepcionRuntime(String mensaje){
        super(mensaje);
    }
}
