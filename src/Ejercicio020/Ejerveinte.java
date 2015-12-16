package Ejercicio020;

import java.util.Scanner;

public class Ejerveinte {
	static int contador1 = 15;
	static int contador2 = 15;
	static int lista1 = 0;
	static int lista2 = 0;
	static int result1 = 0;
	static int result2 = 0;
	
	public static void main(String[] args) {
		while (contador1 > 0) {
			Scanner scan1 = new Scanner(System.in);
			System.out.print("Introduce la primera quincena de numeros: ");
			lista1 = lista1 + scan1.nextInt();
			contador1--;			
		}
		while (contador2 > 0) {
			Scanner scan2 = new Scanner(System.in);
			System.out.print("Introduce la segunda quincena de numeros: ");
			lista2 = lista2 + scan2.nextInt();
			contador2--;			
		}
		System.out.println("El resultado de los primeros 15 numeros son: " + lista1);
		System.out.println("El resultado de los primeros 15 numeros son: " + lista2);
		
		if (lista1 > lista2) {
			System.out.print("Lista 1 mayor");
		} else {
			if (lista1 < lista2) {
				System.out.println("Lista 2 mayor");
			} else {
				if (lista1 == lista2) {
					System.out.println("Listas iguales");
				}
			}
		}
	}
}
