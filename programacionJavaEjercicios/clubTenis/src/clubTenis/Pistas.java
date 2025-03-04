package clubTenis;

public class Pistas {
	public String tipo;
	public double precio;

	public Pistas(String tipo, double precio) {
		super();
		this.tipo = tipo;
		this.precio = precio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Pistas [tipo=" + tipo + ", precio=" + precio + "]";
	}

}
