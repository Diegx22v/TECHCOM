module TECHCOM {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.web;
    requires java.desktop;
    requires javafx.media;
    opens application to javafx.fxml;
    exports application;
}  
