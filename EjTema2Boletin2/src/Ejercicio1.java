package ejtema2boletin2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Declaramos la variable nota, como int. Ya que sera un número del 0 al 10.
		int nota;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca un número del 1 al 10.
		System.out.println("Escribe tu nota del (1) al (10) -->");
		// Leer la nota del teclado.
		nota = sc.nextInt();

		//Le damos al switch el valor de el número introducido por el usuario.
		switch (nota) {
		case 0, 1, 2, 3, 4: //Comparamos si algunos de los casos 1, 2, 3 y 4 es introducido por el usuario.
			//Si se cumple se mostrara "INSUFICIENTE"
			System.out.println("INSUFICIENTE");
			//La instrucción acaba aquí.
			break;
		
		case 5: //Comparamos si el caso 5 es introducido por el usuario.
			//Si se cumple se mostrara "SUFICIENTE"
			System.out.println("SUFICIENTE");
			//La instrucción acaba aquí.
			break;
		
		case 6: //Comparamos si el caso 6 es introducido por el usuario.
			//Si se cumple se mostrara "BIEN"
			System.out.println("BIEN");
			//La instrucción acaba aquí.
			break;
		
		case 7, 8: //Comparamos si algunos de los casos 7 y 8 es introducido por el usuario.
			//Si se cumple se mostrara "NOTABLE"
			System.out.println("NOTABLE");
			//La instrucción acaba aquí.
			break;
		
		case 9, 10: //Comparamos si algunos de los casos 9 y 10 es introducido por el usuario.
			//Si se cumple se mostrara "SOBRESALIENTE"
			System.out.println("SOBRESALIENTE");
			//La instrucción acaba aquí.
			break;
		
		default: //En caso de que el valor introducido no sea ninguno de los anteriores se ejecutara el default.
			//Se mostrara "El número introducido es incorrecto."
			System.out.println("El número introducido es incorrecto.");
		}
		//Cierre de Scanner
		sc.close();
	}

}
