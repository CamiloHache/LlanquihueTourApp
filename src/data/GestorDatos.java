package data; //Agregamos el package que se me pasó en el trabajo de la semana 3

import model.Tour;//Llamamos a la clase tour
import model.GuiaTuristico;
import util.Validador;
import java.io.BufferedReader; //Importamos el buffer para hacer las lecturas
import java.io.FileReader; //Importamos el lector de archivos
import java.io.IOException;
import java.util.ArrayList;

/**
 * Clase para gestionar los datos de los tours
 * Aquí implementamos parsing con pipe (\\|) y manejo de excepciones.
 */
public class GestorDatos {

    public ArrayList<Tour> cargarToursDesdeArchivo(String rutaArchivo) {
        ArrayList<Tour> listaTours = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            int numeroLinea = 0;

            while ((linea = br.readLine()) != null) {
                numeroLinea++;
                if (linea.trim().isEmpty()) continue;

                try {
                    String[] datos = linea.split("\\|");

                    if (datos.length < 6) {
                        throw new Exception("Campos insuficientes en el registro de la linea.");
                    }

                    //Sacamos los datos de la clase Tour
                    String nombreTour = datos[0].trim();
                    String tipoTour = datos[1].trim();
                    int precio = Integer.parseInt(datos[2].trim());

                    //Sacamos los datos de Guia
                    String nombreGuia = datos[3].trim();
                    String idiomaGuia = datos[4].trim();
                    int experienciaGuia = Integer.parseInt(datos[5].trim());

                    //Aquí validamos
                    Validador.validarTexto(nombreTour, "Nombre del Tour");
                    Validador.validarTexto(tipoTour, "Tipo de Tour");
                    Validador.validarPrecio(precio);
                    Validador.validarTexto(nombreGuia, "Nombre del Guía");

                    //Composición
                    GuiaTuristico guia = new GuiaTuristico(nombreGuia, idiomaGuia, experienciaGuia);
                    Tour tour = new Tour(nombreTour, tipoTour, precio, guia);

                    listaTours.add(tour);
                } catch (NumberFormatException e) {
                    System.out.println("Error en línea " + numeroLinea + ": Formato numérico incorrecto en el precio.");
                } catch (Exception e) {
                    System.out.println("Registro descartado en linea " + numeroLinea + ": " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return listaTours;
    }

    }