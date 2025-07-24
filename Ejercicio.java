import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Ingresa un número: ");
            int numero = scanner.nextInt();
            System.out.println("Número ingresado: " + numero);

            System.out.print("¿Quieres continuar? (s/n): ");
            continuar = scanner.next();

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("Programa finalizado.");
        
    }
}
    

