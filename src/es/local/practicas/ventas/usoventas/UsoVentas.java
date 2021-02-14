package es.local.practicas.ventas.usoventas;

import es.local.practicas.ventas.Orden;
import es.local.practicas.ventas.Producto;

public class UsoVentas {

    public static void main(String[] args) {

        Producto p0 = new Producto("Agua",1.50);
        Producto p1 = new Producto("Jarra cerveza",2.50);
        Producto p2 = new Producto("Botellín cerveza",1.75);
        Producto p3 = new Producto("Refresco cola",2.25);
        Producto p4 = new Producto("Refresco limón",2.25);
        Producto p5 = new Producto("Ración bravas",3.50);
        Producto p6 = new Producto("Ración calamares",4.00);
        Producto p7 = new Producto("Ración jamón",5.50);
        Producto p8 = new Producto("Ración queso",3.50);
        Producto p9 = new Producto("Ración croquetas",4.25);

        Producto todosProductos[] = new Producto[10];
        todosProductos[0] = p0;
        todosProductos[1] = p1;
        todosProductos[2] = p2;
        todosProductos[3] = p3;
        todosProductos[4] = p4;
        todosProductos[5] = p5;
        todosProductos[6] = p6;
        todosProductos[7] = p7;
        todosProductos[8] = p8;
        todosProductos[9] = p9;

        /*
        for (Producto p:todosProductos) {
            System.out.println(p);
        }*/

        Orden orden1 = new Orden();
        //orden1.mostrarOrden();
        orden1.agregarProducto(p1);
        orden1.agregarProducto(p1);
        orden1.agregarProducto(p2);
        orden1.agregarProducto(p3);
        orden1.agregarProducto(p5);

        orden1.mostrarOrden();

        Orden orden2 = new Orden();

        orden2.agregarProducto(p1);
        orden2.agregarProducto(p1);
        orden2.agregarProducto(p1);
        orden2.agregarProducto(p1);
        orden2.agregarProducto(p1);
        orden2.agregarProducto(p6);
        orden2.agregarProducto(p8);
        orden2.agregarProducto(p5);
        orden2.agregarProducto(p3);
        orden2.agregarProducto(p7);
        orden2.agregarProducto(p9);
        orden2.agregarProducto(p8);

        orden2.mostrarOrden();
    }
}
