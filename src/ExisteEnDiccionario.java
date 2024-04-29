import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


/**
 * Created by: javierromero
 * Project Name: Proyecto_criptoanalizador
 */
public class ExisteEnDiccionario {

    boolean existeEnDiccionario(String NombrearchivoDiccionario, String palabra) {

        File archivoDiccionario = new File(NombrearchivoDiccionario);
        boolean encontrado = false;
        try {
            if (archivoDiccionario.exists()) {
                BufferedReader leerArchivo = new BufferedReader((new FileReader(archivoDiccionario)));
                String lineaLeida;
                while ((lineaLeida = leerArchivo.readLine()) != null) {
                    String[] palabras = lineaLeida.split(" ");
                    for (int i = 0; i < palabras.length; i++) {
                        if (palabras[i].equals(palabra)) {
                            encontrado = true;
                            return encontrado;
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return encontrado;
    }
}
