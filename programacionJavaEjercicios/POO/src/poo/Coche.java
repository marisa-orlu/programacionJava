package poo;

public class Coche {

	private int ruedas;
	private int puertas;
	private String color;
	private String combustible;
	private String matricula;
	private Double precio;
	private Boolean ambientado;
	
	

	public Coche(int ruedas, int puertas, String color, String combustible, String matricula, Double precio,
			Boolean ambientado) {
		super();
		this.ruedas = ruedas;
		this.puertas = puertas;
		this.color = color;
		this.combustible = combustible;
		this.matricula = matricula;
		this.ambientado = ambientado;
		
		if(color.equals("rojo")) {
			this.precio = 30000.5;
		}
		else {
			this.precio = 20000.75;
		}

	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Boolean getAmbientado() {
		return ambientado;
	}

	public void setAmbientado(Boolean ambientado) {
		this.ambientado = ambientado;
	}

	public int getRuedas() {
		return ruedas;
	}

	public int getPuertas() {
		return puertas;
	}

	public String getCombustible() {
		return combustible;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setColor(String color) {
		this.color= color; //el this.color coge las variables de fuera
	}
	
	public String getColor() {
		return this.color; //Muestra el color
	}

	@Override
	public String toString() {
		return "El coche es de color: " + color + " y su precio es: " + precio;
	}
	
	
}
