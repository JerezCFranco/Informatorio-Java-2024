package personayvehiculo;

public class Vehiculo {

    private int cantidadDeRuedas;
    private boolean competencia;
    private boolean alarma;
    private String marca;
    private String kmMaximo;
    private String kmMinimo;

    public Vehiculo(String marca, int cantidadDeRuedas, boolean competencia, String kmMaximo, String kmMinimo){
        this.marca = marca;
        this.cantidadDeRuedas = cantidadDeRuedas;
        this.competencia = competencia;
        this.alarma = false;
        this.kmMaximo = kmMaximo;
        this.kmMinimo = kmMinimo;
    }
    public Vehiculo(String marca, int cantidadDeRuedas, boolean competencia, boolean alarma, String kmMaximo, String kmMinimo){
        this.marca = marca;
        this.cantidadDeRuedas = cantidadDeRuedas;
        this.competencia = competencia;
        this.alarma = alarma;
        this.kmMaximo = kmMaximo;
        this.kmMinimo = kmMinimo;
    }

    public int getCantidadDeRuedas() {
        return cantidadDeRuedas;
    }
    public boolean getCompetencia(){
        if(this.competencia){
            return competencia;
        } else {
            return competencia;
        }
    }
    public boolean getAlarma(){
        if(this.alarma){
            return alarma;
        } else {
            return alarma;
        }
    }

    public String getMarca() {
        return marca;
    }
    public String getKmMaximo() {
        return kmMaximo;
    }
    public String getKmMinimo() {
        return kmMinimo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setCantidadDeRuedas(int cantidadDeRuedas) {
        this.cantidadDeRuedas = cantidadDeRuedas;
    }
    public void setCompetencia(boolean competencia) {
        this.competencia = competencia;
    }
    public void setAlarma(boolean alarma) {
        this.alarma = alarma;
    }
    public void setKmMaximo(String kmMaximo) {
        this.kmMaximo = kmMaximo;
    }
    public void setKmMinimo(String kmMinimo) {
        this.kmMinimo = kmMinimo;
    }

    public void mostrarPorPantallaMarca(){
        System.out.println("La marca del vehículo es: " + this.marca);
    }

    public void arrancarVehiculo(){
        System.out.println("Se enciende el motor del vehículo.\n");
    }
}
