package es.local.avanzados.interfaces;

/* Implementando una "interface" en una clase con la palabra reservada "implements",
 * lo que hacemos es obligar a esa clase a implementar el comportamiento definido
 * en la interfaz, salvo que dicha clase sea abstracta. */

public class ImplementacionOracle implements IAccesoDatos {

    /* Aunque se informe la anotación "@Override" no se está sobreescribiendo
     * sino implementando por primera vz el método. */
    @Override
    public void insertar() {
        System.out.println("Insertar registros en Oracle");
    }

    @Override
    public void listar() {
        System.out.println("Listar registros de Oracle");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar registros Oracle");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar registros Oracle");
    }
}
