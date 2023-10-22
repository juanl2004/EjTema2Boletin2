package ejtema2boletin2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Declaramos la variable para indicar el día que corresponde al número de la semana.
		int numSemana;

		//Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		//Le pedimos al usuario que introduzca el número.
		System.out.println("Intruduzca un numero entre el (1/7)");
		
		//Leemos el número del teclado.
		numSemana = sc.nextInt();

		//Le damos al switch el valor de el número introducido por el usuario.
		switch (numSemana) {
		case 1: //Comparamos si el caso 1 es introducido por el usuario
			System.out.println("LUNES"); //Si es así se imprimira "LUNES"
			break; //La instrucción acaba aqui
		case 2: //Comparamos si el caso 2 es introducido por el usuario
			System.out.println("MARTES"); //Si es así se imprimira "MARTES"
			break; //La instrucción acaba aquí.
		case 3://Comparamos si el caso 3 es introducido por el usuario
			System.out.println("MIERCOLES"); //Si es así se imprimira "MIERCOLES"
			break; //La instrucción acaba aquí.
		case 4://Comparamos si el caso 4 es introducido por el usuario
			System.out.println("JUEVES"); //Si es así se imprimira "JUEVES"
			break; //La instrucción acaba aquí.
		case 5://Comparamos si el caso 5 es introducido por el usuario
			System.out.println("VIERNES"); //Si es así se imprimira "VIERNES"
			break; //La instrucción acaba aquí.
		case 6://Comparamos si el caso 6 es introducido por el usuario
			System.out.println("SABADO"); //Si es así se imprimira "SABADO"
			break; //La instrucción acaba aquí.
		case 7://Comparamos si el caso 7 es introducido por el usuario
			System.out.println("DOMINGO"); //Si es así se imprimira "DOMINGO"
			break; //La instrucción acaba aquí.
		default: //En caso de que el valor introducido no sea ninguno de los anteriores se ejecutara el default.
			//Se mostrara "El número introducido no es valido."
			System.out.println("El número introducido no es valido.");
		}
		//Cierre de Scanner
		sc.close();
	}

}
