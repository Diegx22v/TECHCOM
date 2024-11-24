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
 * Clase de la ventana de deepfake.
 * Maneja la lógica y las animaciones de la ventana.
 * @author Diego V.
 * @version 1.0
 */
public class deepfake {

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
    private Hyperlink proyecto;

    /**
     * Metodo que inicia lo necesario
     */
    public void initialize() {
        webEngine = webView.getEngine();
        cargar_video("https://www.youtube.com/embed/MxD7hDUjS_8");
    }

    /**
     * Carga el video con la url de YouTube
     * @param url url del video
     */
    public void cargar_video(String url) {
        webEngine.load(url);
    }

    /**
     *  Hipervinculo del proyecto de nuestro grupo
     * @param event necesita de un evento
     * @throws URISyntaxException evita error
     * @throws IOException evita otros errores consecuentes de la red
     */
    @FXML
    void proyecto_web(ActionEvent event) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://colab.research.google.com/drive/1dygH6NjFvrz2Slhufk2ilNR_kD5C48as"));
    }

}
