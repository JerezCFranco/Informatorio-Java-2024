package gestionvehiculos;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Flota {
    public void movimientoVehiculo(List<Vehiculo> vehiculos) {
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mover();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eleccion = 10;
        int nId = 1;
        List<Vehiculo> listaVehiculos = new ArrayList<>();
        while (eleccion != 0) {
            System.out
                    .println("Bienvenido! Que desea realizar? \n -1 Agregar Vehiculo \n -2 Ver vehiculos \n -0 Salir");
                    eleccion = scanner.nextInt();
            System.out.println();
            if (eleccion == 1) {
                System.out.println("Que tipo de Vehiculo Desea agregar?: \n -1 Agregar Coche \n -2 Agregar Moto");
                int eleccionVehiculo = scanner.nextInt();
                if (eleccionVehiculo == 1) {
                    System.out.println("Ingrese la marca del coche: ");
                    String marca = scanner.next();
                    System.out.println("Ingrese el modelo del coche: ");
                    String modelo = scanner.next();
                    Vehiculo vehiculo = new Coche(nId,marca, modelo, "Automovil");
                    nId++;
                    listaVehiculos.add(vehiculo);
                } else if (eleccionVehiculo == 2) {
                    System.out.println("Ingrese la marca de la moto: ");
                    String marca = scanner.next();
                    System.out.println("Ingrese el modelo de la moto: ");
                    String modelo = scanner.next();
                    Vehiculo vehiculo = new Moto(nId,marca, modelo,"Motocicleta");
                    nId++;
                    listaVehiculos.add(vehiculo);
                } else {
                    System.out.println("Número ingresado invalido.");
                }
            } else if (eleccion == 2) {
                for (Vehiculo vehiculo : listaVehiculos) {
                    System.out.println("Id: " + vehiculo.getId());
                    System.out.println("Marca: " + vehiculo.getMarca());
                    System.out.println("Modelo: " + vehiculo.getModelo());
                    System.out.println("Vehiculo: " + vehiculo.getTipoVehiculo());
                    vehiculo.mover();
                }
            } else if(eleccion != 0 && eleccion != 1 && eleccion !=2){
                System.out.println("Número ingresado invalido. \n");
            }
        }System.out.println("Programa finalizado, gracias por participar!");
        scanner.close();
    }
}
