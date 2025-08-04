package Ejerciciosemana5;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
         final int COMBINACION_CORRECTA = 1234; 
        final int MAX_INTENTOS = 4;
        int intentos = 0;
        int combinacionUsuario;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la combinación de 4 cifras para abrir la caja fuerte:");

        while (intentos < MAX_INTENTOS) {
            System.out.print("Intento " + (intentos + 1) + ": ");
            combinacionUsuario = scanner.nextInt();

            if (combinacionUsuario == COMBINACION_CORRECTA) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
                break;
            } else {
                System.out.println("Lo siento, esa no es la combinación.");
                intentos++;
            }
        }

        if (intentos == MAX_INTENTOS) {
            System.out.println("Has agotado los 4 intentos. La caja fuerte permanece cerrada.");
        }
    }
}
