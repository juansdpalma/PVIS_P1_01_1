
package inbetween;

import java.util.Scanner;

public class InBetween {

   public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el entero más grade: ");
        int n1 = teclado.nextInt();
        System.out.println("Introduce el número entero más pequeño: ");
        int n2 = teclado.nextInt();
        for (int i = n2 + 1; i < n1; i++) {
            System.out.println(i);
            
        }
    }
}