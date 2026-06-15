package data;
import model.Tour;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class GestorDatos {
    public ArrayList<Tour> cargartours(String rutaArchivo) throws Exception{
        ArrayList<Tour> listaTours = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));

        String linea;

        while((linea = br.readLine()) != null){
            String[] datos = linea.split(";");
            int precioConvertido = Integer.parseInt(datos[2].trim());
            Tour unTour = new Tour(datos[0].trim(), datos[1].trim(), precioConvertido);
            listaTours.add(unTour);
        }
        br.close();
        return listaTours;
    }


}
