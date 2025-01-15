import java.util.Scanner;
public class Ejercicio1_ProcesarMatrix {
    public static void main(String[] args) {
        int LimFil = 0, LimCol = 0;
        Scanner tcl = new Scanner (System.in);
        System.out.println("DEME LIMITE DE FILAS Y LIMITE DE COLUMNAS: ");
        LimFil = tcl.nextInt();
        LimCol = tcl.nextInt();
        int matriz[][] = new int [LimFil][LimCol];
        genmatriz(matriz);
        presentarmatriz(matriz);
        System.out.println("Elementos pares de la matriz: ");
        presentarpares(matriz);
        System.out.println("Elementos impares de la matriz: ");        
        presentarimpares(matriz);
        System.out.println("Promedio de la matriz: ");
        promedio(matriz);
    }
    public static void genmatriz (int matriz [][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz [i][j] = (int)(Math.random()*10);
            }
        }  
    }
    public static void presentarmatriz (int matriz [][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }  
    }
    public static void presentarpares (int matriz [][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz [i][j] % 2 ==0) {
                    System.out.print(matriz[i][j] + " "); 
                }
            }
            System.out.println("");
        }  
    }
    public static void presentarimpares (int matriz [][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz [i][j] % 2 !=0) {
                    System.out.print(matriz[i][j] + " "); 
                }
            }
            System.out.println("");
        }  
    }    
    public static int promedio (int matriz [][]){
        int sumamatriz = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sumamatriz += matriz [i][j];
            }
        }  
        return (sumamatriz/(matriz.length*matriz[0].length));
    }    
}