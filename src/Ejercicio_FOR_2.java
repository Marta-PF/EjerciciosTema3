import java.util.Scanner;

/*U3 Ejercicio 2 FOR: Tabla de Multiplicar

Leer un número entre 0 y 10. Se mostrará la tabla de multiplicar de dicho número con el formato: 5 x 3 = 15
(desde 0 hasta 10 en líneas distintas). (TablaDeMultiplicar)
 */
public class Ejercicio_FOR_2 {
    public static void main(String[] args) {
        //Pedimos al usuario que introduzca el número de la tabla que quiere consultar.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("¿Qúe tabla quieres consultar? Introduce el número:");
        int numero = keyboard.nextInt();

        /*Con for recorreremos todos los números (de 0 a 10) por los que va a ser multiplicado el
        número introducido por el usuario. Esos números serán i.
         */
        for (int i = 0; i <= 10; i++) {
            /*Para mostrarlos en pantalla, hacemos uso de printf.
            \t añade espacio hacia la derecha en nuestro texto, centrándolo un poco.
            \n es un salto de línea.
            Las tres %d serán sustituidas por los numeros indicados en orden después de las comillas.
            1)El "número" introducido por el usuario.
            2)El número al que equivale i en cada vuelta del bucle for.
            3)Y el resultado será la multiplicación de ambos.
             */
            System.out.printf("\t%d * %d = %d\n", numero, i, numero * i);
        }
    }
}



