package model; //Agregamos el package que se me pasó en el trabajo de la semana 3

public class Tour {

    private String nombreTour;
    private String tipoTour;
    private int precio;
    private Guia guiaAsignado; //Esto viene en composición de la clase Guia

    public Tour(String nombreTour, String tipoTour, int precio, Guia guiaAsignado) {
        this.nombreTour = nombreTour;
        this.tipoTour = tipoTour;
        this.precio = precio;
        this.guiaAsignado = guiaAsignado;
    }

    public String getNombreTour() {
        return nombreTour;
    }
    public void setNombreTour(String nombreTour) {
        this.nombreTour = nombreTour;
    }
    public String getTipoTour() {
        return tipoTour;
    }
    public void setTipoTour(String tipoTour) {
        this.tipoTour = tipoTour;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public Guia getGuiaAsignado() {
        return guiaAsignado;
    }
    public void setGuiaAsignado(Guia guiaAsignado) {
        this.guiaAsignado = guiaAsignado;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "nombreTour='" + nombreTour + '\'' +
                ", tipoTour='" + tipoTour + '\'' +
                ", precio=" + precio +
                ", guiaAsignado=" + guiaAsignado +
                '}';
    }
}
