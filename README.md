Proyecto Criptoanalizador
Autor: L. Javier Romero Hernández

La clase principal se llama "Proyecto Criptoanalizador"
Al ejecutarlo de desplegará un menú principal con las opciones 
disponibles, las cuales son:

+ 1. Imprime Archivo Original en Pantalla ...       +
+ 2. Encripta Archivo ...                           +
+ 3. Imprime Archivo Encriptado en Pantalla ...     +
+ 4. Desencripta Archivo ...                        +
+ 5. Imprime Archivo Desencriptado en Pantalla ...  +
+ 6. Salir ...                                      +

Los archivos con los que se va a trabajar son:

ARCHIVO_ENCRIPTADO = "archivo_encriptado.txt";
ARCHIVO_ORIGINAL = "archivo_original.txt";
ARCIHVO_DICCIONARIO = "DiccionarioEsp.txt";
ARCHIVO_DESENCRIPTADO = "archivo_desencriptado.txt";

La base (numero) con el que se va a iniciar a buscar desencriptar 
el archivo es el número 5000.

Cada cadena a la que se le aplica la base de desencriptación se 
busca en el archivo diccionario hasta encontrar coincidencias
(Este archivo diccionario lo conseguí por internet, son palabras en español) 

Para una segunda versión o versión mejorada se puede:
1.- Escribir el nombre de archivo origen, archivo encriptado y archivo desencriptado
2.- Agregar mas diccionarios y solicitar que se desencripte analizando en algun idioma en especial
