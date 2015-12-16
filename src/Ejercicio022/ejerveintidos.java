package Ejercicio022;

import java.util.Scanner;

public class ejerveintidos {
	public static void main(String[] args) {
		double num1;
		double resultado = 0;
		
		do {
			Scanner scan1 = new Scanner(System.in);
			System.out.print("Ingrese numeros del 0 al 9999: ");
			num1 = scan1.nextInt();
			resultado = resultado + num1;
			
			
		} while (num1!=9999);
		System.out.println("El total es: " + (resultado - 9999));
		if (resultado > 0) {
			System.out.println("El resultado es mayor de 0");
		} else {
			if (resultado < 0) {
				System.out.println("El resultado es menor de 0");
			} else {
				if (resultado == 0) {
					System.out.println("El resultado es 0");
				}
			}
		}
	}
}
