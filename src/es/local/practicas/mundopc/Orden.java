package es.local.practicas.mundopc;

public class Orden {

    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 5;

    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora compu){

        if (this.contadorComputadoras < Orden.MAX_COMPUTADORAS){
            this.computadoras[this.contadorComputadoras++] = compu;
        }
        else {
            System.out.println("Excedido número máximo de computadoras por orden");
        }
    }

    public void mostrarOrden(){
        if(this.contadorComputadoras > 0){
            System.out.println("\nOrden #: "+this.idOrden);
            System.out.println("Computadoras #: "+this.contadorComputadoras);
            for (int i = 0;i < this.contadorComputadoras; i++){
                System.out.print("Computadora: " + i + " -> ");
                System.out.println(this.computadoras[i]);
            }
        } else {
            System.out.println("La orden está vacía.");
        }

    }
}
