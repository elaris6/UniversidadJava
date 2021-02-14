package es.local.practicas.mundopc;

public class DispositivoEntrada {

    private final String tipoEntrada;
    private final String marca;

    public DispositivoEntrada(String tipoEntrada, String marca) {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DispositivoEntrada{");
        sb.append("tipoEntrada='").append(tipoEntrada).append('\'');
        sb.append(", marca='").append(marca).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
