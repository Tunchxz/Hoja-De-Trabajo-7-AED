package uvg.edu.gt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class BinaryTreeTest {
    @Test
    public void testInsertAndSearch() {
        BinaryTree<String> diccionario = new BinaryTree<>();
        Association<String, String> association = new Association<>("house", "casa");
        diccionario.insert(association);

        // Prueba de inserción y búsqueda exitosa
        assertEquals("casa", diccionario.search("house"));

        // Prueba de búsqueda fallida
        assertNull(diccionario.search("dog"));
    }
}