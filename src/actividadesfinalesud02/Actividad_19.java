package actividadesfinalesud02;

import java.util.Scanner;

public class Actividad_19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, introduce un angulo entre 0º y 360º");
		int grados = sc.nextInt();
		System.out.println("Su angulo en radianes es: "+grados*Math.PI/180);
		
	}
}
