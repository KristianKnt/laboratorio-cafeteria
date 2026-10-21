import java.util.Scanner;

public class kata4 {
    public static void main(String[] args) {
        int dia = 0;
        int hora = 0;
        Scanner Entrada = new Scanner(System.in);

        System.out.println("Aca puede validar el horario de la cafeteria del profe cascarita");
        System.out.println("Ingresa el día (1=Lunes,.... 7=Domingo): ");
        dia = Entrada.nextInt();

        while(dia < 1 || dia > 7){
            System.out.print("Dia no exite. Intente de nuevo: ");
            dia = Entrada.nextInt();
        }

        System.out.println("Ingresa la hora (0-23):");
        hora = Entrada.nextInt();

        while(hora < 0 || hora >23 ){
            System.out.print("Hora inválida Ingres entre (0 y 23): ");
            hora = Entrada.nextInt();
        }

        boolean memoria = false;
        switch (dia){
            case 1:

            case 2:

            case 3:

            case 4:

            case 5:
                memoria = (hora >= 6 && hora < 20);
                break;

            case 6:
                memoria = (hora >= 7 && hora < 14);
                break;
            case 7:
                memoria = false;
                break;
            default:
                System.out.println("Ingresa un numero del 1 a 7");
        }

        if (memoria) {
            System.out.println("La cafetería está abierta.");
        } else {
            System.out.println("La cafetería está cerrada.");
        }


    }
}
