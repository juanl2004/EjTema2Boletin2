package ejtema2boletin2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int nota;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe tu nota del (1) al (10) -->");
		nota = sc.nextInt();
		
		 switch (nota) {
		 
		 case 0, 1, 2, 3, 4:
			System.out.println("INSUFICIENTE");
		 	break;
		 case 5:
			System.out.println("SUFICIENTE");
			break;
		 case 6: 
			System.out.println("BIEN");
			break;
		 case 7, 8: 
			System.out.println("NOTABLE");
		 	break;
		 case 9, 10: 
			System.out.println("SOBRESALIENTE");
		 	break;
		 default:
			 System.out.println("El número introducido es incorrecto.");
		 }
		 sc.close();
	}

}
