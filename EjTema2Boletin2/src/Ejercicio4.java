package ejtema2boletin2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Declaramos la variable dado1 y dado2 como string porque el valor introducido es una cadena
		String dado1, dado2;
		//Declaramos la variable valor1 y valor2 como string porque el valor introducido sera un número entero
		int valor1, valor2;

		//Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		//Le pedimos al usuario que introduzca el valor del dado 1
		System.out.println("Introduce el valor del dado 1");
		//Leemos el valor del dado 1
		dado1 = sc.next();
		
		//Le pedimos al usuario que introduzca el valor del dado 2
		System.out.println("Introduce el valor del dado 2");
		//Leemos el valor del dado 2
		dado2 = sc.next();

		// El valor1 es igual al switch al que se le otorga la respuesta del dado1
		valor1 = switch (dado1) {
		case "UNO" -> 1; //Comparamos si el caso "UNO" es introducido por el usuario, si es asi el valor1 vale 1.
		case "DOS" -> 2; //Comparamos si el caso "DOS" es introducido por el usuario, si es asi el valor1 vale 2.
		case "TRES" -> 3; //Comparamos si el caso "TRES" es introducido por el usuario, si es asi el valor1 vale 3.
		case "CUATRO" -> 4; //Comparamos si el caso "CUATRO" es introducido por el usuario, si es asi el valor1 vale 4.
		case "CINCO" -> 5; //Comparamos si el caso "CINCO" es introducido por el usuario, si es asi el valor1 vale 5.
		case "SEIS" -> 6; //Comparamos si el caso "SEIS" es introducido por el usuario, si es asi el valor1 vale 6.
		default -> 0; //En caso de que el valor introducido no sea ninguno de los anteriores se ejecutara el default, si es así el valor1 vale 0.
		};
		// El valor2 es igual al switch al que se le otorga la respuesta del dado2
		valor2 = switch (dado2) {
		case "UNO" -> 1; //Comparamos si el caso "UNO" es introducido por el usuario, si es asi el valor2 vale 1.
		case "DOS" -> 2; //Comparamos si el caso "DOS" es introducido por el usuario, si es asi el valor2 vale 2.
		case "TRES" -> 3; //Comparamos si el caso "TRES" es introducido por el usuario, si es asi el valor2 vale 3.
		case "CUATRO" -> 4; //Comparamos si el caso "CUATRO" es introducido por el usuario, si es asi el valor2 vale 4.
		case "CINCO" -> 5; //Comparamos si el caso "CINCO" es introducido por el usuario, si es asi el valor2 vale 5.
		case "SEIS" -> 6; //Comparamos si el caso "SEIS" es introducido por el usuario, si es asi el valor2 vale 6.
		default -> 0; //En caso de que el valor introducido no sea ninguno de los anteriores se ejecutara el default, si es así el valor2 vale 0.
		};
		
		//Comprobamos si el valor 1 o el valor 2 es igual a 0.
		if (valor1 == 0 || valor2 == 0) {
			//Si es así se imprime "Algunas de las tiradas tiene un valor erroneo".
			System.out.println("Algunas de las tiradas tiene un valor erroneo");
		} else { //En cambio si no se ejecuta el if se ejecutara el else.
			//Si es así se imprimirá la suma de las tiradas que es igual al valor1 y valor2.
			System.out.println("La suma de las tiradas es: " + (valor1+valor2));
		}
		//Cierre de Scanner
		sc.close();
	}

}
