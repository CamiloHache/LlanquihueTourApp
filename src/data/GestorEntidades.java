package data;

import model.Registrable;
import model.GuiaTuristico;
import model.Vehiculo;
import java.util.ArrayList;
import java.util.List;

public class GestorEntidades {
    private List<Registrable> entidades;

    public GestorEntidades() {
        this.entidades = new ArrayList<>();
    }

    public void agregarEntidad(Registrable entidad) {
        this.entidades.add(entidad);
    }

    public List<Registrable> getEntidades() {
        return entidades;
    }

    public void procesarYMostrarColeccion() {
        System.out.println("\n========= PROCESANDO EN CONSOLA (LOGICA INSTANCEOF) =========");
        for (Registrable r : entidades) {
            r.mostrarResumen();

            if (r instanceof GuiaTuristico g) {
                System.out.println(" -> Especialidad: " + g.getEspecialidad());
            } else if (r instanceof Vehiculo v) {
                System.out.println(" -> Tipo de vehiculo: " + v.getTipoVehiculo());
            }
        }
    }
}
