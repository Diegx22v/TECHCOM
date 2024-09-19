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


public class SampleController {
    @FXML
    private WebView webView;
    @FXML
    private WebEngine webEngine;

    private ScaleTransition click_uno,click_dos,cursor_uno,cursor_dos;
    @FXML
    private Button juegoButton,video_dos;
    @FXML 
    private Button video_uno;
    @FXML
    private Hyperlink proyecto,proyectodos;
    private boolean juego_iniciado;
    private boolean inicia_ventana;
    @FXML
    void proyecto_web_2(ActionEvent event)throws URISyntaxException,IOException {
    	Desktop.getDesktop().browse(new URI("https://elevenlabs.io/"));
    }
    
    @FXML
    void  softcursor1() {
    	cursor_uno.stop(); 
        cursor_uno.playFromStart(); 
    }
    
    @FXML
    void softcursor2() {
    	cursor_dos.stop(); 
        cursor_dos.playFromStart(); 
    }
    
    @FXML
    void set_video1() {
    	click_uno.stop(); 
        click_uno.playFromStart(); 
    	cargar_video("https://www.youtube.com/embed/kAbrnfx7axc");
    }
    
    @FXML
    void set_video2() {
    	click_dos.stop(); 
        click_dos.playFromStart(); 
    	cargar_video("https://www.youtube.com/embed/7kcF9v4oo7M");
    }
    
    @FXML
    void proyecto_web(ActionEvent event) throws URISyntaxException,IOException{
    	Desktop.getDesktop().browse(new URI("https://colab.research.google.com/drive/1dygH6NjFvrz2Slhufk2ilNR_kD5C48as"));
    }
    
    public void cargar_video(String url) {
    	webEngine.load(url);
    	
    }
    
    @FXML
    public void initialize() {
    	 click_uno = new ScaleTransition(Duration.millis(200), video_uno);
    	 click_uno.setByX(0.20);
    	 click_uno.setByY(0.20);
    	 click_uno.setAutoReverse(true);
    	 click_uno.setCycleCount(2);
    	 
    	 cursor_uno = new ScaleTransition(Duration.millis(200), video_uno);
    	 cursor_uno.setByX(0.1);
    	 cursor_uno.setByY(0.1);
    	 cursor_uno.setAutoReverse(true);
    	 cursor_uno.setCycleCount(2);
    	 
        
    	 click_dos = new ScaleTransition(Duration.millis(200), video_dos);
    	 click_dos.setByX(0.20);
    	 click_dos.setByY(0.20);
    	 click_dos.setAutoReverse(true);
    	 click_dos.setCycleCount(2);
    	 
    	 cursor_dos = new ScaleTransition(Duration.millis(200), video_dos);
    	 cursor_dos.setByX(0.1);
    	 cursor_dos.setByY(0.1);
    	 cursor_dos.setAutoReverse(true);
    	 cursor_dos.setCycleCount(2);
    	 
    	 webEngine = webView.getEngine();
    	 cargar_video("https://www.youtube.com/embed/kAbrnfx7axc");
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
        		Parent root = FXMLLoader.load(getClass().getResource("preguntas.fxml"));
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
