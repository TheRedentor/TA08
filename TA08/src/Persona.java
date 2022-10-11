
public class Persona {
	
	// Declarar atributos
	private String nombre;
	private int edad;
	private String dni;
	private String sexo;
	private double peso;
	private double altura;
	static final String SEXO = "H";
	
	// Constructores
	public Persona(String dni) {
		
		this.nombre = "";
		this.edad = 0;
		this.dni = dni;
		this.sexo = SEXO;
		this.peso = 0.0;
		this.altura = 0.0;
		
	}
	
	public Persona(String nombre, int edad, String dni, String sexo) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = 0.0;
		this.altura = 0.0;
		
	}
	
	public Persona(String nombre, int edad, String dni, String sexo, double peso, double altura) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		
	}
	
}
