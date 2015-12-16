package Ejercicio001;

import java.util.Scanner;

public class ejeruno {
	public static void main(String[] args) {
	int res1;
	int res2;
	
	Scanner scan1 = new Scanner(System.in);
	System.out.print("Introduce un numero: ");
	int num1 = scan1.nextInt();
	
	Scanner scan2 = new Scanner(System.in);
	System.out.print("Introduce un numero: ");
	int num2 = scan2.nextInt();
	
	if (num1>num2) {
		res1 = num1 + num2;
		res2 = num1 - num2;
		System.out.println("La suma es: " + res1 );
		System.out.println("La diferencia es: " + res2);
	} else {
		res1 = num1 * num2;
		res2 = num1 / num2;
		System.out.println("El producto es: " + res1);
		System.out.println("La division es: " + res2);
	}
}
}
