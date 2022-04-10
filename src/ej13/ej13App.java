package ej13;

import javax.swing.JOptionPane;

/*Crea una aplicaci�n llamada CalculadoraInversa, nos pedir� 2 operandos (int) y un signo
aritm�tico (String), seg�n este �ltimo se realizara la operaci�n correspondiente. Al final
mostrara el resultado en un cuadro de dialogo.
Los signos aritm�ticos disponibles son:
+: suma los dos operandos.
-: resta los operandos.
*: multiplica los operandos.
/: divide los operandos, este debe dar un resultado con decimales (double)
^: 1� operando como base y 2� como exponente.
%: m�dulo, resto de la divisi�n entre operando1 y operando2.*/

public class ej13App {

	public static void main(String[] args) {
		
		//invocaci�n del m�todo CalculadoraInversa
		CalculadoraInversa();
	}
	
	public static void CalculadoraInversa(){
	
		//inputs de los usuarios
		String operando1 = JOptionPane.showInputDialog("Introduce el primer operando");
		String operando2 = JOptionPane.showInputDialog("Introduce el segundo operando");
		String signo = JOptionPane.showInputDialog("Introduce el signo aritm�tico");
				
		//conversi�n de String a int
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
			JOptionPane.showMessageDialog(null, "Operador " + signo + " no es v�lido");
				
				}
		
		}

}
