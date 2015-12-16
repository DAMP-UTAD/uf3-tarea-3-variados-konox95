package Ejercicio009;

import java.util.Scanner;

public class ejernueve {
	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		float num1 = scan1.nextInt();

		Scanner scan2 = new Scanner(System.in);
		System.out.print("Introduce otro numero: ");
		float num2 = scan2.nextInt();

		Scanner scan3 = new Scanner(System.in);
		System.out.print("Introduce otro numero: ");
		float num3 = scan3.nextInt();

		if (num1 == num2) {
			if (num1 == num2) {
				if (num2 == num3) {
					float result1 = (num1 + num2);
					System.out.println("El resultado de la suma de los dos primeros numeros es: " + result1);
					float result2 = result1 * num3;
					System.out.println("El resultado de la suma de los dos primeros numeros por el tercer es: " + result2);
				}
			}
		} else {
			System.out.println("No son iguales");
		}

	}
}
