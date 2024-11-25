package application;
import javafx.animation.Animation.Status;
import javafx.animation.ScaleTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.util.Duration;
import utils.Utils;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
/**
 * Clase de la ventana de juegos.
 * Maneja la lógica y  de los juegos.
 * @author Franklin C.
 * @version 1.0
 */
public class juegos {
    /**
     * Objeto Button para el primer juego
     */
    @FXML
    public Button juego_uno;

    /**
     * Objeto Button para salir del programa
     */
    @FXML
    public Button salir;


    /**
     * Objeto Button para el segundo juego
     */
    @FXML
    public Button juego_dos;

    /**
     * Objeto Button para el tercer juego
     */
    @FXML
    public  Button juegos_tres;

    /**
     * Metodo de cierre
     */
    @FXML
    public void salir(){
        System.exit(0);
    }

}
