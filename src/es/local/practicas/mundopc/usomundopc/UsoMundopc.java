package es.local.practicas.mundopc.usomundopc;

import es.local.practicas.mundopc.*;

public class UsoMundopc {

    public static void main(String[] args) {

        Teclado tec1 = new Teclado("teclas","Razer");
        Teclado tec2 = new Teclado("teclas","Ozone");
        Teclado tec3 = new Teclado("teclas","Corsair");

        Raton rat1 = new Raton("puntero","Glorious");
        Raton rat2 = new Raton("puntero","Razer");
        Raton rat3 = new Raton("puntero","Logitech");

        Monitor mon1 = new Monitor("Dell",31.6);
        Monitor mon2 = new Monitor("Asus",27.0);
        Monitor mon3 = new Monitor("Samsung",34.0);

        Computadora compu1 = new Computadora("SuperPC",mon1,tec1,rat1);
        Computadora compu2 = new Computadora("MegaPC",mon2,tec2,rat2);
        Computadora compu3 = new Computadora("HyperPC",mon3,tec3,rat3);

        Orden orden1 = new Orden();

        orden1.agregarComputadora(compu1);
        orden1.agregarComputadora(compu2);
        orden1.agregarComputadora(compu3);

        orden1.mostrarOrden();


    }
}
