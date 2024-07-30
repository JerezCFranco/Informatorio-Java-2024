package personayvehiculo;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona(123456789, "Matias Candia", false);
        Persona persona2 = new Persona(987654321, "Ricardo Milos", true);

        Vehiculo vehiculo1 = new Vehiculo("Toyota", 4, true, "200km/h", "0km/h");
        Vehiculo vehiculo2 = new Vehiculo("Fiat", 4, false, true, "160km/h", "0km/h");

        persona1.setFechaDeNacimiento(LocalDate.of(1999, 10, 25));
        persona2.setFechaDeNacimiento(LocalDate.of(1977, 11, 11));
        persona2.setVehiculo(vehiculo1);
        System.out.println("Los datos de la primera persona son: \n Nombre: " + persona1.getNombre()+ "\n DNI: " + persona1.getDni()+"\n Fecha de nacimiento: "+persona1.getFechaDeNacimiento()+"\n");
        System.out.println("Los datos de la segunda persona son: \n Nombre: " + persona2.getNombre()+ "\n DNI: " + persona2.getDni()+"\n Fecha de nacimiento: "+persona2.getFechaDeNacimiento()+"\n");

        System.out.println("Sobre el segundo vehículo: ");
        vehiculo2.mostrarPorPantallaMarca();
        vehiculo2.arrancarVehiculo();
        System.out.println("Los datos del primer vehículo son: \n Marca: " +vehiculo1.getMarca()+"\n Cantidad de ruedas: "+vehiculo1.getCantidadDeRuedas()+"\n Competencia: "+vehiculo1.getCompetencia()+"\n Alarma:" + vehiculo1.getAlarma()+"\n Velocidad maxima: "+vehiculo1.getKmMaximo()+"\n Velocidad minima: "+vehiculo1.getKmMinimo()+"\n");
        System.out.println("Los datos del segundo vehículo son: \n Marca: " +vehiculo2.getMarca()+"\n Cantidad de ruedas: "+vehiculo2.getCantidadDeRuedas()+"\n Competencia: "+vehiculo2.getCompetencia()+"\n Alarma:" + vehiculo2.getAlarma()+"\n Velocidad maxima: "+vehiculo2.getKmMaximo()+"\n Velocidad minima: "+vehiculo2.getKmMinimo()+"\n");
        System.out.println(persona1.getNombre() + " " + persona1.getVehiculo());
        System.out.println(persona2.getNombre() + " " + persona2.getVehiculo());
    }
}
