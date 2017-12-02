
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cadav
 */
public class PathsAndCosts {
    
    AVLTree tree;
    ArrayList <LinkedListVertex> adjlinkedlist;
    
    public void searchPath(AVLTree tree){
        AVLNode r = tree.getRoot();
        tree.convertToArrayList(r);
        adjlinkedlist = tree.getAdjList();

    }            
        
    
}
