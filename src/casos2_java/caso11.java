package casos2_java;
import java.util.Scanner;

public class caso11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numerodia = 0;
		
		System.out.println("Ingrese número (1-7): ");
		numerodia =sc.nextInt();
		
		String nombredia = "";
		
		switch(numerodia) {
		case 1:
			nombredia = "Domingo";
			break;
		case 2:
			nombredia = "Lunes";
			break;
		case 3:
			nombredia = "Martes";
			break;
		case 4:
			nombredia = "Miercoles";
			break;
		case 5:
			nombredia = "Jueves";
			break;
		case 6:
			nombredia = "Viernes";
			break;
		case 7:
			nombredia = "Sábado";
			break;
		default:
			nombredia = "Desconocido";
		}
		System.out.println("Nombre del día; "+nombredia);

	}

}
