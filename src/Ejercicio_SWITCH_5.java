/* U3 Ejercicio 5 SWITCH: Un número = a un mes

Escribe un programa que pida al usuario ingresar un número del 1 al 12
y muestre el nombre del mes correspondiente utilizando una sentencia switch.
 */


import java.util.Scanner;

public class Ejercicio_SWITCH_5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Por favor, introduzca el número de mes:");
        int mes = keyboard.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Ha escogido " + mes + ". Corresponde al mes de ENERO."); //He añadido el +mes para que muestre el número escogido cada vez.
                break;
            case 2:
                System.out.println("Ha escogido " + mes + ". Corresponde al mes de FEBRERO.");
                break;

            case 3:
                System.out.println("Ha escogido " + mes + ". Corresponde al mes de MARZO.");
                break;
            case 4:
                System.out.println("Ha escogido " + mes + ". Corresponde al mes de ABRIL.");
                break;
            case 5:
                System.out.println("Ha escogido " + mes + ". Corresponde al mes de MAYO.");
                break;
            case 6:
                System.out.println("Ha escogido " + mes + ". Corresponde al mes de JUNIO.");
                break;
            case 7:
                System.out.println("Ha escogido " + mes + ". Corresponde al mes de JULIO.");
                break;
            case 8:
                System.out.println("Ha escogido " + mes + ". Corresponde al mes de AGOSTO.");
                break;
            case 9:
                System.out.println("Ha escogido " + mes + ". Corresponde al mes de SEPTIEMBRE.");
                break;
            case 10:
                System.out.println("Ha escogido " + mes + ". Corresponde al mes de OCTUBRE.");
                break;
            case 11:
                System.out.println("Ha escogido " + mes + ". Corresponde al mes de NOVIEMBRE.");
                break;
            case 12:
                System.out.println("Ha escogido " + mes + ". Corresponde al mes de DICIEMBRE.");
                break;
            default:
                System.out.println("El número introducido no corresponde a ningún mes.");
                break;
        }
        System.out.println("Fin del programa.");

    }
}
