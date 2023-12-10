/* U3 Ejercicio 4 SWITCH: Días de cada mes

Realiza un programa que solicite al usuario ingresar un mes
(como un número del 1 al 12) y muestre la cantidad de días
que tiene ese mes, considerando años no bisiestos.
 */

import java.util.Scanner;

public class Ejercicio_SWITCH_4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Por favor, introduzca el número de mes:");
        int mes = keyboard.nextInt();

        switch (mes){
            case 1:
                System.out.println("Ha escogido ENERO, 31 días");
            break;
            case 2:
                System.out.println("Ha escogido FEBRERO, 28 días");
                break;
            case 3:
                System.out.println("Ha escogido MARZO, 31 días");
                break;
            case 4:
                System.out.println("Ha escogido ABRIL, 30 días");
                break;
            case 5:
                System.out.println("Ha escogido MAYO, 31 días");
                break;
            case 6:
                System.out.println("Ha escogido JUNIO, 30 días");
                break;
            case 7:
                System.out.println("Ha escogido JULIO, 31 días");
                break;
            case 8:
                System.out.println("Ha escogido AGOSTO, 31 días");
                break;
            case 9:
                System.out.println("Ha escogido SEPTIEMBRE, 30 días");
                break;
            case 10:
                System.out.println("Ha escogido OCTUBRE, 31 días");
                break;
            case 11:
                System.out.println("Ha escogido NOVIEMBRE, 30 días");
                break;
            case 12:
                System.out.println("Ha escogido DICIEMBRE, 31 días");
                break;
            default:
                System.out.println("El número que ha introducido no es válido.");
                break;
        }
        System.out.println("Fin del programa.");
    }
}
