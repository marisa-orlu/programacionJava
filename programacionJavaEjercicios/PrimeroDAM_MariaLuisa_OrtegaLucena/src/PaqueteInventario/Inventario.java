package PaqueteInventario;

import java.util.ArrayList;

import ClasesPapeleria.Material;

public class Inventario implements Imprimible {
	protected ArrayList<Material> listaMaterial;

	public Inventario() {
		super();
		this.listaMaterial = new ArrayList<>();
	}

	public ArrayList<Material> getListaMaterial() {
		return listaMaterial;
	}

	public void setListaMaterial(ArrayList<Material> listaMaterial) {
		this.listaMaterial = listaMaterial;
	}

	// Añadir material
	public void aniadirMaterial(Material m) {
		listaMaterial.add(m);
	}

	// Borrar material
	public void eliminarMaterial(String codigo) {
		boolean encontrado = false;

		for (int i = 0; i < listaMaterial.size(); i++) {
			if (listaMaterial.get(i).getCodigo().equalsIgnoreCase(codigo)) {
				listaMaterial.remove(i);
				System.out.println("Material borrado correctamente");
				encontrado = true;
			}
		}

		if (encontrado != true) {
			System.out.println("No se ha encontrado el material con el codigo: " + codigo);
		}

	}

	public void buscarMaterial(String codigo) {
		boolean encontrado = false;

		for (Material m : listaMaterial) {
			if (m.getCodigo().equalsIgnoreCase(codigo)) {
				System.out.println("Material encontrado: " + m);
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			System.out.println("No se ha encontrado el material con el codigo: " + codigo);
		}
	}

	@Override
	public void imprimirInventarioValorado() {
		double subtotal, precioConIvaLibro, precioConIvaMaterial, subtotalMaterial;
		double ivaLibro = 0.4, ivaMaterial = 0.21;
		System.out.println("""
				 ____________________________________________________________________________________
				 Inventario
				|____________________________________________________________________________________|
									""");

		for (Material m : listaMaterial) {
			// calculando iva para el libro
			subtotal = m.getPrecioCompra() * ivaLibro;
			precioConIvaLibro = subtotal + m.getPrecioCompra() + m.calcularPrecio();

			// calculando iva para el material Papeleria y Material Oficina
			subtotalMaterial = m.getPrecioCompra() * ivaMaterial;
			precioConIvaMaterial = subtotalMaterial + m.getPrecioCompra() + m.calcularPrecio();

			System.out.println(m);
			System.out.println("| -Precio de libro con iva= " + precioConIvaLibro);
			System.out.println("| -Precio de material con iva= " + precioConIvaMaterial);
			System.out
					.println("|____________________________________________________________________________________|");
		}

	}

	// He hecho esta funcion que muestra el inventario para probar primero que se
	// imprimen bien los datos y se guardan
	public void mostrarInventario() {
		for (Material m : listaMaterial) {
			System.out.println("- " + m);
		}
	}

}
