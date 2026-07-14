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
    public void mostrarResumen() {
        System.out.println(
                "Vehículo: "
                        + patente
                        + " | Capacidad: "
                        + capacidadPasajeros
        );
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", capacidadPasajeros=" + capacidadPasajeros + '}';
    }
}
