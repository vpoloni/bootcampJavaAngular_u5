package ej5;

/*Lee un n�mero por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, tambi�n
debemos indicarlo.
*/

import javax.swing.JOptionPane;

public class Ej5App {

	public static void main(String[] args) {
		
		//Pedimos al usuario que introduzca un valor
		String input = JOptionPane.showInputDialog("Introduce un n�mero: ");
		
		//Lo parseamos de String a int
		int inputParseado = Integer.parseInt(input);
		
		//Evaluamos la condici�n 
		if (inputParseado % 2 == 0 ) {
			System.out.println("El valor introducido " + inputParseado + " es divisible entre 2");	
		} else {
			System.out.println("El valor introducido " + inputParseado + " no es divisible entre 2");
			
		}

	}

}
