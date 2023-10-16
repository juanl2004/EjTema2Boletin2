package ejtema2boletin2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		String letra;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la letra del tipo de carnet de conducir -->");
		System.out.println("E: remolques.");
		System.out.println("D: autobuses.");
		System.out.println("C1-C5: camiones.");
		System.out.println("A: motocicletas.");
		System.out.println("B1-B2: automóviles.");
		letra = sc.next();
		
		switch (letra) {
		case "E":
			System.out.println("Remolques");
		break;
		
		case "D":
			System.out.println("Autobuses");
		break;
		
		case "C1":
			System.out.println("Camiones");
		break;
		
		case "C5":
			System.out.println("Camiones");
		break;
		
		case "A":
			System.out.println("Motocicletas");
		break;
		
		case "B1":
			System.out.println("Automóviles");
		break;
		
		case "B2":
			System.out.println("Automóviles");
		break;
		default: 
			System.out.println("Categoría no contemplada");
		
		}
		sc.close();
	}

}
