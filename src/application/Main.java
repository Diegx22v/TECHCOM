package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image; 

public class Main extends Application {
    @Override
    public void start(@SuppressWarnings("exports") Stage primaryStage) throws Exception {
    	
        Image icono = new Image(getClass().getResourceAsStream("6.png"));
        primaryStage.getIcons().add(icono);
        Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
        Scene scene = new Scene(root, 800, 600);
        

        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        
        primaryStage.setTitle("Proyecto");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
