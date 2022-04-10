package ej4;

/*Haz una aplicación que calcule el área de un círculo (pi*R2). El radio se pedirá por teclado
(recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el
método pow de Math.*/

import java.util.Scanner;

public class Ej4App {

	public static void main(String[] args) {
		
		//Instanciamos la clase Scanner
		Scanner sc = new Scanner (System.in); 
		
		//Pedimos al usuario a introducir el valor
		System.out.println("Introduce el radio del círculo: "); 
		
		//Convertimos el input de String a double
		double radioCirculoParseado = sc.nextDouble();
		
		//Cerramos el flujo de la petición de datos
		sc.close();
		
		//Para calcular el área del círculo multiplicamos PI por el valor del input al cuadrado
		double areaCirculo = Math.PI * Math.pow(radioCirculoParseado, 2);
		
		System.out.println("El área del círculo es " + areaCirculo);
		

	}

}
