
package listaadyacencia;

/**
 * Esta clase implementa los Nodos que componen un arbol N-ario
 * @author Felipe Cadavid y Carolina Diaz
 * @version 1.0
 * @since 07-10-2017
 */
public class Nodo {
    
    private Vertice vertice;
    private Nodo liga;

    public Vertice getVertice() {
        return vertice;
    }

    public void setVertice(Vertice vertice) {
        this.vertice = vertice;
    }

    public Nodo getLiga() {
        return liga;
    }

    public void setLiga(Nodo liga) {
        this.liga = liga;
    }

    
    
}
