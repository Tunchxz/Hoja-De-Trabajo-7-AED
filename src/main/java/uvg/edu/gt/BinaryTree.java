package uvg.edu.gt;

public class BinaryTree<E extends Comparable<E>> {
    private Nodo<E> root;

    public void insert(Association<E, E> association) {
        root = insertRec(root, association);
    }

    private Nodo<E> insertRec(Nodo<E> nodoActual, Association<E, E> association) {
        if (nodoActual == null) {
            return new Nodo<>(association);
        }

        if (association.getLlave().compareTo(nodoActual.getData().getLlave()) < 0) {
            nodoActual.setLeft(insertRec(nodoActual.getLeft(), association));
        } else if (association.getLlave().compareTo(nodoActual.getData().getLlave()) > 0) {
            nodoActual.setRight(insertRec(nodoActual.getRight(), association));
        }

        return nodoActual;
    }

    public E search(E llave) {
        return searchRec(root, llave);
    }

    private E searchRec(Nodo<E> nodoActual, E llave) {
        if (nodoActual == null) {
            return null;
        }

        if (llave.compareTo(nodoActual.getData().getLlave()) == 0) {
            return nodoActual.getData().getValor();
        }

        return llave.compareTo(nodoActual.getData().getLlave()) < 0
                ? searchRec(nodoActual.getLeft(), llave)
                : searchRec(nodoActual.getRight(), llave);
    }

    public void inOrder() {
        inOrderRec(root);
    }

    private void inOrderRec(Nodo<E> nodoActual) {
        if (nodoActual != null) {
            inOrderRec(nodoActual.getLeft());
            System.out.println(nodoActual.getData().getLlave() + ", " + nodoActual.getData().getValor());
            inOrderRec(nodoActual.getRight());
        }
    }
}