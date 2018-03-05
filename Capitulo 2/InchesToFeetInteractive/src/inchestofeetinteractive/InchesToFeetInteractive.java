
package inchestofeetinteractive;
import java.util.Scanner;

public class InchesToFeetInteractive {

    public static void main(String[] args) {
         double inches=2.54;
        double feet=30.54;
        
        double entrada;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Covierte pulgadas a pies");
        System.out.println("¿Cuántas pulgadas?");
        
        entrada=teclado.nextDouble();
        double calculo;
        calculo= (entrada*inches)/feet;
        System.out.println(calculo+" pies");
  
    }
    
}
