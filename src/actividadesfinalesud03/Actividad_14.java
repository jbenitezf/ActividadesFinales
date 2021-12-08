package actividadesfinalesud03;

import java.util.Scanner;

public class Actividad_14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, introduce un número en binario para su conversión a decimal");
		
		int num1 = sc.nextInt();
		
		int num2  = 1;
		
		boolean primo;
		
		int contador;
		
		for(int i=0;i<num1;i++) {
			
			primo = true;
			
			contador = 2;
			
				while ((primo)&&(contador<num2)){
					if (num2 % contador == 0)
						primo = false;
				
					contador++;
				}
			
			if(primo)
				System.out.println(num2+" --> es primo");
			else
				System.out.println(num2+" --> no es primo");
			
			num2++;
		}

	}

}
