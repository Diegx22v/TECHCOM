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
 * @version 1.0
 */
public class clonacion_de_voz {

    /**
     * Objeto WebView para visualizar paginas webs
     */
    @FXML
    public WebView webView;
    /**
     * Objeto WebEngine motor de navegador
     */
    @FXML
    public WebEngine webEngine;

    /**
     * Objeto VBox para visualizar la carta principal
     */
    @FXML
    public VBox contenedor_vertical;

    /**
     * Objeto HBox para alinear el boton de hipervinculo
     */
    @FXML
    public HBox contenedor_horizontal;

    /**
     * Objeto ImageView pare el logo del proyecto
     */
    @FXML
    public ImageView Techcom;

    /**
     * Objeto HyperLink para redirigirnos a la pagina del segundo proyecto
     */
    @FXML
    public Hyperlink proyectodos;

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
    public void proyecto_web_2(ActionEvent event)throws URISyntaxException,IOException {
        Desktop.getDesktop().browse(new URI("https://elevenlabs.io/"));
    }

}
