package es.local.basicos.clases;

public class AmbitoAlcanceVariablesUsoMemoria {

    // ATRIBUTOS
    static String atributo;

    /* AMBITO O ALCANCE DE UNA VARIABLE
    *
    * Se denomina ámbito o alcance de una variable, al contexto en el que esa
    * variable existe para el programa. */

    /* Las variables locales se alamacenan en la memoria STACK y las variables
    * de tipo "Object", se almacenan en la memoria HEAP, y se reserva memoria
    * en HEAP para tos sus atributos al instanciar un objeto.
    *
    * Cuando se crea una instancia, en la memoria STACK se crea una variable
    * local con la referencia a la memoria HEAP en la que se almacena dicho
    * objeto/instancia. */

    public static void main(String[] args) {

        /* Variables locales a un método. El final el método "main" es un método especial.
        * Las variables locales se crean y se destriyen cuando se ejecuta y finaliza de
        * ejecutarse un método. */
        int a = 10;
        int b = 7;

        /* Los objetos que se crean en la memoria HEAP deben eliminarse cuando finaliza el
        * método que los ha creado, pero en programas grandes en los que la ejecución es más
        * contínua, el proceso "System.gc()" (garbage collector), se encarga de ir eliminando
        * todos los objetos que ya no están referenciados en la memoria STACK y por ello no
        * están en uso. */
        Aritmetica a1 = new Aritmetica();

        /* Se puede anular la referencia de la memoria STACK de una variable, pero esto no
        * garantiza que sea eliminada y limpiada de la HEAP. No es habitual hacer esto. */
        //a1 = null;

        /* Se puede invocar al garbage collector, pero esto no garantiza que se ejecute ya
        * que es un proceso pesado que debe ser gestionado por otros medios, generalmente
        * por los administradores de sistemas. */
        //System.gc();

        /* Los métodos de tipo "static" solo podrán llamar a otros métodos de tipo "static",
        * o a atributos cuyo modificador de acceso sea "static". */

        atributo = "Nuevo valor";

        /* Las variables locales declaradas en un método, no podrán ser usadas en otro método
        * de la clase.
        * En este punto no tenemos acceso a la variable "a" del método "metodo". */
        metodo();
    }

    public static void metodo(){
        var a = 3; // En este punto no tenemos acceso a la variable "a" del método main.
        var b = 5;

        System.out.println(atributo);
    }
}
