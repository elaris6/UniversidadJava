package es.local.herencia.clases;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Cliente extends Persona{

    private final int idCliente;
    private boolean vip;
    private final Date fechaRegistro;
    private static int contadorId;

    public Cliente(String nombre) {
        /* Si se desea incluir un constructor de la clase padre, obligatoriamente
         * será informado en la primera posición del constructor. */
        super(nombre);
        this.idCliente = Cliente.contadorId++;
        this.vip = false;
        this.fechaRegistro = new Date();
    }

    public int getIdCliente() {
        return idCliente;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", vip=").append(vip);
        /* Agregamos una instancia de clase "SimpleDateFormat" para mostrar
        * el atributo fechaRegistro en un formato más sencillo al imprimir. */
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
        sb.append(", fechaRegistro=").append(formatoFecha.format(this.fechaRegistro));
        /* Agrgamos la información de los atributos heredados mediante el método
        * "toString" de la clase padre "Persona". */
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
