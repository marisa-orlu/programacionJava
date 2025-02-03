import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
    int opcion;
    Scanner scanner =  new Scanner(System.in);
    Colegio colegio = new Colegio();
    do{
        System.out.println("Menu to guapo:");
        System.out.println("Mostrar alumnos:");
        System.out.println("Introducir alumnos");
        System.out.println("Borrar alumnos");
        System.out.println("Salir");

        opcion = scanner.nextInt();

        switch(opcion){
            case 1:
                colegio.mostrarAlumnos();
                break;

            case 2:
                System.out.println("DNI del Alumno");
                String dniALumno = scanner.nextLine();

                System.out.println("Pon el nombre del alumno");
                String nombre = scanner.nextLine();

                System.out.println("Edad del alumno");
                int edad = scanner.nextInt();

                System.out.println("Curso del alumno");
                String curso = scanner.nextLine();

                colegio.crearAlumno(nombre, edad, curso);

                break;

            case 3:
                System.out.println("DNI del alumno a borrar");
                String dniAlumnoBorrado = scanner.nextLine();
                colegio.borrarAlumno(dniAlumnoBorrado);
                break;
            
            case 4: System.out.println("Adios");
            break;
        }

    } while (opcion !=4);
   }
}