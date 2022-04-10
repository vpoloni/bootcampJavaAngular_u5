package ej10;

/*Realiza una aplicación que nos pida un número de ventas a introducir, después nos
pedirá tantas ventas por teclado como número de ventas se hayan indicado. Al final
mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.*/

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ej10App {

	public static void main(String[] args) {
		
		//Obtenemos el número de ventas que desea realizar el usuario
		String numeroVentas = JOptionPane.showInputDialog("Introduce un número de ventas que deseas realizar: ");
		
		//Convertimos el valor del input de String a int
		int numeroVentasParseado = Integer.parseInt(numeroVentas);
		
		//Mostramos cuantas ventas ha de introducir el usuario
		System.out.println("Has de introducir " + numeroVentas + " ventas");
		
		//Creamos el objeto de la clase Scanner
		Scanner sc = new Scanner(System.in);
		
		int totalVentas = 0;
	
		//Recorremos el número de ventas introducido por el usuario
		for (int i = 1; i <= numeroVentasParseado; i++) {
			
			System.out.print("Venta " + i + ": ");
			
			//Parseamos el valor de la venta a number y lo sumamos a totalVentas
			totalVentas += sc.nextInt();
		}
		
		sc.close();
		
		System.out.println("La suma de todas las ventas introducidas es de " + totalVentas);
		

	}

}
