package ModeladoClases;

import java.util.ArrayList;
import java.util.List;

import ModeladoClases.Cultivo.Temporada;

public class ZonaHuerto {
	protected String codigo;
	protected List<Cultivo> cultivos;

	public ZonaHuerto(String codigo) {
		super();
		this.codigo = codigo;
		this.cultivos = new ArrayList<>();
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public List<Cultivo> getCultivos() {
		return cultivos;
	}

	public void setCultivos(List<Cultivo> cultivos) {
		this.cultivos = cultivos;
	}

	@Override
	public String toString() {
		return "ZonaHuerto [codigo=" + codigo + ", cultivos=" + cultivos + "]";
	}

	public void aniadirCultivo(Cultivo c) {
		cultivos.add(c);
	}

	public List<Cultivo> obtenerCultivosPorTemporada(Temporada t) {
		List<Cultivo> listaCultivoTemporada = new ArrayList<>();
		for (Cultivo cultivo : cultivos) {
			if (cultivo.getTemporada().equals(t)) {
				listaCultivoTemporada.add(cultivo);
			}
		}
		return listaCultivoTemporada;
	}
}
