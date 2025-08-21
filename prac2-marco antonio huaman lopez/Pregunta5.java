import java.util.Random;
import java.util.Scanner;

public class Pregunta5 {
    public static void main(String[] args) {
       
             final int N = 9;
        int[][] matriz = new int[N][N];
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = random.nextInt(401) + 500; 
            }
        }

    
        System.out.println("Matriz generada:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nDiagonal secundaria:");
        int[] diagonal = new int[N];
        for (int i = 0; i < N; i++) {
            diagonal[i] = matriz[N - 1 - i][i];
            System.out.print(diagonal[i] + " ");
        }
        System.out.println();

   
        int min = diagonal[0];
        int max = diagonal[0];
        int suma = 0;
        for (int n : diagonal) {
            if (n < min) min = n;
            if (n > max) max = n;
            suma += n;
        }
        double media = (double) suma / N;

        System.out.println("\nMínimo: " + min);
        System.out.println("Máximo: " + max);
        System.out.println("Media: " + media); 
        }
        
    }
