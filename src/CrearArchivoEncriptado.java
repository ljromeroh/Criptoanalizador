import java.io.*;

/**
 * Created by: javierromero
 * Project Name: Proyecto_criptoanalizador
 */
public class CrearArchivoEncriptado {


    void creararchivoencriptado(String Archivo_Origen, String Archivo_Destino, int base_encriptacion) {

        EncriptarDesencriptar encriptador = new EncriptarDesencriptar();
        try (BufferedReader reader = new BufferedReader(new FileReader(Archivo_Origen));
             Writer flujoDeSalida = new FileWriter(Archivo_Destino)) {
            int charCode;
            while ((charCode = reader.read()) != -1) {
                char character = encriptador.encriptar(charCode, base_encriptacion);
                flujoDeSalida.write(character);
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    void creararchivoencriptado(String Archivo_Origen, String Archivo_Destino, int base_encriptacion, String accion) {

        EncriptarDesencriptar encriptador = new EncriptarDesencriptar();
        try (BufferedReader reader = new BufferedReader(new FileReader(Archivo_Origen));
             Writer flujoDeSalida = new FileWriter(Archivo_Destino)) {
            int charCode;
            while ((charCode = reader.read()) != -1) {
                char character = encriptador.encriptaDesencripta("DESENCRIPTA", charCode, base_encriptacion);
                flujoDeSalida.write(character);
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
