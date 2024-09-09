package trabajospracticos.caballero.ej1;

public class Palabra {
    public String palabraString;
    public String definicionString;

    public Palabra(){}
    public Palabra(String palabraString, String definicionString){
        setPalabraString(palabraString);
        setDefinicionString(definicionString);
    }


    public String getPalabraString() {
        return palabraString;
    }
    public String getDefinicionString() {
        return definicionString;
    }


    public void setPalabraString(String palabraString) {
        this.palabraString = palabraString;
    }
    public void setDefinicionString(String definicionString) {
        this.definicionString = definicionString;
    }
}
