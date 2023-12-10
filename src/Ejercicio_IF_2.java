import java.util.Scanner;

/* U3 EJERCICIO 2: SUMA TRES (IF)
Hágase un programa que lea tres enteros positivos, y compruebe si alguno es suma de los otros dos.
En la salida se mostrará “Ninguno es suma de los otros dos” o “8 = 2 + 6”
(en este último caso se introdujeron los números 2, 8 y 6).
*/
public class Ejercicio_IF_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce el primer número: ");
        int num1 = teclado.nextInt();
        System.out.println("Introduce el segundo número: ");
        int num2 = teclado.nextInt();
        System.out.println("Introduce el tercer número: ");
        int num3 = teclado.nextInt();

        if ((num1 == num2+num3) || (num2 == num1+num3) || (num3 == num1+num2)) {
            if ((num1>0) && (num2>0) && (num3>0)) {     //La idea era que se cancelase si se usan números negativos, pero no funciona
                System.out.println("Comprobando...");
            }
            System.out.printf("%d = %d + %d \n",num1,num2,num3);
            System.out.printf("%d = %d + %d \n",num2,num1,num3);
            System.out.printf("%d = %d + %d \n",num3,num1,num2);
            System.out.printf("Se han encontrado números iguales a la suma de los otros dos.\n");
        }else {
            System.out.println("Ninguno es la suma de los otros dos.");
        }

        System.out.println("Fin del programa.");





        /* CORRECCIÓN DEL PROFESOR:
        package ejerciciosif;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce numero 1");
        int numero1 = scanner.nextInt();
        System.out.println("Introduce numero 2");
        int numero2 = scanner.nextInt();
        System.out.println("Introduce numero 3");
        int numero3 = scanner.nextInt();

        if ((numero1==numero2+numero3) || (numero2 == numero1+numero3) || (numero3 == numero1+numero2) ){
            System.out.println("Uno de los números es la suma de los otros dos");
        } else {
            System.out.println("Ninguno es suma de los otros dos");
        }
    }
}

         */
    }
}
