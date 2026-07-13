package model;

public class Vehiculo implements Registrable{
    private String patente;
    private int capacidadPasajeros;

    public Vehiculo(String patente, int capacidadPasajeros) {
        this.patente = patente;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public String getPatente() {return patente;}
    public int getCapacidadPasajeros() {return capacidadPasajeros;}

    @Override
    public void registrar() {
        System.out.println("[VEHICULO REGISTRADO CORRECTAMENTE] Patente: " + patente + ", Capacidad de pasajeros: " + capacidadPasajeros);
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", capacidadPasajeros=" + capacidadPasajeros + '}';
    }
}
