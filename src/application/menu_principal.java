package application;

import javafx.animation.Animation.Status;
import javafx.animation.ScaleTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 * Clase principal del menú de la aplicación.
 * Maneja la lógica y las animaciones de la interfaz principal.
 * @author Diego V.
 * @version 1.0
 */
public class menu_principal {

    /**
     * Objeto ImageView para mostrar y accionar el logo del proyecto
     * Contiene la imagen del proyecto
     */
    @FXML
    public ImageView Techcom;

    /**
     * Objeto ImageView para mostrar una imagen
     * Contiene la imagen del colegio
     */
    @FXML
    public ImageView Delfos;

    /**
     * Objeto ImageView para mostrar una imagen
     * Contiene la imagen de vision
     */
    @FXML
    public ImageView Vision;

    /**
     * Objeto ImageView para mostrar una imagen
     * Contiene la imagen de mision
     */
    @FXML
    public ImageView Mision;

    /**
     * Objeto ImageView para mostrar una imagen
     * Contiene la imagen de deepfake
     */
    @FXML
    public ImageView Deepfake;

    /**
     * Objeto ImageView para mostrar una imagen
     * Contiene la imagen de clonacion de voz
     */
    @FXML
    public ImageView Clonacion_de_voz;

    /**
     * Objeto ImageView para mostrar una imagen
     * Contiene la imagen de creditos
     */
    @FXML
    public ImageView Creditos;


    /**
     * Objeto ScaleTransition para la imagen Techcom
     */
    public ScaleTransition animacionTechcom;

    /**
     * Objeto ScaleTransition para el boton de Deepfake
     */
    public ScaleTransition animacion_de_deepfake;
    /**
     * Objeto ScaleTransition para el boton de clonacion de voz
     */
    public ScaleTransition  animacion_de_clonacion;
    /**
     * Objeto ScaleTransition para el boton de creditos
     */
    public ScaleTransition  animacion_creditos;

    /**
     * Objeto Button para ventana de creditos
     */
    @FXML
    public Button creditos;

    /**
     * Objeto Button para la ventana de Deepfake
     */
    @FXML
    public Button deepfake;

    /**
     * Objeto Button para la ventana de Clonacion de voz
     */
    @FXML
    public Button clonacion_de_voz;
    /**
     * Inicializa los componentes gráficos, las animaciones y las acciones asociadas a los botones de la interfaz.
     * Esta funcion se llama automáticamente cuando la interfaz se carga.
     * <p>
     * Se realiza lo siguiente:
     * - Inicializa el motor de WebView para cargar un video de YouTube.
     * - Configura las animaciones para los botones de la interfaz.
     * - Configura las interacciones de los botones con animaciones al hacer clic.
     */
    @FXML
    public void initialize() {
        inicializarAnimacion_imagen_techcom();
        inicializarAnimacion_boton_deepfake();
        inicializarAnimacion_boton_creditos();
        inicializarAnimacion_boton_clonacion_de_voz();
        //inicializarAnimacion_click_jugar();
        //inicializarAnimacion_click_salir();
        //int puntosIniciales = 0;
        //puntos.setText("Puntos: " + puntosIniciales);
    }


    /**
     * Crea una animacion para el boton clonacion de voz (operativa)
     */
    public void inicializarAnimacion_boton_clonacion_de_voz() {

        animacion_de_clonacion = new ScaleTransition(Duration.millis(150), clonacion_de_voz);
        animacion_de_clonacion.setByX(0.02);
        animacion_de_clonacion.setByY(0.02);
        animacion_de_clonacion.setAutoReverse(true);
        animacion_de_clonacion.setCycleCount(2);
    }

    /**
     * ejecucion (handler) de animacion
     */
    @FXML
    public void soft_clonacion() {
        animacion_soft_clonacion_de_voz(animacion_de_clonacion);
    }



    /**
     * Recibe el objeto animacion_uno para la animacion del boton de Clonacion de voz
     *
     * @param animacion_de_clonacion necesita de un objeto scaletransition
     */
    public void animacion_soft_clonacion_de_voz(ScaleTransition animacion_de_clonacion) {
        if (animacion_de_clonacion.getStatus() != Status.RUNNING) {
            animacion_de_clonacion.playFromStart();
        }
    }



    /**
     * Crea una animacion para el boton deepfake (operativa)
     */
    public void inicializarAnimacion_boton_deepfake() {

        animacion_de_deepfake = new ScaleTransition(Duration.millis(150), deepfake);
        animacion_de_deepfake.setByX(0.02);
        animacion_de_deepfake.setByY(0.02);
        animacion_de_deepfake.setAutoReverse(true);
        animacion_de_deepfake.setCycleCount(2);
    }
    /**
     * Verificacion de animacion (semi-obsoleta)
     *
     * @param animacion_de_deepfake necesita de un objeto ScaleTransition
     */
    public void animacion_soft_deepfake(ScaleTransition animacion_de_deepfake) {
        if (animacion_de_deepfake.getStatus() != Status.RUNNING) {
            animacion_de_deepfake.playFromStart();
        }
    }
    /**
     * ejecucion (handler) de animacion
     */
    @FXML
    public void soft_deepfake() {
        animacion_soft_deepfake(animacion_de_deepfake);
    }


    /**
     * Crea una animacion para el boton creditos (operativa)
     */
    public void inicializarAnimacion_boton_creditos() {

        animacion_creditos = new ScaleTransition(Duration.millis(150), creditos);
        animacion_creditos.setByX(0.02);
        animacion_creditos.setByY(0.02);
        animacion_creditos.setAutoReverse(true);
        animacion_creditos.setCycleCount(2);
    }

    /**
     * Verificacion de animacion (operativa)
     *
     * @param animacion_creditos necesita de un objeto ScaleTransition
     */
    public void animacion_soft_creditos(ScaleTransition animacion_creditos) {
        if (animacion_creditos.getStatus() != Status.RUNNING) {
            animacion_creditos.playFromStart();
        }
    }



    /**
     * ejecucion (handler) de animacion
     */



    /**
     * ejecucion (handler) de animacion
     */
    @FXML
    public void soft_creditos() {
        animacion_soft_creditos(animacion_creditos);
    }


    /**
     * ejecucion (handler) de video, pasando una url de YT
     * carga el video de deepfake
     */



    /**
     * ejecucion (handler) de video, pasando una url de YT
     * carga el video de clonacion de voz
     * espera a otro metodo
     */


    /**
     * Crea animacion de imagen
     */
    public void inicializarAnimacion_imagen_techcom() {

        animacionTechcom = new ScaleTransition(Duration.millis(150), Techcom);
        animacionTechcom.setByX(0.03);
        animacionTechcom.setByY(0.03);
        animacionTechcom.setAutoReverse(true);
        animacionTechcom.setCycleCount(2);
    }

    /**
     * Verifica su ejecucion
     *
     * @param animacionTechcom recoge la animacion de techcom
     */
    public void animacion_image(ScaleTransition animacionTechcom) {
        if (animacionTechcom.getStatus() != Status.RUNNING) {
            animacionTechcom.playFromStart();
        }
    }



    /**
     * Ejecucion de animacion
     */
    @FXML
    public void soft_techcom() {
        animacion_image(animacionTechcom);
    }



    /**
     * crea ventana emergente para las excepciones y errores de la aplicacion
     *
     * @param e recoge el error
     */
    public void alerta_de_error(Exception e) {
        Alert errorAlert = new Alert(AlertType.ERROR);
        errorAlert.setTitle("Error en la Aplicación");
        errorAlert.setHeaderText("Error en la ejecución");
        errorAlert.setContentText("error: " + e);
        Stage errores = (Stage) errorAlert.getDialogPane().getScene().getWindow();
        errores.getIcons().add(new Image(getClass().getResourceAsStream("resources/error_icon.png")));
        errorAlert.showAndWait();
    }

    /**
     * Reproduce un sonido
     */
    private MediaPlayer playsound;

    /**
     * Crea una ventana para Deepfake
     */
    @FXML
    public void ventana_deepfake() {
        try {
            if (playsound == null) {
                String audio = getClass().getResource("resources/deepfake_prueba.mp3").toExternalForm();
                Media sound = new Media(audio);
                playsound = new MediaPlayer(sound);
            }
            playsound.stop();
            playsound.play();
            animacion_image(animacionTechcom);
            Stage stage = (Stage) deepfake.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(getClass().getResource("deepfake.fxml"));
            Stage preguntas = new Stage();
            preguntas.setTitle("Deepfake");
            Image icono = new Image(getClass().getResourceAsStream("resources/TECHCOM.png"));
            preguntas.getIcons().add(icono);
            Scene Deepfake = new Scene(root, 800, 600);
            preguntas.setMaximized(true);
            preguntas.setScene(Deepfake);
            Deepfake.getStylesheets().add(getClass().getResource("resources/menu_principal.css").toExternalForm());
            preguntas.show();
        } catch (Exception e) {
            alerta_de_error(e);
        }
    }

    /**
     * Crea una ventana para clonacion de voz
     */
    @FXML
    public void ventana_clonacion_de_voz() {
        try {
            animacion_image(animacionTechcom);
            Stage stage = (Stage) clonacion_de_voz.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(getClass().getResource("clonacion_de_voz.fxml"));
            Stage preguntas = new Stage();
            preguntas.setTitle("Clonacion de voz");
            Image icono = new Image(getClass().getResourceAsStream("resources/TECHCOM.png"));
            preguntas.getIcons().add(icono);
            Scene Deepfake = new Scene(root, 800, 600);
            preguntas.setMaximized(true);
            preguntas.setScene(Deepfake);
            Deepfake.getStylesheets().add(getClass().getResource("resources/menu_principal.css").toExternalForm());
            preguntas.show();
        } catch (Exception e) {
            alerta_de_error(e);
        }
    }

    /**
     * Cierra el programa por completo
     */
    @FXML
    public void exit() {
        System.exit(0);
    }

    /**
     * Crea una ventana para creditos
     */
    @FXML
    public void ventana_creditos() {
        try {
            animacion_image(animacionTechcom);
            Stage stage = (Stage) creditos.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(getClass().getResource("creditos.fxml"));
            Stage preguntas = new Stage();
            preguntas.setTitle("Creditos");
            Image icono = new Image(getClass().getResourceAsStream("resources/TECHCOM.png"));
            preguntas.getIcons().add(icono);
            Scene Deepfake = new Scene(root, 800, 600);
            preguntas.setMaximized(true);
            preguntas.setScene(Deepfake);
            Deepfake.getStylesheets().add(getClass().getResource("resources/menu_principal.css").toExternalForm());
            preguntas.show();
        } catch (Exception e) {
            alerta_de_error(e);
        }
    }

    /**
     * Plantilla de creacion de ventanas
     */
    @FXML
    public void nueva_ventana() {
        try {
            //animacion_image(animacionTechcom);
            Stage stage = (Stage) Techcom.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(getClass().getResource("juegos.fxml"));
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


}