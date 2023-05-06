import java.util.Date;

class Empleado {
    final String nombre;
    private int edad;
    int edad;
    final Date fechaContratacion;

    public void setEdad(int edad) {
        if (edad<0) throw new RuntimeException("Un empleado no puede tener edad negativa");
        else this.edad = edad;
    }

    Empleado(String name, Date birthDate) {
        this.nombre = name;
        this.birthDate = birthDate;
    }
    @Override
    public String toString() {
        return "Empleado: " + nombre + " (nacido en 19" + birthDate.getYear() + ")";
    }

}

