import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

     
        double nota1, nota2, nota3, nota4, nota5, promedio;

    
        System.out.print("Ingrese la primera nota: ");
        nota1 = scanner.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        nota2 = scanner.nextDouble();

        System.out.print("Ingrese la tercera nota: ");
        nota3 = scanner.nextDouble();

        System.out.print("Ingrese la cuarta nota: ");
        nota4 = scanner.nextDouble();

        System.out.print("Ingrese la quinta nota: ");
        nota5 = scanner.nextDouble();

    
        promedio = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;

        
        if (promedio >= 10.5) {
            System.out.println("¡Aprobado con un promedio de " + promedio );
        } else {
            System.out.println("Desaprobado con un promedio de " + promedio );
        }

    
    }
}
 
