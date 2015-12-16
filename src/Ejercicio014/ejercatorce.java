package Ejercicio014;

import java.util.Scanner;

public class ejercatorce {
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
		
		if (num1 > num2 & num1 > num3 & num2 < num3) {
			System.out.println("El numero mayor es: " + num1);
			System.out.println("El numero menor es: " + num2);
		} else {
			if (num1 > num2 & num1 > num3 & num2 > num3) {
				System.out.println("El numero mayor es: " + num1);
				System.out.println("El numero menor es: " + num3);
			} else {
				if (num2 > num1 & num2 > num3 & num1 < num3) {
					System.out.println("El numero mayor es: " + num2);
					System.out.println("El numero menor es: " + num1);
				} else {
					if (num2 > num1 & num2 > num3 & num1 > num3) {
						System.out.println("El numero mayor es: " + num2);
						System.out.println("El numero menor es: " + num3);
					} else {
						if (num3 > num1 & num3 > num2 & num1 < num2) {
							System.out.println("El numero mayor es: " + num3);
							System.out.println("El numero menor es: " + num1);
						} else {
							if (num3 > num1 & num3 > num2 & num1 > num2) {
								System.out.println("El numero mayor es: " + num3);
								System.out.println("El numero menor es: " + num2);
							} 
						}
					}
				}
			}
		}
	}
}
