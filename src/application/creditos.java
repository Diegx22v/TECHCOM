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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.util.Duration;
import utils.Utils;
import javafx.application.Platform;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
/**
 * Clase de creditos del proyecto
 * Maneja la logica de esta ventana
 * @author Diego V.
 * @version 1.1
 */
public class creditos {
    /**
     *  Objetos obsoletos
     */
    @FXML
    private VBox contenedor_vertical,Contenedor_vertical_dos,Contenedor_vertical_tres;

    /**
     *  Objetos obsoletos
     */
    @FXML
    private HBox contenedor_horizontal,Contenedor_horizontal_dos,Contenedor_horizontal_tres;

    /**
     *  Imagen de Techcon
     */
    @FXML
    private ImageView Techcom;

    /**
     *  Imagen de retorno
     */
    @FXML
    private ImageView Return_credits;


    /**
     *  Animaciones
     */
    private ScaleTransition credits_return_animation;

    /**
     * Inicializa las animaciones y metodos
     */
    @FXML
    public void initialize(){
        initialize_animation_return_credits();
    }

    /**
     * Inicia una animacion
     */
    private void initialize_animation_return_credits() {

        credits_return_animation = new ScaleTransition(Duration.millis(150), Return_credits);
        credits_return_animation.setByX(0.15);
        credits_return_animation.setByY(0.10);
        credits_return_animation.setAutoReverse(true);
        credits_return_animation.setCycleCount(2);
    }

    /**
     * verifica la ejecucion de la animacion
     * @param animacion recoge la animacion
     */
    void animacion_image(ScaleTransition animacion) {
        if (animacion.getStatus() != Status.RUNNING) {
            animacion.playFromStart();
        }
    }

    /**
     * Inicia la animacion
     */
    @FXML
    void softimage1() {
        animacion_image(credits_return_animation);
    }

    /**
     * Cierra la ventana actual y regresa a la anterior
     */
    @FXML
    private void return_main1() {
        try {
            Return_credits.setDisable(true);
            Stage cerrar = (Stage) Return_credits.getScene().getWindow();
            cerrar.close();
            Parent root = FXMLLoader.load(getClass().getResource("menu_principal.fxml"));
            Stage return_main_scene = new Stage();
            return_main_scene.setTitle("TECHCON");
            Image icono = new Image(getClass().getResourceAsStream("resources/TECHCOM.png"));
            return_main_scene.getIcons().add(icono);
            Scene Deepfake = new Scene(root, 800, 600);
            return_main_scene.setMaximized(true);
            return_main_scene.setScene(Deepfake);
            Deepfake.getStylesheets().add(getClass().getResource("resources/interfaz_principal.css").toExternalForm());

            // Mostrar la nueva ventana
            cerrar.close();
            return_main_scene.show();
        } catch (Exception e) {
            // ALERTA`
            Alert errorAlert = new Alert(AlertType.ERROR);
            errorAlert.setTitle("Error en la Aplicación");
            errorAlert.setHeaderText("Error en la ejecución");
            errorAlert.setContentText("error: " + e);

            Stage errores = (Stage) errorAlert.getDialogPane().getScene().getWindow();
            errores.getIcons().add(new Image(getClass().getResourceAsStream("resources/error_icon.png")));
            errorAlert.showAndWait();
        }finally{
            Return_credits.setDisable(false);
        }
    }

    /**
     * Metodo a borrar
     */
    @FXML
    private void nueva_ventana() {
        try {
            //animacion_image(animacionTechcom);
            Stage stage = (Stage) Techcom.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(getClass().getResource("menu_principal.fxml"));
            Stage preguntas = new Stage();
            preguntas.setTitle("Juegos locos franklin");
            Image icono = new Image(getClass().getResourceAsStream("resources/TECHCOM.png"));
            preguntas.getIcons().add(icono);
            Scene juegos_locos_franklin = new Scene(root, 800, 600);
            preguntas.setMaximized(true);
            preguntas.setScene(juegos_locos_franklin);
            juegos_locos_franklin.getStylesheets().add(getClass().getResource("resources/menu_principal.css").toExternalForm());
            preguntas.show();
        } catch (Exception e) {
            alerta_de_error(e);
        }
    }

    /**
     * Crea una alerta de error
     * @param e recoge el error
     */
    public void alerta_de_error(Exception e) {
        Alert errorAlert = new Alert(AlertType.ERROR);
        errorAlert.setTitle("Error en la Aplicación");
        errorAlert.setHeaderText("Error en la ejecución");
        errorAlert.setContentText("error: "+e);
        Stage errores = (Stage) errorAlert.getDialogPane().getScene().getWindow();
        errores.getIcons().add(new Image(getClass().getResourceAsStream("resources/error_icon.png")));
        errorAlert.showAndWait();
    }
}
