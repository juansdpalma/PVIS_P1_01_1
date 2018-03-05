
package BabyNameComparation;
import java.util.Scanner;
public class BabyNameComparation {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Primer nombre:  ");
        String primer= teclado.next();
        System.out.print("Segundo nombre:  ");
        String segundo= teclado.next();
        System.out.print("Tercer nombre:  ");
        String tercero= teclado.next();
        
        System.out.println(primer+" "+segundo);
        System.out.println(primer+" "+tercero);
        System.out.println(segundo+" "+tercero);
        System.out.println(segundo+" "+primer);
        System.out.println(tercero+" "+primer);
        System.out.println(tercero+" "+segundo);
        
    }
    
}
