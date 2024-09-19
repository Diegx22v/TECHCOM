module ejem{
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.web;
	requires javafx.graphics;
	requires java.desktop;
	requires javafx.base;
    opens application to javafx.fxml;
    exports application;
}  
