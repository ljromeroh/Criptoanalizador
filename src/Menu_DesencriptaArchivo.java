

/**
 * Created by: javierromero
 * Project Name: Proyecto_criptoanalizador
 */
public class Menu_DesencriptaArchivo {

    void menu_desencriptaArchivo() {

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+                                                                         +");
        System.out.println("+  Se desencriptará el archivo original en el siguiente archivo:          +");
        System.out.println("+                  archivo_desencriptado.txt                              +");
        System.out.println("+                                                                         +");
        System.out.println("+  Se hace un recorido desde la base 5000 hasta la cero para identificar  +");
        System.out.println("+  en que base es que se encuentran combinaciones de caracteres que       +");
        System.out.println("+  coincidan con el contenido del archivo Diccionario                     +");
        System.out.println("+                                                                         +");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println("");
        System.out.println("Procesando...");
        ObtieneBaseDesencriptar obtieneBaseDesencriptar = new ObtieneBaseDesencriptar();
        int baseObtenida = obtieneBaseDesencriptar.obtieneBaseDesenciptar(NombresDeArchivosTXT.
                        ARCIHVO_DICCIONARIO,
                NombresDeArchivosTXT.ARCHIVO_ENCRIPTADO);

        System.out.println("La Base para desencriptar el archivo es: " + baseObtenida);
        CrearArchivoEncriptado crearArchivoDesEncriptado = new CrearArchivoEncriptado();
        crearArchivoDesEncriptado.creararchivoencriptado(NombresDeArchivosTXT.ARCHIVO_ENCRIPTADO,
                NombresDeArchivosTXT.ARCHIVO_DESENCRIPTADO,
                baseObtenida,
                "DESENCRIPTAR");

    }

}
