import java.util.Scanner;

public class Ex2App {

	public static void main(String[] args) {
		
		boolean valid = false;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Método 1 o 2?");
		String metodo = sc.nextLine();
		
		while (!metodo.equals("1") && !metodo.equals("2")) {
			
			System.out.println("¿Método 1 o 2?");
			metodo = sc.nextLine();
			
		}
		
		// Crea una constraseña de 8 carácteres que nosotros introducimos
		if (metodo.equals("1")) {
			
			System.out.println("Introduce una contraseña (8 caracteres):");
			String contraseña = sc.nextLine();
			
			while (contraseña.length() > 8 || contraseña.length() < 8) {
				
				System.out.println("Introduce una contraseña (8 caracteres):");
				contraseña = sc.nextLine();
				
			}
			
			Password password1 = new Password(contraseña);
			
		}
		
		// Crea una contraseña aleatoria con la longitud que nosotros introducimos
		else if (metodo.equals("2")) {
			
			System.out.println("Introduce la longitud de tu nueva contraseña (mayor que 0):");
			String longitud =  sc.nextLine();
			
			while (!valid) {
				try {
					Integer.parseInt(longitud);
					while (Integer.parseInt(longitud) < 1) {
						
						System.out.println("Introduce la longitud de tu nueva contraseña (mayor que 0):");
						longitud = sc.nextLine();
						
					}
					valid = true;
				}
				catch (Exception e) {
					System.out.println("Introduce la longitud de tu nueva contraseña (mayor que 0):");
					longitud = sc.nextLine();
				}
			}
			
			Password password1 = new Password(Integer.parseInt(longitud));
			
		}

	}

}
