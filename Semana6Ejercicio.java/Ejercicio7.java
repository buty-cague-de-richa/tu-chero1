import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
       
        final int VACIO = 0;
        final int MINA = 1;
        final int TESORO = 2;
        final int INTENTO = 3;

        int filas = 4;
        int columnas = 5;
        int[][] cuadrante = new int[columnas][filas];

        int x, y;
        boolean salir = false;
        Scanner sc = new Scanner(System.in);

       
        for (x = 0; x < columnas; x++) {
            for (y = 0; y < filas; y++) {
                cuadrante[x][y] = VACIO;
            }
        }


        int minaX = (int)(Math.random() * columnas);
        int minaY = (int)(Math.random() * filas);
        cuadrante[minaX][minaY] = MINA;

      
        int tesoroX, tesoroY;
        do {
            tesoroX = (int)(Math.random() * columnas);
            tesoroY = (int)(Math.random() * filas);
        } while (tesoroX == minaX && tesoroY == minaY);
        cuadrante[tesoroX][tesoroY] = TESORO;

        System.out.println("¡BUSCA EL TESORO!");

        do {
 
            for (y = filas - 1; y >= 0; y--) {
                System.out.print(y + "|");
                for (x = 0; x < columnas; x++) {
                    if (cuadrante[x][y] == INTENTO) {
                        System.out.print("X ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            System.out.println("  ----------");
            System.out.println("   0 1 2 3 4");

         
            System.out.print("Coordenada x (0-4): ");
            x = sc.nextInt();
            System.out.print("Coordenada y (0-3): ");
            y = sc.nextInt();

            
            if (x < 0 || x >= columnas || y < 0 || y >= filas) {
                System.out.println(" ⚠️Coordenadas fuera de rango.");
                continue;
            }

            switch (cuadrante[x][y]) {
                case VACIO:
                    cuadrante[x][y] = INTENTO;

                    
                    boolean minaCerca = false;
                    for (int i = x - 1; i <= x + 1; i++) {
                        for (int j = y - 1; j <= y + 1; j++) {
                            if (i >= 0 && i < columnas && j >= 0 && j < filas) {
                                if (cuadrante[i][j] == MINA) {
                                    minaCerca = true;
                                }
                            }
                        }
                    }

                    if (minaCerca) {
                        System.out.println("⚠️ ¡Cuidado! ¡Hay una mina cerca!");
                    } else {
                        System.out.println("Sin pistas...");
                    }
                    break;

                case MINA:
                    System.out.println("💣 Lo siento, has perdido.");
                    salir = true;
                    break;

                case TESORO:
                    System.out.println("🎉 ¡Enhorabuena! ¡Has encontrado el tesoro!");
                    salir = true;
                    break;

                case INTENTO:
                    System.out.println("⚠️ Ya intentaste ahí. Elige otra coordenada.");
                    break;
            }

        } while (!salir);

      
        System.out.println("\nTablero final:");
        for (y = filas - 1; y >= 0; y--) {
            System.out.print(y + " ");
            for (x = 0; x < columnas; x++) {
                String c;
                switch (cuadrante[x][y]) {
                    case VACIO:
                        c = "  ";
                        break;
                    case MINA:
                        c = "* ";
                        break;
                    case TESORO:
                        c = "€ ";
                        break;
                    case INTENTO:
                        c = "X ";
                        break;
                    default:
                        c = "  ";
                        break;
                }
                System.out.print(c);
            }
            System.out.println();
        }
        System.out.println("  ----------");
        System.out.println("   0 1 2 3 4");

   
    }
}

    

