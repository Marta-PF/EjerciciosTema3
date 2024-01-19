import java.util.Scanner;
/*U3 Ejercicio 15 FOR: Juego adivinación
Crear un programa que permita realizar un juego de adivinación.
Para ello el sistema nada más empezar generará un número aleatorio entre 1 y 30.
Tras la generación de este número el usuario contará con 10 intentos para poder adivinarlo.
Para lo cual se irá pidiendo un números y en el caso de aceptarlo terminará el proceso con el mensaje
"Has adivinado el número en X intentos". En el caso de agotar los intentos aparecerá el menaje
"Lo siento, has agotado todos los intentos”
 */
public class Ejercicio_FOR_15 {
    public static void main(String[] args) {
        int aleatorio = (int) (Math.random() * 30)+1; //Así saldrán números del 1 al 30 ambos incluídos
        int intentos = 0;
        Scanner keyboard = new Scanner(System.in);
        boolean acertado = false;

        for (int i = 0; i < 10; i++) {
            System.out.println("Por favor, introduce un número");
            int numero = keyboard.nextInt();
            intentos++; //Vamos acumulando intentos en cada vuelta
            if (numero == aleatorio){
                acertado = true;
                System.out.printf("¡Enhorabuena! Has adivinado el número en %d intentos\n", intentos);
                break;
            }
        }if (!acertado){ //Entiendo que una vez terminado el bucle, volver acertado true mediante la negación ! activa la accion de  este if
            System.out.println("Lo sentimos, has agotado todos los intentos.");
        }



        /* CORRECCIÓN PROFESOR (NO SÉ POR QUÉ MULTIPLICA POR 16)
        int aleatorio = (int) (Math.random() * 16);
        int intentos = 0;
        Scanner scanner = new Scanner(System.in);
        boolean acertado = false;
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce numero");
            int numero = scanner.nextInt();
            intentos++;
            if (numero == aleatorio) {
                acertado = true;
                System.out.printf("Perfecto has adivinado el numero en %d intentos\n", intentos);
                break;
            }
        }
        if (!acertado) {
            System.out.println("Lo siento has agotado todos los intentos");
        }

         */
    }



}


