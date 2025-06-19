package Ejercicio4;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Este programa calcula la media de tres notas y muestra la calificación.");

       
        System.out.print("Introduce la primera nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Introduce la segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Introduce la tercera nota: ");
        double nota3 = scanner.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("La media es: " + media);

     
        if (media >= 0 && media <= 10) {
            System.out.println("Calificación: Insuficiente");
        } else if (media >= 11 && media <= 12) { 
            System.out.println("Calificación: Suficiente");
        } else if (media >= 13 && media <= 15) {
            System.out.println("Calificación: Bien");
        } else if (media >= 16 &&  media <= 20) {
            System.out.println("Calificación: Notable o Sobresaliente");
        } else {
            System.out.println("La media no está en el rango válido (0 - 20).");
        }

        
    }
}

    

