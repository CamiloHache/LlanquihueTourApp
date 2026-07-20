package app;
import data.GestorDatos;
import data.GestorServicios;
import model.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GestorDatos gestor = new GestorDatos();
        String ruta = "resources/tours.txt";

        // Carga de datos de la semana anterior
        ArrayList<Tour> toursArchivos = gestor.cargarToursDesdeArchivo(ruta);

        // Acá unificamos las listas para la Semana8
        ArrayList<Registrable> listaAgencia = new ArrayList<>();

        // LLenamos con los servicios de prueba creados en la semana anterior
        GestorServicios gestorSemana7 = new GestorServicios();
        listaAgencia.addAll(gestorSemana7.obtenerServiciosDePrueba());

        // Agregamos objetos instanciados desde la clase vehiculo
        listaAgencia.add(new Vehiculo("KJKW-89", 12));
        listaAgencia.add(new Vehiculo("FTPL-45", 4));
        listaAgencia.add(new ColaboradorExterno("Carlos Díaz", "Chofer"));

        String[] opciones = {
                "1. Mostrar Catálogo completo",
                "2. Filtrar por vehículo",
                "3. Filtrar por servicio",
                "4. Agregar vehículo",
                "5. Agregar colaborador",
                "6. Salir"
        };

        while (true) {
            // En vez de por consola, ahora desplegamos con JOptionPane
            String seleccion = (String) JOptionPane.showInputDialog(
                    null,
                    "Seleccione una opción de operación:",
                    "SISTEMA DE GESTIÓN: LLANQUIHUE TOUR V2",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            // Salir del programa
            if (seleccion == null || seleccion.contains("6. Salir")) {
                JOptionPane.showMessageDialog(null, "Gracias por preferir Llanquihue Tour. ¡Buen Viaje!");
                break;
            }

            try {

                if (seleccion.contains("1. Mostrar Catálogo completo")) {

                    StringBuilder sb = new StringBuilder("--- CATÁLOGO DE REGISTROS ---\n");

                    for (Registrable r : listaAgencia) {
                        sb.append(r.toString()).append("\n");
                    }

                    JOptionPane.showMessageDialog(null, sb.toString(),
                            "Todos los Registros",
                            JOptionPane.INFORMATION_MESSAGE);

                } else if (seleccion.contains("2. Filtrar por vehículo")) {

                    StringBuilder sb = new StringBuilder("--- VEHÍCULOS DISPONIBLES ---\n");
                    boolean encontramosVehiculo = false;

                    for (Registrable r : listaAgencia) {

                        if (r instanceof Vehiculo) {

                            Vehiculo v = (Vehiculo) r;

                            sb.append("Vehículo ---> Patente: ")
                                    .append(v.getPatente())
                                    .append(", Capacidad Pasajeros: ")
                                    .append(v.getCapacidadPasajeros())
                                    .append("\n");

                            encontramosVehiculo = true;
                        }
                    }

                    if (!encontramosVehiculo) {
                        sb.append("No hay vehículos disponibles.");
                    }

                    JOptionPane.showMessageDialog(null, sb.toString(),
                            "Filtro Vehículos",
                            JOptionPane.INFORMATION_MESSAGE);

                } else if (seleccion.contains("3. Filtrar por servicio")) {

                    StringBuilder sb = new StringBuilder("--- SERVICIOS TURÍSTICOS DISPONIBLES ---\n");
                    boolean encontramosServicio = false;

                    for (Registrable r : listaAgencia) {

                        if (r instanceof ServicioTuristico) {

                            ServicioTuristico s = (ServicioTuristico) r;

                            sb.append("Servicio ---> ")
                                    .append(s.getNombre())
                                    .append(" (Duración: ")
                                    .append(s.getDuracionTour())
                                    .append(" hrs)\n");

                            encontramosServicio = true;
                        }
                    }

                    if (!encontramosServicio) {
                        sb.append("No hay servicios disponibles.");
                    }

                    JOptionPane.showMessageDialog(null, sb.toString(),
                            "Filtro Servicios",
                            JOptionPane.INFORMATION_MESSAGE);

                } else if (seleccion.contains("4. Agregar vehículo")) {

                    String patente = JOptionPane.showInputDialog("Ingrese la patente:");

                    int capacidad = Integer.parseInt(
                            JOptionPane.showInputDialog("Capacidad de pasajeros:")
                    );

                    Vehiculo nuevo = new Vehiculo(patente, capacidad);

                    listaAgencia.add(nuevo);

                    JOptionPane.showMessageDialog(null,
                            "Vehículo agregado correctamente.");

                } else if (seleccion.contains("5. Agregar colaborador")) {

                    String nombre = JOptionPane.showInputDialog("Nombre:");

                    String rol = JOptionPane.showInputDialog("Rol:");

                    ColaboradorExterno colaborador =
                            new ColaboradorExterno(nombre, rol);

                    listaAgencia.add(colaborador);

                    JOptionPane.showMessageDialog(null,
                            "Colaborador agregado correctamente.");
                }

            } catch (Exception e) {

                JOptionPane.showMessageDialog(
                        null,
                        "Error: " + e.getMessage(),
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );

            }
        }

    }
}