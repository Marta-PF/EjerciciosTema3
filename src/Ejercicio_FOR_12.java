/*U3 Ejercicio 12 FOR: Cuadrado Formato
Modificar el ejercicio anterior para dibujar un cuadrado donde las aristas exteriores tengan el caracter -
y la parte interior del cuadrado tenga el caracter +. (CuadradoFormato)
 */

import java.util.Scanner;

public class Ejercicio_FOR_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("De qué lado quieres el cuadrado");
        int lado = scanner.nextInt();
        for (int i = 0; i < lado; i++) {
            // i va a indicar las filas
            for (int j = 0; j < lado; j++) {
                // j va a indicar las columnas

                // estamos en la primera fila
                if (i==0){
                    System.out.print("-");
                }
                // estamos en la última fila
                else if (i==lado-1){
                    System.out.print("-");
                }
                // Ahora estamos en la primera columna
                else if (j==0){
                    System.out.print("-");
                }
                // Ahora estamos en la ultima columna
                else if (j==lado-1) {
                    System.out.print("-");
                }
                else {
                    System.out.print("+");
                }
            }
            System.out.println();
        }
    }

}
