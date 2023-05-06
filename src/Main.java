import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Empleado p = new Empleado("Pepe Pérez", new Date(90, Calendar.FEBRUARY, 1));
        System.out.println(p);

        p.nombre = "Manolo"; // Cambio de nombre. No se debe permitir
        p.fechaContratacion = new Date(99, Calendar.FEBRUARY, 1); // Cambio de fecha. No se debe permitir


        //p.edad = -31; // Arreglado: error de compilación. edad no es accesible

        Empleado p2 = new Empleado("Pepe Pérez", -31, new Date(90, Calendar.FEBRUARY, 1));
        System.out.println(p);


        System.out.println("Si quiero mostrar solo el nombre: " + p.nombre);
        System.out.println("Si quiero mostrar solo la edad no puedo: " + p.edad); // necesito un getter
    }
}