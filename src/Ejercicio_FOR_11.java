import java.util.Scanner;

/*U3 Ejercicio 11 FOR: Cuadrado FOR
Dibujar por consola un Cuadrado de + .
Para ello se pedirá por consola el tamaño del lado y se imprimirá el cuadrado con el siguiente formato (CuadradoFor)
*/
//NOTA: Este no sabía hacerlo así que tomo notas sobre la corrección del profesor
//Se trata de hacer un cuadrado con cruces. Solo el borde, no relleno.
public class Ejercicio_FOR_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("De qué lado quieres el cuadrado"); //El número introducido dará las mismas filas y columnas
    int lado = scanner.nextInt();
        for (int i = 0; i < lado; i++) {
        // i va a indicar las filas
        for (int j = 0; j < lado; j++) {
            // j va a indicar las columnas

            // estamos en la primera fila, donde i es igual a 0 y van una fila de (+)
            if (i==0){
                System.out.print("+");
            }
            // estamos en la última fila, donde i debe medir lado - 1 y va otra fila de cruces(+)
            //Mide eso porque empezamos contando de 0. Por lo que al número que ponga el usuario (lado) se le resta 1.
            else if (i==lado-1){
                System.out.print("+");
            }
            // Ahora estamos en la primera columna, donde j vale 0 y va una columna de (+)
            else if (j==0){
                System.out.print("+");
            }
            // De igual modo que antes, ahora estamos en la ultima columna donde j es igual a lado-1 (+)
            else if (j==lado-1) {
                System.out.print("+");
            }
            // el resto de los huecos que quedan van en blanco para dejar solo el marco del cuadrado ( - )
            //Si por ejemplo pusieramos otra (+), se llenaria el cuadrado de cruces.
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}



}
