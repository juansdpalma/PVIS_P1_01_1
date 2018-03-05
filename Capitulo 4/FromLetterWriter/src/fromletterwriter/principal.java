
package fromletterwriter;

import java.util.Scanner;

public class principal {
     public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el apellido: ");
        String ape = scan.next();
        System.out.println("Nombre: ");
        String nombre = scan.next();
        FromLetterWriter f= new FromLetterWriter(ape,nombre);
        System.out.println(f);
        
    }
    
}
