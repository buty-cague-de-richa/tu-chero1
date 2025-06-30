public class NumerosPositivos {
    public static void main(String[] args) {

        System.out.println("ingrese numeros y pulse INTRO");
        System.out.println("para terminar ingrese un numero negativo");
        int cuentaNumeros = 0;
        int  numeroingresado = 0;
        int suma = 0;
        while (numeroingresado >= 0) {
            numeroingresado = Integer.parseInt(System.console().readLine());
            cuentaNumeros++;
            suma = suma + numeroingresado;


            System.out.println("has ingresado" + (cuentaNumeros-1) + "numeros positivos");
            System.out.println("la suma total de ellos es"+ (suma-numeroingresado));

            
        }
    }
}
