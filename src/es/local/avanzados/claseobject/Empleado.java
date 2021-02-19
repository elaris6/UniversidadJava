package es.local.avanzados.claseobject;

import java.util.Objects;

public class Empleado {

    protected String nombre;
    protected double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String obtenerDetalles(){
        return "Nombre: "+this.nombre+" Sueldo: "+this.sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }


     /* Para realizar comparación de objetos mediante el método "equals" será necesario implementar
     * dicho método heredado de la clase "Object", aplicando la lógica necesaria para determinar si
     * dos objetos son o no iguales.
     *
     * Podemos implementar nuestra propia lógica funcional para realizar la comparación.
     * Los IDE pueden autoimplementar el método "equals", pero en este caso cada uno usa
     * su propia lógica.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Double.compare(empleado.sueldo, sueldo) == 0 && nombre.equals(empleado.nombre);
    }

    /* Las buenas prácticas recomiendan que siempre que se implemente el método "equals", se implemente
     * también el método "hasCode", que debe proporcionar un "int" lo más único posible en base un
     * cálculo sobre los atributos de la clase. */
    @Override
    public int hashCode() {
        return Objects.hash(nombre, sueldo);
    }
}
