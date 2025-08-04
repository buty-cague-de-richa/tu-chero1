package Ejerciciosemana5;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        
         Scanner scanner = new Scanner(System.in);

       
        System.out.print("Introduce un número entero: ");
        int numeroInicial = scanner.nextInt();

      
        System.out.printf("%-10s %-10s %-10s%n", "Número", "Cuadrado", "Cubo");
        System.out.println("--------------------------------------");

 
        for (int i = numeroInicial; i < numeroInicial + 5; i++) {
            int cuadrado = i * i;
            int cubo = i * i * i;
            System.out.printf("%-10d %-10d %-10d%n", i, cuadrado, cubo);
        } 
        
    }
}
