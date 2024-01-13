/*U3 Ejercicio 7 FOR: Lanzamiento de un dado (ahora sí).
Simúlese el lanzamiento de un dado.
Se introducirá el número de veces que se lanza el dado (de no ser positivo, se establecerá a 100).
(Dado)
*/


import java.util.Scanner;

public class Ejercicio_FOR_7 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Por favor, indica el número de tiradas que deseas hacer:");
        int numeroTiradas = keyboard.nextInt();

        if (numeroTiradas<1){
            numeroTiradas=100; //Si introduce un número negativo o 0, automáticamente serán 100.
        }
        for (int i=0; i<numeroTiradas; i++) {
            int tirada = (int)(Math.random() * 6) +1; //Debe dar un número entero random entre 6 posibilidades.
            // El +1 es para que empiece desde 1 y no 0. Un dado no puede sacar 0.

            System.out.println(tirada);

        }

    }
}
