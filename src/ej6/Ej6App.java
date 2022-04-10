package ej6;

import javax.swing.JOptionPane;

/*Lee un número por teclado que pida el precio de un producto (puede tener decimales) y
calcule el precio final con IVA. El IVA sera una constante que sera del 21%
*/

public class Ej6App {
	
	//Declaramos una constante y le asignamos un valor 
	final static double IVA = 1.21;

	public static void main(String[] args) {
		
		//Pedimos al usuario que introduzca un número
		String input = JOptionPane.showInputDialog("Introduce un número: ");
		
		//Parseamos el valor obtenido de String a double
		double inputParseado = Double.parseDouble(input);
		
		//Mostramos el precio final del producto aplicando el IVA
		System.out.println("El precio final del producto con IVA es " + inputParseado * IVA);

	}

}
