package data;

import model.*;
import utils.Validador;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

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
                    if (datos.length < 6) throw new Exception("Campos insuficientes.");

                    String nombreTour = datos[0].trim();
                    String tipoTour = datos[1].trim();
                    int precio = Integer.parseInt(datos[2].trim());
                    String nombreGuia = datos[3].trim();
                    String idiomaGuia = datos[4].trim();
                    int experienciaGuia = Integer.parseInt(datos[5].trim());

                    Validador.validarTexto(nombreTour, "Nombre del Tour");
                    Validador.validarTexto(tipoTour, "Tipo de Tour");
                    Validador.validarPrecio(precio);
                    Validador.validarTexto(nombreGuia, "Nombre del Guía");

                    // Instancias por composición dummy para compatibilidad del archivo antiguo
                    Rut rutDummy = new Rut("11111111-1");
                    Direccion dirDummy = new Direccion("Calle Rural S/N", "Puerto Varas");

                    GuiaTuristico guia = new GuiaTuristico(nombreGuia, idiomaGuia, experienciaGuia, rutDummy, dirDummy);
                    Tour tour = new Tour(nombreTour, tipoTour, precio, guia);

                    listaTours.add(tour);
                } catch (Exception e) {
                    System.out.println("Línea " + numeroLinea + " descartada: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }
        return listaTours;
    }
}