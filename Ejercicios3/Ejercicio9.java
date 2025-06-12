package Ejercicios3;

import java.util.Scanner;

public class Ejercicio9   {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        
        System.out.print("Introduce la nota del primer examen: ");
        double notaPrimerExamen = scanner.nextDouble();

        System.out.print("¿Qué nota quieres sacar en el trimestre? ");
        double notaDeseada = scanner.nextDouble();

        
        double notaSegExamen = (notaDeseada - (notaPrimerExamen * 0.4)) / 0.6;

        
        System.out.printf("Para tener un %.2f en el trimestre necesitas sacar un %.2f en el segundo examen.\n", notaDeseada, notaSegExamen);
        
    }
    
}
