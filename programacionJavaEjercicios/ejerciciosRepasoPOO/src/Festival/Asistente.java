package Festival;

import java.util.ArrayList;

public class Asistente {
	private String nombreAsistente;
	private String apellido;
	private String dni;
	private int anioNacimiento;
	private String correoElectronico;
	private ArrayList<String> recordatorio;
	private String tipoEntrada;
	private String accesoEspecial;
	private ArrayList<String> promociones;

	public Asistente(String nombreAsistente, String apellido, String dni, int anioNacimiento, String correoElectronico,
			ArrayList<String> recordatorio, String tipoEntrada, String accesoEspecial, ArrayList<String> promociones) {
		super();
		this.nombreAsistente = nombreAsistente;
		this.apellido = apellido;
		this.dni = dni;
		this.anioNacimiento = anioNacimiento;
		this.correoElectronico = correoElectronico;
		this.recordatorio = recordatorio;
		this.tipoEntrada = tipoEntrada;
		this.accesoEspecial = accesoEspecial;
		this.promociones = promociones;
	}

	public String getNombreAsistente() {
		return nombreAsistente;
	}

	public void setNombreAsistente(String nombreAsistente) {
		this.nombreAsistente = nombreAsistente;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getAnioNacimiento() {
		return anioNacimiento;
	}

	public void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public ArrayList<String> getRecordatorio() {
		return recordatorio;
	}

	public void setRecordatorio(ArrayList<String> recordatorio) {
		this.recordatorio = recordatorio;
	}

	public String getAccesoEspecial() {
		return accesoEspecial;
	}

	public void setAccesoEspecial(String accesoEspecial) {
		this.accesoEspecial = accesoEspecial;
	}

	public ArrayList<String> getPromociones() {
		return promociones;
	}

	public void setPromociones(ArrayList<String> promociones) {
		this.promociones = promociones;
	}

	public String getTipoEntrada() {
		return tipoEntrada;
	}

	@Override
	public String toString() {
		return "Asistente [nombreAsistente=" + nombreAsistente + ", apellido=" + apellido + ", dni=" + dni
				+ ", anioNacimiento=" + anioNacimiento + ", correoElectronico=" + correoElectronico + ", recordatorio="
				+ recordatorio + ", tipoEntrada=" + tipoEntrada + ", accesoEspecial=" + accesoEspecial
				+ ", promociones=" + promociones + "]";
	}

	// Metodo para verificar mayor de edad o menor
	// Si returna false es menor de edad y se enseña las entradas que tiene
	// disponible
	// Si returna true es mayor de edad y se le enseña las entradas disponibles
	public boolean verificarEdad(int anioNacimiento) {
		int anioFestival = 2026;
		int anio = anioFestival - anioNacimiento;

		if (anio >= 18) {
			return true;
		} else {
			return false;
		}
	}

	public void actualizaCorreo(String correoNuevo) {
		correoElectronico = correoNuevo;
	}

}
