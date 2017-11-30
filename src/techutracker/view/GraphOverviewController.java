/*
 * Clase que permite ejecutar funciones específicas del grafo
 */
package techutracker.view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.TextFlow;
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
    
    @FXML
    private Label resultLabel;
    
    
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
        resultLabel.setText("Relación entre A y B:");
    }
    
    /**
     * Ejecuta la función Menor Número de Saltos 
     * cuando hace click en el botón "Menor Número Saltos"
     */
    @FXML
    public void lessAmountHops(){
        resultLabel.setText("Menor cantidad de Saltos:");
    }
    
    /**
     * Determina la cantidad de llamadas de un número especifico
     */
    @FXML
    public void amountOfCallsA(){
        resultLabel.setText("Cantidad de Llamadas de A:");
    }
    
    /**
     * Determina la cantidad de números en el registro de llamadas
     */
    @FXML
    public void totalNumbers(){
        resultLabel.setText("Total de Números:");
        
    }
    
}
