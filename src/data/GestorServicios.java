package data;

import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ExcursionCultural;
import model.ServicioTuristico;
import java.util.ArrayList;

public class GestorServicios {

    public ArrayList<ServicioTuristico> obtenerServiciosDePrueba(){

        ArrayList<ServicioTuristico> lista = new ArrayList<>();

        RutaGastronomica rg1 = new RutaGastronomica("Ruta de los curantos", 4, 3);
        lista.add(rg1);
        RutaGastronomica rg2 = new RutaGastronomica("Hornitos de Los Lagos", 2, 3);
        lista.add(rg2);
        PaseoLacustre pl1 = new PaseoLacustre("Ruta de los lagos",8,"Barcarola");
        lista.add(pl1);
        PaseoLacustre pl2 = new PaseoLacustre("Lagos de chile",10,"Bus");
        lista.add(pl2);
        ExcursionCultural ec1 = new ExcursionCultural("Iglesias de Chiloé",12,"Iglesias de Chiloé");
        lista.add(ec1);
        ExcursionCultural ec2 = new ExcursionCultural("Lagos de Chile",15,"Lagos de Chile");
        lista.add(ec2);

        return lista;
    }
}
