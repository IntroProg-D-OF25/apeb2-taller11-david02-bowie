/*Generar las funciones/métodos que devuelvan las suma, resta y multiplicación de un
arreglo bidimensional cuadrado; mismo que se lo recibe como parámetro.
 * @author david
 */
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("DEME EL TAMAÑO DE LA MATRIZ CUADRADA:");
        int n = tcl.nextInt();
        int[][] matriz = new int[n][n];

        genMatriz(matriz);
        presentarMatriz(matriz);
        System.out.println("Suma de los elementos: " + sumaMatriz(matriz));
        System.out.println("Resta de los elementos: " + restaMatriz(matriz));
        System.out.println("Multiplicación de los elementos: " + multiplicacionMatriz(matriz));
    }

    public static void genMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void presentarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int sumaMatriz(int[][] matriz) {
        int suma = 0;
        for (int[] fila : matriz) {
            for (int valor : fila) {
                suma += valor;
            }
        }
        return suma;
    }

    public static int restaMatriz(int[][] matriz) {
        int resta = 0;
        for (int[] fila : matriz) {
            for (int valor : fila) {
                resta -= valor;
            }
        }
        return resta;
    }

    public static int multiplicacionMatriz(int[][] matriz) {
        int multiplicacion = 1;
        for (int[] fila : matriz) {
            for (int valor : fila) {
                multiplicacion *= valor;
            }
        }
        return multiplicacion;
    }
}
