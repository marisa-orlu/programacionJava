package Ejercicio2Documento;

public class TarjetaDeVisita extends Documento {

	private String nombre;
	private String apellidos;
	private int telefono;
	private String cargoEmpresa;

	public TarjetaDeVisita(String nombreEmpresa, String ciudadEmpresa, String calleEmpresa, String fundadorEmpresa,
			String nombre, String apellidos, int telefono, String cargoEmpresa) {
		super(nombreEmpresa, ciudadEmpresa, calleEmpresa, fundadorEmpresa);
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.cargoEmpresa = cargoEmpresa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getCargoEmpresa() {
		return cargoEmpresa;
	}

	public void setCargoEmpresa(String cargoEmpresa) {
		this.cargoEmpresa = cargoEmpresa;
	}

	@Override
	public String toString() {
		return "TarjetaDeVisita [nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", cargoEmpresa=" + cargoEmpresa + "]";
	}

	@Override
	public void mostrarDocumento() {
		super.mostrarDocumento();
		System.out.println("Nombre" + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Telefono: " + telefono);
		System.out.println("Cargo de la empresa: " + cargoEmpresa);
	}
}
