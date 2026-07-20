package app;

import data.GestorDatos;
import data.GestorEntidades;
import data.GestorServicios;
import model.*;
import utils.Validador;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        GestorEntidades gestorGlobal = new GestorEntidades();
        GestorDatos lectorArchivo = new GestorDatos();

        // 1. Cargar datos desde archivo e ingresarlos a la colección polimórfica
        for (Tour t : lectorArchivo.cargarToursDesdeArchivo("resources/tours.txt")) {
            gestorGlobal.agregarEntidad(t);
        }

        // 2. Cargar servicios base de la semana anterior
        GestorServicios gestorSemana7 = new GestorServicios();
        for (ServicioTuristico st : gestorSemana7.obtenerServiciosDePrueba()) {
            gestorGlobal.agregarEntidad(st);
        }

        // 3. Agregar objetos iniciales con la nueva estructura estructurada
        try {
            gestorGlobal.agregarEntidad(new Vehiculo("KJKW-89", 12));
            gestorGlobal.agregarEntidad(new Vehiculo("FTPL-45", 4));
            gestorGlobal.agregarEntidad(new ColaboradorExterno("Carlos Díaz", "Chofer", new Rut("18432987-k")));
        } catch (Exception ignored) {}

        String[] opciones = {
                "1. Mostrar Catálogo completo",
                "2. Filtrar por vehículo",
                "3. Filtrar por servicio",
                "4. Agregar vehículo",
                "5. Agregar colaborador",
                "6. Salir"
        };

        while (true) {
            String seleccion = (String) JOptionPane.showInputDialog(
                    null,
                    "Seleccione una operación:",
                    "LLANQUIHUE TOUR V3 - EFT",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            if (seleccion == null || seleccion.contains("6. Salir")) {
                JOptionPane.showMessageDialog(null, "¡Buen Viaje! Saliendo del sistema.");
                break;
            }

            try {
                if (seleccion.contains("1. Mostrar Catálogo completo")) {
                    JOptionPane.showMessageDialog(null, gestorGlobal.generarReporteCatalogo(), "Catálogo", JOptionPane.INFORMATION_MESSAGE);

                } else if (seleccion.contains("2. Filtrar por vehículo")) {
                    StringBuilder sb = new StringBuilder("--- VEHÍCULOS ---\n");
                    for (Registrable r : gestorGlobal.getEntidades()) {
                        if (r instanceof Vehiculo v) {
                            sb.append(v.obtenerResumen()).append("\n");
                        }
                    }
                    JOptionPane.showMessageDialog(null, sb.toString(), "Vehículos", JOptionPane.INFORMATION_MESSAGE);

                } else if (seleccion.contains("3. Filtrar por servicio")) {
                    StringBuilder sb = new StringBuilder("--- SERVICIOS ---\n");
                    for (Registrable r : gestorGlobal.getEntidades()) {
                        if (r instanceof ServicioTuristico s) {
                            sb.append(s.obtenerResumen()).append("\n");
                        }
                    }
                    JOptionPane.showMessageDialog(null, sb.toString(), "Servicios", JOptionPane.INFORMATION_MESSAGE);

                } else if (seleccion.contains("4. Agregar vehículo")) {
                    String patente = JOptionPane.showInputDialog("Ingrese patente:");
                    Validador.validarTexto(patente, "Patente");

                    String capStr = JOptionPane.showInputDialog("Capacidad Pasajeros:");
                    Validador.validarTexto(capStr, "Capacidad");
                    int capacidad = Integer.parseInt(capStr);
                    if(capacidad <= 0) throw new IllegalArgumentException("La capacidad debe ser mayor a 0.");

                    gestorGlobal.agregarEntidad(new Vehiculo(patente, capacidad));
                    JOptionPane.showMessageDialog(null, "Vehículo registrado con éxito.");

                } else if (seleccion.contains("5. Agregar colaborador")) {
                    String nombre = JOptionPane.showInputDialog("Nombre:");
                    Validador.validarTexto(nombre, "Nombre");

                    String rol = JOptionPane.showInputDialog("Rol:");
                    Validador.validarTexto(rol, "Rol");

                    String rutInput = JOptionPane.showInputDialog("RUT (ej: 12345678-9):");
                    Rut rutObj = new Rut(rutInput);

                    gestorGlobal.agregarEntidad(new ColaboradorExterno(nombre, rol, rutObj));
                    JOptionPane.showMessageDialog(null, "Colaborador registrado con éxito.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error de validación: " + e.getMessage(), "Error de entrada", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}