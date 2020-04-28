package casos2_java;

import java.util.Scanner;

public class caso7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ingrese sueldo:");
		int sueldo=sc.nextInt();
		
		if(sueldo>=3000) {
			float impuesto = (float)(sueldo*0.12);
			System.out.println("Impuesto calculado: "+impuesto);
		}
		else {
			if(sueldo<=3000&&sueldo>=1500) {
				float impuesto = (float)(sueldo*0.8);
				System.out.println("Impuesto calculado: "+impuesto);
			}
			else {
				if(sueldo<=1500) {
					float impuesto = (float)(sueldo*0.03);
					System.out.println("Impuesto calculado: "+impuesto);
				}
			}
		}
		
		

	}

}
