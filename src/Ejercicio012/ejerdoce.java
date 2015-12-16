package Ejercicio012;

import java.util.Scanner;

public class ejerdoce {
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Introduce la cordenada X: ");
		float num1 = scan1.nextInt();

		Scanner scan2 = new Scanner(System.in);
		System.out.print("Introduce la otra cordenada Y: ");
		float num2 = scan2.nextInt();
		
		if (num1 > 0 & num2 > 0) {
			System.out.println("Las cordenadas se enuentra en el primer cuadrante");
		} else {
			if (num1 < 0 & num2 > 0) {
				System.out.println("Las cordenadas se enuentra en el segundo cuadrante");
			} else {
				if (num1 < 0 & num2 < 0) {
					System.out.println("Las cordenadas se enuentra en el tercer cuadrante");
				} else {
					if (num1 > 0 & num2 < 0) {
						System.out.println("Las cordenadas se enuentra en el cuarto cuadrante");
					}
				}
			}
		}
		
	}
}
