package model;

public class RutaGastronomica extends ServicioTuristico {
    private String tipoComida;

    public RutaGastronomica(String codigo, String nombre, double precioBase, String tipoComida) {
        super(codigo, nombre, precioBase);
        this.tipoComida = tipoComida;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo de Comida: " + tipoComida;
    }
}
