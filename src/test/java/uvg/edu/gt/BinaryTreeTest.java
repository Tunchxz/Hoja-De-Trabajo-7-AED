package uvg.edu.gt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

/**
 * Esta clase contiene casos de prueba para la clase BinaryTree.
 */
public class BinaryTreeTest {
    /**
     * Prueba la inserción y búsqueda de elementos en el árbol binario.
     */
    @Test
    public void testInsertAndSearch() {
        // Crear un nuevo árbol binario para el diccionario
        BinaryTree<String> diccionario = new BinaryTree<>();

        // Crear una asociación para la prueba
        Association<String, String> association = new Association<>("house", "casa");

        // Insertar la asociación en el diccionario
        diccionario.insert(association);

        // Prueba de inserción y búsqueda exitosa
        assertEquals("casa", diccionario.search("house"));

        // Prueba de búsqueda fallida
        assertNull(diccionario.search("dog"));
    }
}