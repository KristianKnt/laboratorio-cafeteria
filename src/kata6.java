import java.util.Scanner;

public class kata6 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        /*
        Contexto: La cafetería quiere saber cuántos clientes atiende por hora para
        planificar mejor el personal.
         */
        double dato;
        double contadorHoras = 0;
        int total_clientes = 0;
        int horaPico = -1;
        int maxClientes = -1;
        int opcion = 0;
        int contador = 1;



        do {
            System.out.println("");
            System.out.println("Bienvenido a la cafeteria del profe cascarita");
            System.out.println("Ingresa la hora (0-23, -1 para terminar): ");
            dato = Entrada.nextDouble();
            if (dato == -1.0){
                opcion = -1;
                System.out.println("Saliendo el sistema");
            }else{
                while(dato < -1 || dato >23){
                    System.out.println("Hora ingresada erronea");
                    System.out.println("Ingresa la hora (0-23, -1 para terminar): ");
                    dato = Entrada.nextDouble();
                }
                contadorHoras += dato;
                System.out.println("Ingresa el número de clientes en esa hora : ");
                dato = Entrada.nextInt();
                total_clientes += dato;

            }


             contador ++;
        }while(opcion != -1);


        System.out.println("horas -> "+contadorHoras);
        System.out.println("Total clientes atendidos -> "+total_clientes);
        System.out.println("Promedio clientes por hora -> "+ contadorHoras/contador );
        System.out.println();

    }
}
