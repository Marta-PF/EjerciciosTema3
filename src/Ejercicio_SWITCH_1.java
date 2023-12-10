import java.util.Scanner;

/* U3 Ejercicio 1 SWITCH: Día de la semana

Escribe un programa en Java que solicite al usuario ingresar un número del 1 al 7
y muestre el día de la semana correspondiente utilizando una sentencia switch.
 */
public class Ejercicio_SWITCH_1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Por favor, introduce un número del 1 al 7:");
        int numero = keyboard.nextInt();

        switch (numero) {
            case 1:
                System.out.println("El día de la semana es: LUNES");
                break;

            case 2:
                System.out.println("El día de la semana es: MARTES");
                    break;

            case 3:
                System.out.println("El día de la semana es: MIÉRCOLES");
                break;

            case 4:
                System.out.println("El día de la semana es: JUEVES");
                break;

            case 5:
                System.out.println("El día de la semana es: VIERNES");
                break;

            case 6:
                System.out.println("El día de la semana es: SÁBADO");
                break;

            case 7:
                System.out.println("El día de la semana es: DOMINGO");
                break;

            default:
                System.out.println("No ha seleccionado un número entre el 1 y el 7");
                break;
        }

        System.out.println("Fin del programa.");


        //¡Está bien! ¡La corrección es prácticamente igual!


    }
}
