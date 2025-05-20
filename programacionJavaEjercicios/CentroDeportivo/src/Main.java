import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		SistemaGestion sistema = new SistemaGestion();

        // Crear monitores
        Monitor m1 = new Monitor("Lucía", "111A");
        Monitor m2 = new Monitor("Carlos", "222B");
        Monitor m3 = new Monitor("Elena", "333C");

        sistema.registrarMonitor(m1);
        sistema.registrarMonitor(m2);
        sistema.registrarMonitor(m3);

        // Crear centros
        CentroDeportivo c1 = new CentroDeportivo("Polideportivo Norte");
        CentroDeportivo c2 = new CentroDeportivo("Gimnasio Sur");

        sistema.registrarCentro(c1);
        sistema.registrarCentro(c2);

        // Crear actividades
        Actividad a1 = new Fuerza("Crossfit", 5);
        Actividad a2 = new Cardio("Spinning", 4);
        Actividad a3 = new Relajacion("Yoga", 2);
        Actividad a4 = new Fuerza("HIIT", 3);
        Actividad a5 = new Cardio("Zumba", 3);

        // Asignar actividades a centros
        sistema.asignarActividadACentro("Polideportivo Norte", a1);
        sistema.asignarActividadACentro("Polideportivo Norte", a2);
        sistema.asignarActividadACentro("Polideportivo Norte", a3);
        sistema.asignarActividadACentro("Gimnasio Sur", a4);
        sistema.asignarActividadACentro("Gimnasio Sur", a5);

        // Asignar monitores a actividades
        sistema.asignarMonitorAActividad("Polideportivo Norte", "Crossfit", "111A");
        sistema.asignarMonitorAActividad("Polideportivo Norte", "Crossfit", "222B");
        sistema.asignarMonitorAActividad("Polideportivo Norte", "Spinning", "111A");
        sistema.asignarMonitorAActividad("Polideportivo Norte", "Yoga", "333C");
        sistema.asignarMonitorAActividad("Gimnasio Sur", "HIIT", "222B");
        sistema.asignarMonitorAActividad("Gimnasio Sur", "Zumba", "333C");
        sistema.asignarMonitorAActividad("Gimnasio Sur", "Zumba", "111A");
        
        //PRUEBA STREAM
        
        System.out.println("\n Monitores que imparten actividades de Fuerza:");
        sistema.obtenerMonitoresDeFuerzaOrdenados()
                .forEach(nombre -> System.out.println(" - " + nombre));
        
     
        System.out.println("\n Top 3 actividades con más monitores:");
        sistema.obtenerTop3ActividadesConMasMonitores()
                .forEach(act -> System.out.println(" - " + act.getNombre() + " (" + act.getMonitores().size() + " monitores)"));
        
        
        System.out.println("\n Actividades por centro:");
        sistema.obtenerActividadesPorCentro().forEach((centro, actividades) -> {
            System.out.println(" - " + centro + ": " + actividades);
        });
        
        System.out.println("\n Dificultad media por centro:");
        sistema.obtenerDificultadMediaPorCentro().forEach((centro, media) -> {
            System.out.printf(" - %s: %.2f%n", centro.getNombre(), media);
        });
        
        System.out.println("\n Actividades ordenadas en Polideportivo Norte:");
        sistema.obtenerActividadesOrdenadas("Polideportivo Norte")
                .forEach(act -> System.out.println(" - " + act));
        
        System.out.println("\n Monitores que imparten en varios centros:");
        sistema.monitoresQueImpartenEnVariosCentros().forEach(dni -> {
            Monitor m = sistema.getMonitorPorDni(dni);
            System.out.println(" - " + m);
        });
        
        System.out.println("\n Monitor más activo:");
        Optional<Monitor> monitorTop = sistema.obtenerMonitorMasActivo();
        if (monitorTop.isPresent()) {
            System.out.println(" - " + monitorTop.get());
        } else {
            System.out.println(" - Ninguno");
        }

	}

}
