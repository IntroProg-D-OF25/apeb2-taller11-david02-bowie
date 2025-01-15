/*Generar una solución que implemente 3 procedimientos. Que permitan calcular 
el área de un cuadrado, área de un triángulo y área de un rectángulo. 
Cada procedimiento/función debe recibir los datos necesarios y generar 
el valor correspondiente. Se debe invocar a los procedimientos desde un
método principal; Si el usuario ingresa 1 se llama al procedimiento 
obtenerAreaCuadrado; 2 se llama al procedimiento obtenerAreaTriangulo; 
se llama al procedimiento obtenerAreaCuadrado.
El área del cuadrado es igual a lado x lado x lado x lado
El área del triángulo es igual a (base x altura)/2
El área del rectángulo es igual a base x altura
 * @author david
 */
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("ESCOJA UNA OPCIÓN: ");
        System.out.println("1. Área del cuadrado");
        System.out.println("2. Área del triángulo");
        System.out.println("3. Área del rectángulo");
        int opcion = tcl.nextInt();

        switch (opcion) {
            case 1:
                areaCuadrado(tcl);
                break;
            case 2:
                areaTriangulo(tcl);
                break;
            case 3:
                areaRectangulo(tcl);
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    public static void areaCuadrado(Scanner tcl) {
        System.out.println("DEME EL LADO DEL CUADRADO: ");
        double lado = tcl.nextDouble();
        double area = Math.pow(lado, 2); // lado * lado
        System.out.println("El área del cuadrado es: " + area);
    }

    public static void areaTriangulo(Scanner tcl) {
        System.out.println("DEME LA BASE Y LA ALTURA DEL TRIÁNGULO: ");
        double base = tcl.nextDouble();
        double altura = tcl.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);
    }

    public static void areaRectangulo(Scanner tcl) {
        System.out.println("DEME LA BASE Y LA ALTURA DEL RECTÁNGULO: ");
        double base = tcl.nextDouble();
        double altura = tcl.nextDouble();
        double area = base * altura;
        System.out.println("El área del rectángulo es: " + area);
    }
}
/***ESCOJA UNA OPCI�N: 
1. �rea del cuadrado
2. �rea del tri�ngulo
3. �rea del rect�ngulo
2
DEME LA BASE Y LA ALTURA DEL TRI�NGULO: 
12 4
El �rea del tri�ngulo es: 24.0
 */