package casos2_java;

import java.util.Scanner;

public class caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese nombre: ");
		String nombre = sc.next();
		System.out.println("Ingrese horas trabajadas:");
		float hora= sc.nextFloat();
		System.out.println("Tarifa por hora: ");
		float tarifa= sc.nextFloat();
		System.out.println("Ingrese minutos de tardanza(en caso tenga)");
		float tarda = sc.nextFloat();
		
		float importe = hora*tarifa;
		
		if(hora>60) {
			float bonificacion = (float)(importe*0.13);
		}
		else {
			float bonificacion = (float)(importe*0.04);
		}
		
		if(tarda>15) {
			float descuento =(float)(importe*0.03);
		}
		else {
			float descuento = 0;
		}
		float meta = (float)((70/hora)*100);
		
		System.out.println("Resultados");
		System.out.println("Horas trabajadas: "+hora);
		System.out.println("Tarifa por horas: "+tarifa);
		System.out.println("Importe: "+importe);
		System.out.println("Bono: "+ bonificacion);
		System.out.println("Descuento: "+descuento);
		System.out.println("Meta alcanzada: "+meta+"%");
		

	}

}
