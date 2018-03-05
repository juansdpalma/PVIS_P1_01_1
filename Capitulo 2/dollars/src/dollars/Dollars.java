
package dollars;
import java.util.Scanner;

public class Dollars {


    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Dolares:  ");
        int dolares;
        dolares = teclado.nextInt();
        int veinte=20; int diez=10; int cinco=5; int uno=1;
        while (dolares>= veinte){
            dolares=dolares-20;
        }
        System.out.println(dolares);
    }
    
}
