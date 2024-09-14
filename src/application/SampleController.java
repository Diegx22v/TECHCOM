package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import javax.swing.JOptionPane;
import java.util.Random;

public class SampleController {
    @FXML
    private WebView webView;
    @FXML
    private CheckBox a1CheckBox,b1CheckBox,c1CheckBox,d1CheckBox;
    @FXML
    private CheckBox a2CheckBox,b2CheckBox,c2CheckBox,d2CheckBox;
    @FXML
    private CheckBox a3CheckBox,b3CheckBox,c3CheckBox,d3CheckBox;
    @FXML
    private CheckBox a4CheckBox,b4CheckBox,c4CheckBox,d4CheckBox;
    @FXML
    private CheckBox a5CheckBox,b5CheckBox,c5CheckBox,d5CheckBox;
    @FXML
    private Button guardarButton, juegoButton;
    private boolean seleccionGuardada;
    private boolean juego_iniciado;
    private boolean inicia_ventana;
    
    @FXML
    public void initialize() {
        String youtubeEmbedUrl = "https://www.youtube.com/embed/kAbrnfx7axc";
        webView.getEngine().load(youtubeEmbedUrl);
    }
    
    @FXML
    private void guardarSeleccion() {
    	String uno ;String dos;String tres; String cuatro; String cinco;
    	int acierto=0;
    	if (b1CheckBox.isSelected() || c1CheckBox.isSelected() || d1CheckBox.isSelected()){  uno="Opcion incorrecta";  }
    	else if(a1CheckBox.isSelected()){  uno="Opcion correcta";  acierto=acierto+20;  }
    	else {uno= "No se puede dejar vacia esta pregunta";}        
    	
    	if (b2CheckBox.isSelected() || c2CheckBox.isSelected() || d2CheckBox.isSelected()){  dos="Opcion incorrecta";  }
    	else if(a2CheckBox.isSelected()){  dos="Opcion correcta";  acierto=acierto+20;   }
    	else {  dos= "No se puede dejar vacia esta pregunta";  }        
    	
    	if (b3CheckBox.isSelected() || c3CheckBox.isSelected() || d3CheckBox.isSelected()){  tres="Opcion incorrecta";  }
    	else if(a3CheckBox.isSelected()){  tres="Opcion correcta";  acierto=acierto+20;  }
    	else {  tres= "No se puede dejar vacia esta pregunta";  }        
    	
    	if (b4CheckBox.isSelected() || c4CheckBox.isSelected() || d4CheckBox.isSelected()){  cuatro="Opcion incorrecta";  }
    	else if(a4CheckBox.isSelected()){  cuatro="Opcion correcta";  acierto=acierto+20;  }
    	else {  cuatro= "No se puede dejar vacia la pregunta cuatro";  }        
    	
    	if (b5CheckBox.isSelected() || c5CheckBox.isSelected() || d5CheckBox.isSelected()){  cinco="Opcion incorrecta";  }
    	else if(a5CheckBox.isSelected()){  cinco="Opcion correcta";  acierto=acierto+20;  }
    	else {  cinco= "No se puede dejar vacia la pregunta cinco";  }        
    	
    	JOptionPane.showMessageDialog(null,"Pregunta uno:  "+uno+"\nPregunta dos:  "+dos+"\nPregunta tres:  "+tres+"\nPregunta cuatro:  "+cuatro+"\nPregunta cinco:  "+cinco+"\nResultado Total:  "+acierto+"%");
    }

    public boolean getSeleccionGuardada() {
        return seleccionGuardada;
    }
    
    @FXML
    private void iniciarJuego() {

        juego_iniciado=true;
        if(juego_iniciado) {
        	int a, b, c, d, e, ini;

            Random ran = new Random();

            a = ran.nextInt(1, 5);
            b = ran.nextInt(1, 5);
            c = ran.nextInt(1, 5);
            d = ran.nextInt(1, 5);

            String[] opciones = {"arriba", "abajo", "izquierda", "derecha"};

            while (true) {

                JOptionPane.showMessageDialog(null, "Bienvenido a laberinto", "Juego", JOptionPane.PLAIN_MESSAGE);
                JOptionPane.showMessageDialog(null, "Comenzamos", "Juego", JOptionPane.PLAIN_MESSAGE);

                switch (a) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Primer movimiento: arriba", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Primer movimiento: abajo", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Primer movimiento: izquierda", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Primer movimiento: derecha", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Primer movimiento: error", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                }

                switch (b) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Segundo movimiento: arriba", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Segundo movimiento: abajo", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Segundo movimiento: izquierda", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Segundo movimiento: derecha", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Segundo movimiento: error", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                }

                switch (c) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Tercer movimiento: arriba", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Tercer movimiento: abajo", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Tercer movimiento: izquierda", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Tercer movimiento: derecha", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Tercer movimiento: error", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                }

                switch (d) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Cuarto movimiento: arriba", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Cuarto movimiento: abajo", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Cuarto movimiento: izquierda", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Cuarto movimiento: derecha", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Cuarto movimiento: error", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                }

                ini = JOptionPane.showOptionDialog(null, "¿Cuál era la primera?", "Juego",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[1]);

                if (ini == (a - 1)) {
                    JOptionPane.showMessageDialog(null, "¡Bien! Sigamos", "Juego", JOptionPane.PLAIN_MESSAGE);

                    ini = JOptionPane.showOptionDialog(null, "¿Cuál era la segunda?", "Juego",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[1]);

                    if (ini == (b - 1)) {
                        JOptionPane.showMessageDialog(null, "¡Bien! Sigamos", "Juego", JOptionPane.PLAIN_MESSAGE);

                        ini = JOptionPane.showOptionDialog(null, "¿Cuál era la tercera?", "Juego",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[1]);

                        if (ini == (c - 1)) {
                            JOptionPane.showMessageDialog(null, "¡Bien! Ahora", "Juego", JOptionPane.PLAIN_MESSAGE);

                            ini = JOptionPane.showOptionDialog(null, "¿Cuál era la cuarta?", "Juego",
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[1]);

                            if (ini == (d - 1)) {
                                JOptionPane.showMessageDialog(null, "¡Felicidades! Has ganado", "Juego", JOptionPane.PLAIN_MESSAGE);
                                e = JOptionPane.showConfirmDialog(null,"quieres un nivel mas?","juego",JOptionPane.YES_NO_OPTION);
                                if (e == JOptionPane.YES_OPTION) {
                                    
                                    JOptionPane.showMessageDialog(null, "coming soon", "juego" ,JOptionPane.PLAIN_MESSAGE);
                                    break;
                                }
                                else{

                                JOptionPane.showMessageDialog(null, "adios", "juego" ,JOptionPane.PLAIN_MESSAGE);

                                break;   
                                }
                                
                            } else {
                                JOptionPane.showMessageDialog(null, "Perdiste en la cuarta opción\nLa respuesta correcta era: " + opciones[d - 1], "Juego", JOptionPane.PLAIN_MESSAGE);
                                break;
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "Perdiste en la tercera opción\nLa respuesta correcta era: " + opciones[c - 1], "Juego", JOptionPane.PLAIN_MESSAGE);
                            break;
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Perdiste en la segunda opción\nLa respuesta correcta era: " + opciones[b - 1], "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Perdiste en la primera opción\nLa respuesta correcta era: " + opciones[a - 1], "Juego", JOptionPane.PLAIN_MESSAGE);
                    break;
                }
            }
        }
    }
@FXML    
private void nueva_ventana() {
    	try {
    		Parent root = FXMLLoader.load(getClass().getResource("preguntas.fxml"));
    		Stage preguntas = new Stage();
    		preguntas.setTitle("Preguntas");
    		preguntas.setScene(new Scene(root,800,600));
    		preguntas.show();
    	}
    		catch(Exception e){
    			
    		}
    }
    public boolean getjuegoiniciado() {
    	return juego_iniciado;
    }
    public boolean getinicia_ventana() {
    	return inicia_ventana;
    }
    
}
