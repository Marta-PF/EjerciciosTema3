/* U3 Ejercicio 3 SWITCH: ¿Par o impar?

Desarrolla un programa que reciba un número entero
y, utilizando una sentencia switch, determine si es par o impar.
 */

import java.util.Scanner;

public class Ejercicio_SWITCH_3 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número:");
        int numero = keyboard.nextInt();


        switch (numero%2){

            case 0:
                System.out.println("El número es par");
                break;

            default:
                System.out.println("El número es impar");
                break;
        }
        System.out.println("Fin del programa.");





      /* CORRECCIÓN PROFESOR:

public class Ejercicio3 {

            public static void main(String[] args) {
                int numero = 6;
                switch (numero%2){
                    case 0:
                        System.out.println("Numero par");
                        break;
                    default:
                        System.out.println("Impar");
                }
            }
        }*/
    }
}


