package Ejercicio002;

import java.util.Scanner;

public class ejerdos {
	static int res1;
	
	public static void main(String [] args){
		
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Introduce la 1ra nota: ");
		int num1 = scan1.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		System.out.print("Introduce la 2da nota: ");
		int num2 = scan2.nextInt();
		
		Scanner scan3 = new Scanner(System.in);
		System.out.print("Introduce la 3ra nota: ");
		int num3 = scan3.nextInt();
		
		res1 = num1 + num2 + num3;
		res1 = res1 / 3;
		
		if (res1 >= 7) {
			System.out.println("Promocionado");
		}
	}
}
