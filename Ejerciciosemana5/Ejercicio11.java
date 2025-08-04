package Ejerciciosemana5;

import java.util.Scanner;

public class Ejercicio11 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero mayor que 1: ");
        int numero = scanner.nextInt();

        boolean esPrimo = true;

        if (numero <= 1) {
            esPrimo = false;
        } else {
          
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        // Resultado
        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }

       
    }
}

        
 