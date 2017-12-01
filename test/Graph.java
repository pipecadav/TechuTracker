/*
 * Esta clase permite representar un grafo Dirigido como Lista Ligada de Ayacencia  
 */

/**
 * @author Felipe Cadavid
 * @version 1.0
 */
public class Graph {
    
    Vertex root, ult, x;
    
    /**
     * Constructor
     * @param cellNumber
     */
    public Graph(String cellNumber){
       root = new Vertex(cellNumber);
       ult = x = root;
    }
    
    /**
     * Añade un vector adyacente al vector principal
     * @param cellNumber 
     * @param v 
     */
    public void addEdge(String cellNumber){
        Vertex p = new Vertex(cellNumber);
        ult.setLiga(p);
        ult = p;
    }
    
    //public void addEdge(String cellNumber){
    //    Vertex p = new Vertex(cellNumber);
    //    Vertex q = v;
    //    if(q.getLiga() != null){
    //        while(q.getLiga() != null){
    //            q = q.getLiga();
    //        }
    //    }else{
    //        q.setLiga(p);
    //        
    //    } 
    //}
    
    public void ViewEdgesofVertex(Vertex v){
        while(x != null){
            System.out.println(x.getCellNumber() +" ->" );
        }
    }
}
