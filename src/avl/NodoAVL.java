
package avl;

/**
 *
 * @author Felipe Cadavid
 */
public class NodoAVL {
    
    private NodoAVL ligaIzq;
    private NodoAVL ligaDer;
    private int fB;
    private Object d;

    public NodoAVL(Object d) {
        this.d = d;
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

    public Object getD() {
        return d;
    }

    public void setD(Object d) {
        this.d = d;
    }
    
    public int compareTo(NodoAVL x){
        //pendiente hacer esta funcion
        return 1;
    }

    
}
  