package Ejercicio017;

import java.util.Scanner;

public class ejerdiecisiete {
	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		System.out.print("Ingrese el numero de empleados: ");
		float numEmpleados = scan1.nextInt();
		float cobros = 0;
		float contador = numEmpleados;
		float persona1 = 0;
		float persona2 = 0;

		while (contador > 0) {
			Scanner scan2 = new Scanner(System.in);
			System.out.print("Ingrese lo que cobra cada uno: ");
			cobros = cobros + scan2.nextInt();
			contador--;

			if (cobros >= 100 & cobros <= 300) {
				persona1++;
			} else {
				if (cobros > 300) {
					persona2++;
				}
			}
		}
		System.out.println("El numero de empleados que cobran entre 100$ y 300$ es: " + persona1);
		System.out.println("El numero de empleados que cobran mas de 300$ es:" + persona2);
		System.out.println("Lo que se gasta la empresa en sueldos es: " + cobros);
	}
}
