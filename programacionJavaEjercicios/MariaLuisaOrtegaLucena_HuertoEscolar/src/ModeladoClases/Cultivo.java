package ModeladoClases;

import java.util.HashSet;
import java.util.Set;

public abstract class Cultivo {
	public enum Temporada {
		PRIMAVERA, VERANO, OTOÑO, INVIERNO
	}

	protected String nombre;
	protected String variedad;
	protected Temporada temporada;
	protected Set<String> cuidados;

	public Cultivo(String nombre, String variedad, Temporada temporada, Set<String> cuidados) {
		super();
		this.nombre = nombre;
		this.variedad = variedad;
		this.temporada = temporada;
		this.cuidados = new HashSet<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getVariedad() {
		return variedad;
	}

	public void setVariedad(String variedad) {
		this.variedad = variedad;
	}

	public Temporada getTemporada() {
		return temporada;
	}

	public void setTemporada(Temporada temporada) {
		this.temporada = temporada;
	}

	public Set<String> getCuidados() {
		return cuidados;
	}

	public void setCuidados(Set<String> cuidados) {
		this.cuidados = cuidados;
	}

	@Override
	public String toString() {
		return "Cultivo [nombre=" + nombre + ", variedad=" + variedad + ", temporada=" + temporada + ", cuidados="
				+ cuidados + "]";
	}

	public abstract String tipoCultivo();

	public String resumen() {
		return "Cultivo " + tipoCultivo() + " nombre: " + nombre + " variedad: " + variedad + "- temporada: "
				+ temporada;
	}

}
