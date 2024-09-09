package trabajospracticos.padawan.ej2;

public class Contacto {
    private int Id;
    private String nombre;
    private long numeroTelefono;
    private String correoElectronico;

    public Contacto(){}
    public Contacto(int id, String nombre, long numeroTelefono, String correoElectronico){
        setId(id);
        setNombre(nombre);
        setNumeroTelefono(numeroTelefono);
        setCorreoElectronico(correoElectronico);
    }

    public void verContacto(){
        System.out.println("Id: " + getId() + "\nNombre: " + getNombre() +"\n");
    }

    public void verContactoCompleto(){
        System.out.println("Id: " + getId() + "\nNombre: " + getNombre() + "\nNúmero de Telefóno: " + getNumeroTelefono() + "\nCorreo Electronico: " + getCorreoElectronico() + "\n");
    }

    public int getId() {
        return Id;
    }
    public String getNombre() {
        return nombre;
    }
    public long getNumeroTelefono() {
        return numeroTelefono;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }


    public void setId(int id) {
        Id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNumeroTelefono(long numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
