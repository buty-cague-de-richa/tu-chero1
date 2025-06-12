package Ejercicios3;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Ingrese el número de horas trabajadas esta semana: ");
        int horasTrabajadas = scanner.nextInt();

    
        int tarifaPorHora = 12;
        int salarioSemanal = horasTrabajadas * tarifaPorHora;

     
        System.out.println("El salario semanal es: S/ " + salarioSemanal);
        
    }

    
}
