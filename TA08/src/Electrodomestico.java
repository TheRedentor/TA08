
public class Electrodomestico {
	
	// Declarar atributos
	public int precioBase;
	public String color;
	public String consumoEnergetico;
	public int peso;
	static final int PRECIO_BASE = 100;
	static final String COLOR = "Blanco";
	static final String CONSUMO_ENERGETICO = "F";
	static final int PESO = 5;
	
	// Constructores
	public Electrodomestico() {
		
		this.precioBase = PRECIO_BASE;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO_ENERGETICO;
		this.peso = PESO;
		
	}
	
	public Electrodomestico(int precioBase, int peso) {
		
		this.precioBase = precioBase;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO_ENERGETICO;
		this.peso = peso;
		
	}

	public Electrodomestico(int precioBase, String color, String consumoEnergetico, int peso) {
		
		this.precioBase = precioBase;
		this.color = colorIsValid(color);
		this.consumoEnergetico = consumoIsValid(consumoEnergetico);
		this.peso = peso;
		
	}
	
	// Comprueba que el color sea válido
	public static String colorIsValid(String color) {
		
		if (color.toLowerCase().equals("blanco") || color.toLowerCase().equals("negro") || color.toLowerCase().equals("rojo") || color.toLowerCase().equals("azul") || color.toLowerCase().equals("gris")) {
			
			return color;
			
		}
		
		else {
			
			return COLOR;
			
		}
		
	}
	
	// Comprueba que el consumo energético sea válido
	public static String consumoIsValid(String consumoEnergetico) {
		
		if (consumoEnergetico.toLowerCase().equals("a") || consumoEnergetico.toLowerCase().equals("b") || consumoEnergetico.toLowerCase().equals("c") || consumoEnergetico.toLowerCase().equals("d") || consumoEnergetico.toLowerCase().equals("e") || consumoEnergetico.toLowerCase().equals("f")) {
			
			return consumoEnergetico;
			
		}
		
		else {
			
			return CONSUMO_ENERGETICO;
			
		}
		
	}
	
}
