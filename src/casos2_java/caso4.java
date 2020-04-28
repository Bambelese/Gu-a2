package casos2_java;

import java.util.Scanner;

public class caso4 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese su primer número: ");
		int n1 = sc.nextInt();
		
		System.out.println("Ingrese su segundo número: ");
		int n2 = sc.nextInt();
		
		if(n1==n2) {
			System.out.println("Los números son iguales.");
		}
		else {
			if(n1>n2) {
				System.out.println("El segundo número es menor.");
			}
			else {
				System.out.println("El primer número es menor.");
			}
		}

	}

}
