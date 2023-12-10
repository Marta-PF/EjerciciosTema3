/* U3 Ejercicio 6 SWITCH: Mensajes con cada opción

Crea un programa que permita al usuario ingresar un número del 1 al 4
y muestre un mensaje diferente para cada número utilizando una sentencia switch
(por ejemplo, "Opción 1 seleccionada", "Opción 2 seleccionada", etc.).
 */

import java.util.Scanner;

public class Ejercicio_SWITCH_6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Por favor, seleccione una opción del 1 al 4:");
        int opcion = keyboard.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ha seleccionado la opción 1");
                break;
            case 2:
                System.out.println("Ha seleccionado la opción 2");
                break;
            case 3:
                System.out.println("Ha seleccionado la opción 3");
                break;
            case 4:
                System.out.println("Ha seleccionado la opción 4");
                break;
            default:
                System.out.println("No ha introducido una opción válida.");
                break;
        }
        System.out.println("Programa finalizado.");
    }
}
