
package carlysmotto;
import java.util.Scanner;

public class CarlysMotto2 {

  
    public static void main(String[] args) {
        System.out.println("***************************************************");
        System.out.println("* “Carly’s makes the food that makes it a party.” *");
        System.out.println("*  precio por persona:  $35                       *");
        System.out.println("*                                                 *"); 
        System.out.println("***************************************************");
        int precio_por_persona= 35;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Platillos para cuantas personas?  ");
        int personas;
        personas = teclado.nextInt();
        if (personas >=50){
            System.out.println("Evento grande");
        }
        else{
            System.out.println("Evento pequeño");
            
        }
        int total;
        total= precio_por_persona*personas;
        System.out.println("$"+total);
        
        
    }
    
}
