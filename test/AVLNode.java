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
    private String cellNumber;
    private LinkedListVertex vertex;

    public AVLNode(String cellNumber) {
        vertex = new LinkedListVertex(cellNumber);
        this.cellNumber = cellNumber;
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

    public LinkedListVertex getVertice() {
        return vertex;
    }

    public void setVertex(LinkedListVertex vertex) {
        this.vertex = vertex;
    }
    
    
    
    public int compareTo(AVLNode x){
        long number1 = Long.parseLong(this.cellNumber);
        long number2 = Long.parseLong(x.cellNumber);
        if(number1 == number2){
            return 0;
        }else if(number1 < number2){
           return -1;   
        }else{
           return 1;
        }
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }
    

    
}
  