/*U3 Ejercicio 4 WHILE: Adivina
Crea un programa que genere un número aleatorio (entre 0 y 20) de entrada y lo guarde en una variable.
El sistema irá pidiendo números al usuario hasta que coincida con el aleatorio generado
(en caso de no coincidir mostrará el mensaje "Lo siento, intentalo de nuevo").
Cuando coincida el sistema deberá mostar el mensaje "Enhorabuena, has acertado el número en 5 intentos" (Adivina)
 */

import java.util.Scanner;

public class Ejercicio_WHILE_5 {
    public static void main(String[] args) {
        int numAleatorio = (int) (Math.random() * 21);
        int intentos = 0;
        boolean acertado = false;

        do {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Lo siento, intentalo de nuevo"); //FALLO: YA COMIENZA CON ESE MENSAJE
            int numIntroducido = keyboard.nextInt();
            intentos++;
            if (numIntroducido == numAleatorio) {
                acertado = true;
            }
        } while (acertado != true); //El bucle seguirá dando vueltas mientras que acertado sea diferente de true
        System.out.printf("¡Enhorabuena! Has acercato el número en %d intentos \n", intentos);


    }
}
