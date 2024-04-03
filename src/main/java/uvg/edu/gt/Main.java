package uvg.edu.gt;

import java.util.*;
import java.io.*;

/**
 * Esta clase contiene el método principal que lee un diccionario y un texto, y
 * realiza la traducción de palabras utilizando un árbol binario.
 * 
 * @author Cristian Túnchez
 * @version 1.0
 * @since 02-04-2024
 */
public class Main {
    /**
     * El método principal que lee un diccionario y un texto, y realiza la
     * traducción de palabras.
     * 
     * @param args los argumentos de la línea de comandos (no se utilizan en este
     *             caso)
     */
    public static void main(String[] args) {
        // Crear el diccionario
        BinaryTree<String> dictionary = new BinaryTree<>();

        // Leer el archivo diccionario.txt
        try (Scanner scanner = new Scanner(new File("src\\main\\java\\uvg\\edu\\gt\\diccionario.txt"))) {
            System.out.println("\n[Sistema]: Leyendo 'diccionario.txt'...");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(", ");
                dictionary.insert(new Association<>(parts[0], parts[1]));
            }
        } catch (FileNotFoundException e) {
            System.out.println("\n[Sistema]: No se pudo encontrar el archivo diccionario.txt");
            e.printStackTrace();
        }

        // Imprimir el diccionario en orden
        System.out.println("\n--------------- Palabras Ordenadas por Inglés ---------------");
        dictionary.inOrder();

        // Traducir un texto
        try (Scanner scanner = new Scanner(new File("src\\main\\java\\uvg\\edu\\gt\\texto.txt"))) {
            System.out.println("\n[Sistema]: Leyendo 'texto.txt'...");
            System.out.println("\n--------------- Textos Traducidos ---------------");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] palabras = line.split(" ");
                List<String> textoTraducido = new ArrayList<>();
                for (String palabra : palabras) {
                    String traduccion = dictionary.search(palabra.toLowerCase());
                    if (traduccion == null) {
                        textoTraducido.add("*" + palabra + "*");
                    } else {
                        textoTraducido.add(traduccion);
                    }
                }
                System.out.println(String.join(" ", textoTraducido) + ".\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("\n[Sistema]: No se pudo encontrar el archivo texto.txt");
            e.printStackTrace();
        }
    }
}