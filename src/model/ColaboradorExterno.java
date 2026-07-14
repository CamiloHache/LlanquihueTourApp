package model;

public class ColaboradorExterno implements Registrable{
    private String nombre;
    private String rol;

    public ColaboradorExterno(String nombre, String rol) {
        this.nombre = nombre;
        this.rol = rol;
    }

    @Override
    public void mostrarResumen() {
        System.out.println( "Colaborador: " + nombre + ", Rol: " + rol);
    }

    @Override
    public String toString() {
        return "ColaboradorExterno{" + "nombre=" + nombre + ", rol=" + rol + '}';
    }
}
