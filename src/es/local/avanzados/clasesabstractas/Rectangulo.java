package es.local.avanzados.clasesabstractas;

public class Rectangulo extends FiguraGeometrica{

    protected Rectangulo(String tipoFigura) {
        super(tipoFigura);
    }

    /* Al heredar de una clase abstracta y no siendo esta clase también abstracta,
    * será obligatorio implementar todos los métodos abstractos de la clase padre.
    *
    * Aunque se puede marcar el método abstracto heredado con la notación "@Override"
    * realmente no estamos sobreescribiendo el método, sino que lo estamos implementando
    * por primera vez.*/
    @Override
    public void dibujar() {
        System.out.println("El tipo de figura es: "+this.getClass().getSimpleName());
    }
}
