package Ejercicio021;

import java.util.Scanner;

public class ejerveintiuno {
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Ingrese la cantidad de numeros que desee: ");
		double total = scan1.nextInt();
		double numeros = 0;
		double contador = total;
		double pares = 0;
		double impares = 0;
		
		while (contador > 0) {
			Scanner scan2 = new Scanner(System.in);
			System.out.print("Ingrese los numeros: ");
			numeros = numeros + scan2.nextInt();
			contador--;

			if (numeros % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		System.out.println("El numero total de pares es: " + pares);
		System.out.println("El numero total de impares es: " + impares);
	}
}
