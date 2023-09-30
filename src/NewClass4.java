
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author toni
 */
public class NewClass4 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un numero entero positivo: ");
        int Num = scanner.nextInt();

       
        if (Num<= 0) {
            System.out.println("Debe ser un numero entero positivo.");
        } else {
            int suma = 0; 
            int numactual = Num; 

            while (numactual >= 1) {
                suma += numactual; 
                numactual--; 
            }

            System.out.println("La suma de las cifras del numeros  es: " + suma);
        }

    }
}

