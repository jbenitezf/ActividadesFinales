package actividadesfinalesud02;

import java.util.Scanner;

public class Actividad_13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, introduce cuanta comida compra al día");
		double comidaDiaria = sc.nextInt();
		System.out.println("Introduce el número de animales que posee");
		double numAnimales = sc.nextInt();
		System.out.println("Introduce los kilos que consume un animal");
		double KilosPorAnimal = sc.nextInt();
		
		double cuenta = (KilosPorAnimal*numAnimales)-comidaDiaria;
		
		if(cuenta >= 0) {
			System.out.println("La comida es suficiente");
		}else {
			System.out.println("La comida no es suficiente");
			System.out.println("Tendrá que comprar al día"+numAnimales*KilosPorAnimal);
		}
		
		
	}

}
