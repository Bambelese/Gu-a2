package casos2_java;

import java.util.Scanner;

public class caso6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese sueldo: ");
		int sueldo = sc.nextInt();
		
		if(sueldo>2800) {
			float impuesto = (float)(sueldo * 0.05);
			System.out.println("Impuesto calculado: "+impuesto);
		}
		else {
			float impuesto = (float)(sueldo * 0.02);
			System.out.println("Impuesto calculado: "+impuesto);
		}
		

	}

}
