package actividadesfinalesud02;

import java.util.Random;
import java.util.Scanner;

public class Actividad_18 {

	public static void main(String[] args) {
		Random r = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = r.nextInt(100)+1;
		int num2 = r.nextInt(100)+1;
		int resultado = 0;
		
		int cuenta = r.nextInt(3)+1;
		
		switch(cuenta){
		
		case 1:
			System.out.println("Los números son "+num1+" y "+num2);
			System.out.println("Tine que realizar una suma");
			System.out.println("¿Cuanto és?");
			resultado = sc.nextInt();
			if(resultado == (num1+num2))
				System.out.println("Genial has acertado!!");
			else
				System.out.println("Lo siento no has acertado...");
		break;
		
		case 2:
			System.out.println("Los números son "+num1+" y "+num2);
			System.out.println("Tiene que realizar una resta");
			System.out.println("¿Cuanto és?");
			resultado = sc.nextInt();
			if(resultado == (num1-num2))
				System.out.println("Genial has acertado!!");
			else
				System.out.println("Lo siento no has acertado...");
		break;
		
		case 3:
			System.out.println("Los números son "+num1+" y "+num2);
			System.out.println("Tiene que realizar una multiplicación");
			System.out.println("¿Cuanto és?");
			resultado = sc.nextInt();
			if(resultado == (num1*num2))
				System.out.println("Genial has acertado!!");
			else
				System.out.println("Lo siento no has acertado...");
		break;
		}
	}

}
