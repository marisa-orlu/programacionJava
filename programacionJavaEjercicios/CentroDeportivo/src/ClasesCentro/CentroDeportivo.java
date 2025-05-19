package ClasesCentro;

import java.util.HashSet;
import java.util.Set;

public class CentroDeportivo {
	protected String nombreCentro;
	protected Set<Actividad> listaActividades;

	public CentroDeportivo(String nombreCentro) {
		super();
		this.nombreCentro = nombreCentro;
		this.listaActividades = new HashSet<>();
	}

	public String getNombreCentro() {
		return nombreCentro;
	}

	public void setNombreCentro(String nombreCentro) {
		this.nombreCentro = nombreCentro;
	}

	public Set<Actividad> getListaActividades() {
		return listaActividades;
	}

	public void setListaActividades(Set<Actividad> listaActividades) {
		this.listaActividades = listaActividades;
	}

	@Override
	public String toString() {
		return "CentroDeportivo [nombreCentro=" + nombreCentro + ", listaActividades=" + listaActividades + "]";
	}
//	
//	List <Actividad> ordenadas = new ArrayList <>(activida)
//	Collections.sort(ordenadas);
//	return ordenadas

}
