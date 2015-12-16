package Ejercicio003;

import java.util.Scanner;

public class ejertres {
	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		System.out.print("Introduce un digito: ");
		int num1 = scan1.nextInt();
		
		if (num1 < 10) {
			System.out.println("Tiene un digito");
		} else {
			System.out.println("Tiene dos digitos");
		}
	}
}