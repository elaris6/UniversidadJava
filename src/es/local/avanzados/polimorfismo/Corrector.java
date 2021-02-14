package es.local.avanzados.polimorfismo;

public class Corrector extends Editor {

    private int velocidadCorreccion;

    public Corrector(String nombre, double sueldo, TipoLiteratura tipoLiteratura, int velocidadCorreccion) {
        super(nombre, sueldo, tipoLiteratura);
        this.velocidadCorreccion = velocidadCorreccion;
    }

    public int getVelocidadCorreccion() {
        return velocidadCorreccion;
    }

    public void setVelocidadCorreccion(int velocidadCorreccion) {
        this.velocidadCorreccion = velocidadCorreccion;
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles()+ " Velocidad: "+this.getVelocidadCorreccion();
    }
}
