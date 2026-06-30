package model;

public class PaseoLacustre extends ServicioTuristico {
    private String tipoEmbarcacion;

    public PaseoLacustre(String codigo, String nombre, double precioBase, String tipoEmbarcacion) {
        super(codigo, nombre, precioBase);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo de embarcación: " + tipoEmbarcacion;
    }
}
