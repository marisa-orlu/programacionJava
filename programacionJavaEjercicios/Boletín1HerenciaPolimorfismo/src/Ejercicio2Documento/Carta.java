package Ejercicio2Documento;

public class Carta extends Documento {

	private String fecha;

	public Carta(String nombreEmpresa, String ciudadEmpresa, String calleEmpresa, String fundadorEmpresa,
			String fecha) {
		super(nombreEmpresa, ciudadEmpresa, calleEmpresa, fundadorEmpresa);
		this.fecha = fecha;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public void mostrarDocumento() {
		super.mostrarDocumento();
		System.out.println("Fecha de la carta: " + fecha);
	}
}
