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
    private int phonecallCount;
    
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
     */
    public void addEdge(String cellNumber){
        Vertex p = new Vertex(cellNumber);
        ult.setLiga(p);
        ult = p;
        this.phonecallCount++;
    }
    
    /**
     * Permite imprimir el vertice con sus adyacentes
     */
    public void ViewEdgesofVertex(){
        while(x != null){
            System.out.print(x.getCellNumber() +" ->" );
            x = x.getLiga();
        }
    }

    /**
     * Permite obtener el vértice raiz de esta lista ligada
     * @return 
     */
    public Vertex getRoot() {
        return root;
    }

    /**
     * Permite modificar el vértice raiz de esta lista ligada
     * @param root 
     */
    public void setRoot(Vertex root) {
        this.root = root;
    }

    /**
     * Permite Obtener el conteo de llamadas de un registro
     * @return 
     */
    public int getPhonecallCount() {
        return phonecallCount;
    }

    /**
     * Permite modificar el conteo de llamadas de un registro
     * @param phonecallCount 
     */
    public void setPhonecallCount(int phonecallCount) {
        this.phonecallCount = phonecallCount;
    }
    

}
