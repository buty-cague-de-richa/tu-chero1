public class CapitalesDelMundo {
    public static void main(String[] args) {
        String respuesta;
        System.out.println("¿Cual es la capital de Italia");
        respuesta= System.console().readLine();

        if (respuesta.equals("roma")) {
            System.out.println("la respuesta es correcta!!!");
            
        } else {
            System.out.println("lo siento, la repuesta es incorrecta!!!");
        }
        
    }
}
