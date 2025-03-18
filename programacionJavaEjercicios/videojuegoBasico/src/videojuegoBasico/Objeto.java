package videojuegoBasico;

public class Objeto {
	private int idObjeto;
	private String nombreObjeto;
	private double peso;
	private double valor;
	private String descripcion;

	public Objeto(int idObjeto, String nombreObjeto, double peso, double valor, String descripcion) {
		super();
		this.idObjeto = idObjeto;
		this.nombreObjeto = nombreObjeto;
		this.peso = peso;
		this.valor = valor;
		this.descripcion = descripcion;
	}

	public int getIdObjeto() {
		return idObjeto;
	}

	public void setIdObjeto(int idObjeto) {
		this.idObjeto = idObjeto;
	}

	public String getNombreObjeto() {
		return nombreObjeto;
	}

	public void setNombreObjeto(String nombreObjeto) {
		this.nombreObjeto = nombreObjeto;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Objeto: " + nombreObjeto + "\n" + "ID: " + idObjeto + "\n" + "Peso: " + peso + " kg\n" + "Valor: "
				+ valor + " monedas\n" + "Descripción: " + descripcion;
	}

}
