package Ejerciciosemana5;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
        int num1, num2;

        do {
            System.out.print("Introduce el primer número entero: ");
            num1 = scanner.nextInt();
            System.out.print("Introduce el segundo número entero (distinto al primero): ");
            num2 = scanner.nextInt();

            if (num1 == num2) {
                System.out.println("Los números deben ser distintos. Inténtalo de nuevo.\n");
            }
        } while (num1 == num2);

        int menor = Math.min(num1, num2);
        int mayor = Math.max(num1, num2);

        System.out.println("\nNúmeros entre " + menor + " y " + mayor + " incrementando de 7 en 7:");

        for (int i = menor + 1; i < mayor; i += 7) {
            System.out.println(i);
        }
        
    }
}
