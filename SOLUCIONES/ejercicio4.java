/*Generar un procedimiento para calcular el valor de la planilla de luz y otro procedimiento 
para calcular el valor del predio de un bien inmueble. Cada procedimiento debe tener 2 parámetros 
(tipo cadena para nombre del cliente, cédula del cliente).
En el procedimiento de planilla de luz se debe pedir los siguiente datos valor del kilowatio y 
el número de kilowatios del mes. Y se genera en pantalla el siguiente reporte: Cliente Ana Contreras 
con cédula 1100112233 debe cancelar el valor de $10
En el procedimiento del predio se debe pedir el valor de inmueble y el para obtener el valor del 
predio se saca el 2% del valor del inmueble. Y se genera el siguiente reporte:
Cliente Ana Contreras con cédula 1100112233 tiene un bien inmueble valorado en $30000 y tiene que pagar 
de predio $ 600.
En el método principal; si el usuario ingresa 1 se llama al procedimiento calcularValorLuz; 2
se llama al procedimiento calcularPredio. Los datos que se necesita en cada procedimiento se los 
debe ingresar por teclado.
 * @author david
 */
import java.util.Scanner;

public class ejercicio4{
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("ESCOJA UNA OPCIÓN: ");
        System.out.println("1. Calcular planilla de luz");
        System.out.println("2. Calcular predio");
        int opcion = tcl.nextInt();

        switch (opcion) {
            case 1:
                calcularLuz(tcl);
                break;
            case 2:
                calcularPredio(tcl);
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    public static void calcularLuz(Scanner tcl) {
        System.out.println("DEME NOMBRE DEL CLIENTE:");
        tcl.nextLine(); // limpiar buffer
        String nombre = tcl.nextLine();
        System.out.println("DEME CÉDULA DEL CLIENTE:");
        String cedula = tcl.nextLine();
        System.out.println("DEME EL VALOR DEL KILOVATIO:");
        double valorKw = tcl.nextDouble();
        System.out.println("DEME EL NÚMERO DE KILOVATIOS CONSUMIDOS:");
        int consumo = tcl.nextInt();

        double total = valorKw * consumo;
        System.out.printf("Cliente %s con cédula %s debe cancelar el valor de $%.2f%n", nombre, cedula, total);
    }

    public static void calcularPredio(Scanner tcl) {
        System.out.println("DEME NOMBRE DEL CLIENTE:");
        tcl.nextLine(); // limpiar buffer
        String nombre = tcl.nextLine();
        System.out.println("DEME CÉDULA DEL CLIENTE:");
        String cedula = tcl.nextLine();
        System.out.println("DEME EL VALOR DEL INMUEBLE:");
        double valorInmueble = tcl.nextDouble();

        double predio = valorInmueble * 0.02;
        System.out.printf("Cliente %s con cédula %s tiene un bien inmueble valorado en $%.2f y tiene que pagar de predio $%.2f%n", nombre, cedula, valorInmueble, predio);
    }
}
/***ESCOJA UNA OPCI�N: 
1. Calcular planilla de luz
2. Calcular predio
1
DEME NOMBRE DEL CLIENTE:
Ana contreras
DEME C�DULA DEL CLIENTE:
1100112233
DEME EL VALOR DEL KILOVATIO:
10
DEME EL N�MERO DE KILOVATIOS CONSUMIDOS:
250
Cliente Ana contreras con c�dula 1100112233 debe cancelar el valor de $2500.00 
 */