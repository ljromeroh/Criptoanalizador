import java.util.Scanner;

/**
 * Created by: javierromero
 * Project Name: Proyecto_criptoanalizador
 */
public class Proyecto_Criptoanalizador {


    public static void main(String[] args) {

        Scanner opcionMenu = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            MenuPrincipal menuPrincipal = new MenuPrincipal();
            menuPrincipal.DespliegaMenuPrincipal();

            System.out.print("Elige una opcion... ");
            opcion = opcionMenu.nextInt();

            switch (opcion) {
                case 1:
                    Menu_ImprimeArchivoOriginal menuImprimeArchivoOriginal = new Menu_ImprimeArchivoOriginal();
                    menuImprimeArchivoOriginal.menu_imprimeArchivoOriginal();
                    break;
                case 2:
                    Menu_EncriptaArchivo menuEncriptaArchivo = new Menu_EncriptaArchivo();
                    menuEncriptaArchivo.menu_encriptaArchivo();
                    break;
                case 3:
                    Menu_ImprimeArchivoEncriptado menuImprimeArchivoEncriptado = new Menu_ImprimeArchivoEncriptado();
                    menuImprimeArchivoEncriptado.menu_imprimeArchivoEncriptado();
                    break;
                case 4:
                    Menu_DesencriptaArchivo menuDesencriptaArchivo = new Menu_DesencriptaArchivo();
                    menuDesencriptaArchivo.menu_desencriptaArchivo();
                    break;
                case 5:
                    Menu_ImprimeArchivoDesencriptado menuImprimeArchivoDesencriptado = new Menu_ImprimeArchivoDesencriptado();
                    menuImprimeArchivoDesencriptado.menu_imprimeArchivoDesEncriptado();
                    break;
                case 6:
                    salir = true;
                    break;
            }

        }

    }
}
