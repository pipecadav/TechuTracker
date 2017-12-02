
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cadav
 */
public class mainTest {
    
    static ArrayList <LinkedListVertex> listadeGrafos = new ArrayList();
    
    static void splitLine(String sentence){
        String [] getNumber = sentence.split("\\|");
        String parte1 = getNumber[0];
        String parte2 = getNumber[1];
        
        System.out.println(parte1);
        System.out.println(parte2);  
    }

    
    public static void main(String[] args) {
        
        AVLTree arbol = new AVLTree();
        
        arbol.insertNumber("50");
        arbol.insertNumber("32");
        arbol.insertNumber("98");
        arbol.insertNumber("48");
        arbol.insertNumber("60");
        
        

        AVLNode r = arbol.getRoot();
        
        arbol.addEdgeToVertex(r, "50", "32");
        arbol.addEdgeToVertex(r, "50", "48");
        arbol.addEdgeToVertex(r, "98", "50");
        arbol.addEdgeToVertex(r, "32", "60");
        arbol.addEdgeToVertex(r, "32", "48");
        arbol.addEdgeToVertex(r, "48", "60");
        arbol.addEdgeToVertex(r, "60", "98");
        
        
        
        
        arbol.showGraph(r);

        
        System.out.println(arbol.getTotalNumbers());
        arbol.SearchPhoneCallLog(r, "60");
        

        

       

       
        
        
    }
}
