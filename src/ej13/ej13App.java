package ej13;

import javax.swing.JOptionPane;

/*Crea una aplicación llamada CalculadoraInversa, nos pedirá 2 operandos (int) y un signo
aritmético (String), según este último se realizara la operación correspondiente. Al final
mostrara el resultado en un cuadro de dialogo.
Los signos aritméticos disponibles son:
+: suma los dos operandos.
-: resta los operandos.
*: multiplica los operandos.
/: divide los operandos, este debe dar un resultado con decimales (double)
^: 1º operando como base y 2º como exponente.
%: módulo, resto de la división entre operando1 y operando2.*/

public class ej13App {

	public static void main(String[] args) {
		
		//invocación del método CalculadoraInversa
		CalculadoraInversa();
	}
	
	public static void CalculadoraInversa(){
	
		//inputs de los usuarios
		String operando1 = JOptionPane.showInputDialog("Introduce el primer operando");
		String operando2 = JOptionPane.showInputDialog("Introduce el segundo operando");
		String signo = JOptionPane.showInputDialog("Introduce el signo aritmético");
				
		//conversión de String a int
		int operandoParseado1 = Integer.parseInt(operando1);
		int operandoParseado2 = Integer.parseInt(operando2);
				
		//switch para cada caso
		switch (signo) {
				
		case "+":
			int resultado = operandoParseado1 + operandoParseado2;
			JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
			break;
				
		case "-":
			resultado = operandoParseado1 - operandoParseado2;
			JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
			break;
					
		case "*":
			resultado = operandoParseado1 * operandoParseado2;
			JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
			break;
					
		case "/":
			resultado = operandoParseado1 / operandoParseado2;
			JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
			break;
					
		case "%":
			resultado = operandoParseado1 % operandoParseado2;
			JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
			break;
					
		case "^":
			resultado = (int)Math.pow(operandoParseado1, operandoParseado2);
			JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
			break;
					
		default:
			JOptionPane.showMessageDialog(null, "Operador " + signo + " no es válido");
				
				}
		
		}

}
