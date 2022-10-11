import java.util.Scanner;

public class Ex4App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Método 1, 2 o 3?");
		String metodo = sc.nextLine();
		
		while (!metodo.equals("1") && !metodo.equals("2") && !metodo.equals("3")) {
			
			System.out.println("¿Método 1, 2 o 3?");
			metodo = sc.nextLine();
			
		}
		
		// Crea una serie por defecto
		if (metodo.equals("1")) {
			
			Serie serie1 = new Serie();
			
		}
		
		// Crea una seria con su título y creador
		else if (metodo.equals("2")) {
			
			System.out.println("Introduce un título:");
			String titulo = sc.nextLine();
			System.out.println("Introduce un creador:");
			String creador = sc.nextLine();
			Serie serie1 = new Serie(titulo, creador);
			
		}
		
		// Crea una serie con su título, número de temporadas, género y creador
		else if (metodo.equals("3")) {
			
			System.out.println("Introduce un título:");
			String titulo = sc.nextLine();
			System.out.println("Introduce un número de temporadas:");
			String numeroDeTemporadas = sc.nextLine();
			numeroDeTemporadas = temporadasIsValid(numeroDeTemporadas);
			System.out.println("Introduce un género:");
			String genero = sc.nextLine();
			System.out.println("Introduce un creador:");
			String creador = sc.nextLine();
			Serie serie1 = new Serie(titulo, Integer.parseInt(numeroDeTemporadas), genero, creador);
			System.out.println(serie1.titulo);
			System.out.println(serie1.numeroDeTemporadas);
			System.out.println(serie1.entregado);
			System.out.println(serie1.genero);
			System.out.println(serie1.creador);
			
		}

	}
	
	// Comprueba que el número de temporadas sea un número entero
	public static String temporadasIsValid(String numeroDeTemporadas) {
		
		try {
			Integer.valueOf(numeroDeTemporadas);
		}
		catch (Exception e) {
			return "3";
		}
		return numeroDeTemporadas;
		
	}

}
