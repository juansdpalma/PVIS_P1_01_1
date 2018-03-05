
package factorials;

import java.util.Scanner;


public class Factorials {

     public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero");
        int num = teclado.nextInt();
        
        int factorial = 1;
        while(num != 0){
            factorial = factorial * num;
            num--;
        }
        System.out.println(factorial);
    }
}