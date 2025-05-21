package Gestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ModeladoClases.Cultivo;
import ModeladoClases.Cultivo.Temporada;
import ModeladoClases.Voluntario;
import ModeladoClases.ZonaHuerto;

public class HuertoLopeDeVega {
	protected Map<String, ZonaHuerto> zonas;
	protected Map<String, Voluntario> voluntarios;

	public HuertoLopeDeVega() {
		super();
		this.zonas = new HashMap<>();
		this.voluntarios = new HashMap<>();
	}

	public Map<String, ZonaHuerto> getZonas() {
		return zonas;
	}

	public void setZonas(Map<String, ZonaHuerto> zonas) {
		this.zonas = zonas;
	}

	public Map<String, Voluntario> getVoluntarios() {
		return voluntarios;
	}

	public void setVoluntarios(Map<String, Voluntario> voluntarios) {
		this.voluntarios = voluntarios;
	}

	@Override
	public String toString() {
		return "HuertoLopeDeVega [zonas=" + zonas + ", voluntarios=" + voluntarios + "]";
	}

	// a registrar zona
	public void registrarZona(ZonaHuerto z) {
		zonas.put(z.getCodigo(), z);
	}

	// b registrar voluntario
	public void registrarVoluntario(Voluntario v) {
		voluntarios.put(v.getDni(), v);
	}

	// c asignar cultivo a zona
	public void asignarCultivoAZona(String codigoZona, Cultivo cultivo) {
		for (ZonaHuerto zona : zonas.values()) {
			zona.getCultivos().add(cultivo);
			zonas.put(codigoZona, zona);
		}
	}

	// d registar tarea voluntario
	public void registrarTareaVoluntario(String dni, Tarea t) {
		for (Voluntario voluntario : voluntarios.values()) {
			voluntario.aniadirTarea(t);
		}

	}

	// e obtener todos los cultivos
	public List<Cultivo> obtenerTodosLosCultivos() {
		List<Cultivo> listaCultivosRegistrados = new ArrayList<>();

		for (ZonaHuerto zona : zonas.values()) {
			for (Cultivo c : zona.getCultivos()) {
				listaCultivosRegistrados.add(c);
			}
		}
		return listaCultivosRegistrados;
	}

	// Stream

	// 1
	public List<String> obtenerNombresCultivosFrutalesVerano() {
		List<Cultivo> listaCultivos = new ArrayList<>();

		return listaCultivos.stream().filter(c -> c.getTemporada().equals(Temporada.VERANO)).map(Cultivo::getNombre)
				.sorted().toList();

	}

}
