public class Funcion1 {
    public static void main(String[] args) {
        System.out.println("Indrotuce un numero positivo");
        int n = Integer.parseInt(System.console().readLine());

    boolean esPrimo = true;

    for( int i = 2 ; i < n ; i++) {
        if ((n % i ) == 0 ){
            esPrimo = false ;
        
    }
}
 if (esPrimo(n)) {
    System.out.println("El" + n + " es primo");
    } else {
System.out.println("El" + n + " no es primo");

}

}
 public static boolean esPrimo (int x) {
    for ( int i = 2 ; i < x ; i++) {
        if ( (x % i) == 0 ) {
            return false;
}

}
return true;

}

}