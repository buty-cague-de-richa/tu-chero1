import java.util.Random;
import java.util.Scanner;

public class Pregunta4 {
    public static void main(String[] args) {
       Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[100];

    
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(501); 
        }

      
        System.out.println("Array generado:");
        mostrarArray(numeros, -1); 

        System.out.print("\n¿Qué quiere destacar? (1 = mínimo, 2 = máximo): ");
        int opcion = sc.nextInt();

   
        int valorDestacado;
        if (opcion == 1) {
            valorDestacado = buscarMin(numeros);
        } else {
            valorDestacado = buscarMax(numeros);
        }


        System.out.println("\nArray con destacado:");
        mostrarArray(numeros, valorDestacado);

        
    }

   
    public static void mostrarArray(int[] array, int destacado) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == destacado) {
                System.out.print("**" + array[i] + "** ");
            } else {
                System.out.print(array[i] + " ");
            }

           
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }
    }

    public static int buscarMin(int[] array) {
        int min = array[0];
        for (int n : array) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }

    public static int buscarMax(int[] array) {
        int max = array[0];
        for (int n : array) {
            if (n > max) {
                max = n;
            }
        }
        return max; 
    }
}
