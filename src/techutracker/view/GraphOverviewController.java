/*
 * Clase que permite ejecutar funciones específicas del grafo
 */
package techutracker.view;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import techutracker.TechuTracker;

/**
 * FXML Controller class
 *
 * @author Felipe Cadavid
 * @version 1.0
 */
public class GraphOverviewController {
    
    @FXML
    private TextField numberATextField;
    
    @FXML
    private TextField numberBTextField;
    
    
    private TechuTracker initTechu;
    
    /**
     * Constructor
     */
    public GraphOverviewController(){
}
    
    /**
     * Llamado para hacer referencia a si mismo
     */
    public void setInitTechu(TechuTracker initTechy){
        
    }
    
    /**
     * Ejecuta la función Relación de número A y número B 
     * cuando hace click en el botón "Relación A-B"
     */
    @FXML
    public void conectionAB(){
        
    }
    
    /**
     * Ejecuta la función Menor Número de Saltos 
     * cuando hace click en el botón "Menor Número Saltos"
     */
    @FXML
    public void lessAmountHops(){
        
    }
    
    /**
     * Determina la cantidad de llamadas de un número especifico
     */
    @FXML
    public void amountOfCallsA(){
        
    }
    
    /**
     * Determina la cantidad de números en el registro de llamadas
     */
    @FXML
    public void totalNumbers(){
        
    }
    
}
