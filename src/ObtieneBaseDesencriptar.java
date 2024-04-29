import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by: javierromero
 * Project Name: Proyecto_criptoanalizador
 */
public class ObtieneBaseDesencriptar {

    int obtieneBaseDesenciptar(String archivo_diccionario, String Archivo_Encriptado) {

        int baseObtenida = 0;
        File archivoEncriptado = new File(Archivo_Encriptado);
        try {
            if (archivoEncriptado.exists()) {
                BufferedReader leerArchivo = new BufferedReader((new FileReader(archivoEncriptado)));
                String lineaLeida;
                while ((lineaLeida = leerArchivo.readLine()) != null) {
                    String[] palabras = lineaLeida.split(" |\n");
                    // Obtiene las lineas del Archivo Encriptado
                    for (int i = 0; i < palabras.length; i++) {
                        String palabrasAAnalizar = palabras[i];
                        // Aplica a cada linea del archivo encriptado una base para
                        // buscar la que devuelvas coincidencias del diccionario
                        for (int baseDes = 5000; baseDes >= 0; baseDes--) {
                            String palabraDesencriptada = "";
                            // Este for Aplica a cada caracter de la cadena la base para cambiar
                            // el valor de cada caracter y lo va almacenando en el string de la nueva palabra
                            AplicaBaseAPalabra aplicaBaseAPalabra = new AplicaBaseAPalabra();
                            palabraDesencriptada = aplicaBaseAPalabra.aplicaBaseAPalabra(palabrasAAnalizar, baseDes);
                            CuantasCoincidenciasEnDiccionario coincidencias = new CuantasCoincidenciasEnDiccionario();
                            if (coincidencias.CuantasCoincidenciasDiccionario(archivo_diccionario, palabraDesencriptada) > 0) {
                                baseObtenida = baseDes;
                                return baseObtenida;
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return baseObtenida;

    }
}
