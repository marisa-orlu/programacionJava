package ejercicio1ArrayObjetos;

public class Producto {
	public double precioFabrica;
	public String nombre;
	public boolean esFragil;
	public String origen;

	public Producto(double precioFabrica, String nombre, boolean esFragil, String origen) {
		super();
		this.precioFabrica = precioFabrica;
		this.nombre = nombre;
		this.esFragil = esFragil;
		this.origen = origen;
	}

	public double getPrecioFabrica() {
		return precioFabrica;
	}

	public void setPrecioFabrica(double precioFabrica) {
		this.precioFabrica = precioFabrica;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isEsFragil() {
		return esFragil;
	}

	public void setEsFragil(boolean esFragil) {
		this.esFragil = esFragil;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	@Override
	public String toString() {
		return "Producto [precioFabrica=" + precioFabrica + ", nombre=" + nombre + ", esFragil=" + esFragil
				+ ", origen=" + origen + "]";
	}

}
