/*U3 Ejercicio 6 FOR: Números entre dos dados

Mostrar todos los números pares comprendidos entre dos dados. (ParesEntreDosDados)

NOTA: Había entendido que se refería a dos dados de los de jugar, así que pensaba que era del 1 al 12.
Pero se refiere a dos números que te dé el usuario.
La corrección del profesor pone de ejemplo entre 10 y 1000. Yo voy a probar con un Scanner.
 */

import java.util.Scanner;

public class Ejercicio_FOR_6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Por favor, introduce el primer número");
        int numeroUno = keyboard.nextInt();

        System.out.println("Por favor, introduce el segundo número");
        int numeroDos = keyboard.nextInt();

        for (int i = numeroUno; i <= numeroDos; i++) {
            if (i % 2 == 0) {
                System.out.println(i);

                /*
                No hace falta else.
                Si quisieramos los impares sería:
                if (i % 2 != 0);

                 */
            }
        }

    }

}

