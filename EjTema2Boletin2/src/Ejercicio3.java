package ejtema2boletin2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Declaramos la variable num1, num2 y resultado como double porque los valores pueden ser decimales.
		double num1;
		double num2;
		double resultado;
		//La variable respuesta se declara como int porque el valor del usuario es un número entero.
		int respuesta;
		
		//Creamos el Scanner.
		Scanner sc = new Scanner(System.in);

		//Le pedimos al usuario el primer número.
		System.out.println("Escribe un numero -->");
		//Leemos el primer número.
		num1 = sc.nextDouble();
		
		//Le pedimos al usuario el segundo número
		System.out.println("Escribe otro numero -->");
		//Leemos el segundo número.
		num2 = sc.nextDouble();
		
		// Imprimimos el menu, en el que el usuario debe de seleccionar una de las opciones.
		System.out.println("Elija una de estas opciones (Marcando el número correspondiente) -->");
		System.out.println("1. SUMAR LOS NÚMEROS");
		System.out.println("2. RESTAR LOS NÚMEROS");
		System.out.println("3. MULTIPLICAR LOS NÚMEROS");
		System.out.println("4. DIVIDIR LOS NÚMEROS");
		//El usuario debe escribir la respuesta elegida en el menu.
		respuesta = sc.nextInt();

		// Le damos al switch el valor de la respuesta selecionada en el menu
		switch (respuesta) {
		case 1: //Comparamos si el caso 1 es introducido por el usuario
			resultado = num1 + num2; //Se suma num1 y num2 si se efectua el caso 1.
			System.out.println("La suma es " + resultado); //Se imprime el resultado de la suma
			break; //Acaba aquí

		case 2: //Comparamos si el caso 2 es introducido por el usuario
			resultado = num1 - num2; //Se resta num1 y num2 si se efectua el caso 2.
			System.out.println("La resta es " + resultado); //Se imprime el resultado de la resta
			break; //Acaba aquí

		case 3: //Comparamos si el caso 3 es introducido por el usuario
			resultado = num1 * num2; //Se multiplica num1 y num2 si se efectua el caso 3
			System.out.println("La multiplicación es " + resultado); //Se imprime el resutlado de la multiplicación
			break; //Acaba aquí>

		case 4://Comparamos si el caso 4 es introducido por el usuario
			if (num2 != 0) { //Comprobamos si el num2 es distinto de 0
				resultado = num1 / num2; // Se divide num1 entre num2 si se cumple el caso y el if.
				System.out.println("La división es " + resultado); //Se imprimira el resultado de la división.
			} else { //Si no se cumple el if se cumple el else.
				//Se imprimira que "No se puede dividir entre 0"
				System.out.println("No se puede dividir entre 0"); 
			}
			break; //Acaba aquí
		default:  //En caso de que el valor introducido no sea ninguno de los anteriores se ejecutara el default.
			//Se imprime "La opción seleccionada no es válida"
			System.out.println("La opción seleccionada no es válida");
		}
		// Cierre de Scanner
		sc.close();

	}

}
