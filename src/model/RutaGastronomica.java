package model;

public class RutaGastronomica extends ServicioTuristico {
    private int numeroParadas;

    public RutaGastronomica(String nombre, int duracionTour, int numeroParadas) {
        super(nombre, duracionTour);
        this.numeroParadas = numeroParadas;
    }

    @Override
    public String toString() {
        return "RutaGastronomica{" +
                "numeroParadas=" + numeroParadas +
                '}';
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Numero de paradas: " + numeroParadas);
    }
}