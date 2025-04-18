package practicas11;

//. Crear un programa para poner las notas de un alumno (clase Alumno con atributos). Los atributos de un 
//alumno son su nombre, curso, un array de notas, número de suspensos y nota media. 
//En una clase GestionNotas, el programa debe poder poner notas a un solo alumno, mostrar todas sus notas por 
//pantalla, modificar una nota, calcular la media y dar su número de suspensos.  
//Probar todo en la clase Principal. 

public class Alumno {

	private String nombre;
	private int curso;
	private double [] notas;
	private int numeroSuspensos;
	private double notaMedia;
	
	public Alumno(String nombre, int curso, double[] notas, int numeroSuspensos, double notaMedia) {
		this.nombre = nombre;
		this.curso = curso;
		this.notas = notas;
		this.numeroSuspensos = numeroSuspensos;
		this.notaMedia = notaMedia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public int getNumeroSuspensos() {
		return numeroSuspensos;
	}

	public void setNumeroSuspensos(int numeroSuspensos) {
		this.numeroSuspensos = numeroSuspensos;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	
	
	public double calcularMedia() {
		double suma=0;
		for(int i = 0; i<notas.length;i++) {
			suma+=notas[i];
		}
		return notaMedia = suma / notas.length;
	}
	
	
}
