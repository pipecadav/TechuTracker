/*
 * Esta clase permite representar un grafo Dirigido como Lista Ligada de Ayacencia  
 */

/**
 * @author Felipe Cadavid
 * @version 1.0
 */
public class LinkedListVertex {

    private Vertex root;
    private Vertex ult;
    private Vertex x;
    
    /**
     * Constructor
     * @param cellNumber
     */
    public LinkedListVertex(String cellNumber){
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
    
    public void ViewEdgesofVertex(){
        while(x != null){
            System.out.print(x.getCellNumber() +" ->" );
            x = x.getLiga();
        }
    }

    public Vertex getRoot() {
        return root;
    }

    public void setRoot(Vertex root) {
        this.root = root;
    }

}
