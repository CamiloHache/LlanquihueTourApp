package model;

/**
 * clase para representar al Guia turistico
 */

public class GuiaTuristico implements Registrable{
    private String nombre;
    private String idioma;
    private int experienciaAnios;

    public GuiaTuristico(String nombre, String idioma, int experienciaAnios) {
        this.nombre = nombre;
        this.idioma = idioma;
        this.experienciaAnios = experienciaAnios;
    }

    public String getNombre() {

        return nombre;
    }
    public void setNombre(String nombre) {

        this.nombre = nombre;
    }
    public String getIdioma() {

        return idioma;
    }
    public void setIdioma(String idioma) {

        this.idioma = idioma;
    }
    public int getExperienciaAnios(){

        return experienciaAnios;
    }
    public void setExperienciaAnios(int experienciaAnios){

        this.experienciaAnios = experienciaAnios;
    }

    @Override
    public void mostrarResumen() {
        System.out.println(
                "Guía: "
                        + nombre
                        + " | Idioma: "
                        + idioma
                        + " | Experiencia: "
                        + experienciaAnios
                        + " años"
        );
    }

    @Override
    public String toString() {
        return "Guia{" + "nombre=" + nombre + ", idioma=" + idioma + ", experienciaAnios=" + experienciaAnios + '}';
    }
}
