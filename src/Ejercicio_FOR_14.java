/*U3 Ejercicio 14 FOR: Palabra capicua
Pedir una palabra por teclado y comprobar si es o con capicua.
Una palabra es palíndromo cuando se lee igual de izquieda a derecha que de derecha a izquierda.
Por ejemplo ana, oro, radar.
Para poder hacer la comprobacion no se tendrán en cuenta mayusculas ni acentos (CapicuaPalabra)

NOTA: NO TERMINO DE ENTENDER ESTE EJERCICIO
 */

public class Ejercicio_FOR_14 {
    public static void main(String[] args) {

        //CORRECCIÓN PROFESOR
        // r(0) a(1) d(2) y(3) r(4) -> 5 -> 2
        String palabra = "radar";
        boolean isPalindromo = false;
        for (int i = 0; i < palabra.length()/2; i++) {
            if (palabra.charAt(i) == palabra.charAt(palabra.length()-1-i)){ //REVISAR,NO TERMINO DE ENTENDER ESTO
                isPalindromo = true;
            } else {
                isPalindromo = false;
                break;
            }
        }

        if (isPalindromo){
            System.out.println("La palabra es palindromo");
        } else {
            System.out.println("La palabra  no es palindromo");
        }
        
    }
}
