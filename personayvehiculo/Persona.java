package personayvehiculo;
import java.time.LocalDate;

public class Persona {
    private long dni;
    private String nombre;
    private LocalDate fechaDeNacimiento;
    private Vehiculo vehiculo;

    public Persona(){};

    public Persona(long dni, String nombre, boolean licencia){
        this.dni = dni;
        this.nombre = nombre;
    };

    public long getDni() {
        return dni;
    }
    public String getNombre() {
        return nombre;
    }
    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
    public String getVehiculo() {
        if (vehiculo != null) {
            return toString();
        }else {
            return "no tiene vehículo.";
        }
    }

    public void setDni(long dni) {
        this.dni = dni;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    @Override
    public String toString(){
        return "tiene Vehiculo.";
    }
}


