package ej7;

/* Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while*/

public class Ej7App {

	public static void main(String[] args) {
		
		int i = 1;
		
		while (i <= 100) {
			
			System.out.print(i + " "); //hacemos uso del método print() para mostrar valores en una línea
			
			i++; //en cada iteración sumamos 1 al index "i"
		}
		
	}

}
