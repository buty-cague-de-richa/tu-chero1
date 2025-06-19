package Ejercicio4;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);
        int puntuacion = 0;

        System.out.println("Bienvenido al minicuestionario de 10 preguntas. ¡Buena suerte!");
        System.out.println("Responde escribiendo la letra de la opción correcta (a, b, c o d).");

        
        System.out.println("\n1.  ¿Cuál es el lenguaje principal para desarrollo web del lado del cliente?");
        System.out.println("a) PHP\n" + 
                        "b) JavaScript\n" +
                        "c) Python\n" +
                        "d) SQL");
        String respuesta1 = scanner.nextLine();
        if (respuesta1.equalsIgnoreCase("b")) {
            puntuacion++;
        }

    
        System.out.println("\n2. ¿Qué significa CPU?");
        System.out.println("a) Central Processing Unit\nb) Computer Personal Unit\nc) Control Program Unit\nd) Core Power Unit");
        String respuesta2 = scanner.nextLine();
        if (respuesta2.equalsIgnoreCase("a")) {
            puntuacion++;
        }

        
        System.out.println("\n3. ¿Qué estructura de datos utiliza el método LIFO?");
        System.out.println("a) Lista\nb) Árbol\nc) Pila\nd) Cola");
        String respuesta3 = scanner.nextLine();
        if (respuesta3.equalsIgnoreCase("c")) {
            puntuacion++;
        }
        
        System.out.println("\n4. ¿Cuál es el sistema operativo más utilizado en servidores?");
        System.out.println("a) Windows\nb) Linux\nc) macOS\nd) Android");
        String respuesta4 = scanner.nextLine();
        if (respuesta4.equalsIgnoreCase("b")) {
            puntuacion++;
        }

        
        System.out.println("\n5. ¿Qué extensión tienen los archivos Java?");
        System.out.println("a) .jav\nb) .java\nc) .jv\nd) .class");
        String respuesta5 = scanner.nextLine();
        if (respuesta5.equalsIgnoreCase("b")) {
            puntuacion++;
        }

        
        System.out.println("\n6. ¿Qué hace el operador '==' en Java?");
        System.out.println("a) Asigna un valor\nb) Compara igualdad\nc) Compara tipo\nd) Convierte texto");
        String respuesta6 = scanner.nextLine();
        if (respuesta6.equalsIgnoreCase("b")) {
            puntuacion++;
        }
        
        System.out.println("\n7. ¿Qué comando se usa para compilar un archivo Java?");
        System.out.println("a) java\nb) run\nc) javac\nd) compile");
        String respuesta7 = scanner.nextLine();
        if (respuesta7.equalsIgnoreCase("c")) {
            puntuacion++;
        }

        System.out.println("\n8. ¿Cuál es el resultado de 3 + 2 * 2?");
        System.out.println("a) 10\nb) 7\nc) 8\nd) 9");
        String respuesta8 = scanner.nextLine();
        if (respuesta8.equalsIgnoreCase("b")) {
            puntuacion++;
        }

      
        System.out.println("\n9. ¿Qué tipo de lenguaje es HTML?");
        System.out.println("a) Lenguaje de programación\nb) Lenguaje de estilos\nc) Lenguaje de marcado\nd) Lenguaje compilado");
        String respuesta9 = scanner.nextLine();
        if (respuesta9.equalsIgnoreCase("c")) {
            puntuacion++;
        }
        
        System.out.println("\n10. ¿Cuál es la salida del siguiente código: System.out.println(5 > 3)?");
        System.out.println("a) verdad\nb) falso\nc) 5 > 3\nd) Error");
        String respuesta10 = scanner.nextLine();
        if (respuesta10.equalsIgnoreCase("a")) {
            puntuacion++;
        }

        
        System.out.println("\nHas obtenido una puntuación de: " + puntuacion + " de 10.");

      
    }
}