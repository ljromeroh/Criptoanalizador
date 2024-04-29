import java.util.Scanner;

/**
 * Created by: javierromero
 * Project Name: Proyecto_criptoanalizador
 */
public class Menu_EncriptaArchivo {

    void menu_encriptaArchivo() {

        Scanner base = new Scanner(System.in);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+                                                                         +");
        System.out.println("+  Se encriptará el archivo original en el siguiente archivo:             +");
        System.out.println("+                  archivo_encriptado.txt                                 +");
        System.out.println("+                                                                         +");
        System.out.println("+  Nota: Debe elegir la base para encriptar el archivo.                   +");
        System.out.println("+                                                                         +");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.print("Elija la base para encriptar el archivo: ");
        int base_Encriptacion = base.nextInt();
        CrearArchivoEncriptado crearArchivoEncriptado = new CrearArchivoEncriptado();
        crearArchivoEncriptado.creararchivoencriptado(NombresDeArchivosTXT.ARCHIVO_ORIGINAL,
                NombresDeArchivosTXT.ARCHIVO_ENCRIPTADO,
                base_Encriptacion);
    }


}
