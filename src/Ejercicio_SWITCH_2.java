/* U3 Ejercicio 2 SWITCH: ¿Vocal o consonante?

Crea un programa que permita al usuario ingresar un carácter
y luego determine si es una vocal o una consonante utilizando una sentencia switch.
 */

import java.util.Scanner;

public class Ejercicio_SWITCH_2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Por favor, introduzca una letra:");
        char letra = keyboard.next().charAt(0); //Me ha hecho falta consultar el del profesor

        switch (String.valueOf(letra).toUpperCase().charAt(0)) { //Aquí también

            //Ponemos aeiou
            //Las consonantes son el resto, el default

            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Es una vocal.");
                break;
            default:
                System.out.println("Es una consonate."); //Aunque de este modo, si pones un número también dice que es consonante
                break;
        }
        System.out.println("Fin del programa.");
    }
}
