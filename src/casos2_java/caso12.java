package casos2_java;

import java.util.Scanner;

public class caso12 {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 
		 String empleado= "";
		 int nivel = 0;
		 float sueldo=0;
		 
		 System.out.println("Nombre de empleado; ");
		 empleado=sc.nextLine();
		 
		 System.out.println("Nivel (1-4): ");
		 nivel = sc.nextInt();
		 
		 System.out.println("Sueldo: ");
		 sueldo = sc.nextFloat();
		 
		 float inc= 0;
		 
		 switch (nivel) {
		 case 1:
			 inc = 0.045f;
			 break;
		 case 2:
			 inc = 0.06f;
			 break;
		 }
		 float nuevosueldo = sueldo * (1+inc);
		 
		 System.out.println("Empleado: "+empleado);
		 System.out.println("Nivel: "+nivel);
		 System.out.println("Sueldo: "+sueldo);
		 System.out.println("Inremento: "+ inc*100+"%");
		 System.out.println("Nuevo sueldo: "+nuevosueldo);
				 

	}

}
