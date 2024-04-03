package uvg.edu.gt;

/**
 * Esta clase representa una asociación entre una llave de tipo K y un valor de
 * tipo V.
 * 
 * @author Cristian Túnchez
 * @version 1.0
 * @since 02-04-2024
 * 
 * @param <K> el tipo de la llave
 * @param <V> el tipo del valor
 */
public class Association<K extends Comparable<K>, V> {
    /** La llave de la asociación */
    private K llave;
    /** El valor de la asociación */
    private V valor;

    /**
     * Crea una nueva asociación con la llave y el valor especificados.
     * 
     * @param llave la llave de la asociación
     * @param valor el valor de la asociación
     */
    public Association(K llave, V valor) {
        this.llave = llave;
        this.valor = valor;
    }

    /**
     * Obtiene la llave de la asociación.
     * 
     * @return la llave de la asociación
     */
    public K getLlave() {
        return llave;
    }

    /**
     * Obtiene el valor de la asociación.
     * 
     * @return el valor de la asociación
     */
    public V getValor() {
        return valor;
    }
}