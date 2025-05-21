package ModeladoClases;

import Gestion.Tarea;

public class Poda implements Tarea {
	protected Cultivo cultivo;

	public Poda(Cultivo cultivo) {
		super();
		this.cultivo = cultivo;
	}

	public Cultivo getCultivo() {
		return cultivo;
	}

	public void setCultivo(Cultivo cultivo) {
		this.cultivo = cultivo;
	}

	@Override
	public String toString() {
		return "Poda [cultivo=" + cultivo + "]";
	}

	@Override
	public void realizar() {
		System.out.println("Se ha podado el cultivo " + cultivo.getNombre());
	}

}
