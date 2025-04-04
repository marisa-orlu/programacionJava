package ejercicio2Examen;

import java.util.Scanner;

public class Discos {
	Clientes cliente;
	Discos disco;
	Scanner sc = new Scanner(System.in);

	public String titulo;
	public String grupo;
	public String cantante;
	public int anioPublicacion;
	public double precio;
	public int stock = 5;

	public Discos() {
		this.titulo = "luna";
		this.grupo = "Luna";
		this.cantante = "";
		this.anioPublicacion = 2021;
		this.precio = 13.70;
		this.stock = 5;
	}

	public Discos(String titulo, String grupo, String cantante, int anioPublicacion, double precio, int stock) {
		this.titulo = titulo;
		this.grupo = grupo;
		this.cantante = cantante;
		this.anioPublicacion = anioPublicacion;
		this.precio = precio;
		this.stock = stock;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getCantante() {
		return cantante;
	}

	public void setCantante(String cantante) {
		this.cantante = cantante;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Titulo: " + titulo;
	}

	public void introducirDisco() {
		int op = 0;
		System.out.println("---Introduce los siguientes datos---");
		System.out.println("Introduce el titulo del disco: ");
		titulo = sc.next();

		System.out.println("Introduce 1 si es un grupo / Introduce 2 si es un cantante: ");
		op = sc.nextInt();
		if (op == 1) {
			System.out.println("Introduce el nombre del grupo: ");
			grupo = sc.next();
		} else if (op == 2) {
			System.out.println("Introduce el nombre del cantante: ");
			cantante = sc.next();
		}
		System.out.println("Introduce el año de publicacion: ");
		anioPublicacion = sc.nextInt();

		System.out.println("Introduce el precio del disco: ");
		precio = sc.nextDouble();

		System.out.println("Tiene " + stock + " de stock");

		System.out.println("Se han guardado los datos con exito!");
	}

	public void mostrarTitulo() {

		System.out.println("Introduce el titulo del disco que quieras encontrar: ");
		titulo = sc.next();

		System.out.println("Titulo del disco: " + titulo);

	}

	public void obtenerNombre() {
		int op = 0;
		System.out.println("Introduce 1 si es un grupo / Introduce 2 si es un cantante: ");
		op = sc.nextInt();
		if (op == 1) {
			System.out.println("Introduce el nombre del grupo: ");
			grupo = sc.next();
			System.out.println("El nombre del grupo es: " + grupo);
		} else if (op == 2) {
			System.out.println("Introduce el nombre del cantante: ");
			cantante = sc.next();
			System.out.println("El nombre del cantante es: " + cantante);

		}
	}

	public void infDisco() {
		System.out.println("Datos del disco: ");
		System.out.println("Titulo: " + getTitulo());
		System.out.println("Grupo: " + getGrupo());
		System.out.println("Cantante: " + getCantante());
		System.out.println("Año Publicacion: " + getAnioPublicacion());
		System.out.println("Precio: " + getPrecio());
		System.out.println("Stock: " + getStock());

	}

	public void comprarDisco() {
		System.out.println("Introduce cuantas unidades queires comprar: ");
		int unidades = sc.nextInt();
		if (unidades > stock) {
			System.out.println("No hay suficiente stock");
		} else {
			double saldorestante = 0;
			saldorestante = cliente.saldo - disco.precio;
			System.out.println("Se ha realizado la compra, saldo restante: " + saldorestante);
		}
	}

}
