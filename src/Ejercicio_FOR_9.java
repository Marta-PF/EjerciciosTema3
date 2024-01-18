/*U3 Ejercicio 9 FOR: Sueldos
Pedir 10 sueldos. Mostrar su suma, media y cuantos hay mayores de 1000€.(Sueldos)
 */

import java.util.Scanner;

public class Ejercicio_FOR_9 {
    public static void main(String[] args) {
        double sumatorioSueldos = 0.0;
        int contadorMil = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Por favor, introduzca el sueldo número: "+i);
            Scanner keyboard = new Scanner(System.in);
            double sueldo = keyboard.nextDouble();

            sumatorioSueldos += sueldo;
            if (sueldo>1000){
                contadorMil++;
            }
        }
        System.out.println("La suma de todos los sueldos es: "+sumatorioSueldos);
        System.out.println("La media de todos los suelos es: "+sumatorioSueldos/10);
        System.out.println("La cantidad de sueldos superiores a 1000€ es: "+contadorMil);
    }
}
