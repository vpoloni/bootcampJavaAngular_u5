package ej5;

/*Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también
debemos indicarlo.
*/

import javax.swing.JOptionPane;

public class Ej5App {

	public static void main(String[] args) {
		
		//Pedimos al usuario que introduzca un valor
		String input = JOptionPane.showInputDialog("Introduce un número: ");
		
		//Lo parseamos de String a int
		int inputParseado = Integer.parseInt(input);
		
		//Evaluamos la condición 
		if (inputParseado % 2 == 0 ) {
			System.out.println("El valor introducido " + inputParseado + " es divisible entre 2");	
		} else {
			System.out.println("El valor introducido " + inputParseado + " no es divisible entre 2");
			
		}

	}

}
