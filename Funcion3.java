import java.util.Scanner;

public class Funcion3 {
    public static void main(String[] args) {
        //volumen del cilindro y circunferencia del cilindro
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Ingrese el radio del cilindro: ");
        double radio = sc.nextDouble();

        System.out.print("Ingrese la altura del cilindro: ");
        double altura = sc.nextDouble();

        
        double volumen = Math.PI * Math.pow(radio, 2) * altura;

        
        double circunferencia = 2 * Math.PI * radio;

       
        System.out.printf("Volumen del cilindro: %.2f%n", volumen);
        System.out.printf("Circunferencia de la base: %.2f%n", circunferencia);

       } 
    
      public static double calcularvolumen(double radio, double altura) {
        return Math.PI * Math.pow(radio, 2) * altura;

        public static double calcularcircunferencia( double radio) {
        return 2 * Math.PI * radio;
    }

    }
}
  

