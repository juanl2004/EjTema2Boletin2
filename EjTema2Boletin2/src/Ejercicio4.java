package ejtema2boletin2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		String dado1, dado2;
		int valor1, valor2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el valor del dado 1");
		dado1 = sc.next();

		System.out.println("Introduce el valor del dado 2");
		dado2 = sc.next();

		valor1 = switch (dado1) {
		case "UNO" -> 1;
		case "DOS" -> 2;
		case "TRES" -> 3;
		case "CUATRO" -> 4;
		case "CINCO" -> 5;
		case "SEIS" -> 6;
		default -> 0;
		};

		valor2 = switch (dado2) {
		case "UNO" -> 1;
		case "DOS" -> 2;
		case "TRES" -> 3;
		case "CUATRO" -> 4;
		case "CINCO" -> 5;
		case "SEIS" -> 6;
		default -> 0;
		};
		
		if (valor1 == 0 || valor2 == 0) {
			System.out.println("Algunas de las tiradas tiene un valor erroneo");
		} else {
			System.out.println("La suma de las tiradas es: " + (valor1+valor2));
		}
		//Cierre de Scanner
		sc.close();
	}

}
