package poo.dominio;

public class Auto {
    
    private String marca;
    private int cantidadDePuertas;
    private String modelo;
    private String color;
    private String placa;

    public void setMarca( String marca){
        this.marca = marca;
    }
    public void setCantidadDePuertas( int cantidadDePuertas){
        this.cantidadDePuertas = cantidadDePuertas;
    }
    public void setModelo( String modelo){
        this.modelo = modelo;
    }
    public void setColor( String color){
        this.color = color;
    }
    public void setPlaca( String placa){
        this.placa = placa;
    }

    public String getMarca(){
        return this.marca;
    }
    public int getCantidadDePuertas(){
        return this.cantidadDePuertas;
    }
    public String getModelo(){
        return this.modelo;
    }
    public String getColor(){
        return this.color;
    }
    public String getPlaca(){
        return this.placa;
    }

    @Override
    public String toString(){
        return "Marca"+ this.marca 
            +"Cantidad de puertas" + this.cantidadDePuertas 
            + "Modelo" + this.modelo
            + "Color" + this.color
            + "Placa" + this.placa;
    }

}
