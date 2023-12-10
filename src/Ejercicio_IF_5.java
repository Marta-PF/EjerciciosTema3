/* U3 Ejercicio 5 IF: Número capicua


Determinar si un número natural de 4 dígitos (entre 1000 y 9999) es capicúa.
Se comprobará previamente que el número introducido tiene 4 dígitos.
En la salida se mostrará uno de los siguientes mensajes:
    1. “El número no tiene 4 dígitos”;
    2. “Es capicúa”
    3. “No es capicúa”.
    - * Un número es capicúa cuando se lee igual de izquierda a derecha que de derecha a izquierda **

    */

import java.util.Scanner;

public class Ejercicio_IF_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número de 4 dígitos:");
        int numero = scanner.nextInt();

        if(numero>999 && numero<10000){
            System.out.println("El número contiene 4 dígitos");
        }
        else {
            System.out.println("El número no contiene 4 dígitos");
        }
        System.out.println("Finalizando el programa.");
    }
//Falta acabarlo. ¿Puede haber una formula que calcule capicuas de cuatro digitos?

}
