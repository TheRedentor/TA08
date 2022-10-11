
public class Serie {
	
	// Declarar atributos
	public String titulo;
	public int numeroDeTemporadas;
	public boolean entregado;
	public String genero;
	public String creador;
	
	// Constructores
	public Serie() {
		
		this.titulo = "";
		this.numeroDeTemporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
		
	}
	
	public Serie(String titulo, String creador) {
		
		this.titulo = titulo;
		this.numeroDeTemporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = creador;
		
	}
	
	public Serie(String titulo, int numeroDeTemporadas, String genero, String creador) {
		
		this.titulo = titulo;
		this.numeroDeTemporadas = numeroDeTemporadas;
		this.entregado = false;
		this.genero = genero;
		this.creador = creador;
		
	}
	
}
