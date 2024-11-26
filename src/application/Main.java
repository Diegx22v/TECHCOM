
package application;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.transform.Scale;
import javafx.stage.Screen;
import javafx.stage.Stage;
/**
 * Clase Principal del proyecto.
 * Extiende {@link javafx.application.Application} para configurar y ejecutar
 * la interfaz gráfica de usuario utilizando JavaFX.
 * @author Diego V., Franklin C., Dayana T., Carlos V., Mia N.
 * @version 1.0
 */
public class Main extends Application {

    @FXML
    public GridPane main;
    /**
     * Inicia la ventana principal de la aplicación.
     *
     * Configura la interfaz gráfica, incluyendo:
     * <ul>
     * <li>Iconos</li>
     * <li>Archivos FXML</li>
     * <li>Estilos CSS</li>
     * </ul>
     *
     * En caso de errores durante la inicialización, muestra una alerta
     * con detalles del problema.
     *
     * @param primaryStage La ventana principal de la aplicación.
     * @throws Exception Si ocurre algún error durante la carga de recursos.
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            // Resolución base de diseño
            double baseWidth = 1920;
            double baseHeight = 1080;

            // Detectar resolución de pantalla
            Rectangle2D screenBounds = Screen.getPrimary().getBounds();
            double screenWidth = screenBounds.getWidth();
            double screenHeight = screenBounds.getHeight();

            // Configuración de la ventana principal
            Image icono = new Image(getClass().getResourceAsStream("resources/TECHCOM.png"));
            primaryStage.getIcons().add(icono);

            FXMLLoader loader = new FXMLLoader(getClass().getResource("menu_principal.fxml"));
            GridPane main = loader.load(); // Se asegura de que el GridPane es el nodo raíz

            // Crear un grupo para aplicar el escalado al contenido
            Group scalableGroup = new Group(main);

            // Crear una escena con la resolución detectada
            Scene scene = new Scene(new StackPane(scalableGroup), screenWidth, screenHeight);
            scene.getStylesheets().add(getClass().getResource("resources/interfaz_principal.css").toExternalForm());

            // Calcular el factor de escalado
            double scaleX = screenWidth / baseWidth;
            double scaleY = screenHeight / baseHeight;
            double scale = Math.min(scaleX, scaleY); // Mantener proporciones

            // Aplicar el escalado
            scalableGroup.setScaleX(scale);
            scalableGroup.setScaleY(scale);

            // Centrar el contenido escalado en la ventana
            StackPane stackPane = (StackPane) scene.getRoot();
            stackPane.setAlignment(Pos.CENTER);

            // Configuración del Stage
            primaryStage.setMaximized(true);
            primaryStage.setTitle("TECHCON");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            // Manejo de errores con una alerta
            Alert errorAlert = new Alert(AlertType.ERROR);
            errorAlert.setTitle("Error en la Aplicación");
            errorAlert.setHeaderText("Error en la ejecución");
            errorAlert.setContentText("Error: " + e.getMessage());
            Stage errores = (Stage) errorAlert.getDialogPane().getScene().getWindow();
            errores.getIcons().add(new Image(getClass().getResourceAsStream("resources/error_icon.png")));
            errorAlert.showAndWait();
        }
    }
    /**
     * Método principal que lanza la aplicación JavaFX.
     *
     * @param args Argumentos de entrada desde la línea de comandos.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
