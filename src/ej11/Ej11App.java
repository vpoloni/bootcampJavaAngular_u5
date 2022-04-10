package ej11;

import java.util.Scanner;

public class Ej11App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el día de la semana: ");
		String diaSemana = sc.nextLine();
		
		//Convertimos el input a lowerCase
		String diaSemanaToLowerCase = diaSemana.toLowerCase();
		sc.close();
		
		
		switch(diaSemanaToLowerCase) {
		
		case "lunes":
			System.out.println(diaSemanaToLowerCase.replace('l', 'L') + " es un día laboral");
			break; 
			
		case "martes":
			System.out.println(diaSemanaToLowerCase.replace('m', 'M') + " es un día laboral");
			break;
			
		case "miercoles":
			System.out.println(diaSemanaToLowerCase.replace('m', 'M') + " es un día laboral");
			break;
			
		case "jueves":
			System.out.println(diaSemanaToLowerCase.replace('j', 'J') + " es un día laboral");
			break;
			
		case "viernes":
			System.out.println(diaSemanaToLowerCase.replace('v', 'V') + " es un día laboral");
			break;
			
		case "sábado":
			System.out.println(diaSemanaToLowerCase.replace('s', 'S') + " no es un día laboral");
			break;
			
		case "domingo":
			System.out.println(diaSemanaToLowerCase.replace('d', 'D') + " no es un día laboral");
			break;
			
		default: 
			System.out.println (diaSemanaToLowerCase + " El valor introducido no corresponde");			
		
		}

	}

}
