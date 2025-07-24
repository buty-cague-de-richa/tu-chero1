public class Array2 {
        public static void main(String[] args) {
        int[] numeros = new int[5];

        System.out.println("Array de Números");

        // sirve para leer datos y guardarlo en el array
        for (int i = 0; i <= 4; i++) {
            System.out.println("Ingrese el número [" + i + "]");
            numeros[i] = Integer.parseInt(System.console().readLine());
        }

        // que me permita mostrar los datos del array
        for (int i = 0; i <= 4 ; i++) {
            System.out.println(numeros[i]);
        }


    }
}

