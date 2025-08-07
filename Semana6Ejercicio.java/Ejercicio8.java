import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la posición del alfil (ejemplo d5): ");
        String posicion = sc.nextLine().toLowerCase();

     
        if (posicion.length() != 2 || posicion.charAt(0) < 'a' || posicion.charAt(0) > 'h'
                || posicion.charAt(1) < '1' || posicion.charAt(1) > '8') {
            System.out.println("Posición inválida.");
            return;
        }

        int columna = posicion.charAt(0) - 'a'; 
        int fila = 8 - Character.getNumericValue(posicion.charAt(1)); 

        System.out.println("El alfil puede moverse a las siguientes posiciones:");

       
        int[][] direcciones = {
            {-1, -1}, 
            {-1,  1}, 
            { 1, -1}, 
            { 1,  1}  
        };

        for (int[] dir : direcciones) {
            int x = columna + dir[0];
            int y = fila + dir[1];

            while (x >= 0 && x < 8 && y >= 0 && y < 8) {
                char letraColumna = (char) ('a' + x);
                int numeroFila = 8 - y;
                System.out.print(letraColumna + "" + numeroFila + " ");
                x += dir[0];
                y += dir[1];
            }
        }

     
    }
}
