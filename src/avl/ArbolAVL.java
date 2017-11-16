
package avl;

/**
 * Codificación de lo visto en clase
 * @author Felipe Cadavid
 */
public class ArbolAVL {
    
    NodoAVL root;
    NodoAVL ult;
    NodoAVL x;

    public ArbolAVL() {
    }
    
    public void insertarDato(Object dat){
        
        NodoAVL n = new NodoAVL(dat);
        if(root == null){
            root = n;
        }
        NodoAVL x = root;
        NodoAVL padreX = null;
        NodoAVL pivote = root;
        NodoAVL padrePivote = null;
        NodoAVL y;
        NodoAVL q = null;
        
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
    
    public void buscarInsertar(){
        
    }
    
    public void recalcularlosFB(){
        
    }
    
    public void rebalancear(){
        
    }
    
    public void rotacionDerecha(NodoAVL pivote, NodoAVL q){
        pivote.setLigaIzq(q.getLigaDer());
        q.setLigaDer(pivote);
        pivote.setfB(0);
        q.setfB(0);
    }
    
    public void rotacionIzquierda(NodoAVL pivote, NodoAVL q){
        pivote.setLigaDer(q.getLigaIzq());
        q.setLigaIzq(q);
        pivote.setfB(0);
        q.setfB(0);
    }
    
    public void dobleRotacionDerecha(NodoAVL pivote, NodoAVL q){
        NodoAVL r = q.getLigaDer();
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
     
    public void dobleRotacionIzquierda(NodoAVL pivote, NodoAVL q){
        NodoAVL r = q.getLigaIzq();
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
}
