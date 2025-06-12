package Ejercicios3;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Introduce la cantidad en Megabytes (MB): ");
        double megabytes = scanner.nextDouble();

        double kilobytes = megabytes * 1024;
   
        System.out.println(megabytes + " MB equivalen a " + kilobytes + " KB");
    }
    
}
