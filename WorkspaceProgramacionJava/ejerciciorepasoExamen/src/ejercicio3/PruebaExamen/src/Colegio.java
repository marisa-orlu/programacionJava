public class Colegio{

    String alumnos = new Alumno[];
    totalAlumnos = 0;


    public void mostrarAlumnos() {
        for (int i=0; i < totalAlumnos; i++){
            alumnos[i].mostrarInformacion();
        }
        
    }

    public void crearAlumno(String dni, String nombre, int edad, String curso) {
       
    }

    public void borrarAlumno(String dni) {
       
    }

    

}