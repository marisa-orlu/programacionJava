package ejercicios_5;

public class Producto {
	private String nombre;
	private double precio;
	private int cantidadStock;

	public Producto(String nombre, double precio, int cantidadStock) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cantidadStock = cantidadStock;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidadStock() {
		return cantidadStock;
	}

	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", cantidadStock=" + cantidadStock + "]";
	}

	public void actualizarStock(int cantidad) {
		if (cantidad < 0) {
			System.out.println("Negativo");
		} else {
			cantidadStock = cantidad;
		}

	}

	public double calcularPrecioTotal(int cantidad) {
		double precioFinal = 0;

		precioFinal = cantidad * precio;

		return precioFinal;
	}
}
