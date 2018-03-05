
package constructid;

import java.util.Scanner;


public class ConstructID {

  
    public static void main(String[] args) {
        System.out.println("Cual es su primer nombre?  ");
        Scanner teclado = new Scanner(System.in);
        String Primer_nombre= teclado.next();
        System.out.println("Escriba su primer apellido:  ");
        String Apellido = teclado.next();
        System.out.println("Escriba su numero de dirreccion:  ");
        int numero = teclado.nextInt();
        char [] pn= Primer_nombre.toCharArray();
        char [] pa= Apellido.toCharArray();
        System.out.println(pn[0]+""+pa[0]+""+numero);
       
    }
    
}
