import bilioteca.Matematica;

public class Funcion2 {
    public static void main(String[] args) {
        int num1 , num2;

        System.out.println("programa que suma dos numeros enteros");
        System.out.print("ingrese el primer numero: ");
        num1 = Integer.parseInt(System.console().readLine());
        System.out.print("ingrese el segundo numero: ");
         num2 = Integer.parseInt(System.console().readLine());
        System.out.print("la suma es :" + Matematica.miSuma (num1 , num2 ));
         System.out.print("la resta es :" + Matematica.miResta (num1 , num2 ));
          System.out.print("la multiplicacion es :" + Matematica.miMultiplicacion (num1 , num2 ));
          System.out.print("la division es :" + Matematica.miDivision (num1 , num2 ));

    }
  public static int miSuma (int x , int y) {
    return x + y;  
}
}
