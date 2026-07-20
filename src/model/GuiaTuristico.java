package model;

public class GuiaTuristico implements Registrable {
    private String nombre;
    private String idioma;
    private int experienciaAnios;
    private Rut rut;
    private Direccion direccion;

    public GuiaTuristico(String nombre, String idioma, int experienciaAnios, Rut rut, Direccion direccion) {
        this.nombre = nombre;
        this.idioma = idioma;
        this.experienciaAnios = experienciaAnios;
        this.rut = rut;
        this.direccion = direccion;
    }

    public String getNombre() { return nombre; }
    public String getIdioma() { return idioma; }
    public int getExperienciaAnios() { return experienciaAnios; }

    @Override
    public String obtenerResumen() {
        return "Guía: " + nombre + " (RUT: " + rut + ") | Idioma: " + idioma + " | Exp: " + experienciaAnios + " años | Dir: " + direccion;
    }

    @Override
    public String toString() {
        return obtenerResumen();
    }
}