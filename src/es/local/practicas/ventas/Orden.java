package es.local.practicas.ventas;

public class Orden {

    private final int idOrden;
    private Producto productos[];
    /* Esta propiedad no está en el ejercicio, pero sin ella la solución
    * es mucho menos eficiente. */
    private int totalProductos;
    private static int contadorOrdenes;
    private static final int MAX_PRODUCTOS = 10;

    public Orden(){
        this.idOrden = Orden.contadorOrdenes++;
        productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto prod){
        /* Método que recorre el array de productos hasta encontrar
        un hueco vacío e inserta el producto. */
        if(this.totalProductos < Orden.MAX_PRODUCTOS){
            this.productos[totalProductos++] = prod;
        }
        else { 
            System.out.println("No se puede agregar el producto. Máximo de productos alcanzado");
        }
    }

    public double calcularTotal(){
        double total = 0;
        /* Método que recorre el array de productos y suma los importes. */
        for (int i=0;i<this.totalProductos;i++){
            total += this.productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden(){
        /* Método que imprime todos los artúcluos de la orden y el
        * importe total de la misma. */
        System.out.println("\nOrden: "+idOrden+"\n");
        for (int i=0;i<this.totalProductos;i++){
            System.out.println(this.productos[i]);
        }
        System.out.println("\nTotal productos: " + this.totalProductos);
        System.out.println("Importe TOTAL orden: " + this.calcularTotal() + " €\n");
    }
}
