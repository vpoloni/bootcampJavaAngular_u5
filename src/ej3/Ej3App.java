package ej3;

/*Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir
(recuerda usar JOptionPane).*/

import javax.swing.JOptionPane;

public class Ej3App {

	public static void main(String[] args) {
		
		//Pedimos al usuario que introduzca su nombre
		String miNombre = JOptionPane.showInputDialog("Por favor, introduce tu nombre: ");
		
		//Mostramos el valor obtenido por consola
		JOptionPane.showMessageDialog(null, "¡Bienvenido " +  miNombre + "!");

	}

}
