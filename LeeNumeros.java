public class LeeNumeros {
    public static void main(String[] args) {

    String linea;
    System.out.println("ingresa un numero entero ");
    linea =System.console().readLine();
    
double numero1;
numero1= Double.parseDouble(linea);
 System.out.println("ingresa otro numero: ");
  linea= System.console().readLine();

  int numero2;

  numero2 = Integer.parseInt(linea);
   
System.out.println("la suma de ambos numeros es: " + (numero1 + numero2));
    }
}
