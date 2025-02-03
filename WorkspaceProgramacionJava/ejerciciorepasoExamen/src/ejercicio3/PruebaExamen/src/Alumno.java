public class Alumno {
    private String dni;
    private String nombre;
    private int edad;
    private String curso;
          
    public Alumno (String dni, String nombre , int edad, String curso){
        this.dni=dni;
        this.nombre=nombre;
        this.edad=edad;
        this.curso=curso;
    }

    public boolean mayoriaEdad(){
        return edad >= 18;
    }

    public void mostrarInformacion(){
        System.out.println("DNI:" + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Curso: "+ curso);
        System.out.println("Mayor de edad: " + (mayoriaEdad() ? "Si" : "No"));
    }

    
}
