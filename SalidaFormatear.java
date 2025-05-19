public class SalidaFormatear {
    public static void main(String[] args) {
        System.out.printf("el numero no tiene decimales. \n",21);
        System.out.printf("el numero %f tiene decimales. \n",21.00);
        System.err.printf("el numero %.3f tiene decimales. \n",21.0);
    }
}
