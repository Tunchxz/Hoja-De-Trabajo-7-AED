package uvg.edu.gt;

public class Association<K extends Comparable<K>, V> {
    K llave;
    V valor;

    public Association(K llave, V valor) {
        this.llave = llave;
        this.valor = valor;
    }

    public K getLlave() {
        return llave;
    }

    public V getValor() {
        return valor;
    }
}