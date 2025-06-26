import java.util.Scanner;

public class Pregunta2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingres tu edad");
        int edad = scanner.nextInt();
           if (edad > 30) {
            System.out.println("Nunca es tarde para aprender ¿Qué curso tomaremos?");
        } else if (edad >= 18 && edad <= 29) {
            System.out.println("Es un momento excelente para impulsar tu carrera.");
        } else {
            System.out.println("¿Sabes hacia dónde dirigir tu futuro? Seguro puedo ayudarte.");
        }
    }
}
