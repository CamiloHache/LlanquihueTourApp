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

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("--> Tipo de embarcación: " + tipoEmbarcacion + ".");
    }
}
