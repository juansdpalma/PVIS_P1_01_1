
package diagonal;

import java.util.Scanner;


public class Diagonal {
     public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantas veces quieres repetir el ciclo?");
        int c = teclado.nextInt();
        String a = " ";
        String x1 = "x";
        for (int i = 0; i < c; i++) {
            x1 = a + x1;
            System.out.println(x1);
        }
    }
}



   