package model;

public class PaseoLacustre extends ServicioTuristico {
    private String tipoEmbarcacion;

    public PaseoLacustre(String nombre, int duracionTour, String tipoEmbarcacion) {
        super(nombre, duracionTour);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    @Override
    public String obtenerResumen() {
        // Combinamos la lógica base de ServicioTuristico con el atributo único de esta clase
        return super.obtenerResumen() + " | Embarcación: " + tipoEmbarcacion;
    }

    // Eliminamos la función mostrar información en función del último feedback
}
