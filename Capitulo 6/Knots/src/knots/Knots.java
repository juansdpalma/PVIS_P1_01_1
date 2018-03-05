
package knots;

import java.util.Scanner;

public class Knots {

     public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce los kilometros recorridos: ");
        int m = teclado.nextInt();
        double k = 0;
        System.out.println("Cuántas horas se recorrió: ");
        int h = teclado.nextInt();
        double m2 = 0;
        m2 = m * 1.151;
        k = m2 * h;
        System.out.println("Los knots son: "+k);
    }
}
