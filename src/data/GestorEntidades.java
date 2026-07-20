package data;

import model.Registrable;
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

    public String generarReporteCatalogo() {
        StringBuilder sb = new StringBuilder("--- CATÁLOGO GENERAL DE REGISTROS ---\n");
        for (Registrable r : entidades) {
            sb.append(r.obtenerResumen()).append("\n");
        }
        return sb.toString();
    }
}