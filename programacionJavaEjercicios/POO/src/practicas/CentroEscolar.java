package practicas;

public class CentroEscolar {
	public String nombreAsignatura;
	public int aula;
	public String fecha;
	
	//constructor parametrizado
	public CentroEscolar(String nombreAsignatura, int aula, String fecha) {
		this.nombreAsignatura = nombreAsignatura;
		this.aula = aula;
		this.fecha = fecha;
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre de la asignatura: "+nombreAsignatura);
		System.out.println("Numero del aula: "+aula);
		System.out.println("Fecha del examen: "+fecha);
	}
	
	
}
