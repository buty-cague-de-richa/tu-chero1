package Ejercicio4;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mostrar los cargos
        System.out.println("1 - Programador junior");
        System.out.println("2 - Programador senior");
        System.out.println("3 - Jefe de proyecto");

        // Entrada del cargo
        System.out.print("Introduzca el cargo del empleado (1 - 3): ");
        int cargo = scanner.nextInt();

        // Entrada de días de viaje
        System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
        int diasViaje = scanner.nextInt();

        // Entrada del estado civil
        System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
        int estadoCivil = scanner.nextInt();

        double sueldoBase = 0;

        // Sueldo base según el cargo
        if (cargo == 1) {
            sueldoBase = 950.00;
        } else if (cargo == 2) {
            sueldoBase = 1200.00;
        } else if (cargo == 3) {
            sueldoBase = 1600.00;
        } else {
            System.out.println("Cargo no válido.");
            return;
        }

        // Cálculo de dietas
        double dietas = diasViaje * 30.00;

        // Cálculo del sueldo bruto
        double sueldoBruto = sueldoBase + dietas;

        // Cálculo del IRPF
        double porcentajeIRPF;
        if (estadoCivil == 1) {
            porcentajeIRPF = 0.25; // Soltero
        } else if (estadoCivil == 2) {
            porcentajeIRPF = 0.20; // Casado
        } else {
            System.out.println("Estado civil no válido.");
            return;
        }

        double retencionIRPF = sueldoBruto * porcentajeIRPF;

        // Cálculo del sueldo neto
        double sueldoNeto = sueldoBruto - retencionIRPF;

        // Mostrar nómina desglosada
        System.out.println("\n---------------------------------");
        System.out.printf("| Sueldo base \t\t%8.2f |\n", sueldoBase);
        System.out.printf("| Dietas (%2d viajes)\t%8.2f |\n", diasViaje, dietas);
        System.out.println("|--------------------------------|");
        System.out.printf("| Sueldo bruto \t\t%8.2f |\n", sueldoBruto);
        System.out.printf("| Retención IRPF (%.0f%%)\t%8.2f |\n", porcentajeIRPF * 100, retencionIRPF);
        System.out.println("|--------------------------------|");
        System.out.printf("| Sueldo neto \t\t%8.2f |\n", sueldoNeto);
        System.out.println("---------------------------------");

        
    }
}
    

