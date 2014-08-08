/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package webantenna;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author yamashita
 */
public class AntennaController extends AnchorPane implements Initializable {
    
    public AntennaController() {
    }

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
    
    private void loadFXML() throws IOException {
        FXMLLoader loader = new FXMLLoader(WebAntenna.class.getResource("Antenna.fxml"));
        loader.setRoot(this);
        loader.setController(this);
        loader.load();
    }
}
