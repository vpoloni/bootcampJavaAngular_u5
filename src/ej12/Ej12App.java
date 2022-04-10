package ej12;

/* Escribe una aplicaci�n con un String que contenga una contrase�a cualquiera. Despu�s
se te pedir� que introduzcas la contrase�a, con 3 intentos. Cuando aciertes ya no pedir� mas
la contrase�a y mostrara un mensaje diciendo �Enhorabuena�. Piensa bien en la condici�n
de salida (3 intentos y si acierta sale, aunque le queden intentos).*/

import javax.swing.JOptionPane;

public class Ej12App {

	public static void main(String[] args) {
		
		String password = "miContrase�a";
		int intentos = 0;
		boolean isPasswordCorrecto = false;
		
		do {
			
			String input = JOptionPane.showInputDialog("Introduce la contrase�a: ");
			
			//Igualamos las contrase�as
			if (password.equals(input)){
				
				isPasswordCorrecto = true;
				
				System.out.println("�Enhorabuena! Tu contrase�a es correcta");	
				System.exit(0); //salimos del bucle
			}
			
			System.out.println("Contrase�a incorrecta");	
			   
			intentos++;
			
		} while (intentos < 3 && isPasswordCorrecto == false);
		
		System.out.println("Has usado el n�mero m�ximo de intentos. Intenta m�s tarde");	
		
	}

}
