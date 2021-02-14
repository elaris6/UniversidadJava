package es.local.avanzados.bloquesinicializacion;


/* Los BLOQUES DE INICIALIZACION pueden ser estáticos y no estáticos.
* Ambos se van a ejecutar antes del constructor.
* No suelen usarse en casos reales, pero es muy importante saber como
* funcionan si se encuentran en un programa. */

public class ClaseEjemplo {

    private final int idClase;
    private static int contadorClase;

    /* Para definir un BLOQUE DE INICIALIZACION STATIC, hay que indicar
    * dentro de la clase la palabra reservada "static" junto con el bloque
    * de código. */
    /* Los bloques de inicialización estáticos se inicializarán antes
    * del constructor y también antes de cualquier bloque de inicialización
    * no estático, pero solo se ejecutarán una vez, al cargar la clase
    * en memoria. */

    static {
        System.out.println("Ejecución bloque ini estático.");
        /* Al estar dentro del contexto estático, en este bloque no se
        * puede usar el identificador "this", pues el objeto o instancia
        * de clase aún no se ha creado. */
        ++ClaseEjemplo.contadorClase;
        /* Tampoco podremos acceder a variables no estáticas por la misma
        * razón. */
        // idClase = 10;
    }

    /* Para definir un BLOQUE DE INICIALIZACION NO STATIC, simplemente se debe
    * abrir y cerrar el bloque de código con las llaves. */
    /* Los bloques de inicialización no estáticos se ejecutarán cada vez que
    * se cree una instancia de la clase, antes de que se ejecute el constructor. */

    {
        System.out.println("Ejecución bloque ini NO estático.");
        /* Al estar dentro del contexto dinámico, en este bloque ya se
         * puede usar el identificador "this", pues el objeto o instancia
         * de clase ya se está creando. */
        this.idClase = ClaseEjemplo.contadorClase++;
    }

    public ClaseEjemplo(){
        System.out.println("Ejecución del constructor de la clase.");
    }

    public int getIdClase(){
        return this.idClase;
    }

}
