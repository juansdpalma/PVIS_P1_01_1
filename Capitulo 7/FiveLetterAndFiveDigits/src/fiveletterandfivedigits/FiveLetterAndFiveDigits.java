package fiveletterandfivedigits;
import java.util.Scanner;
public class FiveLetterAndFiveDigits {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Escriba una palabra de 5 letras:  ");
        String p= teclado.next();
        char[]pl=p.toCharArray();
        if(pl.length<=5){
            System.out.println("Bien");
            
        }
        else{
            System.out.println("Mal");
        }
        
      
    }
    
}
