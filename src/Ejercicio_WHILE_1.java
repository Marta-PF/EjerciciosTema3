/*U3 Ejercicio 1 WHILE: Sumar positivos
Leer números enteros hasta introducir un 0. El programa obtendrá la suma de todos
los números positivos. (SumarPositivos)
 */
import java.util.Scanner;

public class Ejercicio_WHILE_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero, sumatorio=0; //Creamos una variable numero para los que introduzca el usuario y un sumatorio

        do {
            System.out.println("Introduce un número");
            numero = scanner.nextInt();
            if (numero>0){ //Si el numero introducido sea mayor que 0
                sumatorio+=numero; //En el sumatorio se iran sumando los numeros
                // sumatorio = sumatorio + numero
            }
        } while (numero !=0); // El bucle termina cuando esta condición sea FALSA. Si el usuario introduce 0, esto es FALSO y termina.
        System.out.println("La suma de los positivos es: "+sumatorio);

    }
    }
