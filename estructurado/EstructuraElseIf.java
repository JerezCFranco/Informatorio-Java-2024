package estructurado;

public class EstructuraElseIf {
    public static void main(String[] args) {
         
        // Para booleanos variables en forma de pregunta ¿Es un dia de clases?
        boolean esUnDiaDeClases = true;
        final String DIA = "Viernes";

        if(esUnDiaDeClases && DIA == "Lunes"){
            System.out.println("Hoy es: " + DIA + " y no hay clases");
        } else if (!esUnDiaDeClases){
            //No es un dia de clases
            System.out.println("Hoy es: " + DIA + " y no hay clases");
        } else {
            System.out.println("Pasamos al else");
            if(DIA == "Viernes"){
                System.out.println("Hoy hay clases!");
            } else if(DIA == "Martes"){
                System.out.println("Ayer tuvimos clases");
            }
        }
    }
}
