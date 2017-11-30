/*
 * Esta clase permite representar un grafo Dirigido como Lista Ligada de Ayacencia  
 */


import techutracker.model.*;
import java.util.ArrayList;

/**
 * @author Felipe Cadavid
 * @version 1.0
 */
public class DirectedGraph {
    
    Vertex root, ult, x;
    ArrayList <Vertex> vector = new ArrayList();
    
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
                    vector.add(root);
                    ult = x = root;
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
        if(!vector.isEmpty()){
            for(Vertex validate: vector){
                if(validate.getCellNumber().equals(cellNumber)){
                    break;
                }else{
                    Vertex p = new Vertex(cellNumber);
                    ult.setLiga(p);
                    ult = p;
                }                
            }
        }else{
            Vertex p = new Vertex(cellNumber);
            ult.setLiga(p);
            ult = p;
        }
            
        
        
    }
    
}
