/**
 * 
 */
package utils;

import java.util.Random;

import javax.swing.JOptionPane;

/**
 * 
 */
public class Utils {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// principal
	}
	public static void juego_laberinto() {
		boolean juego_iniciado=true;
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
	// crear metodos de java fx para limitar la cantidad de lineas y generar codigo mas legible 
}
