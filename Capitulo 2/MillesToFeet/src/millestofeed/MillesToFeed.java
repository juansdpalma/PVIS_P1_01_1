
package millestofeed;

import java.util.Scanner;


public class MillesToFeed {//Feet*


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double millas, calculo;       
        millas= 8.5;
        millas=millas*160900;//valores de milla y pies aproximados
        double pies=30.48;
        calculo=millas/pies;
        System.out.println("De casa de tu tio moy a tu casa hay "+calculo+" "+"Pies");
    }
    
}
