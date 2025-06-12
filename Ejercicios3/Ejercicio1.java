package Ejercicios3;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
          Scanner s =new Scanner(System.in);
           System.out.println("ingresa 2 numeros separados por un espacio");
           int num1 = s.nextInt();
           int num2 = s.nextInt();
           int promedio = (num1 * num2 );
           System.out.println("el promedio de esos dos numeros es:"+ promedio);
    }
    
}

