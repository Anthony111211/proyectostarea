
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author toni
 */
public class NewClass1 {
    public static void main(String[] args) {
        
        Scanner lector=new Scanner(System.in) ;
        int numero=0;
        
        System.out.println("ingrese un numero para la resta");
        numero = lector.nextInt();
        while (numero>0  ) {
            
            numero = numero - 1 ;
            System.out.println("la resta es"+numero);
        }
        
    }

}
