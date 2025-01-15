/*Generar una función que tenga 4 parámetros de tipo decimal y devuelva el promedio 
cualitativo de los parámetros. Si el promedio es: De 0 a 5 el promedio cualitativo es 
Regular De 5.1 a 8 el promedio es Bueno De 8.1 a 9 el promedio es Muy Bueno De 9.1 a 10 
el promedio es Sobresaliente. A la función se la debe llamar desde un método principal.
Los parámetros necesarios para llamar a la función, deben ser ingresados solicitados al usuario.
 * @author david
 */
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("DEME 4 VALORES DECIMALES: ");
        double n1 = tcl.nextDouble();
        double n2 = tcl.nextDouble();
        double n3 = tcl.nextDouble();
        double n4 = tcl.nextDouble();

        String resultado = calcularPromedio(n1, n2, n3, n4);
        System.out.println("El promedio cualitativo es: " + resultado);
    }

    public static String calcularPromedio(double n1, double n2, double n3, double n4) {
        double promedio = (n1 + n2 + n3 + n4) / 4;

        if (promedio >= 0 && promedio <= 5) {
            return "Regular";
        } else if (promedio > 5 && promedio <= 8) {
            return "Bueno";
        } else if (promedio > 8 && promedio <= 9) {
            return "Muy Bueno";
        } else {
            return "Sobresaliente";
        }
    }
}
/***DEME 4 VALORES DECIMALES: 
5.6
9.89
7.90
8.90
El promedio cualitativo es: Muy Bueno 
 */