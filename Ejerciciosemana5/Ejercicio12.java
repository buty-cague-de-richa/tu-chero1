package Ejerciciosemana5;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int numero;

      
        do {
            System.out.print("Introduce un número entero positivo: ");
            numero = scanner.nextInt();
            if (numero <= 0) {
                System.out.println("Error: el número debe ser mayor que 0.");
            }
        } while (numero <= 0);

    
        long suma = 0;
        for (int i = numero + 1; i <= numero + 100; i++) {
            suma += i;
        }

        
        System.out.println("La suma de los 100 números siguientes a " + numero + " es: " + suma);

        
    }
}
