package Ejercicios3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

     
        System.out.print("Introduce la cantidad en pesetas: ");
        double pesetas = scanner.nextDouble();

        double euros = pesetas / 4.21;

        
        System.out.printf("la cantidad de euros seria de "+ euros);

          }
    
}
    
