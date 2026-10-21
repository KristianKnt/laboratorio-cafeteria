import java.util.Scanner;

public class taks1 {
    public static void main(String[] args) {
        // pedir el valor de la compra y el % de la propina
        // 2. calcular la propina y dar el total a pagar
        // si el % de la propina es mas del 30% muestra = 'Propina generosa'

        // para llamar al main usamos                   psvm

        // creamos el objeto que va a pedir los datos
        Scanner Entrada = new Scanner(System.in);
        // definimos el valor del producto y de la propina
        float valor_producto = 0;
        int valor_porcentaje = 0;
        float total_pagar = 0;

        System.out.println("");
        System.out.println("Bienvenido a la cafeteria del profe cascarita");
        System.out.println("Por favor ingresa el valor de la compra y el porcentaje de propina que quiere dejar: ");
        System.out.println("Ingresa el valor de la compra: ");
        valor_producto = Entrada.nextFloat();
        System.out.println("Ingresa el valor del porcentaje :");
        valor_porcentaje = Entrada.nextInt();
        // cerramos el Scanner
        Entrada.close();

        // solucion
        total_pagar = valor_producto + ((valor_porcentaje*valor_producto)/100);
        // convertimos el tipo de dato int a Intenger
        Integer valor_porcentaje_mejorado = valor_porcentaje;

        if (valor_producto > 0 ){
            if(valor_porcentaje > 0 && valor_porcentaje <= 100){
                System.out.println("Total a pagar: "+total_pagar);
                switch(valor_porcentaje_mejorado){
                    case Integer temporal when temporal > 30 -> System.out.println("¡Propina generosa!");
                    case Integer temporal when temporal < 5 -> System.out.println("Propina muy baja");
                    default -> System.out.println("");
                }

            }else {
                System.out.println("Error: porcentaje inválido");
            }

        }else {
            System.out.println("Error: total inválido");
        }

        // 20





        //System.out.println("Debes pagar esto : "+total_pagar);






    }
}
