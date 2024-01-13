/*U3 Ejercicio 4 FOR: Tablas comprendida entre números

Modificar el ejercicio anterior para calcular la tabla de multiplicar de los numeros comprendidos en un rango
de números pedidos. Por ejemplo, las tablas de los números comprendidos entre el 3 y el 7 (3,4,5,6,7)

 */

public class Ejercicio_FOR_4 {
    public static void main(String[] args) {

        int numeroUno = 3;
        int numeroDos = 7;

        for (int i = numeroUno; i <=numeroDos ; i++) { //Recorremos los valores desde el numeroUno hasta el numeroDos
            System.out.println("Tabla de multiplicar del "+i);
            for (int j = 0; j < 10; j++) { //Y multiplicamos esos valores, como siempre, por los números del 0 al 10
                System.out.printf("\t%d * %d = %d \n",i,j,i*j);
            }
        }
    }
}
