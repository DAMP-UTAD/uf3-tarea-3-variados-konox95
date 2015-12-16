package Ejercicio011;

import java.util.Scanner;

public class Ejeronce {
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
		
		if (num1 < 10) {
			System.out.println("Alguno de los numeros son menores de diez");
		} else {
			if (num2 < 10) {
				System.out.println("Alguno de los numeros son menores de diez");
			} else {
				if (num3 < 10) {
					System.out.println("Alguno de los numeros son menores de diez");
				}
			}
		}
	}
}
