import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ejercicio6 {
    public static void main(String[] args) {

        int filas = 6;
        int columnas = 10;
        int[][] numeros = new int[filas][columnas];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int filaMax = 0, colMax = 0;
        int filaMin = 0, colMin = 0;

        Random rand = new Random();
        Set<Integer> usados = new HashSet<>();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int num;

                do {
                    num = rand.nextInt(1001); 
                } while (usados.contains(num));

                numeros[i][j] = num;
                usados.add(num);

              
                if (num > max) {
                    max = num;
                    filaMax = i;
                    colMax = j;
                }

             
                if (num < min) {
                    min = num;
                    filaMin = i;
                    colMin = j;
                }
            }
        }

      
        System.out.println("Contenido del array:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.printf("%4d ", numeros[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nValor máximo: " + max + " en la posición [Fila " + filaMax + "][Columna " + colMax + "]");
        System.out.println("Valor mínimo: " + min + " en la posición [Fila " + filaMin + "][Columna " + colMin + "]");
    }
}

        
    

