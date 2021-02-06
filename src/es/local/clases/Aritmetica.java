package es.local.clases;

public class Aritmetica {

    // ATRIBUTOS
    /* Al declarar los atributos de una clase no se permite hacerlo como
    "var", ni aunque se les inicialice con un valor. */
    int a;
    int b;

    // CONSTRUCTORES

    /* El CONSTRUCTOR se crea por defecto. Solo es necesario informarlo si
    * deseamos mantenerlo a pesar de haber creado un constructor personalizado.
    * Tener más de un constructor se denomina SOBRECARGA DE CONSTRUCTORES. */
    public Aritmetica() {
    }

    /* CONSTRUCTOR personalizado que nos permite inicializar los atributos en
    * el momento de instanciar la clase. */
    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // METODOS
    /* La primera línea en la que se indica el modificador de acceso, el tipo de
    * retorno y los argumentos se llama FIRMA DEL METODO. */

    // Método que no retorna nada. Esto se indca con salida "void".
    public void sumar(){
        int resultado = a + b;
        System.out.println("La suma es: "+resultado);
    }

    // Método que retorna un valor de tipo "int".
    public int getSuma(){
        return a + b;
    }

    /* Método que recibe argumentos.
    * No se permite usar "var" en los argumentos, pues la inferencia de tipos podría
    * dar problemas en tiempo de ejecución.
    * Podemos usar el mismo nombre de método, al poder diferenciarse por los argumentos
    * que reciben.
    * Tener más de un método con el mismo nombre se denomina SOBRECARGA DE METODOS. */
    public int getSuma(int a, int b){
        /* Cuando estamos del lado de la llamada los valores se denominan PARAMETROS.
        * Cuando estamos del lado del método, los valores se denominan ARGUMENTOS. */

        this.a = a; // El argumento "a", se asigna al atributo "this.a"
        this.b = b;
        //Podríamos en este punto llamar al método que ya hace uso de los atributos
        return getSuma();
        //return a + b;

        // Podríamos no inicializar los atributos y usar directamente los argumentos
        //return arg1 + arg2;
    }
}
