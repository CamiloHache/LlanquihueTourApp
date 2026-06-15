package data; //Agregamos el package que se me pasó en el trabajo de la semana 3
import model.Tour; //Llamamos a la clase tour
import java.io.BufferedReader; //Importamos el buffer para hacer las lecturas
import java.io.FileReader; //Importamos el lector de archivos
import java.util.ArrayList;

public class GestorDatos {
    public ArrayList<Tour> cargartours(String rutaArchivo) throws Exception{
        ArrayList<Tour> listaTours = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));

        String linea;

        while((linea = br.readLine()) != null){
            // Aquí usamos un separador de campos personalizado
            String[] datos = linea.split(";");

            // Convertir el precio a entero y aprovechamos de limpiar los espacios vacíos
            int precioConvertido = Integer.parseInt(datos[2].trim());

            // Ya con los datos parseados, creamos el objeto tour
            Tour unTour = new Tour(datos[0].trim(), datos[1].trim(), precioConvertido);

            // Y por último agregamos el nuevo tour a al colección dinamica
            listaTours.add(unTour);
        }
        br.close();
        return listaTours;
    }


}
