/*U3 Ejercicio 3 WHILE: Mayor Numero
3. Generar números enteros aleatorios entre 0 y 100 hasta obtener el 0.
El programa mostrará cada uno de los datos generados y obtendrá el mayor de los números generados.
(MayorNumero)
 */

public class Ejercicio_WHILE_3 {
    public static void main(String[] args) {
        int aleatorio;
        int max=0;
        do{
            aleatorio = (int)(Math.random()*101); //Números aleatorios entre 0 y 100
            System.out.println(aleatorio);
            if (aleatorio>max){
                max = aleatorio;
                /* Me ha costado entender cómo este if guarda el número más alto. Pondré un ejemplo.
                Si aleatorio tiene un valor mayor que max, se guardará ese valor con max = aleatorio.
                Por ejemplo: Sale aleatorio = 2
                aleatorio=2 es mayor que max=0 así que los igualamos y max se queda con valor 2.
                Ahora sale el aleatorio = 17
                aleatorio=17 es mayor que max=2, volvemos a igualar y ahora max tiene valor 17.
                A continuación sale aleatorio = 3
                aleatorio=3 no es mayor que max=3 de modo que no guardamos valor y max sigue valiendo 17
                (Que es lo más alto que ha salido)
                Por eso al sacar por pantalla max al final, tendrá el valor más alto.
                 */
            }
        }while (aleatorio!=0); //Se repetirá mientras que aleatorio sea diferente de 0

        System.out.println("El maximo generado es "+max);
    }
}
