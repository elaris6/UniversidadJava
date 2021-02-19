package es.local.avanzados.clasesabstractas;

public class UsoFiguras {

    public static void main(String[] args) {

        // No se pueden instanciar las clases abstractos
        //FiguraGeometrica fig1 = new FiguraGeometrica(); --> Error

        // Aplicamos "upcasting" solo para practicar
        FiguraGeometrica fig1 = new Rectangulo("Figura con 4 lados iguales 2 a 2");
        /* Al invocar un método común, toma prioridad el método de la clase más baja en la
        jerarquía.
         En este caso ni siquiera se podría ejecutar el método de la clase padre al ser
         abstracto. */
        fig1.dibujar();

    }
}
