package techutracker.model.directedgraph;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import techutracker.model.avl.AVLNode;
import techutracker.model.avl.AVLTree;

/**
 *
 * @author cadav
 */
public class PathsAndCosts {
    
    AVLTree tree;
    ArrayList <LinkedListVertex> adjlinkedlist;
    
    public void searchPath(String cellNumber1, String cellNumber2){
        AVLNode r = tree.getRoot();
        tree.convertToArrayList(r);
        adjlinkedlist = tree.getAdjList();
        
        for(LinkedListVertex search: adjlinkedlist){
            if(search.getCellNumber().equals(cellNumber1)){
                Vertex p = search.getRoot();
                while(p != null){
                    
                }
            }
        }

    }            
        
    
}
