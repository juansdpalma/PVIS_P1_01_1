
package millestofeet;
import java.util.Scanner;

public class MillesToFeetInteractive {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double millas, calculo;
        System.out.println("¿Cuantas millas hay de tu casa a tu destino?  ");
        
        millas= teclado.nextDouble();
        millas=millas*160900;
        double pies=30.48;
        calculo=millas/pies;
        System.out.println("Hay "+calculo+" "+"pies");
     
 
    }
    
}
