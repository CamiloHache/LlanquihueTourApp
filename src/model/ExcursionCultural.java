package model;

public class ExcursionCultural extends ServicioTuristico {
    private String lugarHistorico;

    public ExcursionCultural(String nombre, int duracionTour, String lugarHistorico) {
        super(nombre, duracionTour);
        this.lugarHistorico = lugarHistorico;
    }

    @Override
    public String obtenerResumen() {
        return super.obtenerResumen() + " | Sitio Histórico: " + lugarHistorico;
    }

    @Override
    public String toString() {
        return obtenerResumen();
    }
}
