import java.util.Date;

class Empleado {
    final String nombre;
    int edad;
    final Date fechaContratacion;

    Empleado(String name, Date birthDate) {
        this.nombre = name;
        this.birthDate = birthDate;
    }
    @Override
    public String toString() {
        return "Empleado: " + nombre + " (nacido en 19" + birthDate.getYear() + ")";
    }

}

