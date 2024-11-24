
package application;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.stage.Stage;
/**
 * Clase Principal del proyecto.
 * Extiende {@link javafx.application.Application} para configurar y ejecutar
 * la interfaz gráfica de usuario utilizando JavaFX.
 * @author Diego V., Franklin C., Dayana T., Carlos V., Mia N.
 * @version 1.0
 */
public class Main extends Application {
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
            /*
            * Configuracion De ventana
            * */
            Image icono = new Image(getClass().getResourceAsStream("resources/TECHCOM.png"));
            primaryStage.getIcons().add(icono);
            FXMLLoader loader = new FXMLLoader(getClass().getResource("menu_principal.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root, 800, 600);
            scene.getStylesheets().add(getClass().getResource("resources/interfaz_principal.css").toExternalForm());
            primaryStage.setMaximized(true);
            primaryStage.setTitle("TECHCON");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            // ALERTA`
            Alert errorAlert = new Alert(AlertType.ERROR);
            errorAlert.setTitle("Error en la Aplicación");
            errorAlert.setHeaderText("Error en la ejecución");
            errorAlert.setContentText("error: " + e); 
            
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
