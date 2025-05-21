package Clases;

public class Bibliotecario extends Persona {
	protected String turno;

	public Bibliotecario(String codigoCatalogo, String nombre, String email, String turno) {
		super(codigoCatalogo, nombre, email);
		this.turno = turno;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return super.toString() + "Bibliotecario [turno=" + turno + "]";
	}

}
