package techutracker.model.avl;

import techutracker.model.directedgraph.LinkedListVertex;



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

    /**
     * Crea un Nodo que alamcena un Vértice y el número de cell que lo contiene
     * @param cellNumber - Dato de tipo String para el celular
     */
    public AVLNode(String cellNumber) {
        vertex = new LinkedListVertex(cellNumber);
        this.cellNumber = cellNumber;
        ligaIzq = ligaDer = null;
    }

    /**
     * Retorna la Liga Izquierda del Nodo
     * @return 
     */
    public AVLNode getLigaIzq() {
        return ligaIzq;
    }

    /**
     * Modifica la Liga Izquierda del Nodo
     * @param ligaIzq - Dato de tipo NODOAVL
     */
    public void setLigaIzq(AVLNode ligaIzq) {
        this.ligaIzq = ligaIzq;
    }

    /**
     * Retorna la Liga Derecha del Nodo
     * @return 
     */
    public AVLNode getLigaDer() {
        return ligaDer;
    }

    /**
     *  Modifica la Liga Derecha del Nodo
     * @param ligaDer - Dato de tipo NODOAVL
     */
    public void setLigaDer(AVLNode ligaDer) {
        this.ligaDer = ligaDer;
    }

    /**
     * Permite obtener el factor de Balanceo
     * @return 
     */
    public int getfB() {
        return fB;
    }

    /**
     * Permite asignar el factor de Balanceo
     * @param fB - Dato de tipo Entero
     */
    public void setfB(int fB) {
        this.fB = fB;
    }

    /**
     * Permite obtener el vértice con sus adyacentes
     * @return 
     */
    public LinkedListVertex getVertice() {
        return vertex;
    }

    /**
     * Permite agregar un vértice con sus adyacentes
     * @param vertex  - Dato de tipo Vertice
     */
    public void setVertex(LinkedListVertex vertex) {
        this.vertex = vertex;
    }
    
    /**
     * Permite comparar 2 NODOAVL con respecto a su registro de número celular
     * Retorna 0 si el número es igual
     * Retorna 1 si le número es mayor
     * Retorna -1 si e menor
     * @param x - Recibe un Dato del tipo NODOAVL
     * @return 
     */
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

    /**
     * Retorna el registro celular que hay en este vertice
     * @return 
     */
    public String getCellNumber() {
        return cellNumber;
    }

    /**
     * Permite modificar el registro celular en el vertice
     * @param cellNumber 
     */
    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }
    

    
}
  