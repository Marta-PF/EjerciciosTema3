import java.util.Scanner;

/*U3 Ejercicio 5 FOR: Base y Exponente

Dado dos enteros entre 0 y 5 (la base y el exponente), obtener la potencia del primero elevado al segundo sin utilizar
el método “pow”. Por ejemplo, base = 3 y exponente = 5, 35=3x3x3x3x3=243.
Casos particulares: 00 = Error y n0 = 1.(BaseExponente)



 */
public class Ejercicio_FOR_5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Por favor, introduce el número para la base:");
        int numeroBase = keyboard.nextInt();
        System.out.println("Por favor, introduce el número del exponente:");
        int numeroExponente = keyboard.nextInt();

        if (numeroBase == 0 && numeroExponente == 0) {
            System.out.println("Error, no se puede calcular");
        } else {
            int resultado = 1; //Resultado va a ser lo que salga de ir multiplicando la base tantas veces como indique el exponente
            //No puede partir de 0 porque entonces el resultado de la multiplicación daría siempre 0.

            for (int i = 0; i < numeroExponente; i++) {
            //El exponente indica cuántas veces debe multiplicarse por sí misma la base. Cuántas veces se repite el bucle for.

                resultado *= numeroBase;
                //Esto inica que cada vuelta del for iremos multiplicando el resultado por el numeroBase y acumulando su valor.
            }
            System.out.println(resultado);
        }


    }
}
