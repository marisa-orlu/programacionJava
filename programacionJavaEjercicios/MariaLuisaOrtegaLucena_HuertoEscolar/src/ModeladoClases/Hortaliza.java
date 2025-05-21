package ModeladoClases;

import java.util.Set;

public class Hortaliza extends Cultivo {

	public Hortaliza(String nombre, String variedad, Temporada temporada, Set<String> cuidados) {
		super(nombre, variedad, temporada, cuidados);
	}

	@Override
	public String tipoCultivo() {
		return "Hortaliza";
	}

}
