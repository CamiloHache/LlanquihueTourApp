package model;

public class Tour {

    private String nombreTour;
    private String tipoTour;
    private int precio;

    public Tour(String nombreTour, String tipoTour, int precio) {
        this.nombreTour = nombreTour;
        this.tipoTour = tipoTour;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTipoTour() {
        return tipoTour;
    }

    public void setTipoTour(String tipoTour) {
        this.tipoTour = tipoTour;
    }

    public String getNombreTour() {
        return nombreTour;
    }

    public void setNombreTour(String nombreTour) {
        this.nombreTour = nombreTour;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "nombreTour='" + nombreTour + '\'' +
                ", tipoTour='" + tipoTour + '\'' +
                ", precio=" + precio +
                '}';
    }
}
