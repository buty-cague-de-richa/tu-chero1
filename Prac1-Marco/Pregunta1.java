import java.util.Scanner;

public class Pregunta1 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número del 1 al 7: ");
        int numero = scanner.nextInt();
       
        switch (numero) {
            case 1:
                if (numero == 1) 
                System.out.println("Lunes");
            case 2:
                if (numero == 2) 
                System.out.println("Martes");
            case 3:
                if (numero == 3) 
                System.out.println("Miercoles");
            case 4:
                if (numero == 4) 
                System.out.println("Jueves");
            case 5:
                if (numero == 5) 
                System.out.println("Viernes");
            case 6:
                if (numero == 6) 
                System.out.println("Sábado");
            case 7:
                if (numero == 7) 
                System.out.println("Domingo"); 
              
                }
        }
}
