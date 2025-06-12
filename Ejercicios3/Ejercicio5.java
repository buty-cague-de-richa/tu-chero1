package Ejercicios3;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);

        
        System.out.print("Introduce la base del rectángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Introduce la altura del rectángulo: ");
        double altura = scanner.nextDouble();

      
        double area = base * altura;

        System.out.println("El área del rectángulo es: " + area);
    }
}
