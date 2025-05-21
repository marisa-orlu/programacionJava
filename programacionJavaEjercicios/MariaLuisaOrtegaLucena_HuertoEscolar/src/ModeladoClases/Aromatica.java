package ModeladoClases;

import java.util.Set;

public class Aromatica extends Cultivo {

	public Aromatica(String nombre, String variedad, Temporada temporada, Set<String> cuidados) {
		super(nombre, variedad, temporada, cuidados);
	}

	@Override
	public String tipoCultivo() {
		return "Aromatica";
	}

}
