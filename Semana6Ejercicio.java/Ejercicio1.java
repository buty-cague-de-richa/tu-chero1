public class Ejercicio1 {
    public static void main(String[] args) {
        
      
        int[][] num = new int[3][6];

    
        num[0][0] = 0;
        num[0][1] = 30;
        num[0][2] = 2;
        num[0][5] = 5;

        num[1][0] = 75;
        num[1][4] = 0;

        num[2][2] = -2;
        num[2][3] = 9;
        num[2][5] = 11;

        System.out.println("Contenido del array:");
      
        System.out.print("         ");
        for (int columna = 0; columna < 6; columna++) {
            System.out.print("Columna " + columna + "\t");
        }
        System.out.println();

        for (int fila = 0; fila < 3; fila++) {
            System.out.print("Fila " + fila + ":\t");
            for (int columna = 0; columna < 6; columna++) {
                System.out.print(num[fila][columna] + "\t\t");
            }
            System.out.println();
        }
    }
}
        
    

