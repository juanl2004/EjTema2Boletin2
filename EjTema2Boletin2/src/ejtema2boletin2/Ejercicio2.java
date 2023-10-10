package ejtema2boletin2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		 int numSemana;
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Intruduzca un numero entre el (1/7)");
		 numSemana = sc.nextInt();
		 
		 switch (numSemana) {
		 case 1: 
			 System.out.println("LUNES");
			 break;
		 case 2: 
			 System.out.println("MARTES");
			 break;
		 case 3: 
			 System.out.println("MIERCOLES");
			 break;
		 case 4: 
			 System.out.println("JUEVES");
			 break;
		 case 5: 
			 System.out.println("VIERNES");
			 break;
		 case 6: 
			 System.out.println("SABADO");
			 break;
		 case 7: 
			 System.out.println("DOMINGO");
			 break;
		 default:
			 System.out.println("El número introducido no es valido.");	
		 }
		 sc.close();
	}

}
