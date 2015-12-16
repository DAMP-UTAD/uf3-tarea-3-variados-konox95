package Ejercicio007;

import java.util.Scanner;

public class ejersiete {
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Introduce el numero total de preguntas: ");
		float num1 = scan1.nextInt();

		Scanner scan2 = new Scanner(System.in);
		System.out.print("Numero de preguntas acertadas: ");
		float num2 = scan2.nextInt();

		float media = (num2 * 100) / num1;

		if (media >= 90) {
			System.out.println("Nivel máximo");
		} else {
			if (media >= 75) {
				System.out.println("Nivel medio");
			} else {
				if (media >= 50) {
					System.out.println("Nivel regular");
				} else {
					System.out.println("Fuer de nivel");
				}
			}
		}

	}
}
