package gestionvehiculos;

public class Coche extends Vehiculo{

    public Coche(int id,String marca, String modelo, String tipoVehiculo){
        super(id,marca, modelo, tipoVehiculo);
    }

    @Override
    public void mover() {
        System.out.println("Se enciende el motor del coche y acelera. \n");;
    }
    
}
