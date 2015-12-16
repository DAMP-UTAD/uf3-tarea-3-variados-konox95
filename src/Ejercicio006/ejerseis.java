package Ejercicio006;

import java.util.Scanner;

public class ejerseis {
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Introduce un numero de hasta tres cifras: ");
		double num1 = scan1.nextInt();
		
		if (num1 > 9) {
			if (num1>99) {
				System.out.println("Tiene tres cifras");
			} else {
				System.out.println("Tienes dos cifras");
			}
		} else {
				System.out.println("Tiene una cifra");
		}
		
	}
}
