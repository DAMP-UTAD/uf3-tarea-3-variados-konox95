package Ejercicio015;

import java.util.Scanner;

public class ejerquince {
	public static void main(String[] args) {
		int contador = 1;
		int notas1 = 0;
		int notas2 = 0;
		while (contador <= 10) {
			Scanner scan1 = new Scanner(System.in);
			System.out.print("Introduce un nota: ");
			int num1 = scan1.nextInt();
			if (num1 >= 7) {
				notas1++;
				contador++;
			} else {
				notas2++;
				contador++;
			}
		}
		System.out.println("El total de notas mayores de 7 es: " + notas1);
		System.out.println("El total de notas menores de 7 es: " + notas2);
	}
}
