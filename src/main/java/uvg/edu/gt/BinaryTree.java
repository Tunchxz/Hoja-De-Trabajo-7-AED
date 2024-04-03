package uvg.edu.gt;

/**
 * Esta clase representa un árbol binario de búsqueda que almacena datos de tipo
 * Association.
 * 
 * Este código fue adaptado de
 * https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
 * 
 * @author GeeksforGeeks; Cristian Túnchez
 * @version 1.0
 * @since 02-04-2024
 * 
 * @param <E> el tipo de datos que contendrá el árbol
 */
public class BinaryTree<E extends Comparable<E>> {
    /** La raíz del árbol */
    private Nodo<E> root;

    /**
     * Inserta una nueva asociación en el árbol.
     * 
     * @param association la asociación que se va a insertar en el árbol
     */
    public void insert(Association<E, E> association) {
        root = insertRec(root, association);
    }

    /**
     * Método auxiliar para insertar una nueva asociación en el árbol de manera
     * recursiva.
     * 
     * @param currentNode el nodo actual en el que se está considerando la inserción
     * @param association la asociación que se va a insertar en el árbol
     * @return el nodo actualizado después de la inserción
     */
    private Nodo<E> insertRec(Nodo<E> currentNode, Association<E, E> association) {
        if (currentNode == null) {
            return new Nodo<>(association);
        }

        if (association.getLlave().compareTo(currentNode.getData().getLlave()) < 0) {
            currentNode.setLeft(insertRec(currentNode.getLeft(), association));
        } else if (association.getLlave().compareTo(currentNode.getData().getLlave()) > 0) {
            currentNode.setRight(insertRec(currentNode.getRight(), association));
        }

        return currentNode;
    }

    /**
     * Busca el valor asociado a una llave en el árbol.
     * 
     * @param key la llave que se desea buscar en el árbol
     * @return el valor asociado a la llave, o null si la llave no está en el árbol
     */
    public E search(E key) {
        return searchRec(root, key);
    }

    /**
     * Método auxiliar para realizar una búsqueda de manera recursiva en el árbol.
     * 
     * @param currentNode el nodo actual en el que se está considerando la búsqueda
     * @param key         la llave que se desea buscar en el árbol
     * @return el valor asociado a la llave, o null si la llave no está en el árbol
     */
    private E searchRec(Nodo<E> currentNode, E key) {
        if (currentNode == null) {
            return null;
        }

        if (key.compareTo(currentNode.getData().getLlave()) == 0) {
            return currentNode.getData().getValor();
        }

        return key.compareTo(currentNode.getData().getLlave()) < 0
                ? searchRec(currentNode.getLeft(), key)
                : searchRec(currentNode.getRight(), key);
    }

    /**
     * Realiza un recorrido inorden (izquierda, raíz, derecha) del árbol.
     */
    public void inOrder() {
        inOrderRec(root);
    }

    /**
     * Método auxiliar para realizar un recorrido inorden de manera recursiva en el
     * árbol.
     * 
     * @param currentNode el nodo actual en el que se está considerando el recorrido
     */
    private void inOrderRec(Nodo<E> currentNode) {
        if (currentNode != null) {
            inOrderRec(currentNode.getLeft());
            System.out.println(currentNode.getData().getLlave() + ", " + currentNode.getData().getValor());
            inOrderRec(currentNode.getRight());
        }
    }
}