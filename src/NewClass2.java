
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author toni
 */
public class NewClass2 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int n = scanner.nextInt();

        // Validamos que n sea positivo
        if (n <= 0) {
            System.out.println("Por favor, ingrese un número entero positivo.");
        } else {
            int acumulador = 0;
            int contador = 1;

            // Usamos un bucle while para sumar los números del 1 al n
            while (contador <= n) {
                acumulador += contador;
                contador++;
            }

            // Imprimimos el resultado
            System.out.println("La suma de los números del 1 al " + n + " es: " + acumulador);
        }
    }
}
