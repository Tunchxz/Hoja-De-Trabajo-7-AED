package uvg.edu.gt;

public class Nodo<E extends Comparable<E>> {
    private Association<E, E> data;
    private Nodo<E> left;
    private Nodo<E> right;

    public Nodo(Association<E, E> data) {
        this.data = data;
    }

    public Association<E, E> getData() {
        return data;
    }

    public Nodo<E> getLeft() {
        return left;
    }

    public void setLeft(Nodo<E> left) {
        this.left = left;
    }

    public Nodo<E> getRight() {
        return right;
    }

    public void setRight(Nodo<E> right) {
        this.right = right;
    }
}