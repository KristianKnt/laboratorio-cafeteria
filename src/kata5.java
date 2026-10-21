import java.util.Scanner;

public class kata5 {
    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in);

        int opcion = -1;
        int valor_total = 0;


        do{
            System.out.println("\n--- Menú de la Cafetería ---");
            System.out.println("1. Café ($4.000)");
            System.out.println("2. Muffin ($3.500)");
            System.out.println("3. Sandwich ($7.500)");
            System.out.println("4. Jugo ($5.000)");
            System.out.println("5. Té ($3.000)");
            System.out.println("6. Salir");
            System.out.println("Seleccione una opción: ");
            opcion = Entrada.nextInt();

            switch (opcion){
                case 1:
                    System.out.print("producto agregado: Café ($4.000) ");
                    valor_total += 4000;
                    System.out.println("¡Producto registrado con éxito!");
                    break;
                case 2:
                    System.out.print("producto agregado: Muffin ($3.500) ");
                    valor_total += 3500;
                    System.out.println("¡Producto registrado con éxito!");
                    break;
                case 3:
                    System.out.print("producto agregado: Sandwich ($7.500) ");
                    valor_total += 7500;
                    System.out.println("¡Producto registrado con éxito!");
                    break;
                case 4:
                    System.out.print("producto agregado: Jugo ($5.000) ");
                    valor_total += 5000;
                    System.out.println("¡Producto registrado con éxito!");
                    break;
                case 5:
                    System.out.print("producto agregado: Té ($3.000) ");
                    valor_total += 3000;
                    System.out.println("¡Producto registrado con éxito!");
                    break;
                case 6:
                    System.out.println("\nSaliendo del sistema...");
                    break;
                default:
                    System.out.println("Numero no registrado");
            }
        }while(opcion == 6);

        System.out.println("Total del pedido: "+valor_total);


    }
}
