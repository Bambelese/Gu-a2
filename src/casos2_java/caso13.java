package casos2_java;

import java.util.Scanner;

public class caso13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, opc;
		
		System.out.println("Ingrese número 1: ");
		n1=sc.nextInt();
		
		System.out.println("Ingrese número 2: ");
		n2 = sc.nextInt();
		
		System.out.println("Ingrese operación(1-6): ");
		opc = sc.nextInt();
		
		
		String operacion;
		double rpta=0;
		
		switch (opc) {
		case 1:
			operacion ="Suma";
			rpta = n1 + n2;
			break;
		case 2:
			operacion ="Resta";
			if(n1>n2) {
				rpta = n1 - n2;
			}
			else {
				rpta = n2 - n1;
			}
			break;
		case 3:
			operacion ="Multiplicación";
			rpta = n1*n2;
			break;
		case 4:
			operacion ="División";
			rpta = n1/n2;
			break;
		case 5:
			operacion ="Resto entero";
			if(n2==0) {
				operacion ="No es posible hallar el resto entero";
			}
			else {
				rpta= n1%n2;
			}
			break;
		case 6:
			operacion ="Promedio";
			rpta = (double)(n1+n2)/2;
			break;
		default:
			operacion="0";
			rpta= 0;
			break;
												
		}
		System.out.println("Resultados");
		System.out.println("Número 1: "+n1);
		System.out.println("Número 2: "+n2);
		System.out.println("Operación: "+ operacion);
		System.out.println("Resultado: "+rpta);

	}

}
