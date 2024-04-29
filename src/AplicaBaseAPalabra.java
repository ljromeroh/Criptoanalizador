/**
 * Created by: javierromero
 * Project Name: Proyecto_criptoanalizador
 */
public class AplicaBaseAPalabra {

    String aplicaBaseAPalabra(String cadenaAProcesar, int baseAplicar) {
        String cadenaProcesada = "";
        for (int y = 0; y < cadenaAProcesar.length(); y++) {
            char myChar = cadenaAProcesar.charAt(y);
            char i1 = (char) (myChar - baseAplicar);
            cadenaProcesada = cadenaProcesada + i1;
        }
        return cadenaProcesada;
    }
}
