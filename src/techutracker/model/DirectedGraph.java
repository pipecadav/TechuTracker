/*
 * Esta clase permite representar un grafo Dirigido como Lista Ligada de Ayacencia  
 */
package techutracker.model;

import java.util.ArrayList;

/**
 * @author Felipe Cadavid
 * @version 1.0
 */
public class DirectedGraph {
    
    Vertex root, ult, x;
    ArrayList <Vertex> vector;
    
    /**
     * Crea los vertices y los almacena en un vector del tipo Array List
     * @param cellNumber 
     */
    public DirectedGraph(String cellNumber){
        if(!vector.isEmpty()){
            for(Vertex validate: vector){
                if(validate.getCellNumber().equals(cellNumber)){
                    break;
                }else{
                    root = new Vertex(cellNumber);
                    ult = x = root;
                    vector.add(root);
                }
            }
        }else{
            root = new Vertex(cellNumber);
            ult = x = root;
            vector.add(root);
        }
        
    }
    
    /**
     * Añade un vector adyacente al vector principal
     * @param cellNumber 
     */
    public void addAdjacentVertex(String cellNumber){
        for(Vertex validate: vector){
            if(!validate.getCellNumber().equals(cellNumber)){
                Vertex p = new Vertex(cellNumber);
                ult.setLiga(p);
                ult = p;
            }
        }
        
        
    }

    public Vertex getRoot() {
        return root;
    }

    public void setRoot(Vertex root) {
        this.root = root;
    }

    public ArrayList<Vertex> getVector() {
        return vector;
    }

    public void setVector(ArrayList<Vertex> vector) {
        this.vector = vector;
    }
    
    
    
}
