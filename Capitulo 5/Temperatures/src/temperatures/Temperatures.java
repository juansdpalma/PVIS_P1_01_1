
package temperatures;

import java.util.Scanner;

public class Temperatures {

     public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime la temperatura: ");
        int tem = teclado.nextInt();
        if(tem >= 90){
            System.out.println("“Heat warning.”");
        }else if(tem <= 30){
            System.out.println("“Freeze warning.”");
        }
    }
    
}
