package ej10;

/*Realiza una aplicaci�n que nos pida un n�mero de ventas a introducir, despu�s nos
pedir� tantas ventas por teclado como n�mero de ventas se hayan indicado. Al final
mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.*/

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ej10App {

	public static void main(String[] args) {
		
		//Obtenemos el n�mero de ventas que desea realizar el usuario
		String numeroVentas = JOptionPane.showInputDialog("Introduce un n�mero de ventas que deseas realizar: ");
		
		//Convertimos el valor del input de String a int
		int numeroVentasParseado = Integer.parseInt(numeroVentas);
		
		//Mostramos cuantas ventas ha de introducir el usuario
		System.out.println("Has de introducir " + numeroVentas + " ventas");
		
		//Creamos el objeto de la clase Scanner
		Scanner sc = new Scanner(System.in);
		
		int totalVentas = 0;
	
		//Recorremos el n�mero de ventas introducido por el usuario
		for (int i = 1; i <= numeroVentasParseado; i++) {
			
			System.out.print("Venta " + i + ": ");
			
			//Parseamos el valor de la venta a number y lo sumamos a totalVentas
			totalVentas += sc.nextInt();
		}
		
		sc.close();
		
		System.out.println("La suma de todas las ventas introducidas es de " + totalVentas);
		

	}

}
