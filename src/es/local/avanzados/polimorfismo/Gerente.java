package es.local.avanzados.polimorfismo;

public class Gerente extends Empleado{

    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento){
        // Si se usa "super", debe ser la primera línea del constructor
        super(nombre,sueldo);
        this.departamento = departamento;
    }

    /* La anotación "@Override" es opcional, pero ayuda a interpretar
    * al compilador que el método está siendo sobreescrito, no hace nada
    * por si mismo.
    * Cuando se sobrbeescribe un método, este no puede tener un modificador
    * de acceso más restrictivo que el de la clase padre. Puede tenerlo
    * igual o menos restrictivo. */
    @Override
    public String obtenerDetalles(){
        /* Desde el método sobreescrito podemos llamar al método original
        * añadiendo en este caso lo que se considere oportuno. */
        return super.obtenerDetalles() + " Departamento: "+this.departamento;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
