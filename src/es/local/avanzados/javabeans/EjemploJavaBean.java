package es.local.avanzados.javabeans;

import java.io.Serializable;

/* JAVA BEANS */

/* Una clase con ciertas características específicas se denomina "Java Bean" y es usada por
* Java y sus diversos Frameworks para transferir información entre servidores. Por ello, las
* clases que creemos que puedan tener esta finalizada es necesario que sean creadas teniendo
* estas características en cuenta. */

/* Las características son:
* - Implementar la interfaz "Serializable".
* - Los atributos deben ser "private".
* - Implementar un constructor vacío y "public". Puede tener otros constructores también sin problema.
* - Implementar getter y setter para todos los atributos.
*
* NO Obligatorio, pero recomendable:
* - Implementar los métodos: "toString()", "hasCode()" y "equals()" */

/* La implementación de la interfaz "Serializable" es requerida porque los Frameworks avanzados,
* en caso necesario de forma automática convertirán los objetos a serialización de bits transferible
* por la red para comunicar los datos entre servidores. */
public class EjemploJavaBean implements Serializable {

    private String nombre;
    private String apellido;

    public EjemploJavaBean(){}

    public EjemploJavaBean(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "EjemploJavaBean{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
