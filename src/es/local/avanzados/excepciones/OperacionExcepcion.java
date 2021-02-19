package es.local.avanzados.excepciones;

/* EXCEPCIÓN PERSONALIZADA */

/* Es posible crear excepciones personalizadas que hereden de "Exception".
* Antiguamente todas las excepción se recomendaba declararlas heredando
* de "Exception" para que el código fuese más seguro, pero resultaba en
* un código mucho más grande en muchos casos sin necesidad. */

public class OperacionExcepcion extends Exception {

    /* Normalmente lo primero que se hace cuando se crea una excepción personalizada
    * es mandar un mensaje de excepción hacia el constructor de la clase padre. */
    public OperacionExcepcion(String mensaje){
        super(mensaje);
    }
}
