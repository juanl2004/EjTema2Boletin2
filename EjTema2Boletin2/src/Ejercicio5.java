package ejtema2boletin2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Declaramos la variable letra como string porque el valor introducido es una cadena.
		String letra;
		
		//Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Le mostramos al usuario los tipos de carnet de conducir que hay
		System.out.println("Introduce la letra del tipo de carnet de conducir -->");
		System.out.println("E: remolques.");
		System.out.println("D: autobuses.");
		System.out.println("C1-C5: camiones.");
		System.out.println("A: motocicletas.");
		System.out.println("B1-B2: automóviles.");
		//Le pedimos al usuario que introduzca la letra correspondiente del carnet seleccionado.
		letra = sc.next();
		
		//Le damos al switch el valor de la letra seleccionada
		switch (letra) {
		case "E": //Comparamos si el usuario a introducido la letra "E"
			System.out.println("Remolques"); //Si es así se imprimirá "Remolques"
		break; //Acaba aquí
		
		case "D": //Comparamos si el usuario a introducido la letra "D"
			System.out.println("Autobuses"); //Si es así se imprimirá "Autobuses"
		break; //Acaba aquí
		
		case "C1": //Comparamos si el usuario a introducido la letra "C1"
			System.out.println("Camiones"); //Si es así se imprimirá "Camiones"
		break; //Acaba aquí
		
		case "C5": //Comparamos si el usuario a introducido la letra "C5"
			System.out.println("Camiones"); //Si es así se imprimirá "Camiones"
		break; //Acaba aquí
		
		case "A": //Comparamos si el usuario a introducido la letra "A"
			System.out.println("Motocicletas"); //Si es así se imprimirá "Motocicletas"
		break; //Acaba aquí
		
		case "B1": //Comparamos si el usuario a introducido la letra "B1"
			System.out.println("Automóviles"); //Si es así se imprimirá "Automóviles"
		break; //Acaba aquí
		
		case "B2": //Comparamos si el usuario a introducido la letra "B2"
			System.out.println("Automóviles"); //Si es así se imprimirá "Automóviles"
		break; //Acaba aquí
		default: //En caso de que el valor introducido no sea ninguno de los anteriores se ejecutara el default.
			//Se imprimira "Categoría no contemplada"
			System.out.println("Categoría no contemplada");
		
		}
		//Cierre de Scanner
		sc.close();
	}

}
