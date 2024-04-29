/**
 * Created by: javierromero
 * Project Name: Proyecto_criptoanalizador
 */
public class Menu_ImprimeArchivoOriginal {

    void menu_imprimeArchivoOriginal() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+                                                   +");
        System.out.println("+  Se imprimirá en pantalla el archivo:             +");
        System.out.println("+              archivo_original.txt                 +");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");

        MostrarContenidoArchivoEnPantalla leerArchivo = new MostrarContenidoArchivoEnPantalla();
        leerArchivo.MostrarContenidoArchivo(NombresDeArchivosTXT.ARCHIVO_ORIGINAL);
    }

}
