/**
 * Created by: javierromero
 * Project Name: Proyecto_criptoanalizador
 */
public class CuantasCoincidenciasEnDiccionario {

    public int CuantasCoincidenciasDiccionario(String archivoDiccionario, String cadenaEntrante) {


        ExisteEnDiccionario existeEnDiccionario = new ExisteEnDiccionario();

        // Separa el String con la base aplicada en cadenas separadas por espacio o salto de linea
        String[] palabrasSeparadas = cadenaEntrante.split(" |\n");
        // Busca en el diccionario cada cadena separada para ver si existe ahí.
        int palabrasEnDiccionario = 0;
        for (int j = 0; j < palabrasSeparadas.length; j++) {
            if (existeEnDiccionario.existeEnDiccionario(archivoDiccionario, palabrasSeparadas[j])) {
                palabrasEnDiccionario++;
            }
        }
        return palabrasEnDiccionario;

    }

}
