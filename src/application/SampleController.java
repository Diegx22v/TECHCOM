package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.web.WebView;
import javax.swing.JOptionPane;;

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
    private Button guardarButton;

    private boolean seleccionGuardada;
    
    @FXML
    public void initialize() {
        String youtubeEmbedUrl = "https://www.youtube.com/embed/kAbrnfx7axc";
        webView.getEngine().load(youtubeEmbedUrl);
    }
    
    @FXML
    private void guardarSeleccion() {
    	String uno ;String dos;String tres; String cuatro; String cinco;
    	int acierto=0;
    	if (b1CheckBox.isSelected() || c1CheckBox.isSelected() || d1CheckBox.isSelected()){
    		uno="Opcion incorrecta";
    	}else  	if(a1CheckBox.isSelected()){
    		uno="Opcion correcta";
    		acierto=acierto+20;
    	}else {
    		uno= "No se puede dejar vacia la pregunta uno";
    	}        
    	
    	if (b2CheckBox.isSelected() || c2CheckBox.isSelected() || d2CheckBox.isSelected()){
    		dos="Opcion incorrecta";
    	}else  	if(a2CheckBox.isSelected()){
    		dos="Opcion correcta";
    		acierto=acierto+20;
    	}else {
    		dos= "No se puede dejar vacia la pregunta dos";
    	}        
    	
    	if (b3CheckBox.isSelected() || c3CheckBox.isSelected() || d3CheckBox.isSelected()){
    		tres="Opcion incorrecta";
    	}else  	if(a3CheckBox.isSelected()){
    		tres="Opcion correcta";
    		acierto=acierto+20;
    	}else {
    		tres= "No se puede dejar vacia la pregunta tres";
    	}        
    	
    	if (b4CheckBox.isSelected() || c4CheckBox.isSelected() || d4CheckBox.isSelected()){
    		cuatro="Opcion incorrecta";
    	}else  	if(a4CheckBox.isSelected()){
    		cuatro="Opcion correcta";
    		acierto=acierto+20;
    	}else {
    		cuatro= "No se puede dejar vacia la pregunta cuatro";
    	}        
    	
    	if (b5CheckBox.isSelected() || c5CheckBox.isSelected() || d5CheckBox.isSelected()){
    		cinco="Opcion incorrecta";
    	}else  	if(a5CheckBox.isSelected()){
    		cinco="Opcion correcta";
    		acierto=acierto+20;
    	}else {
    		cinco= "No se puede dejar vacia la pregunta cinco";
    	}        
    	
    	
    	JOptionPane.showMessageDialog(null,"Pregunta uno:  "+uno+"\nPregunta dos:  "+dos+"\nPregunta tres:  "+tres+"\nPregunta cuatro:  "+cuatro+"\nPregunta cinco:  "+cinco+"\nResultado Total:  "+acierto+"%");
    }

    public boolean getSeleccionGuardada() {
        return seleccionGuardada;
    }

    
    
}
