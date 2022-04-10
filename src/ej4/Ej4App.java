package ej4;

/*Haz una aplicaci�n que calcule el �rea de un c�rculo (pi*R2). El radio se pedir� por teclado
(recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el
m�todo pow de Math.*/

import java.util.Scanner;

public class Ej4App {

	public static void main(String[] args) {
		
		//Instanciamos la clase Scanner
		Scanner sc = new Scanner (System.in); 
		
		//Pedimos al usuario a introducir el valor
		System.out.println("Introduce el radio del c�rculo: "); 
		
		//Convertimos el input de String a double
		double radioCirculoParseado = sc.nextDouble();
		
		//Cerramos el flujo de la petici�n de datos
		sc.close();
		
		//Para calcular el �rea del c�rculo multiplicamos PI por el valor del input al cuadrado
		double areaCirculo = Math.PI * Math.pow(radioCirculoParseado, 2);
		
		System.out.println("El �rea del c�rculo es " + areaCirculo);
		

	}

}
