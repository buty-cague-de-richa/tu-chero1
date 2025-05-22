public class SalidaFormatear2 {
    public static void main(String[] args) {
          System.out.println("Articulo\tPrecio\tN° Cajas");
        System.out.println("--------\t------\t--------");
        System.out.printf("%-10s\t%8.2f\t%6d\n", "manzana",4.5,10);
        System.out.printf("%-10s\t%9.2f\t%7d\n","platano",3.2,20);
        System.out.printf("%-10s\t%10.2f\t%8d\n","pera",4.25,15);
        System.out.printf("%-10s\t%11.2f\t%9d\n","mango",5.20,10);
        System.out.printf("%-10s\t%12.2f\t%9d\n"," uva",3.2,16);
    }
    
}
