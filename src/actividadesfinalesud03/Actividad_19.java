package actividadesfinalesud03;

import java.util.Scanner;

public class Actividad_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, introduce un numero");
		
		int num1 = sc.nextInt();	
		
		boolean raiz = false;
		
		int contador = 1;
		
		while(!raiz) {
			if((contador*contador)<num1) {
				contador++;
			}else {
				System.out.println("La raiz de "+num1+" es "+(contador-1)+" y su resto "+(num1-((contador-1)*(contador-1))));
				raiz = true;
			}
				
		}
	}

}
