/**
 * Created by: javierromero
 * Project Name: Proyecto_criptoanalizador
 */
public class Menu_ImprimeArchivoEncriptado {
    void menu_imprimeArchivoEncriptado() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+                                                   +");
        System.out.println("+  Se imprimirá en pantalla el archivo:             +");
        System.out.println("+              archivo_encriptado.txt               +");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");

        MostrarContenidoArchivoEnPantalla leerArchivo = new MostrarContenidoArchivoEnPantalla();
        leerArchivo.MostrarContenidoArchivo(NombresDeArchivosTXT.ARCHIVO_ENCRIPTADO);

    }

}
