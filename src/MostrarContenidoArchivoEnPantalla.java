import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by: javierromero
 * Project Name: Proyecto_criptoanalizador
 */
public class MostrarContenidoArchivoEnPantalla {

    void MostrarContenidoArchivo(String NombreArchivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(NombreArchivo))) {
            int charCode;
            while ((charCode = reader.read()) != -1) {
                char character = (char) charCode;
                if (character == '\n') {
                    System.out.print(character);
                } else {
                    System.out.print(character);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void MostrarContenidoArchivo(String NombreArchivo, int base) {
        try (BufferedReader reader = new BufferedReader(new FileReader(NombreArchivo))) {
            int charCode;
            while ((charCode = reader.read()) != -1) {
                char character = (char) (charCode + base);
                if (character == '\n') {
                    System.out.print(character);
                } else {
                    System.out.print(character);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
