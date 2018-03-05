
package testdigitalcamera;

import java.util.Scanner;

public class DigitalCamera {
      public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime la marca: ");
        String marc = teclado.next();
        System.out.println("Dime los pixeles: ");
        Integer pixel = teclado.nextInt();
        TestDigitalCamera pr = new TestDigitalCamera(marc, pixel);
        Integer prec = pr.calcularPrecio();
        System.out.println("El precio es: " + prec);
        System.out.println(pr);
    }
}


