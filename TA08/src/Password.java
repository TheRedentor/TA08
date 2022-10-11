
import java.util.Random;

public class Password {
	
	// Declarar atributos
	private int longitud;
	private String contraseña;
	private String pass = "";
	String valoresRandom = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvxyz";
	
	// Constructores
	public Password(String contraseña) {
		
		this.longitud = 8;
		this.contraseña = contraseña;
		
	}
	
	public Password(int longitud) {
		
		this.longitud = longitud;
		
		for (int i = 0; i < longitud; i++) { // Loop para añadir a la contraseña el número de caracteres indicado
			
			Random r = new Random(); // Declaro un nuevo random
			int c = r.nextInt(valoresRandom.length() - 0) + 0; // Creo un numero aleatorio entre 0 y la longitud del string valoresRandom
			char n = valoresRandom.charAt(c); // Cojo de valoresRandom el carácter en la posición del número random anterior
			pass += n; // Añado el carácter a la contraseña
			
		}
		
		this.contraseña = pass;
		
	}
	
}
