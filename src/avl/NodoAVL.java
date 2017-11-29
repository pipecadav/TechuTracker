
package avl;

import listaadyacencia.Nodo;

/**
 *
 * @author Felipe Cadavid
 */
public class NodoAVL {
    
    private NodoAVL ligaIzq;
    private NodoAVL ligaDer;
    private int fB;
    private Nodo vertice;

    public NodoAVL(Nodo vertice) {
        this.vertice = vertice;
        ligaIzq = ligaDer = null;
    }

    public NodoAVL getLigaIzq() {
        return ligaIzq;
    }

    public void setLigaIzq(NodoAVL ligaIzq) {
        this.ligaIzq = ligaIzq;
    }

    public NodoAVL getLigaDer() {
        return ligaDer;
    }

    public void setLigaDer(NodoAVL ligaDer) {
        this.ligaDer = ligaDer;
    }

    public int getfB() {
        return fB;
    }

    public void setfB(int fB) {
        this.fB = fB;
    }

    public Object getVertice() {
        return vertice;
    }

    public void setVertice(Nodo vertice) {
        this.vertice = vertice;
    }
    
    public int compareTo(NodoAVL x){
        //pendiente hacer esta funcion
        return 1;
    }

    
}
  