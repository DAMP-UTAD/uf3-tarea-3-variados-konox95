package Ejercicio005;

import java.util.Scanner;

public class ejercinco {
	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		System.out.print("Introduce un numero entero: ");
		int num1 = scan1.nextInt();

		if (num1 == 0) {
			System.out.println("El numero es nulo");
		} else {

			if (num1 < 0) {
				System.out.println("El numero es negativo");
			} else {
				System.out.println("El numero es positivo");

			}
		}
	}
}
