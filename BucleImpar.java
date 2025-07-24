public class BucleImpar {
    public static void main(String[] args) {
        int numero;
        do {
System.out.println("ingrese un numero:");
numero = Integer.parseInt(System.console().readLine());
        if(numero % 2 == 0){
            System.out.println(numero);
} else {
    System.out.println("adiosito!!!");
}

} while (numero % 2 == 0);


}
}


