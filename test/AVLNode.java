/*
* Clase que crea un nodo para un arbol AVL
*/


/**
 *
 * @author Felipe Cadavid
 */
public class AVLNode {
    
    private AVLNode ligaIzq;
    private AVLNode ligaDer;
    private int fB;
    private Graph vertex;

    public AVLNode(Graph vertex) {
        this.vertex = vertex;
        ligaIzq = ligaDer = null;
    }

    public AVLNode getLigaIzq() {
        return ligaIzq;
    }

    public void setLigaIzq(AVLNode ligaIzq) {
        this.ligaIzq = ligaIzq;
    }

    public AVLNode getLigaDer() {
        return ligaDer;
    }

    public void setLigaDer(AVLNode ligaDer) {
        this.ligaDer = ligaDer;
    }

    public int getfB() {
        return fB;
    }

    public void setfB(int fB) {
        this.fB = fB;
    }

    public Object getVertice() {
        return vertex;
    }

    public void setVertex(Graph vertex) {
        this.vertex = vertex;
    }
    
    public int compareTo(AVLNode x){
        //pendiente hacer esta funcion
        return 1;
    }

    
}
  