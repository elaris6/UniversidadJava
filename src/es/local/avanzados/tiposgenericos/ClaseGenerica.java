package es.local.avanzados.tiposgenericos;

/* TIPOS GENERICOS */

/* Los tipos genéricos en Java podrían asociarse a un tipo comodín,
* pues permiten no especificar un tipo concreto, hasta el momento en que
* sea necesario su uso, cumpliendo el objetivo de hacer programación
* genérica y reutilizable. */
/* Existen diferentes nomenclaturas, que son orientativas:
* - E. Element. Usado para colecciones generalmente.
* - T. Type. Representa una clase genérica.
* - K. Key. Representa una llave o clave.
* - V. Value. Representa un valor.
* - S, U... etc. Existen otras nomenclaturas. */

/* Para definir una clase como genérica, indicaremos entre pico paréntesis
* el indicador "T", para un tipo genérico. */
public class ClaseGenerica <T>{

    /* Definimos un atributo de tipo genérico. */
    T objeto;

    /* Inicializamos el objeto en el constructor de la clase.
    * En esta inicialización se hace de forma automática un autoboxing. */
    public ClaseGenerica(T objeto){
        this.objeto = objeto;
    }

    /* Método ejemplo para obtener e imprimir el tipo usado en la clase. */
    public void getTipo(){
        System.out.println("El tipo es: " + objeto.getClass().getSimpleName());
    }

}
