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
 * Clase de clonacion de voz
 * Maneja la logica de esta ventana
 * @author Diego V.
 * @version 1.1
 */
public class clonacion_de_voz {

    /**
     * Objeto obsoleto
     */
    @FXML
    private WebView webView;
    /**
     * Objeto obsoleto
     */
    @FXML
    private WebEngine webEngine;

    /**
     * Objeto obsoleto
     */
    @FXML
    private VBox contenedor_vertical,Contenedor_vertical_dos,Contenedor_vertical_tres;

    /**
     * Objeto obsoleto
     */
    @FXML
    private HBox contenedor_horizontal,Contenedor_horizontal_dos,Contenedor_horizontal_tres;

    /**
     * Objeto obsoleto
     */
    @FXML
    private ImageView Techcom;

    /**
     * Objeto obsoleto
     */
    @FXML
    private Hyperlink proyectodos;

    /**
     * Inicializa  lo necesario
     */
    public void initialize() {
        webEngine = webView.getEngine();
        cargar_video("https://www.youtube.com/embed/7kcF9v4oo7M");
    }

    /**
     * Carga el video con la url de YouTube
     * @param url recoge la url del video
     */
    public void cargar_video(String url) {
        webEngine.load(url);
    }

    /**
     * Hipervinculo del proyecto del segundo grupo
     * @param event recoge el evento
     * @throws URISyntaxException evita errores
     * @throws IOException evita errores consecuentes a la red
     */
    @FXML
    void proyecto_web_2(ActionEvent event)throws URISyntaxException,IOException {
        Desktop.getDesktop().browse(new URI("https://elevenlabs.io/"));
    }

}
