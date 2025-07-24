import java.util.Scanner;

public class EjArray1 {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce 10 números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nLos números en orden inverso son:");
        for (int i = 9; i >= 0; i--) {
            System.out.println(numeros[i]);

    }
}
}