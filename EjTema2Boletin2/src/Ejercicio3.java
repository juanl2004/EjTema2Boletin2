package ejtema2boletin2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		 double num1;
		 double num2;
		 int respuesta;
		 double resultado;
	
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Escribe un numero -->");
		 num1 = sc.nextDouble();
		 
		 System.out.println("Escribe otro numero -->");
		 num2 = sc.nextDouble();

		 System.out.println("Elija una de estas opciones (Marcando el número correspondiente) -->");
		 System.out.println("1. SUMAR LOS NÚMEROS");
		 System.out.println("2. RESTAR LOS NÚMEROS");
		 System.out.println("3. MULTIPLICAR LOS NÚMEROS");
		 System.out.println("4. DIVIDIR LOS NÚMEROS");
		 respuesta = sc.nextInt();
		 
		 
		 
		 switch (respuesta) {
		 case 1: 
			 resultado = num1 + num2;
			 System.out.println("La suma es " + resultado);
		 break;
		 
		 case 2: 
			 resultado = num1 - num2;
			 System.out.println("La resta es " + resultado);
		 break;
		 
		 case 3: 
			 resultado = num1 * num2;
			 System.out.println("La multiplicación es " + resultado);
		 break;
		 
		 case 4: 
			 if (num2 != 0) {
			 resultado = num1 / num2;
			 System.out.println("La división es " + resultado);
			 } else {
				 System.out.println("No se puede dividir entre 0");
			 }
			 break;
			 default:
				 System.out.println("La opción seleccionada no es válida");
		 }
	//Cierre de Scanner	 
	sc.close();

	}

}
