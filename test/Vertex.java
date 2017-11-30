/*
 * Esta clase contiene el objeto vértice. 
 * Este objeto se instancia en la Lista Ligada de Adyacencia
 */

import techutracker.model.*;

/**
 *
 * @author Felipe Cadavid
 * @version 1.0
 */
public class Vertex {
    
    private String cellNumber;
    private Vertex liga;
    
    /**
     * Constructor del vértice
     * @param cellNumber - Recibe un dato String con el Número del registro
     */
    public Vertex(String cellNumber){
        this.cellNumber = cellNumber;
        liga = null;
    }

    /**
     * Devuelve el número celular que hay en dicho vértice
     * @return - Devuelve un dato tipo String
     */
    public String getCellNumber() {
        return cellNumber;
    }

    /**
     * Permite modificar el número celular del vértice 
     * @param cellNumber - Recibe untipo de dato String
     */
    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    /**
     * Retorna el vértice con quien está relacionado este vértice
     * @return - tipo de dato Liga
     */
    public Vertex getLiga() {
        return liga;
    }

    /**
     * Permite ingresar el siguiente número con quien está relacionado el vector
     * @param liga - Recibe un parametro tipo Liga
     */
    public void setLiga(Vertex liga) {
        this.liga = liga;
    }  
    
}
