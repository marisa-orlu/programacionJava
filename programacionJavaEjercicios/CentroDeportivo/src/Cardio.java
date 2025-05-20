
public class Cardio extends Actividad{

	public Cardio(String nombre, int dificultad) {
		super(nombre, dificultad);
	}

	@Override
	public String getTipo() {
		return "Cardio";
	}

}