package model;

public class ColaboradorExterno implements Registrable {
    private String nombre;
    private String rol;
    private Rut rut;

    public ColaboradorExterno(String nombre, String rol, Rut rut) {
        this.nombre = nombre;
        this.rol = rol;
        this.rut = rut;
    }

    public String getNombre() { return nombre; }
    public String getRol() { return rol; }

    @Override
    public String obtenerResumen() {
        return "Colaborador Externo: " + nombre + " (RUT: " + rut + ") | Rol: " + rol;
    }

    @Override
    public String toString() {
        return obtenerResumen();
    }
}