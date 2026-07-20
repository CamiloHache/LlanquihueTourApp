package utils;

/**
 * Clase para centralizar las validaciones lógicas
 * Aquí implementamos el try-catch personalizado correctamente
 */
public class Validador {

    public static void validarPrecio(int precio) throws Exception{
        if (precio < 0){
            throw new IllegalArgumentException("El precio del tour no puede ser un valor negativo.");
        }
    }

    public static void validarTexto(String texto, String nombreCampo) throws Exception{
        if(texto == null || texto.trim().isEmpty()){
            throw new IllegalArgumentException("El campo '" + nombreCampo + "' no puede estar vacío.");
        }
    }
}
