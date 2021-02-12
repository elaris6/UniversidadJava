package es.test.paquetes;

/* Usar el "*" para importar todas las clases de un paquete no supone una mala
* optimización de recursos, porque las clases solo se cargarán en memoria si son
* utilizadas. */

//import es.pruebas.paquetes.*;
//import es.pruebas.paquetes.Utilidades;

/* Podemos importar métodos o atributos estáticos mediante el atributo
* "static" tras "import" e indicando el método o atributo a importar.*/
import static es.pruebas.paquetes.Utilidades.imprimir;



public class TestUtilidades {

    public static void main(String[] args) {

        /* Esto funciona sin problemas si hacemos un "import static", pero
        * puede resultar confuso porque parece un método de la propia clase. */
        imprimir("Esto es una cadena");

        /* También se puede usar la forma totalmente calificado, especificando
        * la ruta completa del método o atributo.
        * No es muy recomendado dentro del código habitualmente porque dificulta
        * la interpretación. */
        es.pruebas.paquetes.Utilidades.imprimir("Esto es otra cadena");

    }
}
