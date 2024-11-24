/**
 * Módulo principal para la aplicación Techcom.
 * Este módulo requiere las bibliotecas de JavaFX necesarias para la interfaz de usuario:
 * <ul>
 *       <li>javafx.controls: Para controles de interfaz gráfica.</li>
 *       <li>javafx.fxml: Para la carga de archivos FXML.</li>
 *       <li>javafx.web: Para funcionalidades de webview.</li>
 *       <li>javafx.media: Para reproducir medios. </li>
 *       <li>javafx.desktop: Manejo de Escritorio. </li>
 *  </ul>
 */
module TECHCOM {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.web;
    requires java.desktop;
    requires javafx.media;
    opens application to javafx.fxml;
    exports application;
}  
