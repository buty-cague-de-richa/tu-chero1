package Ejercicio4;

import java.util.Scanner;

public class Ejericio1 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
        int horasTrabajadas = scanner.nextInt();
        
        int sueldo;
        if (horasTrabajadas <= 40) {
            sueldo = horasTrabajadas * 12;
        } else {
            int horasExtras = horasTrabajadas - 40;
            sueldo = (40 * 12) + (horasExtras * 16);
        }
        
        System.out.println("El sueldo semanal que le corresponde es de " + sueldo + " soles.");

        
    }
}
