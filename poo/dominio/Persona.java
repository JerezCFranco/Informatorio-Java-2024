package poo.dominio;

public class Persona {
    // Atributos y metodos (responsabilidades)
    private String nombre;
    private String apellido;
    private int dni;
    private int edad;

    // Relaciones
    private Auto auto;

    // Constructor vacio
    public Persona() {}

    // Constructor completo
    public Persona(String nombre, String apellido, int dni, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    public Persona(String nombre){
        this.nombre = nombre;
    }


    // [Clasificador] [tipoDeRetorno] nombreDelMetodo([<expresiones>])){}

    // Setters para guardar información
    public void setNombre(String nombre){
        //This es una forma de apuntar a atributos y metodos de la clase

        boolean esNombreValido = validarNombre(nombre);
        if(esNombreValido){
            this.nombre = nombre;
        }else {
            System.out.println("Nombre invalido");
        }
    }
    private boolean validarNombre(String nombre){
        if (nombre == null || nombre.isEmpty()){
            return false;
        }
        return true;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setDni(int dni){
        this.dni = dni;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setAuto(Auto auto){
        this.auto = auto;
    }

    // Getters para devolver información
    public String getNombre() {
        return this.nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    public int getDni() {
        return this.dni;
    }
    public int getEdad() {
        return this.edad;
    }

    public Auto getAuto(){
        return auto;
    }

}
