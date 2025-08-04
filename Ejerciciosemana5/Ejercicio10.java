package Ejerciciosemana5;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;
        int numero;

        System.out.println("Introduce 10 números (positivos o negativos):");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            numero = scanner.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }
       
        }

        System.out.println("\nCantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);

       
       }  
    }

