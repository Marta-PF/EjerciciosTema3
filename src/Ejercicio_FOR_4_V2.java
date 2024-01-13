/*U3 Ejercicio 4 Versión 2 FOR: Tablas comprendida entre números

Modificar el ejercicio anterior para calcular la tabla de multiplicar de los numeros comprendidos en un rango
de números pedidos. Por ejemplo, las tablas de los números comprendidos entre el 3 y el 7 (3,4,5,6,7)
NOTA: Quiero intentar hacerlo utilizando Scanner
 */

import java.util.Scanner;

public class Ejercicio_FOR_4_V2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Deseo ver las tablas de multiplicar de los números comprendidos entre: ");
        int numeroUno = keyboard.nextInt();
        System.out.println("Y el número: ");
        int numeroDos = keyboard.nextInt();

        for (int i = numeroUno; i <= numeroDos; i++) {
            System.out.println("La tabla de multiplicar del número "+i);
            for (int j = 0; j <= 10; j++) {
                System.out.printf("\t\t%d * %d = %d\n", i, j, i * j);

            }

        }

    }
}
