package model;

public class ExcursionCultural extends ServicioTuristico {
    private String idiomaGuia;

    public ExcursionCultural(String codigo, String nombre, double precioBase, String idiomaGuia) {
        super(codigo, nombre, precioBase);
        this.idiomaGuia = idiomaGuia;
    }

    @Override
    public String toString() {
        return super.toString() + ", Idioma del guía: " + idiomaGuia;
    }
}
