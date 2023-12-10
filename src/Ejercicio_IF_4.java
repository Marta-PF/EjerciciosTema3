/* U3 Ejercicio 4 IF: Año bisiesto

 Hágase un programa que compruebe si un año pedido por teclado es bisiesto.
 En la salida se mostrará o “Es bisiesto” o “No es bisiesto”,)

 El algoritmo para obtener si un año es bisiesto es el siguiente: un año es bisiesto si es múltiplo de 4.
 */


import java.util.Scanner;

public class Ejercicio_IF_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el año que desea consultar:");
        int anno = scanner.nextInt();

        if(anno%4 == 0){ //Cuidado con la ñ!!
            System.out.println("Es un año bisiesto.");
        }else {
            System.out.println("No es un año bisiesto");
        }
        System.out.println("Finalizando el programa...");

    }

    /* CORRECCIÓN PROFESOR:
    package ejerciciosif;

public class Ejercicio4 {

    public static void main(String[] args) {
        int anio = 2002;
        if (anio%4 == 0){
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
    }
}
     */


}
