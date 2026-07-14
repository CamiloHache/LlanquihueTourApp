package model;

public class ServicioTuristico implements Registrable {
    private String nombre;
    private int duracionTour;

public ServicioTuristico(String nombre, int duracionTour) {
    this.nombre = nombre;
    this.duracionTour = duracionTour;
}

    public String getNombre() {
    return nombre;
    }

    public void setNombre(String nombre) {
    this.nombre = nombre;
    }

    public int getDuracionTour() {
    return duracionTour;
    }

    public void setDuracionTour(int duracionTour) {
    this.duracionTour = duracionTour;
    }

    public void mostrarInformacion (){
        System.out.println("Nombre del tour: " + nombre + ", duración: " + duracionTour + " horas.");
    }

    @Override
    public void mostrarResumen() {
        System.out.println(
                "Servicio: " + nombre +
                        " | Duración: " + duracionTour + " hrs"
        );
    }

    @Override
    public String toString() {
        return "ServicioTuristico{" +
                "nombre='" + nombre + '\'' +
                ", duracionTour=" + duracionTour +
                '}';
    }
}
