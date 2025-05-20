
public class Monitor implements Mostrable{

	private String nombre;
    private String dni;

    public Monitor(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }    	
	
	@Override
	public String resumen() {
		return "Monitor: " + nombre + " (DNI: " + dni + ")";
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        
        if (!(o instanceof Monitor)) return false;
        
        Monitor monitor = (Monitor) o;
        
        return dni.equals(monitor.dni);
    }
	
	@Override
    public String toString() {
        return resumen();
    }
	
	
}