package casos2_java;

import java.util.Scanner;

public class caso14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String carrera ="";
		String turno = "";
		float monto, descuento;
		
		System.out.println("Ingrese su carrera: ");
		carrera=sc.next();
		
		System.out.println("Ingrese turno: ");
		turno=sc.next();
		
		switch(carrera) {
		case "DS":
			monto = 1500;
			break;
		case "RC":
			monto = 1400;
			break;
		case "DG":
			monto = 1300;
			break;
		default:
			monto = 0;
			break;			
		}
		
		switch(turno) {
		case "M":
			descuento =(float)(monto*0.1);
			break;
		case "T":
			descuento =(float)(monto*0.2);
		case "N":
			descuento = (float)(monto*0.15);
		default:
			descuento = 0;
			break;
		}
		float total;
		total=(float)((monto-descuento)/3.33);
		
		System.out.println("Resultados");
		System.out.println("Monto: "+monto);
		System.out.println("Turno: "+turno);
		System.out.println("Total a pagar: "+total+"$");
		
		

	}

}
