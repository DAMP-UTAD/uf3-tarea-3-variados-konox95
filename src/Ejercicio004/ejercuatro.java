package Ejercicio004;

import java.util.Scanner;

public class ejercuatro {
	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		System.out.print("Introduce el primer numero: ");
		int num1 = scan1.nextInt();

		Scanner scan2 = new Scanner(System.in);
		System.out.print("Introduce el segundo numero: ");
		int num2 = scan2.nextInt();

		Scanner scan3 = new Scanner(System.in);
		System.out.print("Introduce el tercer numero: ");
		int num3 = scan3.nextInt();

		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("El numero mayor es: " + num1);
			}
		} else {
			if (num2 > num3) {
				System.out.println("El numero mayor es: " + num2);
			} else {
				System.out.println("El numero mayor es: " + num3);
			}
		}

	}
}