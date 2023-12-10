import java.util.Scanner;

public class Ejercicio_IF_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el primer número: ");
        int numero1 = teclado.nextInt();

        System.out.println("Introduzca el segundo número: ");
        int numero2 = teclado.nextInt();

        if (numero1>numero2) {
            System.out.println("El primer número es mayor");
        }else { System.out.println("El segundo número es mayor");
            }

        System.out.println("Gracias por participar");

    }


}
