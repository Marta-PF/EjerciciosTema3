/*U3 Ejercicio 1 FOR: Temperaturas

Se leerá el número de temperaturas a introducir (de ser 0 o negativo se establecerá a 10).
Obténgase la media con dos decimales de las temperaturas introducidas por consola.
(TemperaturasIntroducidas)

 NOTAS: Este ejercicio necesita:
 1) Pedir al usuario cuantas temperaturas va a analizar.
 2) Guardar la cantidad de temperaturas pedidas.
 3) Pedir al usuario que introduzca las temperaturas.
 4) Guardar las temperaturas introducidas.
 5) Convertir a 10 las temperaturas menores o iguales a 0.
 6) Crear un sumatorio que vaya sumando el valor de las temperaturas introducidas.
 7) Dividir las temperaturas introducidas entre la cantidad de temperaturas introducidas
    (para sacar la media) y que se muestre con dos decimales (%.2f)

 */

import java.util.Scanner;

public class Ejercicio_FOR_1 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("¿Cuántas temperaturas desea introducir?");
        int NumTemperaturas = keyboard.nextInt(); //variable para el numero de temperaturas introducidas
        // double media= 0.0; el profesor ha puesto esta variable, pero sin ella me funciona tambíen
        double sumatorio = 0.0; // variable para ir sumando las temperaturas introducidas

        for (int i = 0; i < NumTemperaturas; i++) {
            System.out.println("Por favor, introduzca la temperatura: ");
            int temperatura = keyboard.nextInt(); //a lo largo de las NumTemperaturas nos pedirá la temperatura deseada
            if (temperatura<1){
                temperatura = 10; //Si se introduce una temperatura menor a 1, será 10
            }
            sumatorio +=temperatura; // con += la variable sumatorio irá sumando el valor de las temperaturas introducidas
        }
        //Usamos printf con la bandera %.2f para sustituir por un número con dos decimales.
        //Resultado de dividir sumatorio y NumTemperaturas (la forma de calcular una media)
        System.out.printf("La media de las temperaturas es de %.2f",sumatorio/NumTemperaturas);

        //NOTA 2: Este método no parece funcionar si el usuario introduce números con decimales



               /* CORRECCIÓN PROFESOR

               Scanner scanner = new Scanner(System.in);

                System.out.println("Cuantas temperaturas vas a meter");
                int nTemperaturas = scanner.nextInt();
                double media = 0.0;
                double sumatorio = 0.0;
                for (int i = 0; i < nTemperaturas; i++) {
                    System.out.println("Por favor introduce la temperatura");
                    int temperatura = scanner.nextInt();
                    if (temperatura<1){
                        temperatura = 10;
                    }
                    sumatorio +=temperatura;
                }
                System.out.printf("La media de las temperaturas es de %.2f",sumatorio/nTemperaturas);
                  */
            }
        }

