import java.util.Arrays;

public class Entrenador {
    public String nombre_entrenador;
    public int experiencia;
    public String [] especialidad = {"experto", "intermedio", "bajo"};

    public Entrenador(String nombre_entrenador, int experiencia, String[] especialidad) {
        this.nombre_entrenador = nombre_entrenador;
        this.experiencia = experiencia;
        this.especialidad = especialidad;
    }

    public String getNombre_entrenador() {
        return nombre_entrenador;
    }

    public void setNombre_entrenador(String nombre_entrenador) {
        this.nombre_entrenador = nombre_entrenador;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String[] getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String[] especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "nombre_entrenador='" + nombre_entrenador + '\'' +
                ", experiencia=" + experiencia +
                ", especialidad=" + Arrays.toString(especialidad) +
                '}';
    }
}
