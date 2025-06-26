package Ejercicio4;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

      
        System.out.print("Introduzca la base imponible: ");
        double baseImponible = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Introduzca el tipo de IMPUESTO (general, reducido o superreducido): ");
        String tipoImpuesto = scanner.nextLine().toLowerCase();

        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        String codigoPromo = scanner.nextLine().toLowerCase();

       
        double impuesto = 0;
        if (tipoImpuesto.equals("general")) {
            impuesto = baseImponible * 0.21;
        } else if (tipoImpuesto.equals("reducido")) {
            impuesto = baseImponible * 0.10;
        } else if (tipoImpuesto.equals("superreducido")) {
            impuesto = baseImponible * 0.04;
        } else {
            System.out.println("Tipo de impuesto no válido.");
            return;
        }

       
        double precioConImpuesto = baseImponible + impuesto;

       
        double descuento = 0;
        if (codigoPromo.equals("nopro")) {
            descuento = 0;
        } else if (codigoPromo.equals("mitad")) {
            descuento = precioConImpuesto / 2;
        } else if (codigoPromo.equals("meno5")) {
            descuento = 5.0;
        } else if (codigoPromo.equals("5porc")) {
            descuento = precioConImpuesto * 0.05;
        } else {
            System.out.println("Código promocional no válido.");
            return;
        }

        double total = precioConImpuesto - descuento;

   
        System.out.printf("\nBase imponible\t\t%.2f\n", baseImponible);
        System.out.printf("IMPUESTO (%.0f%%)\t\t%.2f\n", (impuesto / baseImponible) * 100, impuesto);
        System.out.printf("Precio con IMPUESTO\t%.2f\n", precioConImpuesto);
        System.out.printf("Cód. promo. (%s):\t-%.2f\n", codigoPromo, descuento);
        System.out.printf("TOTAL\t\t\t%.2f\n", total);

      
    }
}
