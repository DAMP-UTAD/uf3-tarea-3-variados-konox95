package Ejercicio016;

import java.util.Scanner;

public class ejerdieciseis {
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Ingrese el numero de personas que se le va ha medir la altura: ");
		float numAlturas = scan1.nextInt();
		float altura = 0;
		float contador = numAlturas;
		
		while (contador > 0) {
			Scanner scan2 = new Scanner(System.in);
			System.out.print("Ingrese la altura: ");
			altura = altura + scan2.nextInt();
			contador--;
		}
		float media =  (altura / numAlturas);
		System.out.println("La media de las alturas es: " + media);
	}
}
