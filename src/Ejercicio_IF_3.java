/* U3 Ejercicio 3 IF: Multiplo de 20 entre -100 y 100

Léase un número entero. Se comprobará si dicho número es o no múltiplo de 20, y también se comprobará si está o no entre -100 y 100. En la salida se mostrará uno de los siguientes menasajes:
    1. “Es múltiplo de 20 y está entre -100 y 100”.
    2. “Es múltiplo de 20 y no está entre -100 y 100”.
    3. “No es múltiplo de 20 y está entre -100 y 100”-
    4. “No es múltiplo de 20 y no está entre -100 y 100”.
    - * Un número es múltiplo de otro cuando su resto es igual a 0 **
 */

import java.util.Scanner;

public class Ejercicio_IF_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, introduce un número: ");
        int numero = teclado.nextInt();

        //¿Multiplo de 20?
        //¿Existe entre -100 y 100?

        if ((numero%20 == 0) && (numero>-99.99) && (numero<=100)){
            System.out.println("Es múltiplo de 20 y está entre -100 y 100");
        } else if ((numero%20 == 0) && (numero<-100) && (numero>100)) {             //No acabo de entender por qué da error este
            System.out.println("Es múltiplo de 20 y no está entre -100 y 100");
        } else if ((numero% 20 != 0) && (numero>-99.99) && (numero<=100)) {
            System.out.println("No es múltiplo de 20 y está entre -100 y 100");
        } else {
            System.out.println("No es mútiplo de 20 y no está entre -100 y 100");
        }
        System.out.println("Fin del programa.");



        /* CORRECCIÓN DEL PROFE:

        package ejerciciosif;

public class Ejercicio3 {

    public static void main(String[] args) {
        int numero = 200;

        if (numero%20==0){
            if (numero>=-100 && numero<=100){
                System.out.println("El numero es multiplo y esta en rango");
            } else {
                System.out.println("El numero es multiplo y no esta en rango");
            }
        } else {
            if (numero>=-100 && numero<=100){
                System.out.println("El numero no es multiplo y esta en rango");
            } else {
                System.out.println("El numero no es multiplo y no esta en rango");
            }
        }
    }
}

         */


    }

}
