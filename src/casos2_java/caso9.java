package casos2_java;

import java.util.Scanner;

public class caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String alumno= "";
		int nota1 = 0, nota2 = 0;
		float asistencia = 0;
		String estado = null;
		
		System.out.println("Ingrese nombre de Alumno:");
		alumno = sc.nextLine();
		
		System.out.println("Ingrese primera nota:");
		nota1= sc.nextInt();
		
		System.out.println("Ingrese segunda nota: ");
		nota2 = sc.nextInt();
		
		System.out.println("Ingrese número de asistencias: ");
		asistencia = sc.nextFloat();
		
		float promedio = (float)(nota1*0.3)+(float)(nota2*0.7);
		float porcentaje = (float)((12/asistencia)*100);
		
		if(porcentaje>=13) {
			estado= "Aprobado";
		}else {
			estado= "Desaprobado";
		}
		
		System.out.println("Resultados");
		System.out.println("Alumno : "+alumno);
		System.out.println("Promedio: "+promedio);
		System.out.println("Aistencia: "+ porcentaje+"%");
		System.out.println("Estado: "+ estado);

	}

}
