package gestionvehiculos;

public class Moto extends Vehiculo {

    public Moto(int id, String marca, String modelo, String tipoVehiculo) {
        super(id,marca,modelo,tipoVehiculo);
    }

    @Override
    public void mover() {
        System.out.println("Se enciende el motor de la moto y se mueve hacia adelante. \n");
    }

}
