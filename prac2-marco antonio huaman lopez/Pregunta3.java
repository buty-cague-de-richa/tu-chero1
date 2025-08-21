import java.util.Random;

public class Pregunta3 {
    public static void main(String[] args) {
        
     
        Random random = new Random();
        int dado1, dado2;
        int tiradas = 0;

        do {
            dado1 = random.nextInt(6) + 1; 
            dado2 = random.nextInt(6) + 1;
            tiradas++;

            System.out.println("Tirada " + tiradas + ": Dado 1 = " + dado1 + ", Dado 2 = " + dado2);

        } while (dado1 != dado2);

        System.out.println("¡Los dos dados son iguales! (" + dado1 + ")");
        System.out.println("Total de tiradas: " + tiradas);
    }
}
  

