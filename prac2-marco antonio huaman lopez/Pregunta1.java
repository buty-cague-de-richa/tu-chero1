import java.util.Scanner;

public class Pregunta1 {
    public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

        int contador = 0;
        double suma = 0;

        while (suma <= 10000) {
            System.out.print("Introduce un número: ");
            double numero = scanner.nextDouble();

            suma += numero;
            contador++;
        }

        double media = suma / contador;

        System.out.println("\n--- Resultados ---");
        System.out.println("Total acumulado: " + suma);
        System.out.println("Cantidad de números introducidos: " + contador);
        System.out.println("Media: " + media);

        
    }
}

