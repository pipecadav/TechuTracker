/*
 * Esta clase almacena los números telefónicos en un Arbol AVL 
 */



/**
 * Codificación de lo visto en clase
 * @author Felipe Cadavid
 */
public class AVLTree {
    
    private AVLNode root;
    private AVLNode ult;
    private AVLNode x;
    private int totalNumbers = 0;

    public AVLTree() {
    }
    /**
     * Inserta un vector en cada Nodo del Arbol
     * @param cellNumber
     */
    
    //public void insertar
    
    public void insertarDato(String cellNumber){
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
    
    public void rotacionDerecha(AVLNode pivote, AVLNode q){
        pivote.setLigaIzq(q.getLigaDer());
        q.setLigaDer(pivote);
        pivote.setfB(0);
        q.setfB(0);
    }
    
    public void rotacionIzquierda(AVLNode pivote, AVLNode q){
        pivote.setLigaDer(q.getLigaIzq());
        q.setLigaIzq(q);
        pivote.setfB(0);
        q.setfB(0);
    }
    
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

    
    public void showGraph(AVLNode r){
        if(r != null){
            showGraph(r.getLigaIzq());
            r.getVertice().ViewEdgesofVertex();
            System.out.println(" ");
            showGraph(r.getLigaDer());
        }

    }
    
    public void addEdgeToVertex(AVLNode r, String cellNumber, String cellNumberDestiny){
        if(r != null){
            addEdgeToVertex(r.getLigaIzq(), cellNumber, cellNumberDestiny);
            if(r.getCellNumber().equals(cellNumber)){
                r.getVertice().addEdge(cellNumberDestiny);
            }
            addEdgeToVertex(r.getLigaDer(), cellNumber, cellNumberDestiny);
        }

    }

    public AVLNode getRoot() {
        return root;
    }

    public void setRoot(AVLNode root) {
        this.root = root;
    }

    public AVLNode getUlt() {
        return ult;
    }

    public void setUlt(AVLNode ult) {
        this.ult = ult;
    }

    public AVLNode getX() {
        return x;
    }

    public void setX(AVLNode x) {
        this.x = x;
    }

    public int getTotalNumbers() {
        return totalNumbers;
    }

    public void setTotalNumbers(int totalNumbers) {
        this.totalNumbers = totalNumbers;
    }
    
    
}
