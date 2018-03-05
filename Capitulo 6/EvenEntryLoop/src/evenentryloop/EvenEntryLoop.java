
package evenentryloop;

import java.util.Scanner;

public class EvenEntryLoop {
      public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        
        int n = 0;
        do{
            System.out.println("Introduce un numero:");
            n = teclado.nextInt();
            if(n % 2 == 0){
                System.out.println("Good job!");
            }else{
                System.out.println("Bad job!");
            }
            
        }while(n != 999);
    }
}
