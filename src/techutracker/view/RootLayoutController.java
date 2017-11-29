/*
 * Este es el controlador de menu principal. Permite gestionar la aplicación principal
 * Por ejemplo, permite cargar un archivo de texto nuevo, o cargar un grafo .xml
 * 
 */
package techutracker.view;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import techutracker.TechuTracker;
/**
 * FXML Controller class
 *
 * @author Felipe Cadavid
 * @version 1.0 
 */
public class RootLayoutController {
      
    private TechuTracker initTechu;
    
    /**
     * Permite inicializar el menu de opciones de usuario
     * @param initTechu 
     */
    public void setInitTechu(TechuTracker initTechu) {
        this.initTechu = initTechu;
    }
    
    /**
     * Permite cargar un archivo .txt nuevo para empezar un registro nuevo de datos
     */
    
    @FXML
    public void LoadNew(){
        FileChooser localFileChooser = new FileChooser();
        FileChooser.ExtensionFilter localExtensionFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", new String[] { "*.txt" });
        localFileChooser.getExtensionFilters().add(localExtensionFilter);
        File localFile = localFileChooser.showOpenDialog(this.initTechu.getPrimaryStage());
        if(localFile != null){
            this.initTechu.loadDataFromFile(localFile);
        }
    
    }
    
    /**
     * Abre un archivo existente .xml donde se encuentre almacenado un grafo previo
     */
    
    @FXML
    public void openRecord(){
        FileChooser localFileChooser = new FileChooser();
        FileChooser.ExtensionFilter localExtensionFilter = new FileChooser.ExtensionFilter("XML files (*.xml)", new String[] { "*.xml" });
        localFileChooser.getExtensionFilters().add(localExtensionFilter);
        File localFile = localFileChooser.showOpenDialog(this.initTechu.getPrimaryStage());
        if(localFile != null){
            this.initTechu.loadDataFromFile(localFile);
        }
    }
    
    
    /**
     * Si se abre un archivo existente, este va guardar cambios sobre el mismo archivo
     * Sino, guarda un archivo nuevo
     */
    @FXML
    public void saveFile(){
        File localFile = this.initTechu.getFilePath();
        if(localFile != null){
            this.initTechu.saveDatatoFile(localFile);
        }else{
            saveAs();
        }
             
    }
    /**
     * Guarda el la información del grafo en un un archivo .xml
     */
    public void saveAs(){
        FileChooser localFileChooser = new FileChooser();
        FileChooser.ExtensionFilter localExtensionFilter = new FileChooser.ExtensionFilter("XML files (*.xml)", new String[] { "*.xml" });
        localFileChooser.getExtensionFilters().add(localExtensionFilter);
        File localFile = localFileChooser.showSaveDialog(this.initTechu.getPrimaryStage());
        if(localFile != null){
            if(!localFile.getPath().endsWith(".xml")){
                localFile = new File(localFile.getPath() + ".xml");
            }
            this.initTechu.saveDatatoFile(localFile);
        }
    }
    
    /**
     * Salida de la Aplicacion
     */
    @FXML
    public void exitApp(){
        System.exit(0);
    }
    
    /**
     * Abre el manual de usuario
     */
    @FXML
    public void openManual() throws URISyntaxException, IOException{
        this.initTechu.showManual();
        
    }
    
    /**
     * Abre ventana de Información de la Aplicación 
     */
    @FXML 
    public void aboutInfo(){
        this.initTechu.showAbout();
        
    }

  
    
}
