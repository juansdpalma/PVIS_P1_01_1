
package countspaces2;
import java.util.Scanner;
public class CountSpaces2 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Escriba una frase:  ");
        String MyString = teclado.nextLine();
        char[] MiCadena=  MyString.toCharArray();
        int n=0;
        for (int i=0 ; i < MiCadena.length; i++){
            if (MiCadena[i] == ' '){
                n++;
                
            }               
            
           
            }
        System.out.println("Los espacios que tienen tu frase son:  ");
        System.out.println(n);
        }
    }