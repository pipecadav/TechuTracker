
import java.util.ArrayList;

/*
 * Esta clase almacena los números telefónicos en un Arbol AVL 
 * Tambien almacena la lista ligada vertice.
 */



/**
 * Codificación de lo visto en clase
 * @author Felipe Cadavid
 */
public class AVLTree {
    
    private AVLNode root;
    private AVLNode ult;
    private AVLNode x;
    private int totalNumbers;
    private   ArrayList <LinkedListVertex> adjList = new ArrayList();

    public AVLTree() {
    }
    /**
     * Inserta un registro celular en el arbol en forma de vértice.
     * @param cellNumber
     */
    
    
    public void insertNumber(String cellNumber){
        AVLNode n = new AVLNode(cellNumber);
        totalNumbers = totalNumbers + 1;
        if(root == null){
            root = n;
        }
        AVLNode x = root;
        AVLNode padreX = null;
        AVLNode pivote = root;
        AVLNode padrePivote = null;
        AVLNode y;
        AVLNode q = null;
        
        while(x != null){
            
            if(x.getfB() != 0){ //Candidato a ser rebalanceado
                pivote = x;
                padrePivote = padreX;
            }
            switch(n.compareTo(x)){
                case 0: //es un dato existente
                    return;
                case -1: // n es menor
                    padreX = x;
                    x = x.getLigaIzq();
                    break;
                case 1: //n es mayor
                    padreX = x;
                    x = x.getLigaDer();
            }
        }
        if(n.compareTo(padreX) == 1){
            padreX.setLigaDer(n);
        }else if(n.compareTo(padreX) == -1){
            padreX.setLigaIzq(n);
        }
        
        if(n.compareTo(pivote) == 1){
            pivote.setfB(pivote.getfB()-1);
            y = pivote.getLigaDer();
        }else{
            pivote.setfB(pivote.getfB()+1);
            y = pivote.getLigaIzq();
        }
        
        q = y;
        
        while(y != n){
            if(n.compareTo(y) == 1){
                y.setfB(y.getfB()-1);
                y = y.getLigaDer();
            }else{
                y.setfB(y.getfB()+1);
                y = y.getLigaIzq();
            }
        }
        if((pivote.getfB() != 2) || (pivote.getfB() != -2)){
            return;
        }
        if(pivote.getfB() == +2){
            if(q.getfB() == +1){
                rotacionDerecha(pivote, q);
            }else{
                dobleRotacionDerecha(pivote, q);
            }
        }else if(pivote.getfB() == -2){
            if(q.getfB() == -1){
                rotacionIzquierda(pivote, q);
            }else{
                dobleRotacionIzquierda(pivote, q);
            }
        }
        
        if(padrePivote == null){
            root = y;
            return;
        }
        
        if(padrePivote.getLigaIzq() == pivote){
            padrePivote.setLigaDer(q);
        }else{
            padrePivote.setLigaDer(q);
            
        }
    }
    
    /**
     * Permite realizar rotación a la DERECHA para balancear el arbol
     * @param pivote
     * @param q 
     */
    public void rotacionDerecha(AVLNode pivote, AVLNode q){
        pivote.setLigaIzq(q.getLigaDer());
        q.setLigaDer(pivote);
        pivote.setfB(0);
        q.setfB(0);
    }
    
    /**
     * Permite realizar rotación a la IZQUIERDA para balancear el arbol
     * @param pivote
     * @param q 
     */
    public void rotacionIzquierda(AVLNode pivote, AVLNode q){
        pivote.setLigaDer(q.getLigaIzq());
        q.setLigaIzq(q);
        pivote.setfB(0);
        q.setfB(0);
    }
    
    /**
     * Permite realizar DOBLE rotación a la DERECHA para balancear el arbol
     * @param pivote
     * @param q 
     */
    public void dobleRotacionDerecha(AVLNode pivote, AVLNode q){
        AVLNode r = q.getLigaDer();
        q.setLigaDer(r.getLigaIzq());
        r.setLigaIzq(q);
        pivote.setLigaIzq(r.getLigaDer());
        r.setLigaDer(pivote);
        switch(r.getfB()){
            case 0:
                pivote.setfB(0);
                q.setfB(0);
                break;
            case 1:
                pivote.setfB(-1);
                q.setfB(0);
                break;
            case -1:
                pivote.setfB(0);
                q.setfB(1);
                break;
        }
        r.setfB(0);
        q = r;
    }
     
    /**
     * Permite realizar DOBLE rotación a la IZQUIERDA para balancear el arbol
     * @param pivote
     * @param q 
     */
    public void dobleRotacionIzquierda(AVLNode pivote, AVLNode q){
        AVLNode r = q.getLigaIzq();
        q.setLigaIzq(r.getLigaDer());
        r.setLigaDer(q);
        pivote.setLigaDer(r.getLigaDer());
        r.setLigaIzq(pivote);
        switch(r.getfB()){
            case 0:
                pivote.setfB(0);
                q.setfB(0);
                break;
            case 1:
                pivote.setfB(0);
                q.setfB(-1);
                break;
            case -1:
                pivote.setfB(1);
                q.setfB(0);
                break;
        }
        r.setfB(0);
        q = r;
    }

    /**
     * Permite Mostrar el grafo represetado como lista ligada de adyacencia + arbol
     * @param r - Recibe un tipo de dato NODOAVL
     */
    public void showGraph(AVLNode r){
        if(r != null){
            showGraph(r.getLigaIzq());
            r.getVertice().ViewEdgesofVertex();
            System.out.println(" ");
            showGraph(r.getLigaDer());
        }

    }
    
    /**
     * Permite añadir un vértice adyacente al vértice en cuestión.
     * Tambien establece la cantidad de llamadas hechas por este registro
     * @param r - Recibe un tipo de dato NODOAVL
     * @param cellNumber - Recibe el número celular de origen
     * @param cellNumberDestiny  - Recibe el número celular al cual llama el número A
     */
    public void addEdgeToVertex(AVLNode r, String cellNumber, String cellNumberDestiny){
        if(r != null){
            addEdgeToVertex(r.getLigaIzq(), cellNumber, cellNumberDestiny);
            if(r.getCellNumber().equals(cellNumber)){
                r.getVertice().addEdge(cellNumberDestiny);
            }
            addEdgeToVertex(r.getLigaDer(), cellNumber, cellNumberDestiny);
        }

    }
    
    /**
     * Permite obtener la cantidad de llamadas que realizó un número.
     * @param r - Recibe un parametro tipo NODOAVL
     * @param cellNumber - Recibe un registro celular como parámetro
     */
    public void SearchPhoneCallLog(AVLNode r, String cellNumber){
        if(r != null){
            SearchPhoneCallLog(r.getLigaIzq(), cellNumber);
            if(r.getCellNumber().equals(cellNumber)){
                System.out.println(r.getVertice().getPhonecallCount());               
            }
            SearchPhoneCallLog(r.getLigaDer(), cellNumber);
        }    
    }
    
    /**
     * Indexa la los vertices y sus adyacentes en un Array
     * @param r
     */
  
    public void convertToArrayList(AVLNode r){
        if(r != null){
            convertToArrayList(r.getLigaIzq());
            adjList.add(r.getVertice());
            convertToArrayList(r.getLigaDer());
        }
    }

    /**
     * Permite obtener la raiz del árbol
     * @return 
     */
    public AVLNode getRoot() {
        return root;
    }

    /**
     * Permite obtener el número total de registros del arbol.
     * @return 
     */
    public int getTotalNumbers() {
        return totalNumbers;
    }    

    public ArrayList <LinkedListVertex> getAdjList() {
        return adjList;
    }

}