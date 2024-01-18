/*U3 Ejercicio 13 FOR: Palabra Inversa
Pedir una palabra por teclado y mostrar su contraria.
Por ejemplo se introducirá la palabra programacion y se mostrará por consola la palara noicamargorp (InversaPalabra)
 */

public class Ejercicio_FOR_13 {
    public static void main(String[] args) {
        String palabra = "programacion";
        // h(0) o(1) l(2) a(3) -> legnth 4
        // p(0) r(1) o (2) g (3) r (4) a (5) m (6) a (7) c (8) i (9) o (10) n (11) -> length 12
        //Usamos el bucle for pero hacia atrás, comenzando con el largo de la palabra y retrocendiendo con i--
        // Podemos usar i = palabra.length()-1, el -1 porque su lenght es 12, pero la palabra acaba en 11 al comenzar de 0
        //Hasta i mayor o igual que 0
        for (int i = palabra.length()-1; i >=0 ; i--) {
            //Luego sacamos las letras una a una hacia atras con palabra.charaAt(i)
            System.out.print(palabra.charAt(i));
            }

    }
}
