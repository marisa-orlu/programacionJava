package ejercicio10Poo;

import java.time.LocalDateTime;

public class Ticket {
	public int cantidadTicket;
	public double precio;
	public LocalDateTime fecha;

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public Ticket(LocalDateTime fecha) {
		super();
		this.fecha = fecha;
	}

	public Ticket(int cantidadTicket, double precio) {
		super();
		this.cantidadTicket = cantidadTicket;
		this.precio = precio;
	}

	public int getCantidadTicket() {
		return cantidadTicket;
	}

	public void setCantidadTicket(int cantidadTicket) {
		this.cantidadTicket = cantidadTicket;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Ticket [cantidadTicket=" + cantidadTicket + ", precio=" + precio + "]";
	}

}
