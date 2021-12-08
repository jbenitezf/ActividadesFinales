package actividadesfinalesud02;

import java.util.Scanner;

public class Actividad_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = -1;
		while(Math.abs(num1)!=num1) {
		System.out.println("Por favor, introduca la base del triágulo");
		num1 = sc.nextInt();
		if(Math.abs(num1)!=num1)
			System.out.println("El valor no es correcto");
		}
		
		int num2 = -1;
		while(Math.abs(num2)!=num2) {
			System.out.println("Por favor, introduca la altura del triágulo");
			num2 = sc.nextInt();
			if(Math.abs(num2)!=num2)
				System.out.println("El valor no es correcto");
		}
		
		System.out.println("");
		System.out.println("El area es: "+(num1*num2)/2);
		
		
	}

}
