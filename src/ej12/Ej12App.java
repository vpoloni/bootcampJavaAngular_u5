package ej12;

/* Escribe una aplicación con un String que contenga una contraseña cualquiera. Después
se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá mas
la contraseña y mostrara un mensaje diciendo “Enhorabuena”. Piensa bien en la condición
de salida (3 intentos y si acierta sale, aunque le queden intentos).*/

import javax.swing.JOptionPane;

public class Ej12App {

	public static void main(String[] args) {
		
		String password = "miContraseña";
		int intentos = 0;
		boolean isPasswordCorrecto = false;
		
		do {
			
			String input = JOptionPane.showInputDialog("Introduce la contraseña: ");
			
			//Igualamos las contraseñas
			if (password.equals(input)){
				
				isPasswordCorrecto = true;
				
				System.out.println("¡Enhorabuena! Tu contraseña es correcta");	
				System.exit(0); //salimos del bucle
			}
			
			System.out.println("Contraseña incorrecta");	
			   
			intentos++;
			
		} while (intentos < 3 && isPasswordCorrecto == false);
		
		System.out.println("Has usado el número máximo de intentos. Intenta más tarde");	
		
	}

}
