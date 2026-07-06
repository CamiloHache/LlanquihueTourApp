package model;

public class ExcursionCultural extends ServicioTuristico {
    private String lugarHistorico;

    public ExcursionCultural(String nombre, int duracionTour, String lugarHistorico) {
        super(nombre, duracionTour);
        this.lugarHistorico = lugarHistorico;
    }

    @Override
    public String toString() {
        return super.toString() + "Lugar Historico: " + lugarHistorico;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Lugar Historico: " + lugarHistorico + ".");
    }
}
