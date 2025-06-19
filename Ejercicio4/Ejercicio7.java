package Ejercicio4;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Solicitar el número
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        // Verificar si es par y/o divisible entre 5
        if (numero % 2 == 0 && numero % 5 == 0) {
            System.out.println("El número es par y divisible entre 5.");
        } else if (numero % 2 == 0) {
            System.out.println("El número es par pero no divisible entre 5.");
        } else if (numero % 5 == 0) {
            System.out.println("El número no es par pero sí divisible entre 5.");
        } else {
            System.out.println("El número no es par ni divisible entre 5.");
        }

    }
}
 
