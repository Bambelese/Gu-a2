package casos2_java;

import java.util.*;

public class caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese precio.");
		float precio = sc.nextFloat();
		
		System.out.println("Ingrese cantidad.");
		int cantidad = sc.nextInt();
		
		float total = precio * cantidad;
		float descuento=0;
		
		if(cantidad>8) {
			descuento = (float)(0.1 * total);
		}

			double neto =total - descuento;
		
		System.out.println("Precio:"+precio);
		System.out.println("Total: "+total);
		System.out.println("Descuento: "+descuento);
		System.out.println("Neto: "+neto);

	}

}
