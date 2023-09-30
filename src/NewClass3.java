
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author toni
 */
public class NewClass3 {
 public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int contador = 0; 
        int acumulador = 0;  
        int numfinal;  
        int num;
        System.out.println("NUMERO POSITIVO INICIA ");
        System.out.println("NUMERO NEGATIVO FINALIZA ");
        System.out.print("Ingrese el numero al que quieres llegar ");
        numfinal = leer.nextInt();
        
        while (acumulador < numfinal) {
            System.out.print("Ingrese los numeros: ");
            num = leer.nextInt();
            
            if (num < 0) {
                System.out.println("Numero negativo ingresado. Finalizando.");
                break;
            }
            acumulador += num;  
            contador++;  
        }
        System.out.println("La suma total es: " + acumulador);
        System.out.println("Se ingresaron un total de " + contador + " numeros.");
        
    }
}
