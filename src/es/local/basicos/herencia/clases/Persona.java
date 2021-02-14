package es.local.basicos.herencia.clases;

public class Persona {

    /* El modificador de acceso "protected" permite que los atributos se
    * hereden. Si se aplicase "private" sobre un atributo, no sería heredable.
    * "protected" permite acceder desde clases de otro paquete.
    * Si no se aplica modificador de acceso, el atributo tendrá el "default" o
    * "package", que permite su uso desde el propio paquete y no lo protege de
    * acceso directo. */
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;

    /* Generamos diferentes constructores para poder instanciar la clase de
    * diversas maneras. */
    public Persona(){
    }

    public Persona(String nombre){
        this.nombre = nombre;
    }

    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", genero=" + genero +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                /* Se añade a mano el método "toString" de la clase padre "Object"
                * para permitir imprimir la referencia de memoria del objeto. */
                ", refMemoria='" + super.toString() + '\'' +
                '}';
    }
}
