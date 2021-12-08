package actividadesfinalesud03;

import java.util.Scanner;

public class Actividad_20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double num1 = -1;
		
		double total = 0;
		
		while(num1!=0) {
			
			System.out.println("Por favor, introduce una cantidad de dinero (0 para salir)");
		
			num1 = sc.nextDouble();
			
			total += num1;
		}
		
		System.out.println("El total de dinero que tiene es de: "+total+"€");
	}

}
