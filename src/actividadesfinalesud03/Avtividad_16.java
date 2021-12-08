package actividadesfinalesud03;

import java.util.Scanner;

public class Avtividad_16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, introduce la altura de su triangulo");
		
		int num1 = sc.nextInt();

		for(int i = 0;i<=num1;i++) {
			 for(int j = 1; j<=num1-i; j++){
	                System.out.print(" ");
	         }
	         for(int asteriscos=1; asteriscos<=i; asteriscos++){
	              System.out.print("*");
	              System.out.print(" ");
	         }
	         System.out.println();
		}
		
	}

}
