/*U3 Ejercicio 3 FOR: Tabla de todos los números

Modificar el ejercicio anterios para calcular la tabla de multiplicar de todos los números (del 0 al 10) (TablaTodos)
(He tenido que consultar la corrección del profesor y está igual)

 */
public class Ejercicio_FOR_3 {
    public static void main(String[] args) {
        //int numero = 0; -> La corrección del profesor tiene declarada esta variable, pero funciona bien sin ella. No lo entiendo muy bien.

        /* Este ejercicio no requiere que el usuario introduzca nada.
        Solo tenemos dos bucles for que se multiplican automáticamente
        hasta llegar al 10 y son mostrados en pantalla.

         */
        for (int i = 0; i <= 10; i++) {
            System.out.println("La Tabla de multiplicar del " + i);
            for (int j = 0; j <= 10; j++) {
                System.out.printf("\t%d * %d = %d\n", i, j, i * j);
            }

        }


    }
}
