package ModeladoClases;

import java.util.Set;

public class Frutal extends Cultivo {

	public Frutal(String nombre, String variedad, Temporada temporada, Set<String> cuidados) {
		super(nombre, variedad, temporada, cuidados);
	}

	@Override
	public String tipoCultivo() {
		return "Frutal";
	}
}
