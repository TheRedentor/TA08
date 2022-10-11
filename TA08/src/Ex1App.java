
import java.util.Scanner;

public class Ex1App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Método 1, 2 o 3?");
		String metodo = sc.nextLine();
		
		while (!metodo.equals("1") && !metodo.equals("2") && !metodo.equals("3")) {
			
			System.out.println("¿Método 1, 2 o 3?");
			metodo = sc.nextLine();
			
		}
		
		// Crea persona con su DNI
		if (metodo.equals("1")) {
			
			System.out.println("Introduce tu DNI:");
			String dni = sc.nextLine();
			Persona persona1 = new Persona(dni);
			
		}
		
		// Crea persona con su nombre, edad, DNI y sexo
		else if (metodo.equals("2")) {
			
			System.out.println("Introduce tu nombre:");
			String nombre = sc.nextLine();
			System.out.println("Introduce tu edad:");
			int edad = Integer.parseInt(sc.nextLine());
			System.out.println("Introduce tu DNI:");
			String dni = sc.nextLine();
			System.out.println("Introduce tu sexo:");
			String sexo = sc.nextLine().toUpperCase();
			Persona persona1 = new Persona(nombre, edad, dni, sexo);
			
		}
		
		// Crea persona con su nombre, edad, DNI, sexo, peso y altura
		else if (metodo.equals("3")) {
			
			System.out.println("Introduce tu nombre:");
			String nombre = sc.nextLine();
			System.out.println("Introduce tu edad:");
			int edad = Integer.parseInt(sc.nextLine());
			System.out.println("Introduce tu DNI:");
			String dni = sc.nextLine();
			System.out.println("Introduce tu sexo:");
			String sexo = sc.nextLine().toUpperCase();
			System.out.println("Introduce tu peso:");
			double peso = Double.parseDouble(sc.nextLine());
			System.out.println("Introduce tu altura:");
			double altura = Double.parseDouble(sc.nextLine());
			Persona persona1 = new Persona(nombre, edad, dni, sexo, peso, altura);
			
		}

	}

}
