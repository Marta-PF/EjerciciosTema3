/*U3 Ejercicio 8 FOR: Numeros tipos
Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros
(cantidad de ceros introducidos por el usuario)
 */



import java.util.Scanner;

public class Ejercicio_FOR_8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //necesitamos un sumatorio de los números positivos y otro de los negativos. Ir sumando el valor de los números que salen.

        double sumatorioPositivos = 0.0, sumatorioNegativos = 0.0; //OJO son double y ojo también con esa coma normal en medio
        //Si lo pongo como int da un error artmético a la hora de dividir. De esta forma el resultado sale con decimales.

        //necesitamos guardar la cantidad de 0 y numeros negativos y positivos que son introducidos cada vuelta del for.
        int numeroCeros = 0, numerosNegativos = 0, numeroPositivos = 0;

        //Ahora, pediremos 10 números

        for (int i = 0; i < 10; i++) {
            System.out.println("Por favor, introduce un número:");
            int numero = keyboard.nextInt();

            //Si el número introducido es mayor que 0, será positivo
            if (numero >= 0) {
                sumatorioPositivos += numero; //vamos sumándo los números (su valor) introducidos positivos guardandolos en la variable sumatorio
                numeroPositivos++; //va acumulando el número de veces que sale un número positivo
            } else {
                //lo que queda, es que sea negativo. Se recopilan igual con sus respectivas variables.
                sumatorioNegativos += numero;
                numerosNegativos++;
            }
            //Por último, para contar los 0 que sean introducidos
            if (numero == 0) {
                numeroCeros++;
            }
        }

        //La media de varios números se calcula dividiendo el valor de esos números entre la cantidad de números que sean:
        System.out.println("La media de los números positivos es: "+(sumatorioPositivos/numeroPositivos));
        System.out.println("La media de los números positivos es: "+(sumatorioNegativos/numerosNegativos));
        System.out.println("El número de 0 introducidos es: "+numeroCeros);
    }

}

