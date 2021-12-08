package actividadesfinalesud03;

import java.util.Scanner;

public class Actividad_12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, introduce un número en binario para su conversión a decimal");
		
		int bin = sc.nextInt();
		
		int exponente = 0;
	    int decimal = 0; 
	      while (bin != 0) {
	                int digito = bin % 10;                        
	                decimal += digito * (int) Math.pow(2, exponente);
	                exponente++;
	                bin = bin / 10;
	      }
	      System.out.println("Su número en decimal es: " + decimal);
	   }

}


