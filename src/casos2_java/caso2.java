package casos2_java;
import java.util.Scanner;

public class caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese su número: ");
		int n = sc.nextInt();
		
		String rpta ="Su número es impar";
		
		if(n % 2 == 0)
			rpta = "Su número es par";
		
		System.out.println("Respuesta: "+ rpta);
		
		
		

	}

}
