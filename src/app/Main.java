package app; //Agregamos el package que se me pasó en el trabajo de la semana 3

import service.GestorDatos;
import model.Tour;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Despliegue de app con menú interactivo básico con función de búsqueda y filtrado
 */

public class Main {
   public static void main(String[] args) {
       GestorDatos gestor = new GestorDatos();
       String ruta = "resources/tours.txt";
       Scanner scanner = new Scanner(System.in);

       System.out.println("==========================================");
       System.out.println("   SISTEMA DE GESTIÓN: LLANQUIHUE TOUR    ");
       System.out.println("==========================================");

       ArrayList<Tour> tours = gestor.cargarToursDesdeArchivo(ruta);

       int opcion = -1;
       while (opcion!= 4) {
           System.out.println("\n--- MENÚ DE OPERACIÓNES ---");
           System.out.println("1.- Mostrar catálogo de tours");
           System.out.println("2.- Buscar por tipo de tour");
           System.out.println("3.- Buscar por precio");
           System.out.println("4.- Salir");
           System.out.println("Selecciones una opción: ");

           try{
               opcion = Integer.parseInt(scanner.nextLine().trim());

               switch (opcion) {
                   case 1:
                       System.out.println("\n---CATÁLOGO DE TOURS DISPONIBLES ---");
                       if(tours.isEmpty()) {
                           System.out.println("No hay tours disponibles en el momento.");
                       } else {
                           for (Tour t : tours) {
                               System.out.println(t);
                           }
                       }
                       break;

                   case 2:
                       System.out.print("\nIngrese el tipo de tour a buscar (ej: Aventura, Cultural, Navegación): ");
                       String tipoBusqueda = scanner.nextLine().trim();
                       System.out.println("\n--- RESULTADOS DE BÚSQUEDA ---");
                       boolean encontradoTipo = false;
                       for (Tour t : tours) {
                           if (t.getTipoTour().equalsIgnoreCase(tipoBusqueda)) {
                               System.out.println(t);
                               encontradoTipo = true;
                           }
                       }
                       if (!encontradoTipo) {
                           System.out.println("No se encontraron tours del tipo: " + tipoBusqueda);
                       }
                       break;

                   case 3:
                       System.out.print("\nIngrese su presupuesto máximo en pesos ($): ");
                       int presupuesto = Integer.parseInt(scanner.nextLine().trim());
                       if (presupuesto < 0) {
                           System.out.println("⚠️ El presupuesto no puede ser un valor negativo.");
                           break;
                       }
                       System.out.println("\n--- TOURS COMPATIBLES CON SU PRESUPUESTO ---");
                       boolean encontradoPrecio = false;
                       for (Tour t : tours) {
                           if (t.getPrecio() <= presupuesto) {
                               System.out.println(t);
                               encontradoPrecio = true;
                           }
                       }
                       if (!encontradoPrecio) {
                           System.out.println("No hay tours disponibles por ese valor.");
                       }
                       break;

                   case 4:
                       System.out.println("\nSaliendo del gestor Llanquihue Tour. ¡Excelente viaje!");
                       break;

                   default:
                       System.out.println("Opción no válida. Intente entre 1 y 4.");
               }

           } catch (NumberFormatException e) {
               System.out.println("Entrada inválida: Digite únicamente números en el menú.");
           } catch (Exception e) {
               System.out.println("Anomalía detectada: " + e.getMessage());
           }
       }
       scanner.close();
   }
}
