package actividadesfinalesud03;

import java.util.Scanner;

public class Actividad_17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, introduce un numero");
		
		int num1 = sc.nextInt();
		
		System.out.println("Por favor, introduce el segundo numero");
		
		int num2 = sc.nextInt();

		int mod1 = 1;
		
		int mod2 = 1;
		
		int maximo = 0;
		
		int divisor = 1;
		if(num1<num2) {
			while(divisor<=num1)  {
				
				mod1 = num1%divisor;
				mod2 = num2%divisor;
				if((mod1==0) && (mod2==0))
					maximo = divisor;
					
				divisor++;
			}
		}else {
			while(divisor<=num2)  {
			
				mod1 = num1%divisor;
				mod2 = num2%divisor;
				if((mod1==0) && (mod2==0))
					maximo = divisor;
					
				divisor++;
			}
		}
		System.out.println("El máximo como un divisor de "+num1+" y "+num2+" es: "+maximo);
	}

}
