package uvg.edu.gt;

/**
 * Esta clase representa un nodo en un árbol binario, que contiene datos de tipo
 * Association.
 * 
 * Este código fue adaptado de
 * https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
 * 
 * @author GeeksforGeeks; Cristian Túnchez
 * @version 1.0
 * @since 02-04-2024
 * 
 * @param <E> el tipo de datos que contendrá el nodo
 */
public class Nodo<E extends Comparable<E>> {
    /** Los datos almacenados en el nodo */
    private Association<E, E> data;
    /** El hijo izquierdo del nodo */
    private Nodo<E> left;
    /** El hijo derecho del nodo */
    private Nodo<E> right;

    /**
     * Crea un nuevo nodo con los datos especificados.
     * 
     * @param data los datos que se almacenarán en el nodo
     */
    public Nodo(Association<E, E> data) {
        this.data = data;
    }

    /**
     * Obtiene los datos almacenados en el nodo.
     * 
     * @return los datos almacenados en el nodo
     */
    public Association<E, E> getData() {
        return data;
    }

    /**
     * Obtiene el hijo izquierdo del nodo.
     * 
     * @return el hijo izquierdo del nodo
     */
    public Nodo<E> getLeft() {
        return left;
    }

    /**
     * Establece el hijo izquierdo del nodo.
     * 
     * @param left el nodo que se establecerá como hijo izquierdo
     */
    public void setLeft(Nodo<E> left) {
        this.left = left;
    }

    /**
     * Obtiene el hijo derecho del nodo.
     * 
     * @return el hijo derecho del nodo
     */
    public Nodo<E> getRight() {
        return right;
    }

    /**
     * Establece el hijo derecho del nodo.
     * 
     * @param right el nodo que se establecerá como hijo derecho
     */
    public void setRight(Nodo<E> right) {
        this.right = right;
    }
}