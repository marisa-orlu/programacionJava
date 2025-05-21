package Clases;

public class Lector extends Persona {
//	public enum TipoLector {
//        INFANTIL,
//        ADULTO,
//        JUBILADO
//    }
//    private TipoLector tipoLector;

	protected String tipoLector;

	public Lector(String codigoCatalogo, String nombre, String email, String tipoLector) {
		super(codigoCatalogo, nombre, email);
		this.tipoLector = tipoLector;
	}

	public String getTipoLector() {
		return tipoLector;
	}

	public void setTipoLector(String tipoLector) {
		this.tipoLector = tipoLector;
	}

	@Override
	public String toString() {
		return super.toString() + "Lector [tipoLector=" + tipoLector + "]";
	}

}
