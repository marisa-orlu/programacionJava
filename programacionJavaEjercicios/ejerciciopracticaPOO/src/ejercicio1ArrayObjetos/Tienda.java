package ejercicio1ArrayObjetos;

public class Tienda {
	public Producto[] producto;
	public int numProductos;

	public Tienda(Producto[] producto, int numProductos) {
		super();
		this.producto = new Producto[numProductos];
		this.numProductos = numProductos;
	}

	public void añadirProducto(Producto producto) {
		Boolean flag = false;
		for (int i = 0; i < this.producto.length; i++) {
			if (this.producto[i] == null) {
				this.producto[i] = producto;
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println("No caben mas productos");
	}

	public void mostrarDatos() {
		for (int i = 0; i < numProductos; i++) {
			if (this.producto[i] == null) {
				i++;
			} else {
				System.out.println(producto[i]);
			}
		}
	}

	public void esFragil(String nombreProducto) {
		boolean encontrado = false;

		for (int i = 0; i < numProductos; i++) {
			if (this.producto[i] != null && this.producto[i].getNombre().equals(nombreProducto)) {
				if (this.producto[i].isEsFragil()) {
					System.out.println("El producto '" + nombreProducto + "' es frágil.");
				} else {
					System.out.println("El producto '" + nombreProducto + "' no es frágil.");
				}
				encontrado = true;
				break;
			}
		}

		if (!encontrado) {
			System.out.println("No se encontró el producto con el nombre: " + nombreProducto);
		}
	}

}