package model;
import utils.Validador;

public class Rut {
    private String numero;
    private String dv;

    public Rut(String rutCompleto) throws Exception {
        Validador.validarTexto(rutCompleto, "RUT");
        // Limpieza básica y separación simple
        String limpio = rutCompleto.replace(".", "").replace("-", "").trim();
        if (limpio.length() < 2) throw new IllegalArgumentException("RUT Inválido.");

        this.numero = limpio.substring(0, limpio.length() - 1);
        this.dv = limpio.substring(limpio.length() - 1);
    }

    @Override
    public String toString() {
        return numero + "-" + dv;
    }
}