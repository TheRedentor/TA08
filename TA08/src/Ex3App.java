import java.util.Scanner;

public class Ex3App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Método 1, 2 o 3?");
		String metodo = sc.nextLine();
		
		while (!metodo.equals("1") && !metodo.equals("2") && !metodo.equals("3")) {
			
			System.out.println("¿Método 1, 2 o 3?");
			metodo = sc.nextLine();
			
		}
		
		// Crea un electrodoméstico por defecto
		if (metodo.equals("1")) {
			
			Electrodomestico electrodomestico1 = new Electrodomestico();
			
		}
		
		// Crea un electrodoméstico con su precio base y peso
		else if (metodo.equals("2")) {
			
			System.out.println("Introduce un precio base:");
			String precioBase = sc.nextLine();
			precioBase = precioIsValid(precioBase);
			System.out.println("Introduce un peso:");
			String peso = sc.nextLine();
			peso = pesoIsValid(peso);
			Electrodomestico electrodomestico1 = new Electrodomestico(Integer.parseInt(precioBase), Integer.parseInt(peso));
			
		}
		
		// Crea un electrodoméstico con su precio base, color, consumo energético y peso
		else if (metodo.equals("3")) {
			
			System.out.println("Introduce un precio base:");
			String precioBase = sc.nextLine();
			precioBase = precioIsValid(precioBase);
			System.out.println("Introduce un color:");
			String color = sc.nextLine();
			System.out.println("Introduce un consumo energético:");
			String consumoEnergetico = sc.nextLine();
			System.out.println("Introduce un peso:");
			String peso = sc.nextLine();
			peso = pesoIsValid(peso);
			Electrodomestico electrodomestico1 = new Electrodomestico(Integer.parseInt(precioBase), color, consumoEnergetico, Integer.parseInt(peso));
			
		}

	}
	
	// Comprueba que precio sea un número entero
	public static String precioIsValid(String precioBase) {
		
		try {
			Integer.valueOf(precioBase);
		}
		catch (Exception e) {
			return "100";
		}
		return precioBase;
		
	}
	
	// Comprueba que peso sea un número entero
	public static String pesoIsValid(String peso) {
		
		try {
			Integer.valueOf(peso);
		}
		catch (Exception e) {
			return "5";
		}
		return peso;
		
	}

}
