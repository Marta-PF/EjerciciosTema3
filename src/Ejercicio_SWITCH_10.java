/*U3 Ejercicio 10 SWITCH: Leer código de barras

Crea un programa que permita al usuario ingresar un código de producto (como una cadena de caracteres)
y, utilizando una sentencia switch, muestre el nombre del producto y su precio correspondiente */


import java.util.Scanner;

public class Ejercicio_SWITCH_10 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Por favor, introduzca uno de los códigos disponibles:");
        System.out.println("1234A; 1234B; 1234C o 1234D");

        String codigo = keyboard.nextLine(); //Me gustaría saber cómo hacer que de igual que las letras esten en mayus o minus

        switch (codigo) {
            case "1234A":
                System.out.println("El producto es Manzana Golden");
                System.out.println("Su precio es 0,30€/unidad");
                break;
            case "1234B":
                System.out.println("El producto es Paquete Arroz 1kg");
                System.out.println("Su precio es 0,99€");
                break;
            case "1234C":
                System.out.println("El producto es Galletas María");
                System.out.println("Su precio es 1,50€");
                break;
            case "1234D":
                System.out.println("El producto es Cuña de queso semi");
                System.out.println("Su precio es 3,99€");
                break;
            default:
                System.out.println("El código que ha introducido no es válido");
                break;
        }
        System.out.println("Finalizar compra.");











   /* CORRECCIÓN PROFESOR

   public static void main(String[] args) {
            String codigo = "123A";
            switch (codigo){
                case "1234A":
                    System.out.println("El producto es XXX");
                    System.out.println("Su precio es XXX");
                    break;
                case "123A":
                    System.out.println("El producto es XXX");
                    System.out.println("Su precio es XXX");
                    break;
                case "1234B":
                    System.out.println("El producto es XXX");
                    System.out.println("Su precio es XXX");
                    break;
                case "123B":
                    System.out.println("El producto es XXX");
                    System.out.println("Su precio es XXX");
                    break;
            }
     */


    }
}


