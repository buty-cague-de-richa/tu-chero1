import java.util.Random;

public class EjArray2 {
    public static void main(String[] args) {
        
          int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

    
        Random rand = new Random();

      
        for (int i = 0; i < 20; i++) {
            numero[i] = rand.nextInt(101); 
            cuadrado[i] = numero[i] * numero[i];
            cubo[i] = numero[i] * numero[i] * numero[i];
        }

        System.out.printf("%-10s %-10s %-10s%n", "Número", "Cuadrado", "Cubo");
        System.out.println("-------------------------------------");
        for (int i = 0; i < 20; i++) {
            System.out.printf("%-10d %-10d %-10d%n", numero[i], cuadrado[i], cubo[i]);
        }
    }
}
