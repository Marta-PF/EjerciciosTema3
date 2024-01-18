/*U3 Ejercicio 10 FOR: Notas Tipos
Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.(NotasTipos)
 */

//Al principio me he confundido un poco con la sintaxis >= (lo escribía al revés)
// y he olvidado el else de else if. Pero por lo demás bien.

import java.util.Scanner;

public class Ejercicio_FOR_10 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int aprobado =0, condicionado =0, suspensos =0;
        for (int i = 0; i < 6; i++) {
            System.out.println("Por favor, introduce la nota");
            int notas = keyboard.nextInt();
            if (notas>=5){
                aprobado++;
            }else if (notas==4){
                condicionado++;
            }else {suspensos++;
            }
        }
        System.out.println("El número de aprobados es: "+aprobado);
        System.out.println("El número de suspensos es: "+suspensos);
        System.out.println("El número de condicionados es: "+condicionado);

        /*

        CORRECCIÓN PROFESOR
        public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAprobados=0, numeroCondicionados=0, numeroSS=0;
        for (int i = 0; i < 6; i++) {
            System.out.println("introduce nota");
            int nota = scanner.nextInt();
            if (nota<4){
                numeroSS++;
            } else if (nota<5){
                numeroCondicionados++;
            } else {
                numeroAprobados++;
            }
        }
        System.out.println("El numero de ap es "+numeroAprobados);
        System.out.println("El numero de ss es "+numeroSS);
        System.out.println("El numero de cd es "+numeroCondicionados);
    }
}
         */

    }
}
