package application;

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
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.util.Duration;
import utils.Utils;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class Controlador {
    @FXML
    private WebView webView;
    @FXML
    private WebEngine webEngine;
    @FXML
    private ButtonBar contenedor;

    @SuppressWarnings("unused")
	private ScaleTransition animacion;
    
    @FXML 
    private Button creditos;
    @FXML 
    private Button salir;
    @FXML 
    private Button jugar;
    @FXML
    private Button juegoButton,video_dos;
    @FXML 
    private Button video_uno;
    @FXML
    private Hyperlink proyecto,proyectodos;
    private boolean juego_iniciado;
    private boolean inicia_ventana;
    
    @FXML
    public void initialize() {
    	 webEngine = webView.getEngine();
    	 cargar_video("https://www.youtube.com/embed/kAbrnfx7axc");
    }
    
    void animacion_boton(int duracion,double x,double y,Button button) {
    	ScaleTransition animacion = new ScaleTransition(Duration.millis(duracion),button);
    	animacion.setByX(x);
    	animacion.setByY(y);
    	animacion.setAutoReverse(true);
    	animacion.setCycleCount(2);
    	animacion.play();
    	animacion.stop(); 
    	animacion.playFromStart(); 
    }
    
    @FXML
    void proyecto_web_2(ActionEvent event)throws URISyntaxException,IOException {
    	Desktop.getDesktop().browse(new URI("https://elevenlabs.io/"));
    }
    
    @FXML
    void  softcursor1() {
    	animacion_boton(150,0.15,0.10,video_uno);

    }
    
    @FXML
    void softcursor2() {
    	animacion_boton(150,0.15,0.10,video_dos);
    }
    
    @FXML
    void softcursor3() {
    	animacion_boton(150,0.15,0.10,jugar);
    }
    
    @FXML
    void softcursor4() {
    	animacion_boton(150,0.15,0.10,creditos);
    }
    
    @FXML
    void softcursor5() {
    	animacion_boton(150,0.15,0.10,salir);
    }
    
    @FXML
    public void cerrarVentana() {
        Stage stage = (Stage) salir.getScene().getWindow();
        stage.close();
    }
    
    @FXML
    void set_video1() {
    	animacion_boton(200,0.20,0.20,video_uno);
    	cargar_video("https://www.youtube.com/embed/kAbrnfx7axc");
    }
    
    @FXML
    void set_video2() {
    	animacion_boton(200,0.20,0.20,video_dos);
    	cargar_video("https://www.youtube.com/embed/7kcF9v4oo7M");
    }
    
    @FXML
    void proyecto_web(ActionEvent event) throws URISyntaxException,IOException{
    	Desktop.getDesktop().browse(new URI("https://colab.research.google.com/drive/1dygH6NjFvrz2Slhufk2ilNR_kD5C48as"));
    }
    
    public void cargar_video(String url) {
    	webEngine.load(url);
    	
    }
        
    public boolean getinicia_ventana() {
    	return inicia_ventana;
    }    
    
    public void alerta_de_error(Exception e) {
		Alert errorAlert = new Alert(AlertType.ERROR);
	    errorAlert.setTitle("Error en la Aplicación");
	    errorAlert.setHeaderText("Error en la ejecución");
	    errorAlert.setContentText("error: "+e); 
	    Stage errores = (Stage) errorAlert.getDialogPane().getScene().getWindow();
	    errores.getIcons().add(new Image(getClass().getResourceAsStream("resources/error_icon.png")));
	    errorAlert.showAndWait(); 
    }
    
    @FXML    
    private void nueva_ventana() {
        	try {
        		Parent root = FXMLLoader.load(getClass().getResource("menu_principal.fxml"));
        		Stage preguntas = new Stage();
        		preguntas.setTitle("Juegos locos franklin");
                Image icono = new Image(getClass().getResourceAsStream("resources/TECHCOM.png"));
                preguntas.getIcons().add(icono);
        		Scene juegos_locos_franklin = new Scene(root,800,600);
        		preguntas.setScene(juegos_locos_franklin);
                juegos_locos_franklin.getStylesheets().add(getClass().getResource("resources/styles.css").toExternalForm());
        		preguntas.show();
        	}catch(Exception e){  alerta_de_error(e);  }
        }
    
    // TODO: Franklin's games/methods for the project
    public boolean getjuegoiniciado() {
    	return juego_iniciado;
    }
    
    @FXML
    private void iniciarJuego() {
    	try { Utils.juego_laberinto();  }
    	catch(Exception e) { alerta_de_error(e);  }
    }   

    
}