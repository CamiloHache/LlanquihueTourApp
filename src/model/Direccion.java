package model;
import utils.Validador;

public class Direccion {
    private String calle;
    private String ciudad;

    public Direccion(String calle, String ciudad) throws Exception {
        Validador.validarTexto(calle, "Calle");
        Validador.validarTexto(ciudad, "Ciudad");
        this.calle = calle;
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return calle + ", " + ciudad;
    }
}