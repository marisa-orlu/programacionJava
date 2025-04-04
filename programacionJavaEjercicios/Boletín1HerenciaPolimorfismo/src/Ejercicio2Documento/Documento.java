package Ejercicio2Documento;

public class Documento {
	protected String nombreEmpresa;
	protected String ciudadEmpresa;
	protected String calleEmpresa;
	protected String fundadorEmpresa;

	public Documento(String nombreEmpresa, String ciudadEmpresa, String calleEmpresa, String fundadorEmpresa) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		this.ciudadEmpresa = ciudadEmpresa;
		this.calleEmpresa = calleEmpresa;
		this.fundadorEmpresa = fundadorEmpresa;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getCiudadEmpresa() {
		return ciudadEmpresa;
	}

	public void setCiudadEmpresa(String ciudadEmpresa) {
		this.ciudadEmpresa = ciudadEmpresa;
	}

	public String getCalleEmpresa() {
		return calleEmpresa;
	}

	public void setCalleEmpresa(String calleEmpresa) {
		this.calleEmpresa = calleEmpresa;
	}

	public String getFundadorEmpresa() {
		return fundadorEmpresa;
	}

	public void setFundadorEmpresa(String fundadorEmpresa) {
		this.fundadorEmpresa = fundadorEmpresa;
	}

	@Override
	public String toString() {
		return "Documento[nombreEmpresa=" + nombreEmpresa + ", ciudadEmpresa=" + ciudadEmpresa + ", calleEmpresa="
				+ calleEmpresa + ", fundadorEmpresa=" + fundadorEmpresa + "]";
	}

	public void mostrarDocumento() {
		System.out.println("Nombre de la empresa: " + nombreEmpresa);
		System.out.println("Ciudad de la empresa: " + ciudadEmpresa);
		System.out.println("Calle de la empresa: " + calleEmpresa);
		System.out.println("Fundador de la empresa: " + fundadorEmpresa);
	}

}
