
public class Relajacion extends Actividad{

	public Relajacion(String nombre, int dificultad) {
		super(nombre, dificultad);
	}

	@Override
	public String getTipo() {
		return "Relajacion";
	}

}