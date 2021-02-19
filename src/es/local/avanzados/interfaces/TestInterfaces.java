package es.local.avanzados.interfaces;

public class TestInterfaces {

    public static void main(String[] args) {

        /* Creamos una variable con el tipo de la interfaz. Uno de los objetivos de la
        * programación en Java es hacerla lo más genérica posible y para ello es
        * preferible que la variable sea del tipo de la interfaz, y luego instanciar
        * las clases que la implementan. */
        IAccesoDatos datos = new ImplementacionMySQL();
        /* Se aplica el polimorfismo ya que el método está definido en la interfaz, pero
        * está realmente implementado en la clase, que será lo que aplique en tiempo de
        * ejecución. */
        datos.insertar();
        imprimir(datos);

        datos = new ImplementacionOracle();
        datos.insertar();
        imprimir(datos);

    }

    /* Aquí también vemos el polimorfismo aplicando interfaces. */
    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
}
