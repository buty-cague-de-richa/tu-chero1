import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
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

    
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sumaFilas[i] += numeros[i][j];
                sumaColumnas[j] += numeros[i][j];
                sumaTotal += numeros[i][j];
            }
        }

       
        System.out.println("Contenido del array con sumas parciales:");
        System.out.println();

   
        System.out.print("\t");
        for (int j = 0; j < columnas; j++) {
            System.out.print("Columna " + j + "\t");
        }
        System.out.println("∑ Fila");

       
        for (int i = 0; i < filas; i++) {
            System.out.print("Fila " + i + ":\t");
            for (int j = 0; j < columnas; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println(sumaFilas[i]);
        }


        System.out.print("∑ Columna\t");
        for (int j = 0; j < columnas; j++) {
            System.out.print(sumaColumnas[j] + "\t");
        }
        System.out.println(sumaTotal);
    }
}
