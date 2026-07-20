package model;

public class Vehiculo implements Registrable {
    private String patente;
    private int capacidadPasajeros;

    public Vehiculo(String patente, int capacidadPasajeros) {
        this.patente = patente;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public String getPatente() { return patente; }
    public int getCapacidadPasajeros() { return capacidadPasajeros; }

    @Override
    public String obtenerResumen() {
        return "Vehículo ---> Patente: " + patente + " | Capacidad Pasajeros: " + capacidadPasajeros;
    }

    @Override
    public String toString() {
        return obtenerResumen();
    }
}