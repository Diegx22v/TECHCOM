
package application;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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
            Rectangle2D Get_pantalla = Screen.getPrimary().getBounds();
            double screenWidth = Get_pantalla.getWidth();
            double screenHeight = Get_pantalla.getHeight();


            /*
             * Configuración de la ventana principal
             */
            Image icono = new Image(getClass().getResourceAsStream("resources/TECHCOM.png"));
            primaryStage.getIcons().add(icono);

            FXMLLoader loader = new FXMLLoader(getClass().getResource("menu_principal.fxml"));
            ScrollPane main = loader.load(); // Asumiendo que tu raíz es un ScrollPane

            // Obtener el contenido original del ScrollPane
            Node content = main.getContent();

            // Crear un contenedor intermedio para escalar
            Group group = new Group(content);
            main.setContent(group); // Reemplazar el contenido original con el contenedor escalable

            // Crear la escena con la resolución detectada
            Scene scene = new Scene(main, screenWidth, screenHeight);
            scene.getStylesheets().add(getClass().getResource("resources/interfaz_principal.css").toExternalForm());

            // Calcular escalado proporcional
            double scaleX = screenWidth / baseWidth;
            double scaleY = screenHeight / baseHeight;
            double scale = Math.min(scaleX, scaleY); // Mantener proporciones
            group.setScaleX(scale);
            group.setScaleY(scale);

            // Centrar el contenido escalado
            double translateX = (screenWidth - (baseWidth * scale)) / 2;
            double translateY = (screenHeight - (baseHeight * scale)) / 2;
            group.setTranslateX(translateX);
            group.setTranslateY(translateY);

            // Ajustar el ScrollPane para que sea responsivo
            main.setFitToWidth(true);
            main.setFitToHeight(true);

            // Configuración de la ventana principal (Stage)
            primaryStage.setMaximized(true);
            primaryStage.setTitle("TECHCON");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            // Manejo de errores con una alerta
            Alert errorAlert = new Alert(AlertType.ERROR);
            errorAlert.setTitle("Error en la Aplicación");
            errorAlert.setHeaderText("Error en la ejecución");
            errorAlert.setContentText("Error: " + e);
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
