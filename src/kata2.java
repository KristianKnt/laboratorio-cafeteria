import java.util.Scanner;

public class kata2 {
    public static void main(String[] args) {

        // creamos la variables;
        String nombre_bebida;
        double temperatura_bebida;

        Scanner Entrada = new Scanner(System.in);

        System.out.println("");
        System.out.println("Bienvenido a la cafeteria del profe cascarita");
        System.out.println("");
        System.out.println("");
        System.out.println("Ingresa el nombre de la bebida");
        nombre_bebida = Entrada.nextLine();
        System.out.println("Ingresa la temperatura");
        temperatura_bebida = Entrada.nextDouble();

        Double temperatura_bebida_mejorada = temperatura_bebida;

        String temperatura_final = switch (temperatura_bebida_mejorada){
            case null -> "Temperatura no definida";
            case Double temporal when temporal > 60 -> "Caliente";
            case Double temporal1 when temporal1 >= 30 -> "Templada";
            case Double temporal2 -> "Fria";
        };

        System.out.println(nombre_bebida+":"+temperatura_final);

    }
}
