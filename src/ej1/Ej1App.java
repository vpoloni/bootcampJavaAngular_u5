package ej1;

/*Declara dos variables numéricas (con el valor que desees), e indica cual es mayor de los
dos. Si son iguales indícalo también. Ves cambiando los valores para comprobar que
funciona.*/

public class Ej1App {

	public static void main(String[] args) {
	
		int a = 1;
		int b = 1;
		
		if (a > b ) {
			System.out.println(a + " es mayor que " + b);
		} else if (b > a) {
			System.out.println(b + " es mayor que " + a);
			
		} else {
			System.out.println("Los valores de " + a + " y " + b + " son iguales");
		}

	}

}
