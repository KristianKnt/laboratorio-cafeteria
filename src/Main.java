//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Simulan datos de estudiantes
        String[] nombres = obtenerNombres();

        System.out.println("Primer estudiante: " + nombres[0]);
        System.out.println("Segundo estudiante: " + nombres[1]);
        System.out.println("Tercer estudiante: " + nombres[2]);
    }

    public static String[] obtenerNombres() {
        String[] names = {"Cristian","Camilo","Laura", "Julieth"};
        return  names;
    }
}