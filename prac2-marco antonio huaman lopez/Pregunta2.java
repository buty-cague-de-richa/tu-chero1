import java.util.Scanner;

public class Pregunta2 {
   public static void main(String[] args) {
   
        Scanner scanner = new Scanner (System.in);

        System.out.print("Por favor, introduzca la altura de la X: ");
        int altura = scanner.nextInt();

        if (altura < 3 || altura % 2 == 0) {
            System.out.println("Error: la altura debe ser un número impar mayor o igual a 3.");
        } else {
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < altura; j++) {
                    if (j == i || j == (altura - 1 - i)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
         }
}
      


    
