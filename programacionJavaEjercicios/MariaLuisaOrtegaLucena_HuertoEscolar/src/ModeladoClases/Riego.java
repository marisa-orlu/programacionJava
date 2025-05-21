package ModeladoClases;

import Gestion.Tarea;

public class Riego implements Tarea {
	protected Cultivo cultivo;
	protected int litros;

	public Riego(Cultivo cultivo, int litros) {
		super();
		this.cultivo = cultivo;
		this.litros = litros;
	}

	public Cultivo getCultivo() {
		return cultivo;
	}

	public void setCultivo(Cultivo cultivo) {
		this.cultivo = cultivo;
	}

	public int getLitros() {
		return litros;
	}

	public void setLitros(int litros) {
		this.litros = litros;
	}

	@Override
	public String toString() {
		return "Riego [cultivo=" + cultivo + ", litros=" + litros + "]";
	}

	@Override
	public void realizar() {
		System.out.println("Se ha regado " + cultivo.getNombre() + " con " + litros + " litros.");

	}

}
