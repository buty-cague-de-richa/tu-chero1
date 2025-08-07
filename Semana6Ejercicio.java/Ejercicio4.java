import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) throws InterruptedException {
      int filas = 4;
        int columnas = 5;
        int[][] numeros = new int[filas][columnas];
        int[] sumaFilas = new int[filas];
        int[] sumaColumnas = new int[columnas];
        int sumaTotal = 0;

        Random rand = new Random();

     
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                numeros[i][j] = rand.nextInt(900) + 100; 
            }
        }

        
        System.out.println("Contenido del array:");
        System.out.println();

       
        System.out.print("\t");
        for (int j = 0; j < columnas; j++) {
            System.out.print("Columna " + j + "\t");
        }
        System.out.println();

        for (int i = 0; i < filas; i++) {
            System.out.print("Fila " + i + ":\t");
            for (int j = 0; j < columnas; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println();
        }

       
        System.out.println("\nCalculando sumas parciales...");
        Thread.sleep(1000);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sumaFilas[i] += numeros[i][j];
                sumaColumnas[j] += numeros[i][j];
                sumaTotal += numeros[i][j];
            }
        }

        System.out.println("\nSumas parciales de filas:");
        for (int i = 0; i < filas; i++) {
            Thread.sleep(500);
            System.out.println("Suma fila " + i + ": " + sumaFilas[i]);
        }


        System.out.println("\nSumas parciales de columnas:");
        for (int j = 0; j < columnas; j++) {
            Thread.sleep(500); 
            System.out.println("Suma columna " + j + ": " + sumaColumnas[j]);
        }

        Thread.sleep(1000);
        System.out.println("\nSuma total: " + sumaTotal);  
        
    }
}
