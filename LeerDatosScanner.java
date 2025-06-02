import java.util.Scanner;

public class LeerDatosScanner {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
       // System.out.println("ingrese su nombre");
        //String nombre = s.nextLine();
        //System.out.println("ingrese su edad");
        //int edad = Integer.parseInt(s.nextLine());
   System.out.println("ingrese su nombre y su edad por un espacio");
   String nombre = s.nextLine();
   int edad = s.nextInt();
        System.out.println("tu nombre es :"+ nombre + "y tu edad es"+ edad);
        
        
    }
}
