/**
 * Created by: javierromero
 * Project Name: Proyecto_criptoanalizador
 */
public class EncriptarDesencriptar {

    char encriptar(int letraAEncriptar, int baseEncriptacion) {
        char letra_Encriptada = (char) (letraAEncriptar + baseEncriptacion);
        return letra_Encriptada;
    }

    char desencriptar(int letraAEncriptar, int baseEncriptacion) {
        char letra_Desencriptada = (char) (letraAEncriptar - baseEncriptacion);
        return letra_Desencriptada;
    }

    char encriptaDesencripta(String accion, int letraAEncriptar, int baseEncriptacion) {
        char letra_Desencriptada;
        if (accion.equals("ENCRIPTA")) {
            letra_Desencriptada = (char) (letraAEncriptar - baseEncriptacion);
        } else if (accion.equals("DESENCRIPTA")) {
            letra_Desencriptada = (char) (letraAEncriptar - baseEncriptacion);
        } else {
            letra_Desencriptada = (char) (letraAEncriptar);
        }
        return letra_Desencriptada;
    }
}
