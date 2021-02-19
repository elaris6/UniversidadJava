package es.local.avanzados.clasesabstractas;

/* Clases ABSTRACTAS */

/* Una clase abstracta se define mediante el modificador "abstract" precediendo a "class".
* Una clase abstracta es la que implementa uno o más métodos abstractos.
* Podría no implementar ninguno, pero esto no tiene mucho sentido en general, salvo para
* evitar que una clase se instancie, pues las clases abstractas no se pueden instanciar. */
public abstract class FiguraGeometrica {

    protected String tipoFigura;

    protected FiguraGeometrica(String tipoFigura){
        this.tipoFigura = tipoFigura;
    }

    /* Un método ABSTRACTO es un método declarado en la clase abstracta que no se desarrolla
    * en esta y que deberá ser obligatoriamente sobreescrito en las clases hijas de esta
    * clase abstracta, salvo que la clase hija se declare también como abstracta.
    *
    * El método no incluye cuerpo con un bloque de código y debe terminarse en punto y coma. */
    public abstract void dibujar();

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" +
                "tipoFigura='" + tipoFigura + '\'' +
                '}';
    }
}
