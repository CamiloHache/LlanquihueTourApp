package ui; //Agregamos el package que se me pasó en el trabajo de la semana 3
import data.GestorDatos;
import model.Tour;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        GestorDatos gestor = new GestorDatos();
        String ruta = "resources/tours.txt";

        System.out.println("----- CARGANDO DATOS DE LLANQUIHUE TOUR -----");
        ArrayList<Tour> todosLosTours = gestor.cargartours(ruta);

        // Recorremos y mostramos todos los elementos de la colección dinámica
        System.out.println("\n[Catálogo Completo de Tours]:");
        for(Tour t : todosLosTours){
            System.out.println(t);
        }
        int precioFiltro = 60000;
        System.out.println("\n[Filtro] - Tours con valor superior a $" + precioFiltro + ":");
        // Aquí filtramos evaluando el precio de cada tour de cada objeto
        for (Tour t : todosLosTours) {
            if (t.getPrecio() > precioFiltro) {
                System.out.println("- " + t.getNombreTour() + " (" + t.getTipoTour() + ") -> $" + t.getPrecio());
            }
        }

    }
}