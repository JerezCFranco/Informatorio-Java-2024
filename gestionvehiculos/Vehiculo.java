package gestionvehiculos;

abstract public class Vehiculo {
    
    private int id;
    private String marca;
    private String modelo;
    private String tipoVehiculo;

    public int getId(){
        return this.id;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public String getTipoVehiculo(){
        return this.tipoVehiculo;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setTipoVehiculo(String tipoVehiculo){
        this.tipoVehiculo = tipoVehiculo;
    }

    public Vehiculo(){}

    public Vehiculo(int id,String marca, String modelo, String tipoVehiculo){
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.tipoVehiculo = tipoVehiculo;
    }

    public abstract void mover();

}
