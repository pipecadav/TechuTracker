 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techutracker;

import java.io.File;
import java.io.IOException;
import java.util.prefs.Preferences;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javax.xml.bind.JAXBContext;
import techutracker.view.RootLayoutController;

/**
 *
 * @author Felipe Cadavid
 * @version 1.0
 * 
 */
public class TechuTracker extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;
    
    public TechuTracker(){
        
    }
    /**
     * Inicializa el programa
     * @param primaryStage 
     */
    @Override
    public void start(Stage primaryStage){
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("TECH U Tracker");
        this.primaryStage.getIcons().add(new Image("file:src/techutracker/view/resources/img/App_icon.png"));
        initRootLayout();
        initGraphOverview();
        
    }
    /**
     * Inicializa la barra de menu y la ventana principal
     */
    public void initRootLayout(){
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(TechuTracker.class.getResource("view/RootLayout.fxml"));
            this.rootLayout = (BorderPane) loader.load();
            
            Scene localScene = new Scene(this.rootLayout);
            this.primaryStage.setScene(localScene);
            RootLayoutController localcontroller = (RootLayoutController) loader.getController();
            localcontroller.setInitTechu(this);
            this.primaryStage.show();
            
        }
        catch (IOException localIOException){
            localIOException.printStackTrace();
        }
        File localFile = getFilePath();
        if(localFile != null){
            loadDataFromFile(localFile);
        }
    }
    /**
     * Inicializa el contenido de la aplicación donde se encuntran las funciones del programa
     */
    public void initGraphOverview(){
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(TechuTracker.class.getResource("view/GraphOverview.fxml"));
            AnchorPane graphOverview = (AnchorPane) loader.load();
            
            this.rootLayout.setCenter(graphOverview);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public Stage getPrimaryStage(){
        return primaryStage;
    }
    
    /**
     * Retorna el archivo que fue abierto por ultima vez. 
     * Esto se hace a traves de preferencias que se leen desde el SO.
     * 
     * @return 
     */
    public File getFilePath(){
        Preferences localPreferences = Preferences.userNodeForPackage(TechuTracker.class);
        String accessPath = localPreferences.get("filepath", null);
        if(accessPath != null){
            return new File(accessPath);
        }
        return null;
    }
    /**
     * Establece la ruta del archivo cargado. 
     * @param filePath - Archvo seleccionado
     */
    public void setFilePath(File filePath){
        Preferences localPreferences = Preferences.userNodeForPackage(TechuTracker.class);
        if(filePath != null){
            localPreferences.put("filepath", filePath.getPath());
            this.primaryStage.setTitle("TECH U Tracker - " + filePath.getName());
        }else{
            localPreferences.remove("filepath");
            this.primaryStage.setTitle("TECH U Tracker");
        }
    }
    
    /**
     * Carga los datos de un grafo en base a un archivo
     * @param theFile - Archivo seleccionado
     */
    public void loadDataFromFile(File theFile){
       
    }
    /**
     * Guarda la información del grafo en un archivo 
     * @param theFile - Archivos de destino
     */
    public void saveDatatoFile(File theFile){
        
    }
    /**
     * Muestra la información del programa cuando se hace click en "Acerca De"
     */
    public void showAbout(){
        try{
            
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(TechuTracker.class.getResource("view/about.fxml"));
            AnchorPane localAnchorPane = (AnchorPane) loader.load();
            Stage localStage = new Stage();
            localStage.setTitle("About");
            localStage.getIcons().add(new Image("file:src/techutracker/view/resources/img/App_icon.png"));
            localStage.initModality(Modality.WINDOW_MODAL);
            localStage.initOwner(this.primaryStage);
            Scene localScene = new Scene(localAnchorPane);
            localStage.setScene(localScene);
            localStage.show();
        }catch (IOException localIOException){
            localIOException.printStackTrace();
        }
    }
    
    
    public static void main(String[] args) {
       launch(args);
    }
    
}
