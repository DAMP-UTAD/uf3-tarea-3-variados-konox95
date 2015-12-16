package Ejercicio013;

import java.util.Scanner;

public class ejertrece {
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Introduce el sueldo: ");
		float num1 = scan1.nextFloat();

		Scanner scan2 = new Scanner(System.in);
		System.out.print("Introduce la antigüedad: ");
		float num2 = scan2.nextFloat();
		
		if (num1 < 500 & num2 >= 10) {
			float media1 = ((num1 / 100) * 20) + num1;
			System.out.println("Cobra menos de 500€ y tiene una antigüedad de 10 años o mas, su nuevo sueldo es: " + media1);
		} else {
			if (num1 < 500 & num2 < 10) {
				float media1 = ((num1 / 100) * 5) + num1;
				System.out.println("Cobra menos de 500€ y tiene una antigüedad de menos de 10 años, su nuevo sueldo es: " + media1);
			} else {
				if (num1 > 500) {
					System.out.println("Su sueldo es igual o mayor de 500€ su sueldo se queda igual: " + num1);
				}
			}
		}
	}
}
