package model;

public class Tour {

    private String nombreTour;
    private String tipoTour;
    private int precio;
    private GuiaTuristico guiaAsignado; //Esto viene en composición de la clase Guia

    public Tour(String nombreTour, String tipoTour, int precio, GuiaTuristico guiaAsignado) {
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
    public GuiaTuristico getGuiaAsignado() {

        return guiaAsignado;
    }
    public void setGuiaAsignado(GuiaTuristico guiaAsignado) {

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
