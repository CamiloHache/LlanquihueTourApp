package model;

public class PaseoLacustre extends ServicioTuristico {
    private String tipoEmbarcacion;

    public PaseoLacustre(String nombre, int duracionTour, String tipoEmbarcacion) {
        super(nombre, duracionTour);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    @Override
    public String toString() {
        return "PaseoLacustre{" +
                "tipoEmbarcacion='" + tipoEmbarcacion + '\'' +
                '}';
    }

    // Eliminamos la función mostrar información en función del último feedback
}
