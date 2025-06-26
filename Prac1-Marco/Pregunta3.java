import java.util.Scanner;

public class Pregunta3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("ingrese un numero");
           int numero = scanner.nextInt();
          switch (numero) {
            case 1:
                if (numero == 1) System.out.println("acceso permitido");
            case 2:
                if (numero == 2) System.out.println("acceso permitido");
            case 3:
                if (numero == 3) System.out.println("acceso permitido");
            case 4:
                if (numero == 4) System.out.println("acceso denegado");
            case 5:
                if (numero == 5) System.out.println("acceso denegado");
            case 6:
                if (numero == 6) System.out.println("acceso denegado");
            case 7:
                if (numero == 7) System.out.println("acceso denegado"); 
           case 8:
                if (numero == 5) System.out.println("acceso denegado");
            case 9:
                if (numero == 6) System.out.println("acceso denegado");
            case 10:
                if (numero == 7) System.out.println("acceso denegado"); 
        
    }
}
}