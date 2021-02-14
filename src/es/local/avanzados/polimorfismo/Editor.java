package es.local.avanzados.polimorfismo;

public class Editor extends Empleado {

    protected final TipoLiteratura tipoLiteratura;

    public Editor(String nombre, double sueldo, TipoLiteratura tipoLiteratura) {
        super(nombre, sueldo);
        this.tipoLiteratura = tipoLiteratura;
    }

    public TipoLiteratura getTipoLiteratura() {
        return tipoLiteratura;
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles()+ " Tipo literatura: "+this.getTipoLiteratura();
    }
}
