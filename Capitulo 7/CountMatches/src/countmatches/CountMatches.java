
package countmatches;
import java.util.ArrayList;
import java.util.Scanner;
public class CountMatches {
    public static void main(String []args){
        Scanner teclado = new Scanner(System.in);
        String primera=" ";
        String segunda= " ";
        System.out.println("Escribe una palabra:  ");
        primera= teclado.next();
        System.out.println("Escribe otra palabra:  ");
        segunda= teclado.next();
        char primera_p;
        char segunda_p;
        for(int i =0; i<primera.length();i++){
            primera_p=primera.charAt(i);
            for (int j=0; j<segunda.length();j++){
                segunda_p=segunda.charAt(i);
                if (primera_p==segunda_p)
                System.out.println("Los caracteres en  "+primera+ " que aparecen en "+segunda+" Son "+primera_p);
            }
            
        
         
        }
        
        }
        
        
        
        
             
        }
       
    
        
            
        
    
    
    

 
            
        
    
        
   
