package Ejercicios3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner Teclado =new Scanner (System.in);
        double pesetas,euros;
        System.out.println("ingresa la cantidad de pesetas a convertir");
       pesetas = Teclado.nextDouble();
        euros = pesetas / 4.20;
        System.out.println("la cantidad de euros seria de "+ euros);

          }
    
}
    
