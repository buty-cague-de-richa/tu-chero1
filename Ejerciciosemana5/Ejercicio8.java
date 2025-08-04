package Ejerciciosemana5;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        long numero;
        int contador = 0;

        System.out.print("Introduce un número entero positivo: ");
        numero = scanner.nextLong();

       
        if (numero == 0) {
            contador = 1;
        } else {
            
            numero = Math.abs(numero);

            while (numero > 0) {
                numero /= 10; 
                contador++;
            }
        }

        System.out.println("El número tiene " + contador + " dígito(s).");

    }
}
